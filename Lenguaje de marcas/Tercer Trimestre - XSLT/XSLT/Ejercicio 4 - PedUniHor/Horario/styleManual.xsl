<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
        <head></head>
        <body>
            <table border="1">
                <tr>
                    <th>hora\dia</th>
                    <th>Lunes</th>
                    <th>Martes</th>
                    <th>Miercoles</th>
                    <th>Jueves</th>
                    <th>Viernes</th>
                </tr>
                <tr>
                    <td>de 9 a 10</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 19]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 19]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 19]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 19]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 19]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 10 a 11</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 21]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 21]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 21]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 21]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 21]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 11 a 12</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 23]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 23]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 23]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 23]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 23]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 12 a 13</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 25]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 25]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 25]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 25]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 25]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 13 a 14</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 27]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 27]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 27]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 27]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 27]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 14 a 15</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 29]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 29]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 29]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 29]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 29]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 15 a 16</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 31]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 31]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 31]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 31]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 31]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 16 a 17</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 33]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 33]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 33]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 33]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 33]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 17 a 18</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 35]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 35]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 35]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 35]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 35]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 18 a 19</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 37]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 37]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 37]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 37]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 37]/nombre"/></td>
                </tr>
                <tr>
                    <td>de 19 a 20</td>
                    <td><xsl:value-of select="//dia[numdia = 1]/tarea[hora-ini + hora-fin = 39]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 2]/tarea[hora-ini + hora-fin = 39]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 3]/tarea[hora-ini + hora-fin = 39]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 4]/tarea[hora-ini + hora-fin = 39]/nombre"/></td>
                    <td><xsl:value-of select="//dia[numdia = 5]/tarea[hora-ini + hora-fin = 39]/nombre"/></td>
                </tr>
                <tr>
                    <th>total tareas</th>
                    <td><xsl:value-of select="count(horario/dia[numdia = 1]/tarea)"/></td>
                    <td><xsl:value-of select="count(horario/dia[numdia = 2]/tarea)"/></td>
                    <td><xsl:value-of select="count(horario/dia[numdia = 3]/tarea)"/></td>
                    <td><xsl:value-of select="count(horario/dia[numdia = 4]/tarea)"/></td>
                    <td><xsl:value-of select="count(horario/dia[numdia = 5]/tarea)"/></td>
                </tr>
            </table>
        </body>
        </html>
    </xsl:template>
</xsl:stylesheet>