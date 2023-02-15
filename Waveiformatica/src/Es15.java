
public class Es15 {
	public static void main(String[] args) {
		int a[] ={1,2,3,4,5,6,7,8,9,0};
		int b = a.length-1;
		
		for (int i = 0; i < b; i++) {
			int temp =0;
			temp =a[i];
			a[i] = a[b];
			a[b] = temp;
			b--;
			for (int j = 0; j < b; j++) {
				System.out.print(a[j] + " ");
				
			}
			System.out.println();
		}
	}

}
