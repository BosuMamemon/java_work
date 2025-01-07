package chapter03_5;

public class MultiArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[][] = new String[4][];
		str[0] = new String[2];
		str[1] = new String[1];
		str[2] = new String[3];
		str[3] = new String[4];
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				str[i][j] = "("+(i + 1)+", "+(j + 1)+")";
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		int intArr[][] = new int[4][];
		intArr[0] = new int[3];
		intArr[1] = new int[2];
		intArr[2] = new int[3];
		intArr[3] = new int[2];
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = 10 * (i + 1) + j;
				System.out.print(intArr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
