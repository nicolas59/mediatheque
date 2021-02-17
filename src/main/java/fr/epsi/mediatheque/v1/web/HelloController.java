package fr.epsi.mediatheque.v1.web;


import fr.epsi.mediatheque.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public ResponseEntity<String> sayHello(@RequestParam String name) {
        return ResponseEntity.ok(this.helloService.sayHello(name));
    }
}
