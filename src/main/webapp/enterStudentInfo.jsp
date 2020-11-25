<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="get" action="abcd" modelAtrribute="Student">

  fname<form:input path="fname"/><br>
  lname<form:input path="lname"/><br>
Click to submit<input type="submit" value="Submit">


</form:form>