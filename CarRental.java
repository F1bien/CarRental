/*

	- name: String
	- owner: String
	- manager: String
	- foundation: String
	- headquarters: String
	- revenue: float[][]
	- cars: Car[]

	--------------------------------------

	+ CarRental(Name:String,):CarRental

	\\ Get

	+ get_Name():String
	+ get_foundation():String 
	+ get_headquarters():String 
	+ get_revenue(): float[][]
	+ get_owner() : String 
	+ get_manager():String
	+ get_cars():Car[]

	\\ Set
	 
	+ set_Name(Name:String):void
	+ set_foundation(foundation:String):void
	+ set_headquarters(headquarters:String):void
	+ set_rvenue(revenue:float[]):void
	+ set_manager(manager:String):void
	+ set_owner(owner:String):void

	// method

	+ buy_car(cars:Car):void

*/

import java.time.LocalDate;
import java.util.ArrayList;

public class CarRental {

	private String name;
	private String owner;
	private String manager;
	private String date_foundation;
	private float revenue;


	private ArrayList<Car> cars;


	public CarRental (String Name, String Owner) {
		this.name = Name;
		this.owner = Owner;
		this.date_foundation = LocalDate.now();
		this.revenue = 0.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarRental rental = new CarRental();
		boolean exit = false;

		while ( !exit ) {
			System.out.println("Select Option :\n\t" +
									"0) Exit\n\t" +
									"1) Rent Car\n\t" +
									"2) Add Car\n\t" +
									"3) boh");

			char input = reader.findInLine(".").charAt(0);

			switch (input) {
				case 0: 
					exit = true;
				break;

				case 1: 
					
				break;

				case 2: 
					// input car property
					rental.addCar();
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

	public String  getDate_foundation () {
		return this.date_foundation;
	}

	public float getRevenue () {
		return this.revenue;
	}


	public Car getCars ()

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

	public void setfoundation ( String date_foundation ) {
		this.date_foundation = date_foundation;
	}

	public void setrvenue ( float revenue ) {
		this.revenue = revenue;
	}


	// ------------- Method -------------

	public void addCar( Car car ) {
		this.cars.add(car);
	}




}
