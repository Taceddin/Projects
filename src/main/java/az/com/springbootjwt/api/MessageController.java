package az.com.springbootjwt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

//	@RequestMapping("/Hi")
//	public String sayHi() {
//		return "Hi";
//	}
	
	@GetMapping
	public ResponseEntity<String> getMessage(){
		return ResponseEntity.ok("Hello JWT");
	}
}
