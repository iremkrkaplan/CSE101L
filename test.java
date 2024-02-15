public class test {
    public static void main(String[] args) {
        try {
            int[] arr={1,2,3,4,5};
            displayValue(arr,arr.length/2);
            displayValue(arr,arr.length);
            displayValue(arr,0);

        }catch (Exception ex){
            System.out.println("error");
        }finally {
            System.out.println("main");
        }
    }
    public static void displayValue(int[] arr, int i )throws IndexOutOfBoundsException{
        try {
            if (i>= arr.length||i<0)
                throw new IndexOutOfBoundsException();
            System.out.println(arr[i]);
        }catch (IndexOutOfBoundsException ex){
            System.out.println("invalid");
        }finally {
            {
                System.out.println("finally");
            }
        }
    }
}
