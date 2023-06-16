public class sorting{
    //printing array
    public static void printarr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i!=arr.length-1){
                System.out.print(",");
            }
        }          
        System.out.println();
    }

    //insertion sort
    public static void insertionSort(int[] arr) {
        int sorted=1;
        for(int i=1;i<arr.length;i++){
            int ele=arr[i];
            int currentindex=i;
            for(int j=sorted-1;j>=0;j--){
                if(ele<arr[j]){
                    int temp=ele;
                    arr[currentindex]=arr[j];
                    arr[j]=temp;
                    currentindex=j;
                }
            }
            sorted++;
        }
        printarr(arr);
    }

    //linear sort
    public static void linearSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            
        }
    }

    //selection sort
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int smallest=arr[i];
            int temp=arr[i];
            int k=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<smallest){
                    smallest=arr[j];
                    k=j;
                }
            }
            arr[i]=smallest;
            arr[k]=temp;
        }
        printarr(arr);;
    }

    //bubble sort
    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarr(arr);
    }
    public static void main(String[] args) {
        int[] arr={7,8,3,9,3,1,5,2};
        insertionSort(arr);
    }
}