<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <head></head>
    <body>
        <table border="3">
            <tr>
                <th colspan="2"><span style="color:green;text-align:center;">Los desayunos de hoy</span></th>
            </tr>
            <xsl:apply-templates/>
        </table>
    </body>
</html>
</xsl:template>
<xsl:template match="food">
    <tr>
        <th style="text-align:center;background:lightblue;">nombre</th>
        <th style="text-align:center;background:lightblue;">precio</th>
    </tr>
    <tr>
        <td><xsl:value-of select="name"/></td>
        <td><xsl:value-of select="price"/></td>
    </tr>
    <tr>
        <th style="text-align:center;background:lightblue;">descripción</th>
        <th style="text-align:center;background:lightblue;">calorias</th>
    </tr>
    <tr>
        <td><xsl:value-of select="description"/></td>
        <td><xsl:value-of select="calories"/></td>
    </tr>
</xsl:template>
</xsl:stylesheet>