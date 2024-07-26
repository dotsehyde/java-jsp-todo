<html>
<head>
    <title>Login</title>
</head>
<style>
    .ctn {
        height: 100vh;
        width: 100vw;
        display: flex;
        justify-content: center;
        align-items: start;
    }
</style>
<body class="ctn">
<form method="post" style="display: flex; flex-direction: column; gap: 2px; ">
    <h2>Login Page</h2>
    <label>
        <input name="name" type="text" placeholder="Enter name" required/>
    </label>
    <label>
        <input name="password" type="password" placeholder="Enter password" required/>
    </label>
    <p style="color: red">${error}</p>
    <input type="submit" value="Login">

</form>
</body>
</html>