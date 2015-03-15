<html>
<head>
    <title></title>
</head>

<body>
<% println 'Hello World' %>
<table>
    <tr>
        <td align="right" valign="top">Add Toy</td>
        <td>
            <form action="addToy.gsp">
                <input type="submit" name="submit">
            </form>
        </td>
    </tr>
    <tr>
        <td align="right" valign="top">Display All Toys</td>
        <td>
            <form action="groovy/displayAllToys.groovy">
                <input type="submit" name="submit">
            </form>
        </td>
    </tr>
</table>
</body>
</html>
