package Day04.array;

public class MainClass05 {
	public static void main(String[] args) {
		
		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		 * index 나열해보기 [0.0] [0.1 1.0] [2.0 1.1 0.2] [0.3 1.2 2.1 3.0] [4.0 3.1 2.2 1.3
		 * 0.4] ... [6.0 5.1 ... 0.6] [1.6 2.5 3.4 4.3 5.2 6.1] [6.2 5.3 4.4 3.5 2.6]
		 * [3.6 4.5 5.4 6.3] ... [6.6]
		 */
		
		int[][] homework = { { 1, 2, 3, 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13, 14 }, { 15, 16, 17, 18, 19, 20, 21 },
				{ 22, 23, 24, 25, 26, 27, 28 }, { 29, 30, 31, 32, 33, 34, 35 }, { 36, 37, 38, 39, 40, 41, 42 },
				{ 43, 44, 45, 46, 47, 48, 49 } };

		System.out.println("숙제");

		int num = 0;
		int tempX = 0;
		int tempY = 0;
		for (int i = 0; i < (homework.length * 2 - 1); i++) {
			if (i % 2 == 0) {
				if (i < homework.length) {
					tempX = num;
					tempY = 0;
				} else {
					tempX = 6;
					tempY = 6 - num;
				}
			} else {
				if (i < homework.length) {
					tempX = 0;
					tempY = num;
				} else {
					tempX = 6 - num;
					tempY = 6;
				}
			}
			for (int j = 0; j <= num; j++) {
				if (i % 2 == 0) {
					System.out.print(homework[tempX][tempY] + " ");
					tempX--;
					tempY++;
				} else {
					System.out.print(homework[tempX][tempY] + " ");
					tempX++;
					tempY--;
				}
			}
			if (i < homework.length - 1)
				num++;
			else
				num--;
			System.out.println();
		}
	}
}
