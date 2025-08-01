public class heapshort {
    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right =2*i+2;
        int maxIdx=i;
        if(left <size&&arr[left]>arr[maxIdx]){
            maxIdx=left;
        }
        if( right<size&&arr[right]>arr[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
        }
    }
    public static void heapshort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr ,i,n);
        }
        for (int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, i);
        }
    }
    public static void main (String args[]){
        int arr[]={1,2,3,68,9,};
    heapshort(arr);
    for (int i = 0; i<=arr.length; i++)
  {
    System.out.println("  "+arr[i]);
  }  
}
}