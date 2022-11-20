public class Car {

	private	String licensePlate;
	private	String brand;
	private	String model;
	private	double cilindrata;
	private	String anno;
	private	int seats;
	private	double price;
	private	Customer cli;
	private	boolean rented;
		
	//Constructor new object
	public Car (String licensePlate, String brand, String model, double cilindrata, String anno, int seats, double price ) {
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.model = model;
		this.cilindrata = cilindrata;
		this.anno = anno;
		this.seats =  seats;
		this.price = price;
		this.rented = false;
	}

	//Constructor copy object
	public Car(Car car, String anno,String licensePlate ) {
		
		this.anno = anno;
		this.licensePlate = licensePlate;
		this.brand = car.brand;
		this.model = car.model;
		this.cilindrata = car.cilindrata;
		this.seats =  car.seats;
		this.price = car.price;
		this.rented = false;

	}
	
	// ------------- Get -------------
	
	public String get_brand() {
		return brand;
	}
	public String get_licensePlate() {
		return licensePlate;
	}
	public String get_model() {
		return model;
	}
	public double get_cilindrata() {
		return cilindrata;
	}
	public String get_anno() {
		return anno;
	}
	public int get_seats() {
		return seats;
	}
	public double get_price() {
		return price;
	}
	public boolean get_rented() {
		return rented;
	}
	
	// ------------- Set -------------
	
	public void set_brand(String brand) {
		this.brand = brand;
	}
	public void set_licensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public void set_model(String model) {
		this.model = model;
	}
	public void set_cilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}
	public void set_anno(String anno) {
		this.anno = anno;
	}
	public void set_seats(int seats) {
		this.seats =  seats;
	}
	public void set_price(double price) {
		this.price = price;
	}
	public void set_rented(boolean rented) {
		this.rented = rented;
	}
	 
	// ------------- Methods -------------

	public boolean rent_car(Customer customer) {
		 
		if(this.rented == false){	
			this.cli = customer;
			this.cli.setLicensePlate(this.licensePlate);
			set_rented(true);
			return true;
		}

		return false;
		
	}
	 
	public boolean return_car() {
		
		if(this.rented == true) {
			this.cli  = null;
			set_rented(false);
			return true;
		}

		return false;
	}

	public boolean change_customer(Customer c) {
		
		if(this.rented == true) {
			this.cli  = c;
			return true;
		}

		return false;
	}
	
	
	
	 
	 

}