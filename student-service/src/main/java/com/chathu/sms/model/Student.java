package com.chathu.sms.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

	@Id
	private Integer sid;
	private String name;
	@OneToOne (cascade = CascadeType.ALL)
	private Address address;
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private List<Telephone> telephone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Telephone> getTelephone() {
		return telephone;
	}

	public void setTelephone(List<Telephone> telephone) {
		this.telephone = telephone;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}
}
