// Searching Algorithms like linear search and binary search
#include <stdio.h>


int main()
{
    int linearSearch(int [],int,int);
    int binarySearch(int [],int,int);
    int lin_array[10]={23,45,1,2,56,7,8,10};  //unsorted array used for linear search
    int bin_array[10]={10,20,30,40,50,60,70,80};  //sorted array for binary seach
    int element=100;
    int size=8;
    // int index=linearSearch(lin_array,element,size);
    int index=binarySearch(bin_array,size,element);
    if(index==-1){
        printf("Element not found");
    }
    else{
        printf("Element %d found at %d",element,index);
    }

    return 0;
}

int linearSearch(int array[],int element,int size){
    for(int i=0;i<size;i++){
        if(array[i]==element){
            return i;
        }
    }
    return -1;
}

int binarySearch(int array[],int size,int element){
    int mid,low,high;
    low=0;
    high=size-1;
    while(low<=high){
        mid=(low+high)/2;
        if(array[mid]==element){
            return mid;
        }
        if(array[mid]<element){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
}