import java.io.IOException;
import java.util.Scanner;

public class App {
	

	
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        //assume an account has already been created
        PersonalAccount account = new PersonalAccount("0614");

//        clrscr();
        System.out.println("`*-.,.-*`♩`*-.,.-*`♪`*-.,.-*`♫`*-.,.-*`♬`*-.,.-*`♩");
		System.out.println("Welcome to Jeffery budget management app");
		System.out.println("`*-.,.-*`♩`*-.,.-*`♪`*-.,.-*`♫`*-.,.-*`♬`*-.,.-*`♩");
		System.out.println(" ");

        while(true){

            System.out.println("Please enter your sim number");
            String pass = input.nextLine();

            if(pass.equals(account.getSimNumber())){
                System.out.println("Welcome");
                break;
            }

            System.out.println(
                "Wrong \n\n"+
                "Press [enter] key to try again or press [Q] to exit\n\n"
            );

            if(input.nextLine().toLowerCase().equals("q")){
                System.out.println("See ya bye!");
                System.exit(0);
            }
        }

//        clrscr();

    	account.showMenu();
        input.close();
        }
    
//    public static void clrscr(){
//		//Clears Screen in java
//		try {
//			if (System.getProperty("os.name").contains("Windows"))
//				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//			else
//				Runtime.getRuntime().exec("clear");
//				System.out.print("\033\143");
//		} catch (IOException | InterruptedException ex) {}
//	}
}

