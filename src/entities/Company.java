package entities;

public final class Company extends TaxPayers {
	private Integer employees;
	
	public Company() {
		super();
	}

	public Company(String name, Double salary, Integer employees) {
		super(name, salary);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double taxesPaid() {
		Double som = 0.0;
		if (employees > 10) {
			som = salary * 0.14;
		}
		else{
			som = salary * 0.16;
		}
		return som;
	}
	
	
}
