package dataStruture.domain;

public class NoDouble<T> {
    private T value;
    private NoDouble<T> refNextNo;
    private NoDouble<T> refPrevNo;

    public NoDouble(T value){
        this.value = value;
        this.refNextNo = null;
        this.refPrevNo = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NoDouble<T> getRefNextNo() {
        return refNextNo;
    }

    public void setRefNextNo(NoDouble<T> refNextNo) {
        this.refNextNo = refNextNo;
    }

    public NoDouble<T> getRefPrevNo() {
        return refPrevNo;
    }

    public void setRefPrevNo(NoDouble<T> refPrevNo) {
        this.refPrevNo = refPrevNo;
    }

    @Override
    public String toString() {
        return "NoDouble{" +
                "value=" + value +
                '}';
    }
}
