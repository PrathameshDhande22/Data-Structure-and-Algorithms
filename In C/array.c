#include <stdio.h>
#include <stdlib.h>

int myarray[100];
int no;

void print_array()
{
    printf("\nYour Array is : [");
    for (int i = 0; i < no; i++)
    {
        printf("%d, ", myarray[i]);
    }
    printf("]");
}

void enter_array()
{
    printf("Enter The No of Elements You Want to Enter : ");
    scanf("%d", &no);
    for (int i = 0; i < no; i++)
    {
        printf("Enter the Element %d :", i + 1);
        scanf("%d", &myarray[i]);
    }
}

void insert()
{
    int index, num;
    int temp;
    printf("\nEnter the Index in which You want to enter : ");
    scanf("%d", &index);
    printf("\nEnter the Number which You want to enter : ");
    scanf("%d", &num);
    for (int i = no - 1; i >= index; i--)
    {
        if (i == index)
        {
            myarray[i + 1] = myarray[i];
            myarray[i] = num;
        }
        else
        {
            myarray[i + 1] = myarray[i];
        }
    }
    no += 1;
}
int check_no(int n)
{
    int i = 0, count = 0;
    while (i < no)
    {

        if (myarray[i] == n)
        {
            return i;
            break;
        }
        i += 1;
    }
    return 0;
}

void delete_element()
{
    int n;
    int i = 0;
    printf("\nEnter the Element Which You want to Delete : ");
    scanf("%d", &n);
    int present = check_no(n);
    if (present == 0)
    {
        printf("\n%d is not Present", n);
    }
    else
    {
        while (present < no)
        {
            myarray[present] = myarray[present + 1];
            present += 1;
        }
        printf("\nDeleted Successfully");
    }
    no -= 1;
}

void search_element()
{
    int n;
    printf("\nEnter the element to Be Searched : ");
    scanf("%d", &n);
    int present = check_no(n);
    if (present == 0)
    {
        printf("\n Entered element is not present");
    }
    else
    {
        printf("Element is Present in %d Index", present);
    }
}

int main()
{
    int choice;
    enter_array();
    while (1)
    {
        printf("\nEnter Your Following choices \n1.Insert \n2.Print Array\n3.Delete element\n4.Search Element\n5.Exit\nEnter Your Choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            insert();
            break;
        case 2:
            print_array();
            break;
        case 3:
            delete_element();
            break;
        case 4:
            search_element();
            break;
        case 5:
            exit(0);
            break;
        default:
            printf("Enter the Valid Choice");
        }
    }

    return 0;
}