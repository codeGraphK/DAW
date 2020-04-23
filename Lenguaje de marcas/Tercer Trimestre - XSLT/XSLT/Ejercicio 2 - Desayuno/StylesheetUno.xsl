<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <head></head>
    <body>
        <table border="1">
            <tr>
                <th colspan="3"><span style="color: green;text-align:center;">Los desayunos de hoy</span></th>
            </tr>
            <xsl:apply-templates/>
        </table>
    </body>
</html>
</xsl:template>
<xsl:template match="food">
    <tr>
        <td><img src="fork.gif"/></td>
        <td>Puedes comer <xsl:apply-templates select="description"/> por solo <xsl:apply-templates select="price"/> (y <xsl:apply-templates select="calories"/>)</td>
        <td>ELIGE: <xsl:value-of select="name"/></td>
    </tr>
</xsl:template>
<xsl:template match="price">
    <b><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match="description">
    <u><xsl:apply-templates/></u>
</xsl:template>
<xsl:template match="calories">
    <span><xsl:apply-templates/> calorias</span>
</xsl:template>
</xsl:stylesheet>