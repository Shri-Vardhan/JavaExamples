JDBC Configuration with Spring Profiles
---------------------------------------

The application uses Spring Profiles to manage different JDBC configurations for development and production environments.

Profiles Supported:
------------------

dev – Local / development database

prod – Production database

Activate Profile:
----------------
Run with DEV profile
java -jar example-rest-api.jar --spring.profiles.active=dev

Run with PROD profile
java -jar example-rest-api.jar --spring.profiles.active=prod

Default Behavior:
----------------
If no profile is specified, Spring uses application.properties

Recommended: Always specify profile explicitly in non-local environments
Database connections are auto-configured via Spring Boot JDBC

No code changes required when switching environments

Credentials for production should be managed securely (env variables / vault)
