package arraysolution;

/**
 *
 * @author Jacob
 */
public class ArrayProcessor {

    public void incrementElementsByOne(final int[] givenArray) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < givenArray.length; i++) {
            int value = givenArray[i];
            sb.append(value + 1);
        }
        System.out.println(sb.toString());
    }

    public int[] generateIncrementedArray(final int[] givenArray) {

        int arraySize = givenArray.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < givenArray.length; i++) {
            int value = givenArray[i];
            if (value == 9) {
                arraySize++;
            }
            sb.append(value + 1);
        }
        int foo = Integer.parseInt(sb.toString());
        return convertIntToArray(foo, arraySize);
    }

    private int[] convertIntToArray(int value, int arraySize) {

        int[] returnedList = new int[arraySize];
        for (int j = arraySize - 1; j > -1; j--) {
            returnedList[j] = value % 10;
            value = value / 10;
        }
        return returnedList;
    }

}
