xquery version "1.0";
<html>
<body>
<h1>Bookstore</h1>
<ul>
{
for $x in doc("bookstore.xml")/bookstore/book
order by $x/title
return<li>{data($x/title)}.
Categoría:{data($x/@category)}</li>
}

</ul>
</body>
</html>