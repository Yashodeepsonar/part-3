class Employee{
	int salary;
	public void Employee(int salary)
	{
		this.salary=30000;

	}
	public void work(){
		System.out.println("work as employee");
	}
	public int getsalary(){
	return salary;
}
}
public class HRManager extends Employee{
	public HRManager(int salary){
		super(salary);
	}
	public void main(){
		System.out.println("managing Employee");
	}
	public void addEmployee(){
		System.out.println("Add Employee")
	}
}
public class Main{
	public static void main(String[] args) {
		Employee employee=new Employee();
		
	}
}