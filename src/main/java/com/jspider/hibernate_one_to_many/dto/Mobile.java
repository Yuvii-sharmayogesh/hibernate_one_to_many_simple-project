package com.jspider.hibernate_one_to_many.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
	@Id
	private int mobileId;
	private String mobileName;
	private String mobileColor;
	private int mobilePrice;
	
	@OneToMany
	private List<Sim> sims;

}
