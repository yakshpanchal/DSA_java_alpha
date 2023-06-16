public class spiral_matrix {

    public static void spiral_matrix(int matrix[][]) {
        int start_row = 0;
        int start_col = 0;
        int end_row = matrix.length-1;
        int end_col = matrix[0].length-1;
    
        while(start_row <= end_row && start_col <= end_col){
            // topline print sc --> ec // and sr = fix
            for(int j = start_col ; j <= end_col ; j++){
                System.out.print(matrix[start_row][j] + " ");
            }
            // rightline print sr+1 --> er // and ec = fix
            for(int i = start_col+1 ; i <= end_row ; j++){
                System.out.print(matrix[i][end_col] + " ");
            }
            // bottomline print ec-1 --> sc // and ec = fix
            for(int j=end_col-1 ; j >= start_col ; j--){
                if(start_row == end_col){
                    break;
                }
                System.out.print(matrix[end_row][j] + " ");
            }
            // leftline print er-1 --> sr // and sc = fix
            for(int i=end_col-1 ; i >= start_col ; i--){
                if(start_row == end_col){
                    break;
                }
                System.out.print(matrix[i][start_col] + " ");
            }
            start_row++;
            start_col++;
            end_col--;
            end_row--;
        }
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
        spiral_matrix(matrix[][]);
    
    }
    
    
}
