package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{

    Object[] nArr;

    public SortDecorator(SmartArray nArr, MyComparator cmp){
        super(nArr);
    }

    @Override
    public Object[] toArray() {
        return nArr;
    }

    @Override
    public String operationDescription() {
        return "SortDecorator";
    }

    @Override
    public int size() {
        return nArr.length;
    }
}
