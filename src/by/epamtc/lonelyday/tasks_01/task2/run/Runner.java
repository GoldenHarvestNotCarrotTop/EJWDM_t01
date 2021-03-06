package by.epamtc.lonelyday.tasks_01.task2.run;

import by.epamtc.lonelyday.tasks_01.task2.enums.MonthEnum;
import by.epamtc.lonelyday.tasks_01.task2.service.CalendarService;
import by.epamtc.lonelyday.tasks_01.task2.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.task2.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        int year = UserAskService.askYear();
        MonthEnum month = UserAskService.askMonthNumber();

        int daysNumber = CalendarService.calcDaysNumber(year, month);

        Reporter.reportDaysNumber(daysNumber);
    }
}
