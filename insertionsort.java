public class insertionsort {
    public static void InsertionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        InsertionSort(arr);
        printArr(arr);
    }
    
}
