<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
<title>
Customer Confirmation
</title>
</head>

<body>
The Customer is confirmed: ${customer.firstName } ${customer.lastName }
<br>
Free Passes: ${customer.freePasses }

Course Code : ${customer.courseCode }
</body>
</html>