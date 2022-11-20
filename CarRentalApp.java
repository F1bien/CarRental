import java.util.Scanner;

public class CarRentalApp {

    public static void main(String[] args) throws InterruptedException {
        int index, num, input;
		CarRental rental = new CarRental("", "");
		boolean exit = false, flag;
		Scanner scanner = new Scanner(System.in);
		
		while ( !exit ) {
			do {
				System.out.println("Select Option :\n\t" +
										"0) Exit\n\t" +
										"1) Rent Car\n\t" +
										"2) Return Car\n\t" +
										"3) Buy Car\n\t" +
										"4) Change Customer\n\t" +
										"5) Remove Car\n\t");

				
				input = scanner.nextInt();
			} while ( input < 0 || input > 5 );

			if(input != 0){
				rental.printAllCar();
			}
				

			switch (input) {
				case 0: 
					exit = true;
				break;

				case 1:
					System.out.print("which car would you like to rent?:\t");
					index = scanner.nextInt();
					System.out.print("Insert customer data(name, surname and DOB):\t");

					flag = rental.rentCar(index, new Customer(scanner.next(), scanner.next(),scanner.next()));
					if (flag == false) {
						System.out.print("La macchina è gia affittata:\t");
					}
				break;

				case 2:

					System.out.print("which car would you like to return?:\t");
					index = scanner.nextInt();
					flag = rental.returnCar(index);
					if (flag == false) {
						System.out.print("La selezionata macchina non è affittata:\t");
					}
				break;

				case 3:

					do {
						System.out.print("would tou lik to buy a new car(1) or a copy of one(0)?:\t");
						num = scanner.nextInt();
					} while ( num != 1 && num != 0 );

					if(num == 0){
						System.out.print("which car would you like to buy?:\t");
						index = scanner.nextInt();
						System.out.print("which car would you like to buy again?:\t");
						rental.addCar(new Car(rental.getCar(index), scanner.next(),  scanner.next()));
					}
					if(num == 1){
						System.out.print("Insert the cars data licensePlate, brand, model, cilindrata, anno, seats, price:\t");
						rental.addCar(new Car(  scanner.next(), scanner.next(),scanner.next(),scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextFloat()));
					}
				break;

				case 4:
					System.out.print("which car would you like to change the customer of?:\t");
					index = scanner.nextInt();

					System.out.print("Insert new customers data(name, surname and DOB):\t");
					flag = rental.changeCustomer(index, new Customer(scanner.next(), scanner.next(),scanner.next()));

					if (flag == false) {
						System.out.print("La selezionata macchina non è affittata:\t");
					}
					
				break;

				case 5:
					System.out.print("which car would you like to remove?:\t");
					index = scanner.nextInt();
					System.out.print("Insert the new customers data(name, surname and DOB):\t");
					rental.removeCar(index);
					
				break;

				default:
					System.out.println("Error");
			}
		}
		scanner.close();
	}
}
