class quicksort
{
    public static void swap(int[] arr, int i, int j)
    {
       int temp=arr[i];
       arr[i]= arr[j];
       arr[j]=temp;
    }
    public static void print(int[] arr)
     {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
     }
     public static int partition(int[] arr, int lo, int hi)
     {
        int pivot = arr[lo], pivotIdx = lo;
        int smallercount = 0;
        for(int i=lo+1;i<=hi;i++)
        {
            if(arr[i]<=pivot) smallercount++;
        }
        int correctIdx = pivotIdx + smallercount;
        swap(arr,pivotIdx,correctIdx);
        int i = lo, j= hi;
        while(i<correctIdx && j>correctIdx)
        {
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot &&  arr[j]<pivot)
            {
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quicksort(int[] arr , int lo ,int hi)
    {
        if(lo>=hi) return;
        int idx=partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }
    public static void main(String[] args)
    {
        int[] arr = {109,33,89,27,69,10,70};
        int n=arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
        
    }
}