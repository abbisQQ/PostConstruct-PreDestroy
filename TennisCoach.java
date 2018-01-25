package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")//bean id to inject happyfortuneService
	private FortuneService FortuneService;
	
	public TennisCoach() {
		System.out.println("Inside tennis coach instructor");
	}
	


	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Back hand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getFortune();
	}

	
	
	
	
	@PostConstruct
	public void Startup() {
		System.out.println("PostContruct here this code will be execute after the construtor and after the injection of dependancies. ");
	}
	
	@PreDestroy
	public void finish() {
		System.out.println("PreDestroy method its called before the destroy pretty straight forward");
		
	}
	
	
	
	
	
	
	
}
