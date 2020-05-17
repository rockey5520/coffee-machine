package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int containsWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int containsMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int containsCofeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int numberOfCups = scanner.nextInt();
        int numberOfCupsICanMake = 0;
        while (containsWater >= 200 && containsMilk >= 50 && containsCofeeBeans >= 15){
            numberOfCupsICanMake++;
            containsWater-= 200;
            containsMilk-= 50;
            containsCofeeBeans-= 15;
        }

        if(numberOfCups == numberOfCupsICanMake){
            System.out.println("Yes, I can make that amount of coffee");
        }else if(numberOfCupsICanMake > numberOfCups){
            System.out.println("Yes, I can make that amount of coffee (and even "+(numberOfCupsICanMake - numberOfCups)+ "more than that)");
        }else{
            System.out.println("No, I can make only "+numberOfCupsICanMake +" cup(s) of coffee");
        }

    }
}
