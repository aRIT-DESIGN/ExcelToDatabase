package com.ImportExcel.fetchmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "mobileid")
public class Fetchid {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Useid")
	private Integer Useid;
	@Column(name = "mobile")
	private String mobile;
	
	public Fetchid() {
		super();
	}

	public Fetchid(Integer useid, String mobile) {
		super();
		Useid = useid;
		this.mobile = mobile;
	}

	public Integer getUseid() {
		return Useid;
	}

	public void setUseid(Integer useid) {
		Useid = useid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Fetchid [Useid=" + Useid + ", mobile=" + mobile + "]";
	}
    
    
    
	
}
