# README #
Total profiles = 3 (default, prod and dev)
If profile not specified in execution command, then system will load application-default.yml (configured in .pro file)

### Commands to execute on the terminal ###

### Method 01 - Creating Jar then executing ###
./gradlew  clean build  
java -jar build\libs\javaexamples-1.0-SNAPSHOT.jar
java -jar build\libs\javaexamples-1.0-SNAPSHOT.jar --spring.profiles.active=dev

### Method 02 - With out jar ###
./gradlew bootRun
./gradlew bootRun --args='--spring.profiles.active=dev'
./gradlew bootRun --args='--spring.profiles.active=prod'