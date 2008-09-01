<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Login</title>         
        <openid:css />
    </head>
    <body>
        <h1>Login</h1>
        <openid:hasLoginError>
            <div class="errors">
                <ul>
                    <li><openid:renderLoginError /></li>
                </ul>
            </div>
        </openid:hasLoginError>
        <openid:form success="[action:'loggedin']">
            <openid:input size="30" value="curious-attempt-bunny.blogspot.com" /> (e.g. http://username.myopenid.com)
            <br/>
            <g:submitButton name="login" value="Login" />
        </openid:form>
    </body>
</html>
