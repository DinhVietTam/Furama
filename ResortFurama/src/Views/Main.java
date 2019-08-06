package Views;

import Controllers.ControllerDate1;
import Models.runningApplicationInterface;

public class Main implements runningApplicationInterface {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    @Override
    public void run(){
        ControllerDate1.showTask01();
        ControllerDate1.showTask02();
    }
}
