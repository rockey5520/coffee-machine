package machine;
import java.util.Scanner;
public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {
        //printContents();
        mainMenu();
        return;

    }

    private static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Write action (buy, fill, take):");
            String action = scanner.nextLine();
            switch (action){
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    System.out.println("I gave you "+money);
                    money = 0;
                    //printContents();
                    break;
                case "remaining":
                    printContents();
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }

    private static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int addwater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int addcups = scanner.nextInt();
        water+= addwater;
        milk+=addMilk;
        coffeeBeans+=addBeans;
        cups+=addcups;
        //printContents();

    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();

        switch (input){
            case "1":
                buyExpresso();
                break;
            case "2":
                buyLatte();
                break;
            case "3":
                buyCappuccino();
                break;
            default:
                mainMenu();
                break;
        }
    }

    private static void buyCappuccino() {
        if(water >=200 && coffeeBeans >= 12 && milk >=100 && cups >= 1){
            money+=6;
            water-= 200;
            coffeeBeans-=12;
            milk-=100;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
            //printContents();
        }else{
            if(water < 200){
                System.out.println("Sorry, not enough water!");
            }else if(coffeeBeans < 12){
                System.out.println("Sorry, not enough coffee beans!");
            }else if(milk < 100){
                System.out.println("Sorry, not enough milk");
            }else if(cups < 1){
                System.out.println("Sorry, not enough cups");
            }
        }
    }

    private static void buyExpresso() {
        if(water >=250 && coffeeBeans >= 16){
            money+=4;
            water-= 250;
            coffeeBeans-= 16;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
            //printContents();
        }else{
            if(water < 250){
                System.out.println("Sorry, not enough water!");
            }else if(coffeeBeans < 16){
                System.out.println("Sorry, not enough coffee beans!");
            }else if(cups < 1){
                System.out.println("Sorry, not enough cups");
            }
        }
    }

    private static void buyLatte() {
        if(water >=350 && coffeeBeans >= 20 && milk >=75){
            money+=7;
            water-= 350;
            coffeeBeans-=20;
            milk-=75;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
            //printContents();
        }else{
            if(water < 350){
                System.out.println("Sorry, not enough water!");
            }else if(coffeeBeans < 20){
                System.out.println("Sorry, not enough coffee beans!");
            }else if(milk < 75){
                System.out.println("Sorry, not enough milk");
            }else if(cups < 1){
                System.out.println("Sorry, not enough cups");
            }
        }
    }

    private static void printContents() {
        System.out.println("The coffee machine has:");
        System.out.println(water+" of water");
        System.out.println(milk+" of milk");
        System.out.println(coffeeBeans+" of coffee beans");
        System.out.println(cups+" of disposable cups");
        System.out.println("$"+money+" of money");

    }
}