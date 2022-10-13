import java.math.BigInteger;
import java.util.Scanner;

public class Question4_PowerX {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x, n;
        while(true){
            System.out.println("Enter value for x and n separated by a space: ");
            String[] sArr = s.nextLine().trim().split(" ");
            try{
                x = Integer.parseInt(sArr[0]);
                n = Integer.parseInt(sArr[1]);
            } catch (NumberFormatException e){
                System.out.println("Entered data are not numbers. Please try again!!");
                continue;
            }
            break;
        }
        System.out.println(x+"^"+n+" = " + calcPow(x, n));
    }

    private static BigInteger calcPow(int x, int n){
        if(n==0){
            return BigInteger.ONE;
        } else if(n==1){
            return BigInteger.valueOf(x);
        } else {
            BigInteger temp = BigInteger.valueOf(x), res = BigInteger.valueOf(1);
            while(n!=0){
                if((n&1) == 1){
                    res = res.multiply(temp);
//                    System.out.println("Res is : " + res);
                }
                temp = temp.multiply(temp);
                n >>= 1;
            }
            return res;
        }
    }
}
