xquery version "1.0";
for $x in doc("horario.xml")/horario/dia/tarea[@prioridad = 'alta']
order by $x/../numdia, $x/hora-ini
return data($x/nombre)