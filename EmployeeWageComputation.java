public class EmployeeWageComputation {

	public static void main(String[] args) {
		int attendence=(int)(Math.random()*2); // Generates 0 or 1 using random() and stores the value
		
		//Checks if Employee is present or absent
		if(attendence==1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}

public class EmployeeWageComputation {

	final static int WAGE_PER_HOUR=20; //Assigned wage per hour as 20
	static int dailyWage=0;	 //Stores dailyWage of employee
	static int workHours=0;  //Stores work hour of employee
	public static void main(String[] args) {
		int attendence=(int)(Math.random()*2); // Generates 0 or 1 using random() and stores the value
		
		//Checks if Employee is present or absent
		if(attendence==1) {
			System.out.println("Employee is Present");
			workHours=8;
			dailyWage=workHours*WAGE_PER_HOUR;
		}
		else
			System.out.println("Employee is Absent");

		System.out.println("Daily Wage of an Employee "+dailyWage);
	}

}
