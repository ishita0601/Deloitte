<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<body>
<h2>Search customer by id</h2>
	<f:form action="searchCustomerById.do">

		<table cellspacing="10" cellpadding="10" align="center">
			<tr>
				<td>Customer Id</td>
				<f:input type="text" path="customerId" name="customerId"></f:input>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Search"></td>
				<td><input type="reset" value="Clear"></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><f:input path="customerName" name="customerName"></f:input></td>
			</tr>
			<tr>
				<td>Customer Address</td>
				<td><f:input path="customerAddress" name="customerAddress"></f:input></td>
			</tr>
			</td>
			</tr>

			<tr>
				<td>Bill Amount</td>
				<td><f:input path="billAmount" name="billAmount"></f:input></td>
			</tr>

			<tr>
				<td><input type="submit"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</f:form>


	<a href="Home.html">Home</a>

</body>
</html>