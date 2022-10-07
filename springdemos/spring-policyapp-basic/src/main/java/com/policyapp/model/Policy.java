package com.policyapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Policy {
	private String policyName;
	private Integer policyNumber;
	private double premium;
	private int duration;
	private String coverage;
	private String category;
	private double sumAssured;
	private String type;

	

}
