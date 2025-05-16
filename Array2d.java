public class Array2d {
        public static void main(String[] args) {
            /*int[][] matrix = new int[3][4];  // Declaration of a two-dimensional array
    
            matrix[0][0] = 1;  // Assigning a value to the element in the first row and first column
            matrix[1][2] = 5;  // Assigning a value to the element in the second row and third column
    
            int element = matrix[0][0];  // Accessing the element in the first row and first column
    
            System.out.println("Element: " + element);  // Output the value of the accessed element*/

            int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};  // Declaration and initialization of a two-dimensional array

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matrix[i][j] + " ");  // Printing each element of the array
                }
                System.out.println();  // Moving to the next row
            }
        }
    }

    /*
     * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of rows: ");
        int i = sc.nextInt();
        System.out.printf("Enter the number of columns: ");
        int j = sc.nextInt();
        System.out.printf("Enter the elements of the array: \n");
        int[][] element = new int[i][j];
        for(int a = 0; a<i; a++){
            for(int b = 0; b<j; b++){
            System.out.printf("Element at [%d][%d]: ", a,b);
            element[a][b] = sc.nextInt();
            }
        }
        
        sc.close();
        System.out.printf("Elements of the array: \n");
        for(int c = 0; c<i; c++){
            for(int d = 0; d<j; d++){
                System.out.printf("%d ", element[c][d]);
            }
            System.out.printf("\n");
        }
    }
}
     *//*
     import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.printf("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] arr1 = new int[row][columns];
        int[][] arr2 = new int[row][columns];
        System.out.printf("Enter the elements of the first array: \n");
        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                System.out.printf("Element at [%d][%d]: ", i,j);
                arr1[i][j] = sc.nextInt();
            }
        }
        
        System.out.printf("Enter the elements of the second array: \n");
        
        for(int a=0; a<row; a++){
            for(int b=0; b<columns; b++){
                System.out.printf("Element at [%d][%d]: ", a,b);
                arr2[a][b] = sc.nextInt();
            }
        }
        
        sc.close();
        int compare=0;
        for(int c=0; c<row; c++){
            for(int d=0; d<columns; d++){
                if(arr1[c][d]!=arr2[c][d]){
                    compare++;
                }
            }
        }
        System.out.printf("Number of differences between the two matrices: %d", compare);
    }
} */

/*
 * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.printf("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[row][columns];
        System.out.printf("Enter the elements of the array: \n");
        
        int[] sumArr = new int[row];
        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                System.out.printf("Element at [%d][%d]: ", i,j);
                arr[i][j] = sc.nextInt();
                sumArr[i] += arr[i][j];
            }
        }
        
        System.out.printf("Sum of each row: \n");
        for(int a = 0; a<row; a++){
                System.out.printf("%d\n", sumArr[a]);
        }
    }
}
 */

 /*
  * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.printf("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[row][columns];
        
        int[] sumArr = new int[row];
        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                System.out.printf("Element at [%d][%d]: ", i,j);
                arr[i][j] = sc.nextInt();
                sumArr[i] += arr[i][j];
            }
        }
        sc.close();
        System.out.printf("Averages of each row: \n");
        double[] average = new double[row];
        for(int a =0; a<row; a++){
            average[a] = (double)sumArr[a]/columns;
            System.out.printf("Row %d: %.2f\n", a+1, average[a]);
        }
    }
}
  */
  /*
   * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        
        int[][] arr = new int[5][5];
        int num = 1;
        
        for(int a=0; a<5; a++){
            for(int b=0; b<5; b++){
                arr[a][b] = num++;
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
   */
