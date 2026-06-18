class Missing_Number
{
    public static void main(String[] args)
    {
        int[] arr={ 10,20,30,40};
        int n=arr.length;
        int expected_sum=n*(n+1)/2;
        int actual_sum=0;
        for(int num:arr)
        {
            actual_sum+=num;
        }
        int missing=expected_sum-actual_sum;
        System.out.println("Missing number is:" + missing);
    }
}
