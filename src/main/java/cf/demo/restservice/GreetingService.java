package cf.demo.restservice;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
//@EnableAutoConfiguration
////@EnableEurekaClient
//@EnableDiscoveryClient
@RestController
public class GreetingService {

  @RequestMapping("/api/greeting")
  public String greeting() {
    return "Hello World";
  }
}
