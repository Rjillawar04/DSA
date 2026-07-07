public class QuickSort {

    static void displayarray(int arr[]){
        for(int val : arr){
            System.out.println(val);
        }
    }

    static void swap(int []arr,int x,int y){
        int temp =   arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    static int partition(int arr[],int low,int high){
         int pivot = arr[low];
         int count = 0;

         for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot) count++;
         }

         int pivotindex = low+count;
         swap(arr,low,pivotindex);

         int i=low,j=high;
         while(i<pivotindex  && j>pivotindex){
            while(arr[i]<=pivot)i++;
            while(arr[j]>pivot)j--;

            if(i<pivotindex && j>pivotindex){
                swap(arr,i,j);
                i++;
                j--;
            }
         }
         return pivotindex;
    }

    static void quicksort(int arr[],int low , int high){
        if(low>=high) return;

        int pi = partition(arr ,low,high);
        quicksort(arr,low,pi-1);
        quicksort(arr,pi+1,high);
    }
    public static void main(String[]args){
        int [] arr = {4,6,2,5,7,9,1,3};
        System.out.println("Array before Sorting :");
        displayarray(arr);

        quicksort(arr,0,arr.length-1);
        System.out.println("Array after sorting :");
        displayarray(arr);
    }
}
