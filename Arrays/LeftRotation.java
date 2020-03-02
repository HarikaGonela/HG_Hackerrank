public class Sample
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int n=2;
        int[] result = leftRotate(arr,n);
        for(int i=0;i<arr.length;i++) {
            System.out.print(result[i]+" ");
        }

    }

    private static int[] leftRotate(int[] arr, int n)
    {

        for(int i=0;i<n;i++)
        {
            int last = arr[0];
            int j=0;
            for(j=0;j<arr.length-1;j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j]=last;
        }
        return arr;
    }
}


////////////////OutPut/////////
3 4 5 1 2 
