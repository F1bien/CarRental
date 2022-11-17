public class Customer {
	private String name;
	private String surname;
	private String dateOfBirth;
	private String licensePlate;
	private String startDateRent;
	private String endDateRent;
	
	public Customer(String name, String sur, String DOB, String lPlate) {
		this.name = name;
		this.surname = sur;
		this.dateOfBirth = DOB;
		this.licensePlate = lPlate;
	}

	// Set

	public void setName(String Name) {
		this.name = Name;
	}
	public void setSurname(String Surname) {
		this.surname = Surname;
	}
	public void setDOB(String DOB) {
		this.dateOfBirth = DOB;
	}
	public void setStartDateRent(String startrent) {
		this.startDateRent = startrent;
	}
	public void setEndDateRent(String endrent) {
		this.endDateRent = endrent;
	}
	
	// Get
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return this.surname;
	}
	
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	public String getLicensePlate() {
		return this.licensePlate;
	}
	
	public String getStartDateRent() {
		return this.startDateRent;
	}
	
	public String getEndDateRent() {
		return this.endDateRent;
	}

}


