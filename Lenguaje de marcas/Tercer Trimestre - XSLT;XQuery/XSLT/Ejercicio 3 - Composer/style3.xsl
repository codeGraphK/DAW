<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <head>
        <style>
          tr, td, th {
            border: 1px solid #000;
          }
          .centered, th {
            text-align: center;
          }
          table {
            display: inline-flex;
            margin: 2vw;
          }
        </style>
      </head>
      <body>
        <xsl:apply-templates select="catalog"/>
      </body>
    </html>
  </xsl:template>
  <xsl:template match="catalog">
    <table style="background:green;color:white;border: 4px outset green;">
      <tr>
        <th>Autores por apellido</th>
      </tr>
      <xsl:for-each select="./composer">
          <xsl:sort select="./name/last_name"/>
          <tr>
            <td><xsl:value-of select="./name/last_name"/>, <xsl:value-of select="./name/first_name"/><xsl:value-of select="./name/middle_name"/></td>
          </tr>
      </xsl:for-each>
    </table>
    <table style="background:fuchsia;color:white;border: 4px outset fuchsia;">
      <tr>
        <th>Composiciones por nombre</th>
      </tr>
      <xsl:for-each select="composition">
          <xsl:sort select="title"/>
          <tr>
            <td><xsl:value-of select="title"/></td>
          </tr>
      </xsl:for-each>
    </table>
    <table style="background:red;color:white;border: 4px outset red;">
      <tr>
        <th colspan="2">Composiciones por duración</th>
      </tr>
      <xsl:for-each select="composition">
        <xsl:sort select="substring-before(length, 'm')" data-type="number"/>
        <xsl:if test="length != ''">
          <tr>
            <td><xsl:value-of select="title"/></td>
            <td><xsl:value-of select="substring-before(length, 'm')"/>.<xsl:value-of select="substring-before(substring-after(length, 'm'), 's')"/></td>
          </tr>
        </xsl:if>
      </xsl:for-each>
    </table>
    <table style="background:blue;color:white;border: 4px outset blue;">
      <tr>
        <th colspan="2">Composiciones por año de publicación</th>
        <xsl:for-each select="composition">
          <xsl:sort select="date/year"/>
          <tr>
            <td><xsl:value-of select="title"/></td>
            <td><xsl:value-of select="date/year"/></td>
          </tr>
        </xsl:for-each>
      </tr>
    </table>
  </xsl:template>
</xsl:stylesheet>