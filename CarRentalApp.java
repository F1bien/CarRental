import java.util.Scanner;

public class CarRentalApp {

    public static void main(String[] args) throws InterruptedException {
        int index;
		CarRental rental = new CarRental("", "");
		boolean exit = false, flag;
		Scanner scanner = new Scanner(System.in);
		String input, name, surname, DOB;

		while ( !exit ) {
			System.out.println("Select Option :\n\t" +
									"0) Exit\n\t" +
									"1) Rent Car\n\t" +
									"2) Return Car\n\t" +
									"3) Buy Car\n\t" +
									"4) Change Customer\n\t" +
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
					flag = rental.rentCar(index, c);
					if (flag == false) {
						System.out.print("La macchina è gia affittata:\t");
					}
				break;

				case "2":
					System.out.print("which car would you like to return?:\t");
					index = scanner.nextInt();
					flag = rental.returnCar(index);
					if (flag == false) {
						System.out.print("La selezionata macchina non è affittata:\t");
					}
				break;

				case "3":
					do {
						System.out.print("would tou lik to buy a new car(1) or a cop of one(2)?:\t");
						flag = scanner.nextInt();
					} while ( flag != 1 && flag != 2 );
				break;

				case "4":

				break;

				case "5":

				break;

				case "6":

				break;

				default:
					System.out.println("Error");
			}
		}
		scanner.close();
	}
}
