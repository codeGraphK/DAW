<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <table border="1">
                    <tr>
                        <th>cliente</th>
                        <th>numero de productos</th>
                        <th>total a pagar</th>
                    </tr>
                    <xsl:apply-templates select="//pedido"/>
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
        <xsl:if test="../@confirmado = 'si'">
            <xsl:variable name="countProd" select="count(producto)"/>
            <td><xsl:copy-of select="$countProd"/></td>
            <xsl:variable name="sumProd" select="sum(producto/preciounidad)"/>
            <td><xsl:copy-of select="$sumProd"/></td>
        </xsl:if>
        <xsl:if test="../@confirmado = 'no'">
            <td colspan="2">El pedido no ha sido confirmado</td>
        </xsl:if>
    </xsl:template>
</xsl:stylesheet>