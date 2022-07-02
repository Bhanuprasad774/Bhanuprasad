package sortingSearching;


public class Searching{
	boolean exponentialSearch(int arr[],int key) {
		int lengthofArray = arr.length;
		if (arr[0]==key) {
			return true;
		}
		
		int i=1;
		while(i <lengthofArray && arr[i]<=key) {
			i =i*2;
		}
		
		return binarySearch(arr,i/2,Math.min(i,lengthofArray -1),key);
	}
		Searching search = new Searching();
		int arr[] = {
				1,2,3,4,5,6,7,8,9,10
		};
		
		if (search.exponentialSearch(arr,10) {
			System.out.println("Element found:");
		}else {
			
		
	}
		
	
boolean binarySearch(int arr[],int low,int high,int key) {
int mid;
while (low<=high) {
	mid=(low+high/2);
	
	if (arr[mid]==key) {
		return true;
	}
	else if(arr[mid]<key) {
		low =mid+1;
		
	}
	else { high=mid-1;
}
}
return false;
}}