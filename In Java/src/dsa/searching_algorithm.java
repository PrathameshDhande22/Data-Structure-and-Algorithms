package dsa;
/*
 * Implementing the searching algorithm like binary search and linear search
 */

class S_Algorithm{
    public int linearSearch(int array[],int element){
        for(int i=0;i<array.length;i++){
            if(array[i]==element){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int array[],int element){
        int mid,low,high;
        low=0;
        high=array.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(array[mid]==element){
                return mid;
            }
            if(array[mid]>element){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}

public class searching_algorithm {
    public static void main(String[] args) {
        S_Algorithm sa=new S_Algorithm();
        @SuppressWarnings("unused")
		int lin_arr[]={12,34,112,56,78,89};
        int bin_arr[]={10,20,30,40,50,60,70};
        int element=20;
        // int index=sa.linearSearch(lin_arr, element);
        int index=sa.binarySearch(bin_arr, element);
        if(index==-1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element "+element+" found at index "+index);
        }

    }
}
