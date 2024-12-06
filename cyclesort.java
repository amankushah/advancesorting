class cyclesort
{
    static int i=0;
    public static void swap(int i, int j, int[] arr)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static int missingNumber(int[] nums) {
        int n;
        n=nums.length;
        while(i<n)
        {
            if(nums[i]==i || nums[i]==n) i++;
            else
            {
                swap(i,nums[i],nums);
            }
        }
        for(i=0;i<n;i++)
        if(nums[i]!=i) break;
        return i;
        
    }
    public static void main(String[] args)
    {
        int arr[]={0,1,5,4,3};
        missingNumber(arr);
        System.out.println("the missing number is : "+i);

        
    }
}