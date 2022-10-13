import java.util.Arrays;
import java.util.Scanner;

public class Question5_LargestNumber {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] iArr;
        while(true){
            System.out.println("Enter numbers separated by space: ");
            String[] sArr = s.nextLine().trim().split(" ");
            iArr = new int[sArr.length];
            try{
                for(int i=0; i<iArr.length; i++){
                    iArr[i] = Integer.parseInt(sArr[i]);
                }
            } catch (NumberFormatException e){
                System.out.println("Entered data is not a number. Please Try again!");
                continue;
            }
            break;
        }

        largestNumber(iArr);
    }

    private static void largestNumber(int[] iArr){
        String[] sArr = new String[iArr.length];
        for(int i=0; i<sArr.length; i++){
            sArr[i] = Integer.toString(iArr[i]);
        }
        Arrays.sort(sArr);
        StringBuilder strb = new StringBuilder();
        for(int i = sArr.length-1; i>=0; i--){
            strb.append(sArr[i]);
        }
        System.out.println(strb.toString());
    }
}
