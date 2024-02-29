package simplejavacalculator;

public class SimpleJavaCalculator {

    public static void main(String[] args) {
        try {
            simplejavacalculator.UI uiCal = new simplejavacalculator.UI();
            uiCal.init();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}