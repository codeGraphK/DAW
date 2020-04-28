<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <body>
      
      <table border="1" align="center">
       <tr>
           <th><b>Nombre</b></th>
           <th><b>Apellido</b></th>
           <th><b>Codigo Asignatura</b></th>
           <th><b>Resultado</b></th>
       </tr>
       <xsl:apply-templates select="//alumno"/>
        </table>
    </body>  
    </html>
  </xsl:template>

<xsl:template match="alumno">
<tr>  
    <td>
        <xsl:value-of select="nombre"/>
    </td>
    <td>
        <xsl:value-of select="apellido"/>
    </td>
    <td></td>
    <td>
      <xsl:for-each select="matriculado">
      
        <tr>
          <td></td>
          <td></td>
          <td>
          <xsl:if test="./@asignatura='F89'">
           Lenguaje Maquina </xsl:if>
          <xsl:if test="./@asignatura='A190'">
          Bases Datos </xsl:if>
          <xsl:if test="./@asignatura='A1'">
          Sistemas en red </xsl:if>
         <xsl:if test="./@asignatura='A990'">
          Programación avanzada web </xsl:if>
         </td>
          <td> 
          <xsl:choose>
          <xsl:when test="./@nota > 0" > Suspenso 
          (sin recuperacion)
          </xsl:when>
          <xsl:when test="./@nota > 3 " > Suspenso 
          (con recuperacion)
          </xsl:when>
          <xsl:when test="./@nota > 4 "> Aprobado 
          </xsl:when>
          <xsl:when test="./@nota > 6 "> Notable 
          </xsl:when>
          <xsl:when test="./@nota > 8 " > 
           Sobresaliente 
          </xsl:when>
          <xsl:otherwise>
            La nota no se corresponde
          </xsl:otherwise>
          </xsl:choose>
         </td>
         </xsl:for-each>
   </td>

</tr>
</xsl:template>