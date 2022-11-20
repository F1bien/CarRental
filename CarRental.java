
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CarRental {

	private String name;
	private String owner;
	private String manager;
	private LocalDate date_foundation;
	private double revenue;

	private ArrayList<Car> cars;

	// Constructor new object
	public CarRental(String Name, String Owner) {
		this.name = Name;
		this.owner = Owner;
		this.manager = Owner;
		this.date_foundation = LocalDate.now();
		this.revenue = 0.0;
		this.cars = new ArrayList<Car>();
	}

	// ------------- Get -------------

	public String getName() {
		return this.name;
	}

	public String getOwner() {
		return this.owner;
	}

	public String getManager() {
		return this.manager;
	}

	public LocalDate getDate_foundation() {
		return this.date_foundation;
	}

	public double getRevenue() {
		return this.revenue;
	}

	public Car getCar(int index) {
		return this.cars.get(index);
	}

	// public Car getCars ()

	// ------------- Set -------------

	public void setName(String name) {
		this.name = name;
	}

	public void setowner(String owner) {
		this.owner = owner;
	}

	public void setmanager(String manager) {
		this.manager = manager;
	}

	public void setfoundation(LocalDate date_foundation) {
		this.date_foundation = date_foundation;
	}

	public void setrvenue(double revenue) {
		this.revenue = revenue;
	}

	// ------------- Methods -------------

	public void printAllCar() throws InterruptedException {
		int i = 0;
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException ex) {
		}
		System.out.println("                  All cars                  \n" +
				"----------------------------------------------\n");
		for (Car x : this.cars) {
			System.out.println(i + ") " + x.get_brand() + "\n\n" + x.get_model() + "\t\t" + x.get_licensePlate()
					+ "\t\trented:" + x.get_rented() + "\n");
		}
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}

	public void removeCar(int index) {
		this.cars.remove(index);
	}

	public boolean rentCar(int index, Customer customer) {
		boolean flag;
		flag = this.cars.get(index).rent_car(customer);
		return flag;
	}

	public boolean returnCar(int index) {
		boolean flag;
		flag = this.cars.get(index).return_car();
		return flag;
	}

	public boolean changeCustomer(int index, Customer c) {
		boolean flag;
		flag = this.cars.get(index).change_customer(c);
		return flag;
	}

}
