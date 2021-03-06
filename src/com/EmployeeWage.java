import java.util.*;
public class EmployeeWage {
	
	public static void main(String[] args) {
		Scanner readIn=new Scanner(System.in);
		System.out.println("**Welcome to Employee Wage Computation Problem**");
		System.out.println("How Many Comapanies Do you want to compute Employee wage for?");
		int n=readIn.nextInt();
		List<CompanyEmpWage> ewc=new ArrayList<>();
		for (int i=0;i<n;i++) {
		System.out.println("Enter the following for "+(i+1)+"th Comapny" );
		System.out.println("Daily wage per hour");
		int dailyWage=readIn.nextInt();
		System.out.println("Number of hours for a full day");
		int fullTime=readIn.nextInt();
		System.out.println("Number of hours for a half day");
		int halfTime=readIn.nextInt();
		System.out.println("Maximum of working hours in a month");
		int maxHours=readIn.nextInt();
		System.out.println("Maximum of working days in a month");
		int maxDays=readIn.nextInt();
		ewc.add(new CompanyEmpWage(dailyWage,halfTime,fullTime,maxDays,maxHours));
		}
		ewc.forEach(user->{
			System.out.println("Employee Wage Computation of Company");
			user.employeeWageComp();
		}); 
			
		}
	}
interface EmpWageBuilder{
	int attendance();
	void employeeWageComp();
}
class CompanyEmpWage implements EmpWageBuilder{
int WAGE_PER_HOUR,HALF_HOURS_PER_DAY,FULL_HOURS_PER_DAY,MAX_DAYS,MAX_HOURS,total_hours,wage,total_monthly_wage;
	
	CompanyEmpWage(int WAGE_PER_HOUR,int HALF_HOURS_PER_DAY,int FULL_HOURS_PER_DAY,int MAX_DAYS,int MAX_HOURS){
	this.FULL_HOURS_PER_DAY=FULL_HOURS_PER_DAY;
	this.HALF_HOURS_PER_DAY=HALF_HOURS_PER_DAY;
	this.WAGE_PER_HOUR=WAGE_PER_HOUR;
	this.MAX_DAYS=MAX_DAYS;
	this.MAX_HOURS=MAX_HOURS;
	}
   public int attendance() {
	   
	   int n=(int)(Math.random()*3);
	   return n;
   }
	public void employeeWageComp() {	

		for(int i=1;i<=MAX_DAYS&&total_hours<MAX_HOURS;i++) {
			System.out.print("Wage of Employee on "+i+"th day:");
			switch(attendance()) {
			case 1: total_hours+=FULL_HOURS_PER_DAY;
					wage=WAGE_PER_HOUR*FULL_HOURS_PER_DAY;
					System.out.println(wage+" Rs");
					total_monthly_wage+=wage;
					break;
			case 2: total_hours+=HALF_HOURS_PER_DAY;
					wage=WAGE_PER_HOUR*HALF_HOURS_PER_DAY;
					System.out.println(wage+" Rs");
					total_monthly_wage+=wage;
					break;
			default: System.out.println("0 Rs");
			}
			
		}
		System.out.println("Total Monthly Wage for Employee "+total_monthly_wage+" Rs");
		
}
}
