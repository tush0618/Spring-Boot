package com.bbuzz.us.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="CardDetails")
public class Card {
	
	@Id
	@Column(name="Card Number")
	@NotNull
	@javax.validation.constraints.NotEmpty
	@NotBlank
	
	private String cardNo;
	@NotNull
	@javax.validation.constraints.NotEmpty
	@NotBlank
	@Column(name="Name")
	private String nameOnCard;
	@NotNull
	@javax.validation.constraints.NotEmpty
	@NotBlank
	@Column(name="Type")
	private String type;
	@NotNull
	@javax.validation.constraints.NotEmpty
	@NotBlank
	@Pattern(regexp="(^$|[0-9]{3})")
	@Column(name="CVV")
	private String cvv;
	@NotNull
	@javax.validation.constraints.NotEmpty
	@NotBlank
	@Column(name="Expiry date")
	@Temporal(TemporalType.DATE)
	private Date expiryDate;
	
	@ManyToOne
	private User user;

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "CreditCard [nameOnCard=" + nameOnCard + ", type=" + type + ", cardNo=" + cardNo + ", cvv=" + cvv
				+ ", expiryDate=" + expiryDate + "]";
	}

	public Card() {
		super();
	}

	public Card(String nameOnCard, String type, String cardNo, String cvv, Date expiryDate) {
		super();
		this.nameOnCard = nameOnCard;
		this.type = type;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

}
