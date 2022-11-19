import java.util.Scanner;

public class CarRentalApp {

    public static void main(String[] args) {
        int i=0, index;
		CarRental rental = new CarRental("", "");
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);
		String input, name, surname, DOB;

		while ( !exit ) {
			System.out.println("Select Option :\n\t" +
									"0) Exit\n\t" +
									"1) Rent Car\n\t" +
									"2) Return Car\n\t" +
									"3) Add Car\n\t" +
									"4) Edit Car\n\t" +
									"5) Remove Car\n\t");

			
			input = scanner.nextLine();

			if(input != "0"){
				rental.printAllCar();
			}
				

			switch (input) {
				case "0": 
					exit = true;
				break;

				case "1":
					System.out.print("which car would you like to rent?:\t");
					index = scanner.nextInt();
					System.out.print("Insert customer data(name, surname and DOB):\t");
					name = scanner.next();
					surname = scanner.next();
					DOB = scanner.next();
					Customer c = new Customer(name, surname, DOB);
					rental.rentCar(index, c);

				break;

				case "2":
					System.out.print("which car would you like to return?:\t");
					index = scanner.nextInt();
					rental.returnCar(index);
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
		scanner.close();
	}
}
