package com.policyapp.client;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.policyapp.service.IPolicyService;
import com.policyapp.service.PolicyServiceImpl;
import com.policyapp.service.exception.IdNotFoundException;
import com.policyapp.service.exception.PolicyNotFoundException;

public class UserClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.policyapp");
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		IPolicyService policyService=context.getBean(PolicyServiceImpl.class,"policyServiceImpl");
		policyService.getAll().forEach(System.out::println);
		System.out.println();
		System.out.println("By Type");
		try {
			policyService.getByCategory("life").forEach(System.out::println);
		} catch (PolicyNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("By premium");
		try {
			policyService.getByLessPremium(2000).forEach(System.out::println);
		} catch (PolicyNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("By Marriage");
		try {
			policyService.getByCoverage("Marriage").forEach(System.out::println);
		} catch (PolicyNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("By getByHighSumAssured");
		try {
			policyService.getByHighSumAssured(2000).forEach(System.out::println);
		} catch (PolicyNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("By Id");
		try {
			System.out.println(policyService.getById(1005));
		} catch (IdNotFoundException e) {
			e.printStackTrace();
		}
	}

}
