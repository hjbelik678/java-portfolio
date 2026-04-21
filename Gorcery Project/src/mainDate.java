//henry Belik

public class mainDate { 
    public static void main(String[] args) {

        // March First 2024
        int targetYear = 2024;
        int targetMonth = 3;
        int targetDay = 1;

        // February 18th 2024
        MyDate MyDate = new MyDate(2024, 2, 18);

        System.out.println("Days until " + targetYear + "-" + targetMonth + "-" + targetDay + ": " +
                MyDate.getDaysUntil(targetYear, targetMonth, targetDay));

        System.out.println("Day: " + MyDate.getDay());
        System.out.println("Month: " + MyDate.getMonth());
        System.out.println("Year: " + MyDate.getYear());
        System.out.println("Is leap year? " + MyDate.isLeapYear());
    }
}

