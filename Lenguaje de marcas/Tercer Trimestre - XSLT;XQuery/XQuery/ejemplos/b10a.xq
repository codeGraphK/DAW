xquery version "1.0";
for $x in doc("bookstore.xml")//book/year, 
$y in doc("bookstore.xml")//book
where $x/../title=$y/title and $x>2003 and $y/price<40
return {data($y/title), data($x)}
