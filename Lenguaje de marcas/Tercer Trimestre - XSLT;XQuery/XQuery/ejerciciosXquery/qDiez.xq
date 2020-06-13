xquery version "1.0";
for $x in doc("horario.xml")/horario/dia/tarea
return if ($x/hora-ini<=13)
then <manana>{data($x/nombre)}</manana>
else <tarde>{data($x/nombre)}</tarde>