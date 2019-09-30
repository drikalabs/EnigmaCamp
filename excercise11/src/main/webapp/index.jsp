<page contentType="text/html;charset=UTF-8" language="java">
    <html>
    <head>
        <title>Enigma Camp</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
    <header>
        <h1>Enigma Academy</h1>
    </header>
    <div class="sidenav">
        <li><a href="#">Data</a></li>
        <li><a href="#">Input</a></li>
    </div>
    <div class="main container">
        <form method="post" action="robot">
            <label ><b>Setup</b></label>
            <input type="text" placeholder="Enter Direction" name="setup" required>

            <label ><b>Battery</b></label>
            <input type="text" placeholder="Enter Value" name="fuels" required>

            <label><b>Movement</b></label>
            <input type="text" placeholder="Enter Movement" name="movement" required>
            <input type="submit" class="btn">
        </form>
    </div>
    </body>
    </html>
</page>