xquery version "1.0";
for $x in doc("bookstore.xml")//book
where $x/price>30
order by $x/title
return $x/title
