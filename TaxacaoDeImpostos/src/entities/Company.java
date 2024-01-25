package entities;

public class Company extends TaxPayer{
	
	private Integer numberOfemployees;

	public Company(String name, Double anualIncome, Integer numberOfemployees) {
		super(name, anualIncome);
		this.numberOfemployees = numberOfemployees;
	}

	public Integer getNumberOfemployees() {
		return numberOfemployees;
	}

	public void setNumberOfemployees(Integer numberOfemployees) {
		this.numberOfemployees = numberOfemployees;
	}

	@Override
	public double tax() {
		double basicTax; 		
		if(getNumberOfemployees()>10) {
					basicTax= getAnualIncome()*0.14;
				}else {
					basicTax = getAnualIncome()*0.16;
				}return basicTax;
	}
	
	
}
	
	