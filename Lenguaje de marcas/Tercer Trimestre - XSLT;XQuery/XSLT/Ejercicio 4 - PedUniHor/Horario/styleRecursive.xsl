<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
        <head></head>
        <body>
            <table border="1">
                <tr>
                    <th>hora\dia</th>
                    <th>Lunes</th>
                    <th>Martes</th>
                    <th>Miercoles</th>
                    <th>Jueves</th>
                    <th>Viernes</th>
                </tr>
                <xsl:call-template name="mainTemplate"/>
                <tr>
                    <th>total tareas</th>
                    <xsl:call-template name="countTemplate"/>
                </tr>
            </table>
        </body>
        </html>
    </xsl:template>

    <!-- Principal template que imprime toda la tabla -->

    <xsl:template name="mainTemplate">
        <!-- Parámetros que necesitamos para consultar tareas -->
        <xsl:param name="primerNumero" select="9"/>
        <xsl:param name="segundoNumero" select="10"/>
        <!-- if para limitar a 20 el segundo número con el que
            consultamos -->
        <xsl:if test="$segundoNumero &lt; 21">
            <tr>
                <xsl:call-template name="recursiveActionTemplate">
                    <xsl:with-param name="firstNum" select="$primerNumero"/>
                    <xsl:with-param name="secNum" select="$segundoNumero"/>
                </xsl:call-template>
            </tr>
            <!-- Utilizamos la recursividad para volver a llamar al template
            y le pasamos cada vez los números aumentados en 1, como un for i. -->
            <xsl:call-template name="mainTemplate">
                <xsl:with-param name="primerNumero" select="$primerNumero + 1"/>
                <xsl:with-param name="segundoNumero" select="$segundoNumero + 1"/>
            </xsl:call-template>
        </xsl:if>
    </xsl:template>

    <!-- Template para imprimir las tareas -->

    <xsl:template name="recursiveActionTemplate">
        <xsl:param name="firstNum" select="9"/>
        <xsl:param name="secNum" select="10"/>
        <xsl:param name="index" select="1"/>

        <!-- if para imprimir el título lateral sólo una vez -->
        <xsl:if test="$index = 1">
            <td>de <xsl:value-of select="$firstNum"/> a <xsl:value-of select="$secNum"/></td>
        </xsl:if>

        <!-- if para consultar hasta el quinto día -->
        <xsl:if test="$index &lt; 6">

            <!-- Buscamos el día según su numdia, y la tarea si
            la suma de su hora de inicio y hora de fin sumadas
            son iguales a las que estamos consultando y obtenemos
            su nombre. -->
            <td><xsl:value-of select="//dia[numdia = $index]/tarea[hora-ini + hora-fin = $firstNum + $secNum]/nombre"/></td>

            <!-- Generamos recursividad aumentando al segundo día
            y manteniendo los parámetros ingresados inicialmente -->
            <xsl:call-template name="recursiveActionTemplate">
                <xsl:with-param name="index" select="$index + 1"/>
                <xsl:with-param name="firstNum" select="$firstNum"/>
                <xsl:with-param name="secNum" select="$secNum"/>
            </xsl:call-template>

        </xsl:if>
    </xsl:template>

    <!-- Template para hacer el conteo de tareas por día -->

    <xsl:template name="countTemplate">
        <xsl:param name="index" select="1"/>

        <!-- Tiene la misma función que el anterior index,
        para buscar hasta el quinto día. -->
        <xsl:if test="$index &lt; 6">

            <!-- Hacemos un simple conteo de cuantos nodos tarea
            tiene el dia con el numdia solicitado. -->
            <td><xsl:value-of select="count(horario/dia[numdia = $index]/tarea)"/></td>

            <!-- Generamos recursividad para buscar el segundo día. -->
            <xsl:call-template name="countTemplate">
                <xsl:with-param name="index" select="$index + 1"/>
            </xsl:call-template>

        </xsl:if>
    </xsl:template>
</xsl:stylesheet>