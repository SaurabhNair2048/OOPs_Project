package Q2;

import java.util.Scanner;

class Cart{
    private int[] items;
    private VendingMachine vm;
    private String name;
    Cart(VendingMachine vm, String name){
        this.vm = vm;
        this.items = new int[5];
        this.name = name;
    }

    public void addItem(int item, int count){
        int temp = vm.getItemCount(item);
        if(temp - items[item]>=count) {
            items[item] = count;
            switch(item){
                case 0:
                    System.out.println("Frooti added to cart!");
                    break;
                case 1:
                    System.out.println("KitKat added to cart!");
                    break;
                case 2:
                    System.out.println("Peanuts added to cart!");
                    break;
                case 3:
                    System.out.println("Pringles added to cart!");
                    break;
                case 4:
                    System.out.println("Snickers added to cart!");
                    break;
            }

        } else {
            System.out.println("We only have " + temp +" number of item " + item + " in stock!");
        }
    }

    public void checkout(Scanner s){
        System.out.println("Pay using Card/Cash? Enter card or cash: default to cash : ");
        String str = s.next();
        if(s.hasNextLine()){
            s.nextLine();
        }
        int cost = 0;
        int mult_fact = str.equalsIgnoreCase("cash")?1:2;
        for(int i=0; i < items.length; i++){
            int sum=0;
            switch(i){
                case 0:
                    sum = items[0]*Frooti.getCost()*mult_fact;
                    System.out.println("Frooti cost -> " + sum + "USD for quantity " + items[0]);
                    cost+=sum;
                    break;
                case 1:
                    sum = items[1]*KitKat.getCost()*mult_fact;
                    System.out.println("Kitkat cost -> " + sum + "USD for quantity " + items[1]);
                    cost+=sum;
                    break;
                case 2:
                    sum = items[2]*Peanuts.getCost()*mult_fact;
                    System.out.println("Peanuts cost -> " + sum + "USD for quantity " + items[2]);
                    cost+=sum;
                    break;
                case 3:
                    sum = items[3]*Pringles.getCost()*mult_fact;
                    System.out.println("Pringles cost -> " + sum + "USD for quantity " + items[3]);
                    cost+=sum;
                    break;
                case 4:
                    sum = items[4]*Snicker.getCost()*mult_fact;
                    System.out.println("Snickers cost -> " + sum + "USD for quantity " + items[4]);
                    cost+=sum;
                    break;
            }
        }
        System.out.println(this.name+"! Your total bill is : " + cost + "USD");
        System.out.println("Please type pay to complete the payment... OR cancel to cancel order... [Default value is pay and amount will be deducted]");
        str = s.next();
        if(s.hasNextLine()){
            s.nextLine();
        }
        if(completeTxn(str)){
            System.out.println("Payment successful. Order delivered!\n\n");
        } else {
            System.out.println("Order cancelled! :(\n\n");
        }

    }

    private boolean completeTxn(String str){
        if(str.equalsIgnoreCase("cancel")){
            items = new int[5];
            return false;
        }

        vm.reduceSoldItemCount(items);
        return true;
    }

    public int getItemCount(int item){
        return items[item];
    }
}
