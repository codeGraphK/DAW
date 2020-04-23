<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <head></head>
    <body>
        <table xsl:use-attribute-sets="tableAttr">
            <tr>
                <xsl:attribute name="bgcolor">yellow</xsl:attribute>
                <th>Artist</th>
                <th>Title</th>
                <th>Country</th>
                <th>Year</th>
                <th>Price</th>
            </tr>
            <xsl:apply-templates/>
        </table>
    </body>
</html>
</xsl:template>
<xsl:template match="cd">
    <tr>
        <td xsl:use-attribute-sets="greenOnes"><xsl:value-of select="artist"/></td>
        <td xsl:use-attribute-sets="aquaOnes"><xsl:value-of select="title"/></td>
        <td xsl:use-attribute-sets="greenOnes"><xsl:value-of select="country"/></td>
        <td xsl:use-attribute-sets="aquaOnes"><xsl:value-of select="year"/></td>
        <td xsl:use-attribute-sets="greenOnes"><xsl:value-of select="price"/> €</td>
    </tr>
</xsl:template>
<xsl:attribute-set name="tableAttr">
    <xsl:attribute name="border">1</xsl:attribute>
    <xsl:attribute name="style">border-collapse: collapse;</xsl:attribute>
</xsl:attribute-set>
<xsl:attribute-set name="greenOnes">
    <xsl:attribute name="bgcolor">greener</xsl:attribute>
</xsl:attribute-set>
<xsl:attribute-set name="aquaOnes">
    <xsl:attribute name="bgcolor">aquamarine</xsl:attribute>
</xsl:attribute-set>
</xsl:stylesheet>