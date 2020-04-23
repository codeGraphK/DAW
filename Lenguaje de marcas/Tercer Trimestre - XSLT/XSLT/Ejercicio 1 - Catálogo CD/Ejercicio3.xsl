<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <head></head>
    <body>
        <h2>Catálogo CD</h2>
        <xsl:apply-templates/>
    </body>
</html>
</xsl:template>
<xsl:template match="cd">
    <span style="color: blue;"><xsl:apply-templates/></span>
    <br/>
</xsl:template>
<xsl:template match="title" name="primero">
    <span style="color: green;"><xsl:apply-templates/></span>
</xsl:template>
<xsl:template match="artist" name="segundo">
    <span style="color: red;"><xsl:apply-templates/></span>
</xsl:template>
</xsl:stylesheet>