package com.jacome.spring.springcore.properties;

import java.util.Properties;

public class Languages {

	private Properties countrysAndLangs;

	public Properties getCountrysAndLangs() {
		return countrysAndLangs;
	}

	public void setCountrysAndLangs(Properties countrysAndLangs) {
		this.countrysAndLangs = countrysAndLangs;
	}

	@Override
	public String toString() {
		return "Languages [countrysAndLangs=" + countrysAndLangs + "]";
	}
	
	
	
}
