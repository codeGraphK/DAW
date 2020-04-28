<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
  <html>
    <head>
      <style>
        table, tr, td, th {
          border: 1px solid #000;
        }
        .centered, th {
          text-align: center;
        }
      </style>
    </head>
    <body>
      <div align="center">
        <xsl:apply-templates select="//cataloging_info/abstract"/>
        <br/>
        <table class="centered">
          <tr>
            <th>LISTA DE AUTORES</th>
          </tr>
          <xsl:for-each select="./catalog/composer">
          <xsl:sort select="./name/last_name"/>
          <tr>
            <td><xsl:value-of select="./name/last_name"/>, <xsl:value-of select="./name/first_name"/><xsl:value-of select="./name/middle_name"/></td>
          </tr>
        </xsl:for-each>
        </table>
        <br/>
        <table>
          <tr>
            <th colspan="2">LISTA DE COMPOSICIONES</th>
          </tr>
          <xsl:apply-templates select="./catalog/composition"/>
        </table>
      </div>
    </body>
  </html>
</xsl:template>
<xsl:template match="abstract">
  <table class="centered">
    <tr>
      <th><xsl:apply-templates/></th>
    </tr>
    <tr>
      <td><a href="composer2.xml">actualizaciones</a></td>
    </tr>
  </table>
</xsl:template>
<xsl:template match="composition">
  <tr style="background:lightblue;">
    <td><xsl:apply-templates select="title"/></td>
    <td><xsl:apply-templates select="date/year"/></td>
  </tr>
  <tr>
    <td colspan="2">Duración: <xsl:apply-templates select="length"/></td>
  </tr>
  <tr>
    <td colspan="2">Descripción:<br/><xsl:apply-templates select="description/p"/></td>
  </tr>
</xsl:template>
</xsl:stylesheet>