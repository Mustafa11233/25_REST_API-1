package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MsgController {
	
	@PostMapping("/msg")
	//when we want to send custom response code,then we can use ResponseEntity
	public ResponseEntity<String> saveMsg() {
		//logic to save msg
		
		String responseBody = "Saved Successfully";
		
		return new ResponseEntity<String>(responseBody,HttpStatus.CREATED);
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg = "Welcome to REST API...!!";
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Evening...!!";
	}

}
