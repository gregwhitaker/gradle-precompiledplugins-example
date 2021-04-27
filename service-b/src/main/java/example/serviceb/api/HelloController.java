package example.serviceb.api;

import example.core.HelloMessageGenerator;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping(value = "/hello",
              produces = MediaType.TEXT_PLAIN_VALUE)
  public ResponseEntity<?> hello(@RequestParam("name") String name) {
    return ResponseEntity.ok(HelloMessageGenerator.helloMessage(name) + " - from Service B");
  }
}
