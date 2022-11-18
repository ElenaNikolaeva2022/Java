/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n)
 */

package SEM_1_HW;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        int n = 8;
        int triangleN = 0;
        int factorialN = 1;
        for (int i = 1; i <= n; i++) {
            triangleN += i;
            factorialN *= i;
        }
        System.out.println(triangleN);
        System.out.println(factorialN);
    }
}





