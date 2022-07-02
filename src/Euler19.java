public class Euler19 {

    public static void main(String... args) {
        int dayOfWeek = 0; // 0 - Monday, 6 - Sunday

        int day = 1;
        int month = 1;
        int year = 1900;

        int startingYear = 1901;
        int sundayOnFirstMonth = 0;

        while(true) {
            if (year == 2001) {
                break;
            }
            dayOfWeek = (dayOfWeek+1)%7;
            if (month == 4 || month == 6 || month == 9) {
                if(day >= 31) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
            } else if (month == 2) {
                int monthsInFebruary = 28;
                if (isLeapYear(year)) {
                    monthsInFebruary = 29;
                }
                if(day >= monthsInFebruary) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
            } else {
                if(day >= 31) {
                    day = 1;
                    if (month >= 12) {
                        month = 1;
                        year++;
                    } else {
                        month++;
                    }
                } else {
                    day++;
                }
            }

            if (year >= startingYear) {
                if(dayOfWeek == 6 && day == 1){
                    sundayOnFirstMonth++;
                }
            }
        }
        System.out.println(sundayOnFirstMonth);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}
