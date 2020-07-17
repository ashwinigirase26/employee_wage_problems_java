public class EmpWageComputation {

	final static int WAGE_PER_HOUR=20; //Assigned wage per hour as 20
	static int dailyWage=0;	 //Stores dailyWage of employee
	static int workHours=0;  //Stores work hour of employee
	
	//Computes DailWage of an Employee
	public static int ComputeDailyWage(int hours) {
		return hours*WAGE_PER_HOUR;
	} 
	public static void main(String[] args) {
		int attendence=(int)(Math.random()*3); // Generates 0,1 or 2 using random() and stores the value
		
		//Checks if Employee is working full time , part time or absent
		if(attendence==2) {
			System.out.println("Employee is Present for Full Time");
			workHours=8;
			dailyWage=ComputeDailyWage(workHours);;
		}
		else if(attendence==1) {
			System.out.println("Employee is Present for Part Time");
			workHours=4;
			dailyWage=ComputeDailyWage(workHours);;
		}
		else
			System.out.println("Employee is Absent");

		System.out.println("Daily Wage of an Employee "+dailyWage);
	}

}

public class EmployeeWageComputation
{

public static void main(String args[]){
System.out.println("*********Welcome To Employee Wage System**********");
		//constant
		final int fullTime = 1;
		final int partTime = 2;
		final int wagePerHour = 20;
		final int fullDayHour = 8;
		//variable
		int dailyWage;
		int dailyHours;
		//computation
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case fullTime:
				dailyHours = fullDayHour;
				break;
			case partTime:
				dailyHours = fullDayHour / 2;
				break;
			default:
				dailyHours = 0;
				break;
		}
		System.out.println("Employee daily wage is "+(wagePerHour * dailyHours));		
}

}
