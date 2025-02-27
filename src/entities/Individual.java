package entities;

public final class Individual extends TaxPayers{

	private Double health;
	
	public Individual() {
		
	}
	
	public Individual(String name, Double salary, Double health) {
		super(name, salary);
		this.health = health;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

	@Override
	public Double taxesPaid() {
		Double som = 0.0;
				if(salary < 20000.0) {
					som = (salary * 0.15) - (health * 0.5);
				}
				else if(salary >= 20000.0) {
					som = (salary * 0.25) - (health * 0.5);
				}
					return som;
	}

}
