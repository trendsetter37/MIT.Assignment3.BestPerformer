/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mit.assignment3.bestperformer;


/*A group of friends perform in the Marathon
 find the best performeer and then find the second best performer
 */
/**
 *
 * @author javis
 */
public class BestPerformer {

    public static int bestPerformer(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
            //return minValue;

        }
        return minValue;
    }

    public static int getSecondBestPerformer(int[] values) {
        int min2Idx = -1;
        int bestValue = bestPerformer(values);
        int min2Value = Integer.MAX_VALUE;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == bestValue) {
                continue;
            }
            if (values[i] < min2Value) {
                min2Value = values[i];
                min2Idx = i;

            }

        }
        return min2Value;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
