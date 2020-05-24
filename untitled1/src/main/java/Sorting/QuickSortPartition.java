package main.java.Sorting;

public class QuickSortPartition{
    static void doQuickSort(int [] arr,int l,int h){
        int p;
        if(l<h){
            p=doPartition(arr,l,h); //p is pivot at its right place
            doQuickSort(arr,l,p); //p->sorted element
            doQuickSort(arr,p+1,h); //h->infi
        }
    }

    static int doPartition(int [] arr,int l,int h){   //11,1,6,2,21
        int pivot=arr[l];
        int i=l,j=h;
        while(i<j){
            do{
                i++;
            }
            while(i<arr.length && arr[i]<=pivot);
            do{
                j--;
            }
            while(arr[j]>pivot);
            if(j<i) {
                break;
            }else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp2=arr[l];
        arr[l]=arr[j];
        arr[j]=temp2;
        return j;
    }

    static void printAll(int[] arr){
        System.out.print("\nAll Elements after partitioning are : ");
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+"-");
        }
    }

    public static void main(String args[]){
        int [] arr={12,2132,12,3,1,32,53,1,212,42};
        doQuickSort(arr,0,arr.length);
        printAll(arr);
    }

}