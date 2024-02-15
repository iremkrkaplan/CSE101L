public class Quiz2_20220808056 {

        public static int[] eliminateDuplicates(int[] array) {
                int[] result = new int[array.length];
                int endeks = 0;
                for (int i = 0; i < array.length; i++) {
                    boolean isExists = false;
                    for (int j = 0; j < endeks; j++) {
                        if (array[i] == result[j]) {
                            isExists = true;
                            break;
                        }
                    }
                    if (!isExists) {
                        result[endeks] = array[i];
                        endeks++;
                    }
                }

                int[] finalResult = new int [endeks];
                for (int i = 0; i < endeks; i++) {
                    finalResult[i] = result[i];

                }

                return finalResult;
        }

        public static double[][] getClosestPoints(double[][] array) {
            double sensitivePoint =1;
            int[] same = new int[array.length];
            int n = same.length;
            int d = same.length;
            double[][] close = new double[n][d];
            // double closest=0;
            for (int i =0;i<array.length;i++){
                for (int j =0;j<array.length;j++){
                    double closest=close[i][j];


                    //int[][] result = new int[m][k];


                }

            }

            return close;
        }
    public static int random(int max,int min,int... exclude){
        //int[] randomArray = new int [exclude.length];
        int randomly =random(max ,min);
        for (int i = 0; i < exclude.length; i++) {
            while (randomly ==exclude[i]){
                randomly =random(max,min,exclude);
            }
        }

        return randomly;
    }

    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int random(int start, int end) {
        return start + (int) (Math.random() * (end - start + 1));
    }
        public static int employeeWorkingHours(int[][] employees){


    int[] totalHours = new int[employees.length];
     for (int i = 0; i < employees.length; i++) {
        for (int j = 0; j < employees[i].length; j++) {
            totalHours[j] += employees[i][j];//?
        }
    }

     for (int m = 0; m < employees.length-1; m++) {

        int sayi = employees.length;
        int temp = m;

        for (int j = m+1; j < employees.length ; j++) {
            if(totalHours[j]<sayi){
                sayi = totalHours[j];
                temp = j;
            }
        }

        if(temp != m){
            totalHours[temp] = totalHours[m];
            totalHours[m] = sayi;
        }
    }
        return 1;
        }

}



