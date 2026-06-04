package phase.first.beforedsu.conditionalthinking.trickylogical;

import phase.first.beforedsu.conditionalthinking.simpleconditions.CheckGivenYearIsLeapYear;

public class CheckDayAndMonthAreValidCalendarDate {
    //ignoring Leap Years
    public boolean isValidCalendarDateIgnoringLeapYears(int month, int day){
        //checking not valid date
        if(day <= 0 || day > 31 || month <= 0 || month > 12 ){
            return false;
        }

        return switch (month) {
            case 2 -> day <= 28;
            case 4, 6, 9, 11 -> day <= 30;
            default -> true;
        };

    }

    //with leap year
    public boolean isValidCalendarDateWithLeapYears(int month, int day, int year){
        CheckGivenYearIsLeapYear givenYearIsLeapYear = new CheckGivenYearIsLeapYear();
        //checking not valid date
        if(day <= 0 || day > 31 || month <= 0 || month > 12 ){
            return false;
        }

        return switch (month) {
            case 2 -> givenYearIsLeapYear.checkGivenYearIsLeapYear(year) ? day <= 29 : day <= 28;
            case 4, 6, 9, 11 -> day <= 30;
            default -> true;
        };

    }
}
