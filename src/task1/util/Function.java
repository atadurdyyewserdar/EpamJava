package task1.util;

public class Function
{
    public static int getLastNumber(int number){
        int lastNumber = number % 10;
        return (int)Math.pow(lastNumber, 2) % 10;
    }

    public static int getDays(int month, int year){

        final int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(month > 12 || month < 1 || year < 0){
            return -1;
        }

        if ((year % 100 != 0 || year % 400 == 0) && year % 4 == 0 && month == 2){
            return 29;
        }

        return daysOfMonth[--month];
    }

    public static boolean ifExistsTwoEven(int...numbers){
        int k = 0;
        for (int a: numbers) {
            if (a % 2 == 0) k++;
        }
        return k > 1;
    }

    public static boolean perfectNumber(int number){
        if (number < 2)
            return false;

        int sum = 0;

        for (int i = 1; i < number;i++){
            if (number % i == 0)
                sum+= i;
        }
        return sum == number;
    }

    public static int getHour(int seconds){
        if (seconds < 0 || seconds > 86400)
            return -1;
        return seconds / 3600;
    }

    public static int getMinute(int seconds){
        if (seconds < 0 || seconds > 86400)
            return -1;
        return seconds / 60;
    }

    public static int getSeconds(int seconds){
        if (seconds < 0 || seconds > 86400)
            return -1;
        return seconds;
    }

    public static String findClosest(int x1, int y1, int x2, int y2){
        if (Math.sqrt((x1 * x1) + (y1 * y1)) > Math.sqrt((x2 * x2) + (y2 * y2))){
            return "A(x1, y2)";
        }
        return "B(x2, y2)";
    }

    public static double mathematicalFunction(double x){
        if (x >= 3){
            return -x*x + 3 * x + 9;
        }
        else{
            return 1 / (Math.pow(x, 3) -6);
        }
    }

    public static double getLength(double R){
        if (R < 0)
            return -1;
        return 2 * 3.14 * R;
    }

    public static double getSquare(double R){
        if (R < 0)
            return -1;
        return 3.14 * R * R;
    }

}