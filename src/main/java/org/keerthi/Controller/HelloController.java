package org.keerthi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi!!!";
	}
	
	@RequestMapping("/")
	public String sayHi() {
		return "Congrats you deployed you app to heroku!!!";
	}


}
