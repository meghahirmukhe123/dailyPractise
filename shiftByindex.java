import java.util.Arrays;

public class shiftByindex {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        int i1 = Arrays.binarySearch(arr, 1);
        System.out.println("index of 1 : "+i1 );

        int i2 = Arrays.binarySearch(arr, 2);
        System.out.println("index of 2 : "+i2 );

        int i3 = Arrays.binarySearch(arr, 3);
        System.out.println("index of 3 : "+i3 );

        int i4 = Arrays.binarySearch(arr, 4);
        System.out.println("index of 4 : "+i4 );

        int i5 = Arrays.binarySearch(arr, 5);
        System.out.println("index of 5 : "+i5 );

        int i6 = Arrays.binarySearch(arr, 6);
        System.out.println("index of 6 : "+i6 );

        //for first shifting

        int f1= arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];    //0th index=2,1st index=3.....
        }

        arr[arr.length - 1] = f1;  //now index of arr[0] is 5

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();


        //for second shifting

        int f2= arr[0];
        

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];    //0th index=2,1st index=3.....
        }

        arr[arr.length - 1] = f2;  //index of f1 is 5

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        //for third shifting

        int f3= arr[0];
      

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];    //0th index=3,1st index=4.....
        }

        arr[arr.length - 1] = f3;  //index of f1 is 5

        for (int num : arr) {
            System.out.print(num + " ");
        }




    }

}
