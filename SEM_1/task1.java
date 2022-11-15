// package SEM_1;
// import java.time.LocalDateTime;

// /**
//  * task1
//  */
// public class task1 {

//     public static void main(String[] args) { 
//         System.out.println("Hello world!");
//         System.out.println(LocalDateTime.now());
//     }
// }
// ==========================================================================

/** Задание №1
* Написать программу, которая запросит пользователя ввести <Имя> в консоли.
* Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"
*/

package SEM_1;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }

}

