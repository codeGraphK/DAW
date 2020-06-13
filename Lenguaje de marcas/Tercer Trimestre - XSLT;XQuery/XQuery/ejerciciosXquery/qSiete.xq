xquery version "1.0";
for $x in doc("horario.xml")/horario/dia[numdia = 4]/tarea/nombre
return {data($x)}