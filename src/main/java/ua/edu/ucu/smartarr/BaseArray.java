package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {

    private Object[] nArr;

    public BaseArray(Integer[] nArr){
        this.nArr = nArr;
    }

    @Override
    public Object[] toArray() {
        return this.nArr;
    }

    @Override
    public String operationDescription() {
        return "Base array for decorators";
    }

    @Override
    public int size() {
        return nArr.length;
    }
}
