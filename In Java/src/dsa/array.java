package dsa;

import java.util.Scanner;

/*
 * Array Which have the following menu Insertion,Deletion and Search
 */


public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The No of Elements You Want to add : ");
		int no = sc.nextInt();
		int[] myarray = new int[100];
		for (int i = 0; i < no; i++) {
			System.out.print("Enter the Element " + (i + 1) + " : ");
			myarray[i] = sc.nextInt();
		}
		menu(myarray, no);
		sc.close();
	}

	public static void menu(int[] myarray, int size) {
		Scanner sc = new Scanner(System.in);
		Array_operation ar = new Array_operation();
		boolean run = true;
		while (run) {
			System.out.print(
					"\nEnter According to Your Choice \n1.Insert\n2.Print\n3.Delete\n4.Search\n5.Exit\nEnter Your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				myarray = ar.insert(myarray, size);
				size += 1;
				System.out.println("Insertion Successfull");
				break;
			case 2:
				ar.iterator(myarray, size);
				break;
			case 3:
				System.out.println("Enter the Number which You want to Delete :");
				int number = sc.nextInt();
				if (ar.get(myarray, size, number) == -1) {
					System.out.println("Element is Not Present");
				} else {
					myarray = ar.delete(myarray, size, ar.get(myarray, size, number));
					size -= 1;
					System.out.println("Deletion Successfull");
				}
				break;
			case 4:
				System.out.println("Enter the Number which You want to Delete :");
				number = sc.nextInt();
				if (ar.get(myarray, size, number) == -1) {
					System.out.println("\nElement is Not Present");
				} else {
					System.out.println("Element is Present in Index " + ar.get(myarray, size, number));
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the correct choice");
			}

		}
		sc.close();
	}
}

class Array_operation {
	Scanner sc = new Scanner(System.in);

	public void iterator(int[] arr, int size) {
		System.out.println("\nPrinting the Array : ");
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print("]\n");
	}

	public int[] insert(int[] myarray, int size) {
		System.out.print("\nEnter the Index In which You want to Insert : ");
		int index = sc.nextInt();
		System.out.print("\nEnter the Number which You want to Insert : ");
		int number = sc.nextInt();
		for (int i = size - 1; i >= index; i--) {
			if (i == index) {
				myarray[i + 1] = myarray[i];
				myarray[i] = number;
			} else {
				myarray[i + 1] = myarray[i];
			}
		}
		return myarray;
	}

	public int[] delete(int[] myarray, int size, int index) {
		for (int i = index; i < size; i++) {
			myarray[i] = myarray[i + 1];
		}
		return myarray;
	}

	public int get(int[] myarray, int size, int no) {
		int count = 0;
		for (count = 0; count < size; count++) {
			if (no == myarray[count]) {
				return count;
			}
		}
		return -1;
	}
}