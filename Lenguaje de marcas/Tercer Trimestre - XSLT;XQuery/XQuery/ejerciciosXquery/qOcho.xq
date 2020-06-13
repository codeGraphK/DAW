xquery version "1.0";
for $x in doc("horario.xml")/horario/dia/tarea[hora-ini = 9]
return {data($x/nombre)}