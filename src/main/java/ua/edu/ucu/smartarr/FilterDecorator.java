package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{

    Object[] nArr;
    MyPredicate predicate;

    public FilterDecorator(SmartArray nArr, MyPredicate predicate) {
        super(nArr);
    }

    @Override
    public Object[] toArray() {
        return nArr;
    }

    @Override
    public String operationDescription() {
        return "FilterDecorator";
    }

    @Override
    public int size() {
        return nArr.length;
    }
}
