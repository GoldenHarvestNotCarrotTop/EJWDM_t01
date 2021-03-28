package by.training.lonelyday.tasks_01.task6.ui;

import by.training.lonelyday.until.scanner.DataScanner;

public class UserAskService {
    public static int askSeconds(int maxSeconds){
        int seconds = -1;
        while (seconds > maxSeconds || seconds < 0) {
            Reporter.reportString("Enter seconds number:");
            seconds = DataScanner.enterInt();
        }
        return seconds;
    }

}
