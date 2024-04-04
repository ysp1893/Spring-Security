# Questions and Answers

## Spring boot

1. **what is Spring boot** ?
   1. Spring Boot is an open-source Java-based framework used to create a Micro Service. Spring Boot is developed by Pivotal Team and is used to build stand-alone and production ready spring applications. It is a combination of Spring Framework and Embedded Servers.
   2. Spring Boot provides a number of features that make it easier to develop and deploy Spring applications. These features include:
      1. _Embedded servers:_ Spring Boot can embed a number of different servers, such as Tomcat, Jetty, and Undertow. This means that you do not need to deploy your Spring application to a separate server.
      2. _Autoconfiguration:_ Spring Boot can automatically configure your Spring application based on the dependencies that you have added to your project. This means that you do not need to write a lot of configuration code.
      3. _Starters:_ Spring Boot provides a number of starters that you can use to add dependencies to your Spring application. Starters are a convenient way to add dependencies to your project without having to hunt through sample code and copy paste loads of dependency descriptors.
      4. _CLI:_ Spring Boot provides a CLI that you can use to run your Spring application from the command line. This is a convenient way to run your application without having to use an IDE.
   3. Spring Boot is a popular choice for developing Spring applications. It is easy to use and provides a number of features that make it easier to develop and deploy Spring applications.
2. **What is @SpringBootApplication annotation ?**
   1. The @SpringBootApplication annotation is a convenient way to mark the main class of a Spring Boot application. It combines the functionality of three other annotations:
      1. _@SpringBootConfiguration:_ This signifies that the class provides Spring Boot application configuration. 
      2. _@EnableAutoConfiguration:_ This enables Spring Boot's auto-configuration mechanism, which automatically configures beans based on the presence of libraries on the classpath.
      3. _@ComponentScan:_ This enables component scanning on the package where the application is located. This means Spring Boot will search for classes annotated with _@Component_, _@Controller_, _@Service_, etc., in that package and its sub-packages.
   2. In essence, @SpringBootApplication is a shortcut that simplifies configuration and gets your Spring Boot application up and running quickly. It's the standard way to define the main class for most Spring Boot applications.
3. What is @RestController Annotation ?
   1. The @RestController annotation in Spring MVC is a specialization of the @Controller annotation that simplifies building RESTful web services. Here's a breakdown of what it does:
      1. _@Controller:_ This marks a class as a Spring MVC controller, handling incoming HTTP requests. 
      2. _@ResponseBody:_ This tells Spring MVC to treat the return value of a request-handling method as the body of the HTTP response. This is typical for RESTful APIs that return data in formats like JSON or XML 
   2. Benefit of Using @RestController:
      1. By using @RestController, you avoid the need to explicitly add @ResponseBody to every request-handling method within the controller class. It assumes a response body by default, streamlining development for REST APIs.
   3. Key Points:
      1. Applied at the class level.
      2. Enables handling various REST API operations like GET, POST, PUT, and DELETE requests.
      3. Spring automatically converts the response data (objects) to JSON or XML (depending on client configuration) before sending it back in the response body.
   4. In essence, @RestController provides a cleaner and more concise way to develop RESTful controllers in Spring applications.
      
4. 
