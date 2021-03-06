package by.epamtc.lonelyday.tasks_01.task5.run;

import by.epamtc.lonelyday.tasks_01.task5.service.IntService;
import by.epamtc.lonelyday.tasks_01.task5.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.task5.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        int n = UserAskService.askInt();

        boolean perfectness = IntService.isPerfect(n);

        Reporter.reportBool(perfectness);

    }
}
