# SpringOAuth2
A simple demo uses GitHub for OAuth2 authentication for the ToDo app.

## Creating the ToDo App in GitHub
You can log in to your account and then
open https://github.com/settings/applications/new. That’s where you create the
application. You can use the following values.
  * Application name: todo-app
  * Homepage URL: http://localhost:8080
  * Application description: ToDo App
  * Authorization callback URL: http://localhost:8080/login/oauth2/code/github
  
You can click the Register application button. After this, GitHub creates the keys you
need in your application
Once you have this, copy the client id and client secret keys and append them
to the application.properties with the spring.security.oauth2.client.
registration.* keys.
