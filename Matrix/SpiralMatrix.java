package Matrix;
// public class SpiralMatrix {
    
// }


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int rowMin = 0;
        int rowMax = m - 1;
        int colMin = 0;
        int colMax = n - 1;

        List<Integer> order = new ArrayList<>();

        while (rowMin <= rowMax && colMin <= colMax) {

          
            for (int j = colMin; j <= colMax; j++) {
                order.add(matrix[rowMin][j]);
            }
            rowMin++;

            
            for (int i = rowMin; i <= rowMax; i++) {
                order.add(matrix[i][colMax]);
            }
            colMax--;

            
            if (rowMin <= rowMax) {
                for (int j = colMax; j >= colMin; j--) {
                    order.add(matrix[rowMax][j]);
                }
                rowMax--;
            }

            
            if (colMin <= colMax) {
                for (int i = rowMax; i >= rowMin; i--) {
                    order.add(matrix[i][colMin]);
                }
                colMin++;
            }
        }

        return order;
    }
}