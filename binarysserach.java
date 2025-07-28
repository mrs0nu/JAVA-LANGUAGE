public class binarysserach {
   
    public static int  binarySearch(int arr[],int key){

        int start=0,end=arr.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]agrs){
        int arry[]={11,22,33,44,55,66,77,88,99},keys=88;
        System.out.print(binarySearch(arry,keys));
    }
   
}
