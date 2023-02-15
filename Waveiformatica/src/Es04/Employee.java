package Es04;

public class Employee {
	private String nome;
	private double stipendio;

	public Employee() {
	}

	public Employee(String nome, double stipendio) {
		this.nome = nome;
		this.stipendio = stipendio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public void nomeEmpolyee() {
		System.out.println(getNome());
	}

	public void stipendioEmployee() {
		System.out.println(getStipendio());
	}

	public void riseSalary(double byPercent) {
		this.stipendio = stipendio + (stipendio * byPercent) / 100;

	}

}
