<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <head></head>
    <body>
        <h2>Catálogo CD</h2>
        <p style="color: blue;">
            <xsl:apply-templates/>
        </p>
    </body>
</html>
</xsl:template>
</xsl:stylesheet>