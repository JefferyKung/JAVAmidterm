import java.util.Scanner;

public class PersonalAccount {

    private int balance;
    private int previousTransaction;
    private String simNumber;
//    private static double realmonthlyBudget;

//	public static double setrealMonthlyBudget(double value) {
//		return realmonthlyBudget=value;
//		
//	}
//	
//	public static void printrealMonthlyBudget() {
//		System.out.println(realmonthlyBudget);
//	}

	
	
	
	public PersonalAccount(String simNumber) {
		super();
		this.simNumber = simNumber;
	}
	
	public String getSimNumber() {
		return simNumber;
	}

	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}

    void deposit(double amount) {
        if(amount > 0){
            balance = (int) (balance + amount);
            previousTransaction = (int) amount;
        }else{
            errorMessage("Invalid amount. Please enter correct amount.");
        }
    }


    void errorMessage(String message){
        System.out.println("\n--------------------------------------");
        System.out.println("!!! " + message);
        System.out.println("--------------------------------------\n");
    }

    // A->設定預算
    // B->記帳
    
    void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("`*-.,.-*`♩`*-.,.-*`♪`*-.,.-*`♫`*-.,.-*`♬`*-.,.-*`♩");
            System.out.println("Hi! How are you doing today? What do you want to do?");
            System.out.println("`*-.,.-*`♩`*-.,.-*`♪`*-.,.-*`♫`*-.,.-*`♬`*-.,.-*`♩");
            System.out.println("a: Monthly budget calculation helper");
            System.out.println("b: Add your expense");
            System.out.println("c: Set budget and Track your expense percentage");
            System.out.println("e: Quit");
            option = scanner.next().charAt(0); // [a]bcdef

//            App.clrscr();

            
            switch (option) {
                case 'a':
                
                {
                    System.out.println("--------------------------------------");
                    System.out.println("Let's start to calculate your monthly budget");
                    //在餐廳吃飯
                    System.out.println("How many breakfast & lunch do you usually eat out per week?");
                    double mealBLTimes = scanner.nextDouble();
                    System.out.println("How much do you usually spend per meal for breakfast & lunch?");
                    double mealBLMoney = scanner.nextDouble();
                    System.out.println("How many meals do you usually eat out per week for dinner?");
                    double mealDTimes = scanner.nextDouble();
                    System.out.println("How much do you usually spend per meal for dinner?");
                    double mealDMoney = scanner.nextDouble();                   
                    double restaurant = ((mealBLTimes*mealBLMoney)+(mealDTimes*mealDMoney)*4);
                    System.out.println("your monthly budget in restaurant is:" + restaurant);
                    System.out.println("\n");
                    // 喝酒&大麻
                    System.out.println("How much do you usually spend for extra buying alcohol per week?");
                    double alcoholPerWeek = scanner.nextDouble();
                    System.out.println("How much do you usually spend for weed per month?");
                    double WeedPerMonth = scanner.nextDouble();
                    //grocery
                    System.out.println("How much do you usually spend for grocery shopping per week?");
                    double grocery = scanner.nextDouble();
                    //hair cut
                    System.out.println("How much do you spend for hair-cutting per month?");
                    double hair = scanner.nextDouble();
                    //transportation
                    System.out.println("How much do you spend for compass card per month?");
                    double transportation = scanner.nextDouble();
                    //MSP
                    System.out.println("How much do you spend for health insurance per month?");
                    double insurance = scanner.nextDouble();
                    //fido
                    System.out.println("How much do you spend for cellphone plan per month?");
                    double phone = scanner.nextDouble();
                    //housing
                    System.out.println("How much is your housing rent per month?");
                    double housing = scanner.nextDouble();
                    //shopping
                    System.out.println("How much is your ideal spend on shopping and entertainment per month?");
                    double shopping = scanner.nextDouble();
                    
                    double monthlyBudget = restaurant + (alcoholPerWeek*4) + WeedPerMonth + (grocery*4) +hair+transportation+insurance+phone+housing+shopping;
                    System.out.println("questions are finish");
                    System.out.println("\n");
                    System.out.println("You need $" + monthlyBudget +" for one month");
                    System.out.println("\n");
                    System.out.println("According to the currency rate on July 8th, it's equal to $" + monthlyBudget*22.97 +" in Taiwanese dollar.");
                    System.out.println("And $" + monthlyBudget*105.10 +" in Japanese yen.");
                    System.out.println("--------------------------------------");
                    System.out.println("A single person estimated monthly costs are 1,276.67C$ without rent (resource->numbeo.com)");
                   
                    
                    if((monthlyBudget-housing)>1276.67) {
                    	System.out.println("You might spend too much money.");
                    }else if((monthlyBudget-housing)<=1276.67) {
                    	System.out.println("Your monthly budget is within average level.");
                    }
                    System.out.println("\n");                    
                    System.out.println("Vancouver is the most expensive city in Canada (1 out of 12), resource->expatistan.com");
                    System.out.println("--------------------------------------");
                    System.out.println("\n");
                    
//                    setrealMonthlyBudget(monthlyBudget);
                    break;
                    }
                    
                	
     

                case 'b':
                    System.out.println("--------------------------------------");
                   

                    System.out.println("\n");

                    try {

                        System.out.println("Enter an amount that you spent today");
                    	
                        double amount = scanner.nextDouble();
                        deposit(amount);
//                        printrealMonthlyBudget();
                        

                    } catch (Exception e) {
                        errorMessage("Wrong Input! Only integers please");
                    }

                    break;

                case 'c':
                	System.out.println("--------------------------------------");

                    System.out.println("\n");

                    try {
                    	System.out.println("Enter an amount of your monthly budget");
                    	double monthlyBudget = scanner.nextDouble();
                        double percentage = (balance / monthlyBudget) *100;
//                        double percentage2= (balance / realmonthlyBudget) *100;
       
						System.out.println("You already spent $" +balance+" in this month. Which is "+ percentage+"% of this month budget." );
//						System.out.println("You already spent $" +balance+" in this month. Which is "+ percentage2+"% of this month budget." );
                    } catch (Exception e) {
                        errorMessage("Wrong Input! Only integers please");
                    }

                    break;

                case 'e':
                    System.out.println("--------------------------------------");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        } while (Character.toLowerCase(option) != 'e');
        System.out.println("Thank you for using this app!");
        scanner.close();
    }
}

