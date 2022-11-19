public class Customer {
	private String name;
	private String surname;
	private String dateOfBirth;
	private String licensePlate;
	private String startDateRent;
	private String endDateRent;
	
	//Constructor new object
	public Customer(String name, String sur, String DOB) {
		this.name = name;
		this.surname = sur;
		this.dateOfBirth = DOB;
		this.licensePlate = "";
	}

	// ------------- Get -------------
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

	// ------------- Set -------------

	public void setName(String Name) {
		this.name = Name;
	}
	public void setSurname(String Surname) {
		this.surname = Surname;
	}
	public void setDOB(String DOB) {
		this.dateOfBirth = DOB;
	}
	public void setLicensePlate(String LPlate) {
		this.licensePlate = LPlate;
	}
	public void setStartDateRent(String startrent) {
		this.startDateRent = startrent;
	}
	public void setEndDateRent(String endrent) {
		this.endDateRent = endrent;
	}

}


