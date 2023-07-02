//2. Design an applet to display the user information such as Roll No., Name, Branch and Section in separate lines with different font colors. Set the background color yellow also.
<!DOCTYPE html>
<html>
<head>
	<title>User Information</title>
	<style type="text/css">
		body {
			background-color: yellow;
		}
		.roll-no {
			color: red;
		}
		.name {
			color: blue;
		}
		.branch {
			color: green;
		}
		.section {
			color: purple;
		}
	</style>
</head>
<body>
	<p class="roll-no">Roll No.: 12345</p>
	<p class="name">Name: John Doe</p>
	<p class="branch">Branch: Computer Science</p>
	<p class="section">Section: A</p>
</body>
</html>