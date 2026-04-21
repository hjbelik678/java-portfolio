//Henry Belik

public class nameDate {
    private int year;
    private int month;
    private int day;

    public void MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDaysUntil(int targetYear, int targetMonth, int targetDay) {
        int daysUntil = 0;
        // counts until target date
        while (year != targetYear || month != targetMonth || day != targetDay) {
            daysUntil++;
            moveForwardDays(1);
        }
        return daysUntil;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private void moveForwardDays(int days) {
        int daysInMonth = getDaysInMonth(year, month);
        day += days;
        while (day > daysInMonth) {
            day -= daysInMonth;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
            daysInMonth = getDaysInMonth(year, month);
        }
    }

    private int getDaysInMonth(int year, int month) {
        if (month == 2) {
            if (isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}