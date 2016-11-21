package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    Object[] nArr;

    public DistinctDecorator(SmartArray nArr) {
        super(nArr);
        int end = this.nArr.length;
        int count = 0;
        boolean exists = false;
        Object arr[] = this.smartArray.toArray();
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i].equals(arr[j])) {
                    exists = true;
                }
            }
            if (!exists) {
                arr[count] = arr[i];
                count++;
            }
        }
        final Integer[] finalArray = new Integer[count];
        System.arraycopy(arr, 0, finalArray, 0, count);

    }


    @Override
    public Object[] toArray() {
        return nArr;
    }

    @Override
    public String operationDescription() {
        return "DistinctDecorator";
    }

    @Override
    public int size() {
        return nArr.length;
    }
}
