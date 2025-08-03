import java.util.Scanner;
public class runCity
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

			
		 System.out.println("\t\tWhat is Your Name ");
		 String N = input.nextLine();
		  System.out.println("\t\tWhat is Your Address ");
		 String A = input.nextLine();
		  System.out.println("\t\tPlease Enter  Gender ");
		 String G = input.nextLine();
		   System.out.println("\t\tEnter Landline OR Phone Number ");
		 long P = input.nextLong();


		 //scanner
		System.out.println("\t\tThis Is Your Input Requriment " +  " \n\nConfirm  ");
		smallCity sc = new smallCity(N,P,A,G);
		sc.display();


		System.out.println("\t\tPlease Select One Of The Given Option 1 OR 2  " );
				System.out.print("1) I AM Local Person"+"\t");
				System.out.println("2)	I Am Tourist Person");

				int op= input.nextInt();
		
				int option = 1;
				

				if (op == option)
				{
					
					System.out.println("\t\tEneter Your Fourteen Digiets Identity Number :");
					int id = input.nextInt();
					

					local lo = new local(id,"\n \t\t Conformation Done ",N,P,A,G);
					lo.display();
					lo.info();
					
				}
				else{
						

						System.out.println("\t\t Enter Your Passprot Number");
						int pass = input.nextInt();

						
						tourist tu = new tourist("Yes","Canada",pass);
						sc.display();

						tu.display();

				}



		
		

}

	}
