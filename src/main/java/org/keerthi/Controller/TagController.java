package org.keerthi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TagController {
	//controller calls service classes
	
	@RequestMapping("/tags")
	public String getAllTagsWithTheirCounts() {
		return "Congrats you deployed you app to heroku!!!";
	}


}
