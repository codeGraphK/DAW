xquery version "1.0";
for $x in doc("bookstore.xml")//book
return if ($x/@category="CHILDREN")
then <child>{data($x/title)}</child>
else <adult>{data($x/title)}</adult>
