package exercise231217;

public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        // 声明和初始化一个3x3的二维数组
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 输出二维数组
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); // 换行
        }
    }
}