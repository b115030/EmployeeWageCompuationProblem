public class EmployeeWage {
public final int WAGE_PER_HOUR=20;
	public final int HOURS_PER_DAY=8;
   public int attendance() {
	   
	   int n=(int)Math.floor((Math.random()*10)%3);
	   return n;
   }
	public static void main(String[] args) {
		EmployeeWage ewc =new EmployeeWage();
		System.out.println("**Welcome to Employee Wage Computation Problem**");
		for(int i=1;i<=20;i++) {
			System.out.print("Wage of Employee on"+i+"th day:");
			if(ewc.attendance()==1) {
				System.out.println((ewc.WAGE_PER_HOUR*ewc.HOURS_PER_DAY)+"Rs");
			}
			else {
				System.out.println("0 Rs");
			}
		}
	}

}
