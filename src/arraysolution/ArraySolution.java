package arraysolution;

import java.util.Arrays;

/**
 *
 * @author Jacob
 */
public class ArraySolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] sampleArray = {9, 9, 9, 9};
        ArrayProcessor processArray = new ArrayProcessor();
        
        processArray.incrementElementsByOne(sampleArray);
        int[] incrementedArray = processArray.generateIncrementedArray(sampleArray);
        System.out.println(Arrays.toString(incrementedArray));
    }

}
