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

public class EmpWageComputation {

	final static int WAGE_PER_HOUR=20; //Assigned wage per hour with 20
	final static int FULL_TIME=2; //Assigned full time with 2
	final static int PART_TIME=1; //Assigned part time with 1
	final static int MAX_WORKING_DAYS=20; //Assigned maximum working days in month with 20
	final static int MAX_WORKING_HOURS=100; //Assigned maximum working hours in month with 100
	static int dailyWage;	 //Stores dailyWage of employee
	static int workHours;  //Stores work hour of employee
	static int totalWorkingDays=1; //Stores total working days of an employee in month
	static int totalWages=0; //Stores total wages in a month
	static int totalWorkingHrs=1; //Stores total working hours of an employee in month
	
	//Computes DailWage of an Employee
	public static int ComputeDailyWage(int hours) {
		return hours*WAGE_PER_HOUR;
	} 
	public static void main(String[] args) {
		int attendence; //Stores value of employee attendance 
		
		//Continues till totalWorkings days reached maximum working days
		while(totalWorkingDays<=MAX_WORKING_DAYS || totalWorkingHrs<=MAX_WORKING_DAYS) {
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
		totalWorkingHrs+=workHours; //Increments by workHours
		totalWages+=dailyWage; //sum of daily wages in month
		dailyWage=0; // Assigns daily wage to 0 for the purpose of next iteration
		totalWorkingDays++;
	}
		System.out.println("Total Wages in a month = "+totalWages);
} }


public class EmployeeWage
{
	private static final int fullTime = 1;
	private static final int partTime = 2;

	private static int employeeMonthlyWage( int wagePerHour, int fullDayHour, int dayPerMonth, int totalHours ) {
		//variable
		int dailyWage;
		int dailyHours;
		int monthlyWage = 0;
		int hours = 0;
		int day = 0;
		//computation
		while ( hours <= totalHours && day <= dayPerMonth )
		{
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
			hours += dailyHours;
			day++;
			dailyWage = wagePerHour * dailyHours;
			monthlyWage += dailyWage;
      }
		return monthlyWage;
	}

	public static void main(String args[]){
		System.out.println("Employee monthly wage is "+employeeMonthlyWage(20, 8, 20, 100));
}

}


public class EmployeeWageComputation
{
	private static final int fullTime = 1;
	private static final int partTime = 2;

	private static String company;
	private static int wagePerHour;
	private static int fullDayHour;
	private static int totalHours;
	private static int dayPerMonth;

	employeeWage( String company, int wagePerHour, int fullDayHour, int totalHours, int dayPerMonth) {
		this.company=company;
		this.wagePerHour = wagePerHour;
		this.fullDayHour = fullDayHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}

	private static void employeeMonthlyWage() {
		//variable
		int dailyWage;
		int dailyHours;
		int monthlyWage = 0;
		int hours = 0;
		int day = 0;
		//computation
		while ( hours <= totalHours && day <= dayPerMonth )
		{
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
			hours += dailyHours;
			day++;
			dailyWage = wagePerHour * dailyHours;
			monthlyWage += dailyWage;
      }
		System.out.println("Monthly Wage of "+company+" is: "+monthlyWage);
	}

	public static void main(String args[]){
		employeeWage company1 = new employeeWage("Jio", 24, 8, 120, 20);
		company1.employeeMonthlyWage();
		employeeWage company2 = new employeeWage("infosys", 20, 8, 100, 20);
		company2.employeeMonthlyWage();  
}

}


public class EmployeeWageComputation
{
	private static final int fullTime = 1;
	private static final int partTime = 2;

	//variable
	private static String company;
	private static int wagePerHour;
	private static int fullDayHour;
	private static int totalHours;
	private static int dayPerMonth;
	private static int dailyWage, dailyHours, monthlyWage, hours, day;

	employeeWage( String company, int wagePerHour, int fullDayHour, int totalHours, int dayPerMonth) {
		this.company=company;
		this.wagePerHour = wagePerHour;
		this.fullDayHour = fullDayHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}

	private static int employeeMonthlyWage() {
		int dailyWage = 0, dailyHours = 0, monthlyWage = 0, hours = 0, day = 0;
		//computation
		while ( hours <= totalHours && day <= dayPerMonth )
		{
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
			hours += dailyHours;
			day++;
			dailyWage = wagePerHour * dailyHours;
			monthlyWage += dailyWage;
      }
		return monthlyWage;
	}

	public static void main(String args[]){
		Map<String, Integer> company = new HashMap<>();
		employeeWage company1 = new employeeWage("Jio", 24, 8, 120, 20);
		company.put("Jio",company1.employeeMonthlyWage());
		employeeWage company2 = new employeeWage("infosys", 20, 8, 100, 20);
		company.put("infosys",company2.employeeMonthlyWage());
		System.out.println("Jio : "+company.get("Jio"));
		System.out.println("infosys : "+company.get("infosys"));  
}

}

public class EmployeeWage
{
//constant
	private static final int fullTime = 1;
	private static final int partTime = 2;
	//variable
	private static String company;
	private static int wagePerHour;
	private static int totalHours;
	private static int dayPerMonth;

	ComputeEmployeeWage( String company, int wagePerHour, int totalHours, int dayPerMonth) {
		this.company=company;
		this.wagePerHour = wagePerHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}

	public String getCompany() {
		return this.company;
	}

	public static int employeeMonthlyWage() {
		int dailyWage = 0, dailyHours = 0, monthlyWage = 0, hours = 0, day = 0, fullDayHour = 8;
		//computation
		while ( hours <= totalHours && day <= dayPerMonth )
		{
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
			hours += dailyHours;
			day++;
			dailyWage = wagePerHour * dailyHours;
			monthlyWage += dailyWage;
      }
		return monthlyWage;
	}
}

public class employeeWage {

	public static ComputeEmployeeWage companyWage[] = new ComputeEmployeeWage[2];

	public static void main(String args[]){
		companyWage[0] = new ComputeEmployeeWage("Jio", 24, 120, 20);
		System.out.println(companyWage[0].getCompany()+" : "+companyWage[0].employeeMonthlyWage());
		companyWage[1] = new ComputeEmployeeWage("infosys", 20, 100, 20);
		System.out.println(companyWage[1].getCompany()+" : "+companyWage[0].employeeMonthlyWage());
}

}
