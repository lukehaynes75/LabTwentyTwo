<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css" rel="stylesheet" integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp" crossorigin="anonymous">
<meta charset="UTF-8">
<link rel="stylesheet" href="/prettyThings.css"/>
<title>User Registration</title>
</head>
<body>
<h4>Please Fill out this form to Register to become a member of the shop!</h4>
 <form action="userInfo" method ="post">
      <fieldset>
        <legend>Registration form</legend>
        <p>
          <label>User Name</label>
          <input type = "text" name = "userName" value = "User Name"/>
        </p>
        <p>
          <label>Password</label>
          <input type = "password" name = "myPwd" />
        </p>
        <p>
          <label>First Name</label>
          <input type = "text" name = "first" value = "First Name"/> </p>
        <p>
          <label>Last Name</label>
          <input type = "text" name = "last" value = "Last Name"/></p>
         <p>
          <label>Email</label>
          <input type = "email" name = "email" value = "Email@website.com"/>
        </p>
        <label>Gender</label><br>
        <input type="radio" name="gender" value="Male">Male<br>
        <input type="radio" name="gender" value="Female">Female<br>
       
        <p>
        Birthday (month/day/year): <input type="date" name="bdaymonth"></p>
  		<p>
  		<label for="phone">Enter your phone number:</label>

		<input type="tel" name="phone" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required>
		<span class="note">Format: 123-456-7890</span>
  		</p>
  		<p>
        <input type="submit" value="submit"/>
        </p>
  
      </fieldset>
    </form>
</body>
</html>