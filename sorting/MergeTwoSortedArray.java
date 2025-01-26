package sorting;

public class MergeTwoSortedArray {

    /*
     * a= [10,20,50]
     * b=[5,50,100]
     * 
     */

     public static void merge(int a[] , int b[] , int m , int n){

        int i = 0, j = 0;
		while (i < m && j < n) {
			if (i > 0 && a[i - 1] == a[i]) {
				i++;
				continue;
			}
			if (j > 0 && b[j - 1] == b[j]) {
				j++;
				continue;
			}
			if (a[i] < b[j]) {
				System.out.print(a[i] + " ");
				i++;
			} else if (a[i] > b[j]) {
				System.out.print(b[j] + " ");
				j++;
			} else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
		while (i < m) {
			/*
			 * important step
			 */
			if (i == 0 || a[i] != a[i - 1])
				System.out.print(a[i] + " ");
			i++;
		}
		
		while (j < n) {
			if (j == 0 || b[j] != b[j - 1])
				System.out.print(b[j] + " ");
			j++;
		}

     }
    
}