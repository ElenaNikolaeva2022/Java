/** 
 * Задание №3
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному,
 * нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива 
 * должны быть отличны от заданного, а остальные - равны ему.
*/
package SEM_1;

public class task3 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 2, 2, 3 };
        int val = 3;
        int last = array.length - 1;
        while (array[last] == val)
            last--;
        for (int i = 0; i < last; i++)
            if (array[i] == val) 
            {
                int tmp = array[i];
                array[i] = array[last];
                array[last] = tmp;
                last--;
            }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}