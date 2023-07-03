// Matrisin transpozunu bulan program
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        int rows = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matris: ");
        for(int[] row: matrix){
            for(int colm: row){
                System.out.print(colm + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoze: ");

        for(int[] roww: transpose){
            for(int colm: roww){
                System.out.print(colm + " ");
            }
            System.out.println();
        }
    }
}