package com.jacome.spring.springcoreadvanced.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("inst")
@Scope("prototype")
public class Instructor {

	// SpEL Simples
//	@Value("#{6+6}")
	// SpEL Instanciando objeto
	@Value("#{new Integer(1)}")
	// SpEL com método estático
//	@Value("#{T(java.lang.Math).abs(-6)}")
	// SpEL com variável estático
//	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id;
	
//	@Value("Jacome")
	// SpEL com Strings
	@Value("#{'Jacome'.toUpperCase()}")
	private String name;
	
	@Value("#{topics}")
	private List<String> topics;	
	
	@Autowired
	private Profile profile;
	
	// SpEL com Expressões Booleanas
	@Value("#{2>1?true:false}")
	private Boolean active;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTopics() {
		return topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}	
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active="
				+ active + "]";
	}
}
