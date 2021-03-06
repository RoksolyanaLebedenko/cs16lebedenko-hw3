package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{

    Object[] nArr;

    public MapDecorator(SmartArray nArr, MyFunction func){
        super(nArr);
        Object[] arr = smartArray.toArray();
        int end = arr.length;
        for (int i = 0; i < end; ++i) {
            arr[i] = func.apply(arr[i]);
        }
    }
    @Override
    public Object[] toArray() {
        return nArr;
    }

    @Override
    public String operationDescription() {
        return "MapDecorator";
    }

    @Override
    public int size() {
        return nArr.length;
    }
}
