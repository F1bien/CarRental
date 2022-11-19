
import java.util.Scanner;
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


	public CarRental (String Name, String Owner) {
		this.name = Name;
		this.owner = Owner;
		this.date_foundation = LocalDate.now();
		this.revenue = 0.0;
	}

	public static void main(String[] args) {

		CarRental rental = new CarRental("", "");
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);
		
		while ( !exit ) {
			System.out.println("Select Option :\n\t" +
									"0) Exit\n\t" +
									"1) Rent Car\n\t" +
									"2) Return Car\n\t" +
									"3) Add Car\n\t" +
									"4) Edit Car" +
									"5) Remote Car\n\t");

			
			String input = scanner.nextLine();

			switch (input) {
				case "0": 
					exit = true;
				break;

				case "1":
					rental.rentCar();
				break;

				case "2":
					rental.returnCar();
				break;

				case "3":
					// input car property

					//rental.addCar(new Car());
				break;

				case "4":

				break;

				case "5":

				break;

				default:
					System.out.println("Error");

			}

		}



	}

	// ------------- Get -------------

	public String getName () {
		return this.name;
	}

	public String  getOwner () {
		return this.owner;
	}

	public String getManager () {
		return this.manager;
	}

	public LocalDate  getDate_foundation () {
		return this.date_foundation;
	}

	public double getRevenue () {
		return this.revenue;
	}


	//public Car getCars ()

	// ------------- Set -------------
	 
	public void setName ( String name ) {
		this.name = name;
	}

	public void setowner ( String owner ) {
		this.owner = owner;
	}

	public void setmanager ( String manager ) {
		this.manager = manager;
	}

	public void setfoundation ( LocalDate date_foundation ) {
		this.date_foundation = date_foundation;
	}

	public void setrvenue ( double revenue ) {
		this.revenue = revenue;
	}

	// ------------- Method -------------

	public void printAllCar() throws InterruptedException {
		try {
            Runtime.getRuntime().exec("clear");
    	}
    	catch (IOException ex) {}
		System.out.println("                  All cars                  \n" + 
							"----------------------------------------------\n");
		for( Car x : this.cars ) {
			System.out.println("\n1) " + x.get_model() + "\t\t" + x.get_licensePlate());
		}
	}

	public void addCar( Car car ) {
		this.cars.add(car);
	}

	public void removeCar( int index ) {
		this.cars.remove(index);
	}

	public void editCar( int index, Car car ) {
		this.cars.set(index, car);
	}


	public void rentCar() {

	}

	public void returnCar() {

	}





}
