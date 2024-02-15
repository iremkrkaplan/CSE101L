import java.util.Arrays;

public class exercise03_20220808056 {
    public static void main(String[] args) {
        // Question 1
       /* int[][] array2D = generateArray2D(4, 4, 0, 10);
        display2D(array2D);
        int diagonalSum = sumDiagonal(array2D);
        System.out.println("Sum of the diagonal for the given 2D array is: " + diagonalSum);*/


        // Question 2
      /*   int[][] employees = generateArray2D(8, 7, 4, 9);
        display2D(employees);
       int[] workingHours = employeeWorkingHours(employees);
        display2D(employees);
        display(workingHours);*/

     //   Question 3
     /*   int[][] matrixA = generateArray2D(3, 2, 1, 10);
        int[][] matrixB = generateArray2D(2, 3, 1, 10);
        display2D(matrixA);
        //display2D(matrixB);

        int[][] productMatrix = dotProduct(matrixA, matrixB);
       // display2D(productMatrix);

        /* Question 4
        double[][] points = generateArray2D(12, 5, -0.3, 0.3);
        display2D(points);
        int[] closestPoints = getClosestPoints(points, 0);
        System.out.println("Indexes of points with closest distance");
        display(closestPoints);
        */

        /* Question 5
        char[][] charArray2D = headsNtails(7);
        display2D(charArray2D);*/

    }
    /*
     * Write a method that sums all the numbers in the major diagonal
     * in an n x n matrix
     *
     * Args:
     *      array2D (int[n][n]) : two dimensional array of integers
     *
     * Returns:
     *      (int) : sum of all the numbers in the major diagonal
     */

    // Your code goes here...
    public static int sumDiagonal(int[][] array2D) {
       //hatalı int [][] matrix = new int [array2D.length][array2D.length];
       // int [][]matrix=new int [][];
        int sum=0;
        for (int i=0;i<array2D.length;i++) {
            sum += array2D[i][i];
        }

        return sum;

    }
    // Question 2: Compute the weekly hours for each employee
    public static int[] employeeWorkingHours(int[][] employees) {
        /*
         * Suppose the weekly hours for all employees are stored in a
         * two-dimensional array. Each row records an employee's seven
         * day work hours with seven columns. Write a method that sorts the
         * employee's according to their sum of working hours for an enteire week
         * in decreasing order. Finally returns the sum of working hours for each
         * employee (sort both returned array and given employees array)
         *
         * Args:
         *      employees (int[8][7]) : the array of employees. Each row contains
         *      the employee's seven day work hours.
         *
         * Returns:
         *      int[8] : the array of sum working hours for each employee in decreasing order.
         */

        // Your code goes here...
      //  int[][] employee=new int[8][7];
      //  int[] workingHours = employeeWorkingHours(employees);


            int[] totalHours = new int[employees.length];

            // Compute the total working hours for each employee
            for (int i = 0; i < employees.length; i++) {
                for (int j = 0; j < employees[i].length; j++) {
                    totalHours[j] += employees[i][j];//?
                }
            }




            for (int m = 0; m < employees.length-1; m++) { //Dizimizin değerlerini sırası ile alıyoruz

                    int sayi = employees.length; //sıradaki değeri sayi değişkenine atıyoruz
                    int temp = m; //sayi 'nin indeksini temp değerine atıyoruz

                    for (int j = m+1; j < employees.length ; j++) { //dizimizde i' den sonraki elemanlara bakıyoruz
                        if(totalHours[j]<sayi){ //sayi değişkeninden küçük sayı var mı
                            sayi = totalHours[j]; //varsa sayi değişkenimizide değiştiriyoruz
                            temp = j; //indeks değerini de değiştiriyoruz
                        }
                    }

                    if(temp != m){ //temp değeri başlangıç değeri ile aynı değil ise , yani list[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
                        totalHours[temp] = totalHours[m];
                        totalHours[m] = sayi;
                    }

                }

        return totalHours;



    }
    // Question 3: multiply two matrices
        /*
         * Write a method to multiply two matrices.
         *
         * Args:
         *      matrixA (int[m][n]) : the two-dimensional array of integers
         *      matrixB (int[n][k]) : the two-dimensional array of integers
         *
         * Returns:
         *      int[m][k] : the two-dimensional array of result dot product of
         *      matrixA and matrixB
         */

        // Your code goes here...
     public static int[][] dotProduct(int[][] matrixA, int[][] matrixB) {
          // int m,n,k;
         int m = matrixA.length;
         int k = matrixB[0].length;
         int[][] result = new int[m][k];

         // Multiply the matrices and store the result in the new matrix
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < k; j++) {
                 for (int p = 0; p < matrixA[0].length; p++) {
                     result[i][j] += matrixA[i][p] * matrixB[p][j];
                 }
             }
         }

     return result;
     }











    /////////////// HELPER METHODS ////////////////////////////

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void display(double[] array) {
        for (double i : array) {
            System.out.printf("%.1f\t", i);
        }
        System.out.println();
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
    }

    public static void display(char[] array) {
        for (int i : array) {
            System.out.printf("%c\t", i);
        }
        System.out.println();
    }

    public static void display2D(int[][] array2D) {
        for (int[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static void display2D(double[][] array2D) {
        for (double[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static void display2D(char[][] array2D) {
        for (char[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static int[][] generateArray2D(int m, int n, int start, int end) {
        int[][] array2D = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = random(start, end);
            }
        }

        return array2D;
    }

    public static double[][] generateArray2D(int m, int n, double start, double end) {
        double[][] array2D = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = round(random(start, end), 1);
            }
        }

        return array2D;
    }

    public static int random(int start, int end) {
        return start + (int) (Math.random() * (end - start + 1));
    }

    public static double random(double start, double end) {
        return start + Math.random() * (end - start + 1);
    }

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }}
