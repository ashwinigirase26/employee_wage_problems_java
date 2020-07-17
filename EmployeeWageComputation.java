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
public class EmployeeWageComputation {

	final static int WAGE_PER_HOUR=20; //Assigned wage per hour with 20
	final static int FULL_TIME=2; //Assigned full time with 2
	final static int PART_TIME=1; //Assigned part time with 1
	final static int MAX_WORKING_DAYS=20; //Assigned maximum working days in month with 20
	static int dailyWage;	 //Stores dailyWage of employee
	static int workHours;  //Stores work hour of employee
	static int totalWorkingDays=1; //Stores total working days of an employee in month
	static int totalWages=0; //Stores total wages in a month
	
	//Computes DailWage of an Employee
	public static int ComputeDailyWage(int hours) {
		return hours*WAGE_PER_HOUR;
	} 
	public static void main(String[] args) {
		int attendence; //Stores value of employee attendance 
		
		//Continues till totalWorkings days reached maximum working days
		while(totalWorkingDays<=MAX_WORKING_DAYS) {
			attendence=(int)(Math.random()*3); // Generates 0,1 or 2 using random() and stores the value
			
			/*Checks if Employee is working full time,part time or absent and store work hours and calculate daily wage of employee
		  	according to work time*/
			switch(attendence) {
				case FULL_TIME: workHours=8;
								dailyWage=ComputeDailyWage(workHours);
								break;
						
				case PART_TIME: workHours=4;
								dailyWage=ComputeDailyWage(workHours);
								break;
						
				default:		workHours=0;
		
		}
		
		System.out.println("Daily Wage of an Employee on Day "+totalWorkingDays+" is "+dailyWage);
		totalWages+=dailyWage; //sum of daily wages in month
		dailyWage=0; // Assigns daily wage to 0 for the purpose of next iteration
		totalWorkingDays++;
	}
		System.out.println("Total Wages in a month = "+totalWages);
} }
