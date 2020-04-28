<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
        <head>
            <title>Document</title>
        </head>
        <body>
            <table border="1">
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Código Asignatura</th>
                    <th>Resultado</th>
                </tr>
                <xsl:apply-templates select="//alumno"/>
            </table>
        </body>
        </html>
    </xsl:template>
    <xsl:template match="alumno">
        <tr>
            <td><xsl:value-of select="nombre"/></td>
            <td><xsl:value-of select="apellido"/></td>
            <td>Nota media:</td>
            <td><xsl:value-of select="sum(.//@nota) div count(.//@nota)"/></td>
        </tr>
        <xsl:apply-templates select="matriculado"/>
    </xsl:template>
    <xsl:template match="matriculado">
        <xsl:variable name="materia"><xsl:value-of select="@asignatura"/></xsl:variable>
        <tr>
            <td></td>
            <td></td>
            <td><xsl:value-of select="//asignatura[@codigo = $materia]/titulo"/></td>
            <td>
                <xsl:choose>
                    <xsl:when test="@nota &lt; 4">Suspenso (sin recuperacion)</xsl:when>
                </xsl:choose>
                <xsl:choose>
                    <xsl:when test="@nota = 4">Suspenso (con recuperacion)</xsl:when>
                </xsl:choose>
                <xsl:choose>
                    <xsl:when test="@nota &gt; 4 and @nota &lt; 7">Aprobado</xsl:when>
                </xsl:choose>
                <xsl:choose>
                    <xsl:when test="@nota &gt; 6 and @nota &lt; 10">Notable</xsl:when>
                </xsl:choose>
                <xsl:choose>
                    <xsl:when test="@nota = 10">Sobresaliente</xsl:when>
                </xsl:choose>
            </td>
        </tr>
    </xsl:template>
</xsl:stylesheet>