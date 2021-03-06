package by.epamtc.lonelyday.tasks_01.task3.run;

import by.epamtc.lonelyday.tasks_01.task3.entity.CircleEntity;
import by.epamtc.lonelyday.tasks_01.task3.entity.SquareEntity;
import by.epamtc.lonelyday.tasks_01.task3.service.AreaRatioService;
import by.epamtc.lonelyday.tasks_01.task3.service.CircleConstructor;
import by.epamtc.lonelyday.tasks_01.task3.service.SquareConstructor;
import by.epamtc.lonelyday.tasks_01.task3.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.task3.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        double squareArea = UserAskService.askSquareArea();

        SquareEntity squareObject = SquareConstructor.createSquareByArea(squareArea);
        CircleEntity inscribedCircleObject = CircleConstructor.createCircleInscribedInSquare(squareObject);
        SquareEntity inscribedSquareObject = SquareConstructor.createSquareInscribedInCircle(inscribedCircleObject);

        double areaRatio = AreaRatioService.calcSquareAreaRatio(squareObject, inscribedSquareObject);

        Reporter.reportSquareArea(inscribedSquareObject.calcArea());
        Reporter.reportAreaRatio(areaRatio);
    }
}
