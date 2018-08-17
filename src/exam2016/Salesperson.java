package exam2016;

public class Salesperson extends Employee {
	
	private double monthlyOvertime;
	private double overtimeRate = super.getAnnualSalary() /1500;
	private String externalContact;
	private String internalContact;
	
	private String employeeID;
	
	
	
	public String getExternalContact() {
		return externalContact;
	}



	public void setExternalContact(String externalContact) {
		this.externalContact = externalContact;
	}



	public String getInternalContact() {
		return internalContact;
	}



	public void setInternalContact() {
		internalContact = externalContact.substring(6);
	}
	
	public double getMonthlyOvertime() {
		return monthlyOvertime;
	}



	public void setMonthlyOvertime(double monthlyOvertime) {
		this.monthlyOvertime = monthlyOvertime;
	}



	@Override
	public void addOvertime() {
		monthlyOvertime += overtimeRate;

	}
	
	public String getEmployeeID() {
		return employeeID;
	}

}
