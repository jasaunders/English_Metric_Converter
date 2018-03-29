<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html><body>


<div class="container-fluid">
    <h2>Search Results: </h2>
    <table width="70%">
        <thead>
        <th>Measurement Conversion</th>
        <th>Value in the initial system</th>
        <th>Value after conversion</th>
        </thead>
        <tbody>
            <tr>
                <td>${user.firstName} ${user.lastName}</td>
                <td>${user.userName}</td>
                <td>${user.age}</td>
            </tr>
        </tbody>
    </table>
</div>

</body>
</html>
