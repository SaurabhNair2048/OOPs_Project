import java.util.Scanner;

public class Question3_TwoSum {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] iArr;
        arrLoop: while(true) {
            System.out.println("Enter the int array as space separated numbers: ");
            String[] sArr = s.nextLine().trim().split(" ");
            iArr = new int[sArr.length];
            try {
                for (int i = 0; i < iArr.length; i++) {
                    iArr[i] = Integer.parseInt(sArr[i]);
                }
            } catch(NumberFormatException e){
                System.out.println("Data entered is not a number. Try again!");
                continue arrLoop;
            }
            break;
        }
        int target;
        tarLoop: while(true) {
            System.out.println("Enter the target: ");
            try {
                target = Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e){
                System.out.println("Target entered is not a number. Try again!");
                continue tarLoop;
            }
            break;
        }
        int[] res = calcTwoSum(iArr, target);
        System.out.println("[" + res[0] + ", " + res[1]+"]");
    }

    private static int[] calcTwoSum(int[] iArr, int target){
        int[] res = new int[2];
        res[0] = res[1] = -1;
        int left = 0, right = iArr.length - 1;
        while(left < right){
            int sum = iArr[left]+iArr[right];
            if(sum == target){
                res[0] = left;
                res[1] = right;
                break;
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
