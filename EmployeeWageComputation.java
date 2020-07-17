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
