<!DOCTYPE html>
<html>
<head>
	<title>Student Feedback Form</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
		<h1>Student Feedback Form</h1>
		<form method="post" action="feedbackServlet">
			<label for="studentName">Student Name:</label>
			<input type="text" id="studentName" name="studentName"><br><br>
			<label for="courseName">Course Name:</label>
			<input type="text" id="courseName" name="courseName"><br><br>
			<label for="instructorName">Instructor Name:</label>
			<input type="text" id="instructorName" name="instructorName"><br><br>
			<label for="comments">Feedback Comments:</label>
			<textarea id="comments" name="comments" rows="5" cols="50"></textarea><br><br>
			<input type="submit" value="Submit Feedback">
		</form>
	</div>
</body>
</html>
