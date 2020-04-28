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
        <table class="centered">
          <xsl:apply-templates select="//cataloging_info/abstract"/>
          <xsl:apply-templates select="./catalog/maintainer"/>
        </table>
      </div>
      </body>
    </html>
  </xsl:template>
<xsl:template match="abstract">
    <tr>
      <th><xsl:apply-templates/></th>
    </tr>
    <tr>
      <td><a href="composer3.xml">Listas</a></td>
    </tr>
</xsl:template>
<xsl:template match="maintainer">
  <tr>
    <td>
      Encargado del catalogo: <xsl:value-of select="name/first_name"/>_<xsl:value-of select="name/middle_name"/>_<xsl:value-of select="name/last_name"/><br/>
      contacto: <xsl:value-of select="./@email"/>
    </td>
  </tr>
  <tr>
    <td style="background:red;color:white;">ultima actualizacion: <xsl:apply-templates select="../last_updated"/></td>
  </tr>
</xsl:template>
</xsl:stylesheet>