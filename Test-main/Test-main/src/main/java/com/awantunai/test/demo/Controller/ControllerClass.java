package com.awantunai.test.demo.Controller;

@RestController
public class ControllerClass {


@Autowire
ServiceClass serviceClass;
	
@PostMapping("/signup")
public ResponseEntity signUpController(@RequestBody User user) {
	return this.serviceClass.signupMethod(user);
	
	
	
}
	
	
	
}
