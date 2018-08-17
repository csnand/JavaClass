package exam2016;

public class Programmer extends Employee{

	private double overtimeRate = super.getAnnualSalary() /1500;
	private double monthlyOvertime;
	private String employeeID;
	private String PIN;
	
	public Programmer(String forename, String surname, String dob, double annualSalary, String contact) {
		super(forename, surname, dob, annualSalary, contact);
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
	
	public boolean verifyPIN(String PIN) {
		if (PIN == this.PIN) {
			return true;
		}
		
		return false;
	}
	
	

}
