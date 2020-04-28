<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head></head>
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
            <td><xsl:value-of select="nombre"/></td>
            <td></td>
            <td></td>
        </tr>
        <xsl:apply-templates select="matriculado"/>
    </xsl:template>
    <xsl:template match="matriculado">
        <tr>
            <td></td>
            <td></td>
            <td><xsl:value-of select="@asignatura"/></td>
            <td><xsl:value-of select="@nota"/></td>
        </tr>
    </xsl:template>
</xsl:stylesheet>