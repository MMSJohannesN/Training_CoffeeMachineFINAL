package machine;

import java.util.Scanner;

public class CoffeeMachine6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //---------- Beginn Task 1 ----------
        /*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        */
        //---------- Ende Task 1 ----------


        int oneWater = 200;
        int oneMilk = 50;
        int oneCoffeeBeans = 15;


        //---------- Beginn Task 3 ----------
        /*
        System.out.println("Write how many ml of water the coffee machine has: ");
        int amountWaterInMachine = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");
        int amountMilkInMachine = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int amountCoffeeBeansInMachine = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int amountCoffee = scanner.nextInt();


        int ableToMakeWater = amountWaterInMachine / oneWater;
        int ableToMakeMilk = amountMilkInMachine / oneMilk;
        int ableToMakeCoffeeBeans = amountCoffeeBeansInMachine / oneCoffeeBeans;

        int [] numberOfAbleToMake = {ableToMakeWater, ableToMakeMilk, ableToMakeCoffeeBeans};
        Arrays.sort(numberOfAbleToMake);
        int howMuchEvenMore = numberOfAbleToMake[0] - amountCoffee;

        if(numberOfAbleToMake[0] >= amountCoffee) {
            System.out.println("Yes, I can make that amount of coffee (and even " + howMuchEvenMore + " more than that)");
        }else {
            System.out.println("No, I can make only " + numberOfAbleToMake[0] + " cup(s) of coffee");
        }
        */
        //---------- Ende Task 3 ----------


        //---------- Beginn Task 2 ----------
        /* Dieser Teil wird nun in Task 3 verwendet!
        System.out.println("Write how many cups of coffee you will need: ");
        int amountCoffee = scanner.nextInt();
        */
        /*
        System.out.println("For " + amountCoffee + " cups of coffee you will need: ");
        int totalWater = oneWater * amountCoffee;
        int totalMilk = oneMilk * amountCoffee;
        int totalCoffeeBeans = oneCoffeeBeans * amountCoffee;
        System.out.println(totalWater + " ml of water");
        System.out.println(totalMilk + " ml of totalMilk");
        System.out.println(totalCoffeeBeans + " g of oneCoffeeBeans");
        */
        //---------- Ende Task 2 ----------

        //---------- Beginn Task 5 ----------
        int fixedAmountWaterInMachine = 400;
        int fixedAmountMilkInMachine = 540;
        int fixedAmountCoffeeBeansInMachine = 120;
        int fixedAmountDisposableCups = 9;
        int fixedAmountMoneyInMachine = 550;
        /*
        System.out.println("The coffee machine has: ");
        System.out.println(fixedAmountWaterInMachine + " of water");
        System.out.println(fixedAmountMilkInMachine + " of milk");
        System.out.println(fixedAmountCoffeeBeansInMachine + " of coffee beans");
        System.out.println(fixedAmountDisposableCups + " of disposable cups");
        System.out.println(fixedAmountMoneyInMachine + " of money");
        */

        String actionInput = "";

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            actionInput = scanner.next();
        if(actionInput.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");


            String buyInput = scanner.next();
            if(buyInput.equals("1")) {

                if(fixedAmountWaterInMachine < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if(fixedAmountCoffeeBeansInMachine < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(fixedAmountDisposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    fixedAmountWaterInMachine = fixedAmountWaterInMachine - 250;
                    fixedAmountCoffeeBeansInMachine = fixedAmountCoffeeBeansInMachine - 16;
                    fixedAmountDisposableCups = fixedAmountDisposableCups - 1;
                    fixedAmountMoneyInMachine = fixedAmountMoneyInMachine + 4;
                }

            }else if(buyInput.equals("2")) {

                if(fixedAmountWaterInMachine < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if(fixedAmountMilkInMachine < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if(fixedAmountCoffeeBeansInMachine < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(fixedAmountDisposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    fixedAmountWaterInMachine = fixedAmountWaterInMachine - 350;
                    fixedAmountMilkInMachine = fixedAmountMilkInMachine - 75;
                    fixedAmountCoffeeBeansInMachine = fixedAmountCoffeeBeansInMachine - 20;
                    fixedAmountDisposableCups = fixedAmountDisposableCups - 1;
                    fixedAmountMoneyInMachine = fixedAmountMoneyInMachine + 7;
                }

            }else if(buyInput.equals("3")) {

                if(fixedAmountWaterInMachine < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if(fixedAmountMilkInMachine < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if(fixedAmountCoffeeBeansInMachine < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(fixedAmountDisposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    fixedAmountWaterInMachine = fixedAmountWaterInMachine - 200;
                    fixedAmountMilkInMachine = fixedAmountMilkInMachine - 100;
                    fixedAmountCoffeeBeansInMachine = fixedAmountCoffeeBeansInMachine - 12;
                    fixedAmountDisposableCups = fixedAmountDisposableCups - 1;
                    fixedAmountMoneyInMachine = fixedAmountMoneyInMachine + 6;
                }

            }else if(buyInput.equals("back")) {
                continue;
            } else{
                System.out.println("Error - BUY");
            }

        }else if(actionInput.equals("fill")) {
            System.out.println("Write how many ml of water do you want to add: ");
            int amountWaterYouWantToAdd = scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add: ");
            int amountMilkYouWantToAdd = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add: ");
            int amountCoffeeBeansYouWantToAdd = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add: ");
            int amountDisposableCupsYouWantToAdd = scanner.nextInt();

            fixedAmountWaterInMachine = fixedAmountWaterInMachine + amountWaterYouWantToAdd;
            fixedAmountMilkInMachine = fixedAmountMilkInMachine + amountMilkYouWantToAdd;
            fixedAmountCoffeeBeansInMachine = fixedAmountCoffeeBeansInMachine + amountCoffeeBeansYouWantToAdd;
            fixedAmountDisposableCups = fixedAmountDisposableCups + amountDisposableCupsYouWantToAdd;

        }else if(actionInput.equals("take")) {
            System.out.println("I gave you $" + fixedAmountMoneyInMachine);
            System.out.println(" ");
            fixedAmountMoneyInMachine = 0;

        }else if(actionInput.equals("remaining")) {
            System.out.println("The coffee machine has: ");
            System.out.println(fixedAmountWaterInMachine + " of water");
            System.out.println(fixedAmountMilkInMachine + " of milk");
            System.out.println(fixedAmountCoffeeBeansInMachine + " of coffee beans");
            System.out.println(fixedAmountDisposableCups + " of disposable cups");
            System.out.println(fixedAmountMoneyInMachine + " of money");
        }else if(actionInput.equals("exit")) {
            //Testoutput
            System.out.println("exit");
        }else {
            System.out.println("Error - GENERAL");
        }
        } while(!actionInput.equals("exit"));
        }
        //---------- Ende Task 5 ----------
    }
