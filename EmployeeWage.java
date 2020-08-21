public class EmployeeWage {
public int attendance() {
	   
	   int n=(int)Math.floor((Math.random()*10)%3);
	   return n;
   }
	public static void main(String[] args) {
		EmployeeWage ewc =new EmployeeWage();
		System.out.println("**Welcome to Employee Wage Computation Problem**");
		for(int i=1;i<=20;i++) {
			System.out.print("Attendance of Employee on "+i+"th day:");
			if(ewc.attendance()==1) {
				System.out.println("Present");
			}
			else {
				System.out.println("Absent");
			}
		}
	}

}
