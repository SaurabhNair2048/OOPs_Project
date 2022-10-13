package Q2;

import java.util.Arrays;
import java.util.Scanner;

public class Question2_VendingMachine {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();
        base: while(true){
            System.out.println("Please enter your name: [quit to exit app]");
            String name = s.nextLine();
            if(name.toLowerCase().contains("quit")){
                break base;
            }
            Cart cart = new Cart(vm, name);
            addItem: while(true) {
                System.out.println("Enter a number to add an item to the cart: [Invalid input leads to this message again. Enter 5 to quit adding items or 6 to exit app]");
                System.out.println("0: Frooti; Quantity: " + (vm.getItemCount(0)-cart.getItemCount(0)));
                System.out.println("1: KitKat; Quantity: " + (vm.getItemCount(1)-cart.getItemCount(1)));
                System.out.println("2: Peanuts; Quantity: " + (vm.getItemCount(2)-cart.getItemCount(2)));
                System.out.println("3: Pringles; Quantity: " + (vm.getItemCount(3)-cart.getItemCount(3)));
                System.out.println("4: Snickers; Quantity: " + (vm.getItemCount(4)-cart.getItemCount(4)));
                String str = s.next();
                if (s.hasNextLine()) {
                    s.nextLine();
                }
                char item = str.charAt(0);
                if(item=='5'){
                    break addItem;
                } else if(item == '6'){
                    break base;
                } else if(item > '6'){
                    continue addItem;
                }
                System.out.println("Enter quantity of selected item between 1 to 5: [Invalid inputs lead to 0 items added]");
                String count = s.next();
                if (s.hasNextLine()) {
                    s.nextLine();
                }
                char c = count.charAt(0);
//                if (c > '0' && c <= '5') {
                    if (item >= '0' && item <= '4') {
                        cart.addItem(item - '0', c - '0');
                    }
//                }
            }
            cart.checkout(s);
        }
    }
}

