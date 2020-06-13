<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <table border="1">
                    <tr>
                        <th>cliente</th>
                        <th>producto</th>
                        <th>precio</th>
                    </tr>
                    <xsl:apply-templates select="//pedido"/>
                    <tr style="text-align: center;">
                        <td colspan="3">
                            <span style="background: red;">productos que cuestan 100 o mas</span><br/>
                            <span style="background: orange;">productos que cuestan entre 50 y 99</span><br/>
                            <span style="background: lightgreen;">productos que cuestan entre 10 y 49</span>
                        </td>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="pedido">
        <tr>
            <td><xsl:value-of select="./cliente/nombre"/></td>
            <xsl:apply-templates select="./productos"/>
        </tr>
    </xsl:template>
    <xsl:template match="productos">
        <td>
            <table style="width: 100%;">
                <xsl:apply-templates mode="producto"/>
            </table>
        </td>
        <td>
            <table style="width: 100%; text-align:center;">
                <xsl:apply-templates mode="precio"/>
            </table>
        </td>
    </xsl:template>
    <xsl:template match="producto" mode="producto">
        <tr>
            <xsl:choose>
                <xsl:when test="./preciounidad &gt; 9 and ./preciounidad &lt; 50">
                    <td style="background: lightgreen;"><xsl:value-of select="./descripcion"/></td>
                </xsl:when>
                <xsl:when test="./preciounidad &gt; 49 and ./preciounidad &lt; 100">
                    <td style="background: orange;"><xsl:value-of select="./descripcion"/></td>
                </xsl:when>
                <xsl:when test="./preciounidad &gt; 99">
                    <td style="background: red;"><xsl:value-of select="./descripcion"/></td>
                </xsl:when>
                <xsl:otherwise>
                    <td><xsl:value-of select="./descripcion"/></td>
                </xsl:otherwise>
            </xsl:choose>
        </tr>
    </xsl:template>
    <xsl:template match="producto" mode="precio">
        <tr>
            <xsl:choose>
                <xsl:when test="./preciounidad &gt; 9 and ./preciounidad &lt; 50">
                    <td style="background: lightgreen;"><xsl:value-of select="./preciounidad"/></td>
                </xsl:when>
                <xsl:when test="./preciounidad &gt; 49 and ./preciounidad &lt; 100">
                    <td style="background: orange;"><xsl:value-of select="./preciounidad"/></td>
                </xsl:when>
                <xsl:when test="./preciounidad &gt; 99">
                    <td style="background: red;"><xsl:value-of select="./preciounidad"/></td>
                </xsl:when>
                <xsl:otherwise>
                    <td><xsl:value-of select="./preciounidad"/></td>
                </xsl:otherwise>
            </xsl:choose>
        </tr>
    </xsl:template>
</xsl:stylesheet>