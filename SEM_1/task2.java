/**
 * Задание №2
 * Дан массив двоичных чисел, например [1,1,0,1,1,1]. 
 * Вывести максимальное количество подряд идущих 1.
 */

// package SEM_1;

// public class task2 {
//     public static void main(String[] args) {

//         int[] arr = new int[] { 1, 1, 0, 1, 1, 1 }; 
//         int count = 0;

//         for (int i = 0; i < arr.length; i++)

//         if (arr[i] == 1) {
//             count ++;
//         }
//         else {
//             count = 0;
//         }
//         if (count != 0){
//     System.out.println(count);   
// }
//             System.out.println(count);
//     }
// }

package SEM_1;

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 0, 1, 1, 1 };
        int max = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            while (i < array.length && array[i] == 1) {
                count++;
                i++;
            }
            if (count > max)
                max = count;
            count = 0;
        }
        System.out.println(max);
    }
}
