xquery version "1.0";
for $x in doc("horario.xml")/horario/dia/tarea[hora-ini < 11]
order by $x/../numdia
return data($x/nombre)