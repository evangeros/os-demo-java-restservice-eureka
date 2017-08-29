package cf.demo.restservice;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
//@EnableDiscoveryClient
@RestController
public class HelloService {

  @RequestMapping("/api/hello")
  public String home() {
    return "Hello World";
  }
}
