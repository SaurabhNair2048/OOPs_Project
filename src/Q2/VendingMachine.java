package Q2;

import java.util.Arrays;

class VendingMachine{
    private int[] items = new int[5];

    VendingMachine(){
        refill();
    }

    public void refill(){
        Arrays.fill(items, 5);
    }

    public int getItemCount(int item){
        return items[item];
    }

    public void reduceSoldItemCount(int[] items){
        boolean flag = false;
        for(int i=0; i<this.items.length; i++){
            if(items[i]<=this.items[i]){
                this.items[i]-=items[i];
                if(this.items[i]==0){
                    flag = true;
                }
            }
        }
        if(flag) {
            refill();
        }
    }
}
