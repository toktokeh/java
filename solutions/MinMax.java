/*
    Write a function that returns both the minimum and maximum number of the given list/array

    MinMax.minMax(new int[]{1,2,3,4,5}) == {1,5}
    MinMax.minMax(new int[]{2334454,5}) == {5,2334454}
    MinMax.minMax(new int[]{1}) == {1,1}
*/

import java.util.*;
import java.util.stream.IntStream;

// Using arrays


class MinMax {
    public static int[] minMax(int[] arr) {
         Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }

    public static void main(String[] args) {
        System.out.println("{" + 
            minMax(new int[]{1,2,3,4,5})[0] + "," +
            minMax(new int[]{1,2,3,4,5})[1] + "}"
            );
        System.out.println("{" + 
            minMax(new int[]{2334454,5})[0] + "," +
            minMax(new int[]{2334454,5})[1] + "}"
            );
        System.out.println("{" + 
            minMax(new int[]{1})[0] + "," +
            minMax(new int[]{1})[1] + "}"
            ); 
    }
}

// Using streams (two methods)
// class MinMax {
//     public static int[] minMax(int[] arr) {
//        return new int[]{Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
//     }

//     public static void main(String[] args) {
//         System.out.println("{" + 
//             minMax(new int[]{1,2,3,4,5})[0] + "," +
//             minMax(new int[]{1,2,3,4,5})[1] + "}"
//             );
//         System.out.println("{" + 
//             minMax(new int[]{2334454,5})[0] + "," +
//             minMax(new int[]{2334454,5})[1] + "}"
//             );
//         System.out.println("{" + 
//             minMax(new int[]{1})[0] + "," +
//             minMax(new int[]{1})[1] + "}"
//             ); 
//     }
// }

// class MinMax {
//     public static int[] minMax(int[] arr) {
//        return new int[]{IntStream.of(arr).min().getAsInt(), IntStream.of(arr).max().getAsInt()};
//     }

//     public static void main(String[] args) {
//         System.out.println("{" + 
//             minMax(new int[]{1,2,3,4,5})[0] + "," +
//             minMax(new int[]{1,2,3,4,5})[1] + "}"
//             );
//         System.out.println("{" + 
//             minMax(new int[]{2334454,5})[0] + "," +
//             minMax(new int[]{2334454,5})[1] + "}"
//             );
//         System.out.println("{" + 
//             minMax(new int[]{1})[0] + "," +
//             minMax(new int[]{1})[1] + "}"
//             ); 
//     }
// }




