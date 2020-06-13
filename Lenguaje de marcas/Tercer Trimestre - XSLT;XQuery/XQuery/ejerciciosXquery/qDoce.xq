xquery version "1.0";
for $x in doc("horario.xml")/horario/dia/tarea
return if ($x/@prioridad = 'alta')
then <urgente>{"dia:",data($x/../numdia),"tarea:",data($x/nombre),"de",data($x/hora-ini),"a",data($x/hora-fin)}</urgente>
else <agenda>{"dia:",data($x/../numdia),"tarea:",data($x/nombre),"de",data($x/hora-ini),"a",data($x/hora-fin)}</agenda>