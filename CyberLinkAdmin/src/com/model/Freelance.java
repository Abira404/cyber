package com.model;

public class Freelance {
	private String cname, jobdesc, salary, email, contact;

	public Freelance(String cname, String jobdesc, String salary, String email, String contact) {
		super();
		this.cname = cname;
		this.jobdesc = jobdesc;
		this.salary = salary;
		this.email = email;
		this.contact = contact;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getJobdesc() {
		return jobdesc;
	}

	public void setJobdesc(String jobdesc) {
		this.jobdesc = jobdesc;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
