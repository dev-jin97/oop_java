package ch22;

public class TwoDimensionTest {
    // TODO: 2022/12/10 2차원 배열
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1, 2, 3, 4}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i+", "+arr[i][j]);
            }
        }
    }




}
