package Wendler531;

import java.util.Map;


/** Java class representing the 531 Program.
 *  @author K. Chang
 */
class Program {

    protected Program(Map<String, Integer> m, boolean useMetric) {
        myLifts = m;
        metric = (useMetric) ? "kgs" : "lbs";
    }

    protected void printProgram() {
        String buf = " || ";
        System.out.println("Program Cycle " + "(" + metric + ")" +   ":");
        System.out.println(buf + "  Week 1  " + buf + "  Week 2  " + buf +
                           "  Week 3  " + buf + "  Week 4  " + buf);
        for (String lift : myLifts.keySet()) {
            System.out.println(lift);
            Calculator calc = new Calculator(myLifts.get(lift));
            double[][] c = calc.numbers;
            int wk3;
            String amrap;
            for (int i = 0; i < 3; i++) {
                amrap = (i == 2) ? "+" : " ";
                wk3 = 5 - 2 * i;
                System.out.printf(buf + "%.2f x 5" + amrap + buf + "%.2f x 3" + amrap + buf
                                  + "%.2f x " + wk3 + amrap + buf + "%.2f x 5" + buf,
                                  c[0][i], c[1][i], c[2][i], c[3][i]);
                System.out.println();
            }
        }
    }

    private Map<String, Integer> myLifts;

    private String metric;
}