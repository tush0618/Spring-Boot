package com.bbuzz.us.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="UserDetails")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Account Number")
	private String accNo;
	
	@NotNull
	@javax.validation.constraints.NotEmpty
	@NotBlank
	@Column(name="First Name")
	private String fName;
	@NotNull
	@javax.validation.constraints.NotEmpty
	@NotBlank
	@Column(name="Last Name")
	private String lName;
	@NotNull
	@javax.validation.constraints.NotEmpty
	@NotBlank
	@Column(name="City")
	private String city;
	@NotNull
	@javax.validation.constraints.NotEmpty
	@NotBlank
	@Pattern(regexp="(^$|[0-9]{10})")
	@Column(name="Mobile Number")
	private String mobileNo;
	
	@OneToMany(mappedBy="user")
	private List<Card> cards = new ArrayList<Card>();


	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}



	public User() {
		super();
	}

	
}
