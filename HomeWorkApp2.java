package lesson2;

public class HomeWorkApp2 {
    public static boolean checkSum(int a, int b) {
        if ((a+b) >= 10 && (a+b)<=20) {
            return true;
        } else {
            return false;
        }
    }
    public static int num1(int a) {
        return a;
    }
    public static boolean num2(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean year(int a) {
        if ((a % 400) == 0) {
            return true;
        } else if ((a % 100) == 0){
            return false;
        } else if ((a % 4) == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(checkSum(5,10));

        if (num1(5) >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

        System.out.println(num2(7));

        String str = "Доброе утро";
        int x = 1;
        for (int i = 1; i <= x; i++) {
            System.out.println(str);
        }

        System.out.println(year(1800));
    }
}
