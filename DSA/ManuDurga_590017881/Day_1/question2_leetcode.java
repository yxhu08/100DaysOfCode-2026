import java.util.Scanner;

class question2_leetcode{
    public static void main(String[] args){
        int missingNumberSum = 0;
        int totalNumberSum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();          //this is the size of the input array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();missingNumberSum=missingNumberSum+nums[i];}     //elements of that array
        for(int j =0; j<=n;j++){totalNumberSum=totalNumberSum+(j+1);}
        System.out.println(totalNumberSum-missingNumberSum);
     }}