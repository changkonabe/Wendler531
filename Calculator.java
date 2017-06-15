package Wendler531;

/** Class that calculates working sets of a 4 week
 *  cycle based on the 5/3/1 Program. 
 *  @author K. Chang
 */
class Calculator {

    /** Constructor class for Calculator. */
    protected Calculator(int lift) {
        numbers = calculate(lift);
    }
    
    private double[][] calculate(int lift) {
        double[][] result = new double[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j ++) {
                result[i][j] = (double) lift * percentages[i][j];
            }
        }
        return result;
    }

    /* 2D array of attempt numbers, where row is week and column is set. */
    protected double[][] numbers;
    
    /* 2D array of percentages for attempts. */
    private static final double[][] percentages = new double[4][];

    static {
        percentages[0] = new double[] {0.65, 0.75, 0.85};
        percentages[1] = new double[] {0.70, 0.80, 0.90};
        percentages[2] = new double[] {0.75, 0.85, 0.95};
        percentages[3] = new double[] {0.40, 0.50, 0.60};
    }
        
}