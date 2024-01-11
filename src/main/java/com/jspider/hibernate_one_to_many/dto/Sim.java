package com.jspider.hibernate_one_to_many.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sim {
	@Id
	private int simId;
	private String simType;//Prepared/Postpaid
	private String simNetworkType;//2G/3G/4G/5G
	private String simOperatorNameString;

}
