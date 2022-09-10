#include <stdio.h>
#include <stdlib.h>

// Creating the dynamic array in c using the malloc

struct myArray
{
    int totalSize;
    int size;
    int *ptr;
};

int create_array(struct myArray *arr, int tsize, int size)
{
    arr->totalSize = tsize;
    arr->size = size;
    arr->ptr = (int *)malloc(tsize * sizeof(int));
    return 1;
}

void entry(struct myArray arr)
{

    int no;
    for (int i = 0; i < arr.size; i++)
    {
        printf("Enter Element %d :", i);
        scanf("%d", &no);
        arr.ptr[i] = no;
    }
}

void display(struct myArray arr)
{
    for (int i = 0; i < arr.size; i++)
    {
        printf("%d ", arr.ptr[i]);
    }
}

int insertion(struct myArray *arr, int number, int index)
{

    for (int i = arr->size - 1; i >= index; i--)
    {
        arr->ptr[i + 1] = arr->ptr[i];
    }
    arr->ptr[index] = number;
    arr->size += 1;
    return 1;
}

void deletion(struct myArray *arr, int index)
{
    for (int i = index; i < arr->size; i++)
    {
        arr->ptr[i] = arr->ptr[i + 1];
    }
    arr->size -= 1;
}

int main()
{
    struct myArray array;
    int success = create_array(&array, 30, 5);
    if (success == 1)
    {
        printf("Created the Array Successfully\n");
    }
    else
    {
        printf("Errored Occured during Creating the Array");
        return 0;
    }
    entry(array);
    printf("\nDisplaying the Array :\n");
    display(array);
    insertion(&array, 6, 4);
    printf("\nDisplaying the Array After Insertion:\n");
    display(array);
    deletion(&array, 1);
    printf("\nDisplaying the Array After Deletion:\n");
    display(array);
    return 0;
}