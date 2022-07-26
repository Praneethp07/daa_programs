package exam;

import java.util.Scanner;

public class Mergesort {
	public static void divide(int arr[],int low,int high) {
		if(low>=high) {
			return;
		}
		int mid = (low+high)/2;
		divide(arr,low,mid);
		divide(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	public static void merge(int arr[],int low ,int mid ,int high) {
	int []merger = new int[high - low +1];
	int i=low;
	int j = mid+1;
	int x=0;
	while(i<=mid && j<=high) {
		if(arr[i]<=arr[j]) {
			merger[x++] = arr[i++];
		}else {
			merger[x++] = arr[j++];
		}
	}
	while(i<=mid) {
		merger[x++] = arr[i++];
	}
	while(j<=high) {
		merger[x++] = arr[j++];
	}
	for(int z=0,y=low;z<merger.length;z++,y++) {
		arr[y] = merger[z];
	}
	}
	public static void main(String[]args) {
		int []a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n = sc.nextInt();
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
//		MergeSort m = new MergeSort();
		divide(a, 0, n-1);
		//print
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
}
