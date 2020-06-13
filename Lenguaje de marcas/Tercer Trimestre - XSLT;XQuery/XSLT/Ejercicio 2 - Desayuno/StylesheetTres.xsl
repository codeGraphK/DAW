<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <head></head>
    <body>
        <table border="1" bordercolor="#ff0000" style="position:absolute;left:40vw;">
            <tr>
                <th colspan="2"><span style="color:green;text-align:center;">Ordena tu desayuno</span></th>
            </tr>
            <xsl:apply-templates mode="up"/>
        </table>
        <br/>
        <table border="2" bordercolor="#007700" style="position:absolute;left:25vw;top:30vh;">
            <tr>
                <th><span style="color:green;text-align:center;">Los desayunos de hoy</span></th>
                <td>
                    <table border="2" bordercolor="#0000ff" style="color:blue;">
                        <xsl:apply-templates mode="down"/>
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
</xsl:template>
<xsl:template match="food" mode="up">
    <tr>
        <td><xsl:value-of select="name"/></td>
        <td>
            <select>
                <option>0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
            </select>
        </td>
    </tr>
</xsl:template>
<xsl:template match="food" mode="down">
    <tr>
        <td><xsl:value-of select="name"/></td>
        <td><xsl:value-of select="description"/></td>
        <td><xsl:value-of select="price"/></td>
    </tr>
</xsl:template>
</xsl:stylesheet>