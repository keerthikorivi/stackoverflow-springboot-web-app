package org.keerthi.Controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.keerthi.model.TagCount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TagController {
	//controller calls service classes
	
	
	@RequestMapping("/tagstest")
	public String getAllTags() {
		return "Congrats you deployed you app to heroku!!!";
	}
	
	@RequestMapping("/tags")
	public List<TagCount> getAllTagsWithTheirCounts() {
		return buildTagCount();
	}

	
	public List<TagCount> buildTagCount(){
		List<TagCount> tagCountList = new ArrayList<TagCount>();
		tagCountList.add(new TagCount("java", BigInteger.valueOf(10000)));
		tagCountList.add(new TagCount("python", BigInteger.valueOf(8000)));
		tagCountList.add(new TagCount("sql", BigInteger.valueOf(7800)));
		tagCountList.add(new TagCount("android", BigInteger.valueOf(6000)));
		tagCountList.add(new TagCount("react", BigInteger.valueOf(5900)));
		tagCountList.add(new TagCount("js", BigInteger.valueOf(5500)));
		tagCountList.add(new TagCount("node", BigInteger.valueOf(5000)));
		tagCountList.add(new TagCount("spring", BigInteger.valueOf(4500)));
		return tagCountList;
		
	}

}
