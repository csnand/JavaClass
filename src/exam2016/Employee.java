package exam2016;

public abstract class Employee {
	private String forename;
	private String surname;
	private String dob;
	private double annualSalary;
	private String contact;
	
	public Employee() {
		
	}
	
	public Employee(String forename, String surname, String dob, double annualSalary, String contact) {
		this.forename = forename;
		this. surname = surname;
		this.dob = dob;
		this.annualSalary = annualSalary;
		this.contact = contact;
	}
	
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public abstract void addOvertime();

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
}
