public class ArrayLast {
    public static void main(String[] args) {
        int[] arr = {555,5,5,5,7};
        System.out.println(returnLast(arr));
    }

    public static int returnLast(int[] arr) {
       if (arr.length == 0) {
           return -1;
       } else {
           if (arr.length <= 1000) {
               return arr[arr.length-1];
           } else {
               return arr[1000];
           }
       }
    }
}
