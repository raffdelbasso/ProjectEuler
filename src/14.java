package ex13;

public class e13 {

	public static void main(String[] args) {
		int i;
		long j;
		int k;
		int max;
		max=1;
		int maxNum=100;
		for (i=1; i<1000000; i++) {
			j=i;
			k=1;
			while (j!=1) {
				if (j%2==0) {
					j=j/2;
				} else {
					j=3*j+1;
				}
				k++;
			}
			if (k>max) {
				max=k;
				maxNum=i;
			}
			
		}
		System.out.print(maxNum);
	}

}
