import java.util.Arrays;
public class Exercise02_20220808056 {

       // int[] array = {1, 3, 3, 5, 5, 7, 7, 1, 1};
        //int[] result = eliminateDuplicates(array);
        //for (int i = 0; i < result.length; i++) {
          //  System.out.print(array[i]);



    // Question 1
        /*
        int[] students = new int[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = random(0, 100);
        }

        System.out.println("Scores of students:");
        display(students);

        char[] grades = grade(students);

        System.out.println("Grades of students are:");
        display(grades);
        */
    /*
     * Write a method that gets student scores and finds the best score
     * then, assigns grades based on the following scheme:
     *      grade is A if score is >= best - 10;
     *      grade is B if score is >= best - 20;
     *      grade is C if score is >= best - 30;
     *      grade is D if score is >= best - 40;
     *      grade is F otherwise
     *
     * Args: students int[]: array of scores
     * Returns: char[]: array of grades
     */

        public static int getMax(int []array){
        int maxNum=array[0];
        for (int i=0;i< array.length;i++){
            if (array[i]>maxNum){
                maxNum=array[i];
            }

        }
            return maxNum;


    }
// assigninng grades
    public static char[] grade(int[] students){
        char[]grades=new char[students.length];
        int best =getMax(students);
        for (int i=0;i< students.length;i++){
          //neden çar değil
            if (students[i]>= best -10) {
                grades[i]='A';
            } if (students[i]>= best -20) {
                grades[i]='B';
            } if (students[i]>= best -30) {
                grades[i]='C';
            } if (students[i]>= best -40) {
                grades[i]='D';
            }else grades[i]='F';


        }
        return grades;
    }

    // Question 2
        /*
        int[] numbers = new int[8];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random(0, 10);
        }
        display(numbers);
        System.out.println("Average of numbers is: " + average(numbers));

        double[] doubleNumbers = new double[8];
        for (int i = 0; i < doubleNumbers.length; i++) {
            doubleNumbers[i] = random(-0.5, 0.5);
        }
        display(doubleNumbers);
        System.out.println("Average of numbers is: " + average(doubleNumbers));
        */
    // Question 2: Average an array
    /*
     * Write a method that reutnrs the average of an array
     *
     * Args: array int[]: array to average
     * Returns: int: average of the array
     */

    // Your code goes here...

    public static int average(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }


    // Overload the above method for double data type
   // public static double average(double[] array) {
        /*
         * Write a method that reutnrs the average of an array
         *
         * Args: array double[]: array to average
         * Returns: double: average of the array
         */

        // Your code goes here...
      public static double average(double[] array){
            double[] doubleNumbers=new double[8];
            double sum=0;
            for (int i=0;i<doubleNumbers.length;i++){
                doubleNumbers[i]=(double) (Math.random()-0.5);
                sum+=doubleNumbers[i];
            }
            return sum/doubleNumbers.length;
        }

    // Question 3
        /*
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random(0, 10, 1, 3, 5, 7, 9);
        }
        System.out.println("Generated numbers are: ");
        display(numbers);
        */


    /*
     * Write a method that returns a random number between start and end,
     * excluding the numbers passed in the argument exclude. if a number generated
     * is one of the excluded numbers, then generate another number.
     *
     * Args:
     *      start int: the start of the number to generate
     *      end int: the end of the number to generate
     *      exclude int[optional]: the numbers to exclude
     *
     * Returns: int: the number generated that is not one of the exluded numbers
     */

    // Your code goes here...

        public static int random(int start, int end, int... exclude) {


          //  int number = (int) (Math.random() * (end - start + 1)) + start;
            //while (contains(exclude, number)) {
              //  number = (int) (Math.random() * (end - start + 1)) + start;

            int ran=random(start,end);
            for (int i = 0; i < exclude.length; i++) {
                while (ran==exclude[i]){
                    ran=random(start,end,exclude);
                }
               // if (array[i] == value) {
                 //   return true;
                //}
        }

            return ran;
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
    // Question 4
        /*
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random(0, 10, 0, 1, 3, 5, 7, 9);
        }
        System.out.println("Generated numbers with duplicate values are: ");
        display(numbers);
        int[] nonDuplicateNumbers = eliminateDuplicates(numbers);

        System.out.println("Non duplicate numbers");
        display(nonDuplicateNumbers);
        */
    // Question 4: Eliminate duplicates



    /*
     * Write a method that returns a new array by eliminating the duplicate
     * values in the array. Order of appearences for numbers must not change
     *
     * Args: array int[]: array containing duplicate elements
     * Returns: int[]: new array that does not contains duplicate elements, but
     * keeps the order of appearences of numbers.
     */

    // Your code goes here...

    //public static int[] duplicateCounter(int[] counter){}
      //  public static int[] eliminateDuplicates(int[] array) {


     //   int []result=new int[array.length];
      //  for (int i=0;i<array.length;i++){
        //    array[i]= (int) (Math.random()*(10-0)+1);
          //  int value=-1;
            //if (array[i]==value){

            //value=array[i];




    public static int[] eliminateDuplicates(int[] array) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean exists = false;
            for (int j = 0; j < index; j++) {
                if (array[i] == result[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                result[index] = array[i];
                index++;
            }
        }



        int[] finalResult = new int[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }
    // Question 5: Sorted?
    /*
     * Write a method that returns true if the array is already sorted in increasing order,
     * false otherwise
     *
     * Args: array int[]: array of numbers
     * Returns: boolean
     */

    // Your code goes here...
    public static boolean isSorted(int[] array) {
        int[] sorted=new int[array.length];
        for (int i=0;i<array.length;i++){
            if (sorted[i] < sorted[i - 1]){
                return false;
            }

        }
        return true;


    }

    // shuffle the array randomly
    public static void shuffle(int[] array) {
        /*
         * Write a method that shuffles the array randomly

         */

        // Your code goes here...
        int[] shuffle=new int[array.length];
        for (int i=0;i<array.length;i++){
            shuffle[i]=(int) (Math.random());
        }
        }








    // Question 6: Locker puzzle
    public static int[] lockers(boolean[] locker) {
        /*
         * A school has 100 lockers and 100 students. All lockers are closed on
         * the first day of school. As the students enter, the first student, denoted as
         * S1, opens every locker. Then the second student, S2, begins wtih the second
         * locker, denoted L2, and closes every other locker (every second locker). Student S3 begins with the
         * third locker, L3, and changes every third locker (closes it if it was open,
         * and opens it if it was closed). Student S4 begins with L4 and changes every fourth
         * locker. S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100
         *
         * After all the students have passed through the building and changed the lockers, which lockers are open?
         * find the indicies of lockers that are open and return them as counting numbers(this means index 0 should be 1,
         * so add +1 to each index value you are storing in returned array)
         *
         * Args: array boolean[]: boolean array thata represents the lockers, true means open locker, false means closed locker
         * Returns: int[]: array of open locker indicies as counting numbers
         */
        int num=locker.length;
        int[] openLockers=new int[num];
        int counter=0;
        for (int i=0;i<=num;i++){
            for (int j=i-1;j<num;j+=i){
                locker[j]=!locker[j];
            }
        }
        for (int i=0;i<num;i++){
            if (locker[i]){
                openLockers[counter]=i+1;
                counter++;
            }
        }
    return Arrays.copyOf(openLockers,counter);
    }
    public static int lockers(int lockerNumber) {
        // Check if the locker number is within the bounds of the array
        if (lockerNumber < 1 || lockerNumber > 100) return 0;

        // Initialize the array and the counter
        int[] lockerss = new int[100];
        int counter = 0;

        // Iterate through the numbers from 1 to 100
        for (int bolen = 2; bolen <= 100; bolen++) {
            // Check if the locker number is divisible by the current number
            if (lockerNumber % bolen == 0) counter++;
        }

        // Return 1 if the number of divisors is even, otherwise return 0
        return counter % 2 == 0 ? 1 : 0;
    }
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

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}



