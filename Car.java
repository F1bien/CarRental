public class Car {

	private	String licensePlate;
	private	String brand;
	private	String model;
	private	double cilindrata;
	private	String anno;
	private	int seats;
	private	double price;
	private	Customer custumer;
	private	boolean rented;
		
	
	public Car(String licensePlate, String brand, String model, double cilindrata, String anno, int seats,
				double price, boolean rented )
	{
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.model = model;
		this.cilindrata = cilindrata;
		this.anno = anno;
		this.seats =  seats;
		this.price = price;
		this.rented = rented;
	}
	
	//get
	
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
	
	//set
	
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
	 void set_rented(boolean rented) {
		this.rented = rented;
	}
	 
	 
	 public boolean rent_car(Costumer costumer) {
		 
		if(this.rented == false){	
		this.costumer = costumer;
		set_rented(true);
		return true;
		}
		return false;
		
	 }


	
	
	
	
}
