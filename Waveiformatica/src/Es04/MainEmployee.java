package Es04;

public class MainEmployee {
	public static void main(String [] args) {
		Employee employee = new Employee();
		Employee cavoli = new Employee("piero", 1200);
		cavoli.nomeEmpolyee();
		cavoli.stipendioEmployee();
		cavoli.riseSalary(50);
		cavoli.stipendioEmployee();
	}

}
