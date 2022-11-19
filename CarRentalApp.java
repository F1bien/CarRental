

public class CarRentalApp {

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
									"5) Remove Car\n\t");

			
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
}
