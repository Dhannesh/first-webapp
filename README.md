# Web Application

- you can change the port in properties file by `server.port=8081`
- Create SayHelloController

  ```
  package com.xtranity.springboot.webapp;

  import org.springframework.stereotype.Controller;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.ResponseBody;

  @Controller
  public class SayHelloController {

      @RequestMapping("hello")
      @ResponseBody
      public String sayHello() {
          return "Hello! whar are you learning today?";
      }

  }

  ```

  put all jsp pages at
  `/src/main/resources/META-INF/resources/WEB-INF/jsp/`
  add dependency in pom.xml

  ```
    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
        <scope>provided</scope>
    </dependency>
  ```

## Login JSP

create a login package and LoginController inside that return a login.jsp page

- store request parameter with the help of @RequestParam annotation
  pass anything to contorller to jsp, we use ModelMap
