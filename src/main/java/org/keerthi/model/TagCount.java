package org.keerthi.model;

import java.math.BigInteger;

public class TagCount {
	
	String tag;
	BigInteger tagCount;
	
	public TagCount(String tag, BigInteger tagCount) {
		this.tag = tag;
		this.tagCount = tagCount;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public BigInteger getTagCount() {
		return tagCount;
	}
	public void setTagCount(BigInteger tagCount) {
		this.tagCount = tagCount;
	}
	
	

}
