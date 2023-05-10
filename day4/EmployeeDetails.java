package week1.day4;

public class EmployeeDetails {
	
	public void getEmployeeNameAndId(String empName, int Id) {
		System.out.println("Employee Name : " +empName);
		System.out.println("Employee Id :" +Id);
	}	
	public void getEmployeeAddress(String empAddress) {
	    System.out.println("Employee Address :" +empAddress);
	}
	
	public void getEmployeeSalary(double empSalary) {
		System.out.println("Employee Salary :" +empSalary);
	}
	
	
	public void getEmployeeMobileNumber(long empMobileNumber) {
	    System.out.println("Employee Mobile Number :"+empMobileNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
        EmployeeDetails details=new EmployeeDetails();
        details.getEmployeeNameAndId("Nick", 79);
        details.getEmployeeAddress("Chennai");
        details.getEmployeeSalary(74000);
        details.getEmployeeMobileNumber(9821653876l);
    
	}

}
