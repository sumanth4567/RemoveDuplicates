//DAY 1
//the code gives the integer which says the number of non duplicate elements in an array
import java.util.Scanner;
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String args[]){
        RemoveDuplicates rd=new RemoveDuplicates();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements into the array :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int x=rd.removeDuplicates(nums);
        System.out.println("The number of non duplicte elements are :"+" "+x);
    }
}
