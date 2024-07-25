
public class Employee {
	
	int id;
	
	String name;
	
	static String company;
	
	public static void main(String[] args) {
		Employee ramesh=new Employee();
		ramesh.id=1;
		ramesh.name="Ramesh";
		ramesh.company="tcs";
		
		System.out.println(ramesh.company);
		
		
		Employee emp2=new Employee();
		emp2.id=2;
		emp2.name="Suresh";
		emp2.company="Infosys";
		
		ramesh.company="--";
		
		System.out.println(emp2.company);
		
		System.out.println(ramesh.company);
	}

}
