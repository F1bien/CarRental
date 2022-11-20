import java.util.Scanner;

public class CarRentalApp {

    public static void main(String[] args) throws InterruptedException {
        int i=0, index, num = 0;
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
					if (flag == true) {

					}

				break;

				case "2":

					System.out.print("which car would you like to return?:\t");
					index = scanner.nextInt();
					rental.returnCar(index);

				break;

				case "3":
					
				System.out.print("which cars would you like to ....... ?:\t");
				//inserire scelta dei per comprare

				

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
