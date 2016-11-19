package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    Object[] nArr;

    public DistinctDecorator(SmartArray nArr) {
        super(nArr);
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
