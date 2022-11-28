package Day04.array;

public class MainClass06 {
	public static void main(String[] args) {
		int[][] array = new int[7][7];
		int init = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = init++;
			}
		}

		for (int i = 0; i < 13; i++) {
			if (i < 7) {
				for (int j = 0; j < i + 1; j++) {
					if (i % 2 == 0) {
						System.out.print(array[i - j][j] + " ");
					} else {
						System.out.print(array[j][i - j] + " ");
					}
				}
			} else {
				for (int j = 0; j < array.length * 2 - 1 - i; j++) {
					if (i % 2 == 0) {
						System.out.print(array[6 - j][(i + j + 1) % 7] + " ");
					} else {
						System.out.print(array[(i + j + 1) % 7][6 - j] + " ");
					}
				}
			}
			System.out.println();
		}
	}

}
