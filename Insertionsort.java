import java.util.*;
class Insertionsort{
	void insertionSort(int a1[]){
		int n = a1.length;
		for(int i=n-1;i>=0;i--){
		int key= a1[i];
		int j = i-1;
          while(j>=0 && a1[j]>=a1[key]){
			
			//int temp = a1[j+1];
			a1[j+1]=a1[j];
		//	a1[j]=temp;
			j--;
			System.out.println(Arrays.toString(a1));
		}
		int temp= a1[j+1];
		a1[j+1]=key;
		key=temp;
		}
		System.out.println("after sorting "+Arrays.toString(a1));
	}
	public static void main(String args[]){
		int a1[]={2,4,6,8,3};
		System.out.println("before sorting "+Arrays.toString(a1));
		Insertionsort hi = new Insertionsort();
		hi.insertionSort(a1);
		
	}
    	
	


}