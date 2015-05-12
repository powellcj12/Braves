public class Brave {

	public static void main(String[] args) {
		LinePrinter lp = new LinePrinter("Hello, world!");
		lp.multiPrint(10);
		int[] j={25,39,-3,14,33,79,6,18923,267,-34902,26434,78979,333,-22,90};
		selectionSort(j);
		System.out.println(j);
	}
	
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// find index of smallest remaining value
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}

			// swap smallest value its proper place, a[i]
			swap(a, i, min);
			if(i%100==0){
			}
		}
	}
	public static void swap(int[] a, int i, int j) {
		if (i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
}
