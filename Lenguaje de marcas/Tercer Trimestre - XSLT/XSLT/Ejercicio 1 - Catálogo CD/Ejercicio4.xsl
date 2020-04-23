<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <head></head>
    <body>
        <h2 align="center">Catálogo CD</h2>
        <xsl:apply-templates/>
    </body>
</html>
</xsl:template>
<xsl:template match="cd">
    <p style="text-align: center;">
        <span style="color: red;"><xsl:value-of select="artist"/></span>
        (<xsl:value-of select="country"/>):
        <span style="color: green;"><xsl:value-of select="title"/></span>
        <br/>
        Fecha: <xsl:value-of select="year"/><br/>
        Precio: <xsl:value-of select="price"/>
    </p>
</xsl:template>
</xsl:stylesheet>