package dataStruture.domain;

public class No<T> {
    private T value;
    private No<T> refNextNo;

    public No() {
        this.refNextNo = null;
    }

    public No(T value) {
        this.value = value;
        this.refNextNo = null;
    }

    public No(T value, No<T> refNextNo) {
        this.value = value;
        this.refNextNo = refNextNo;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public No<T> getRefNextNo() {
        return refNextNo;
    }

    public void setRefNextNo(No<T> refNextNo) {
        this.refNextNo = refNextNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "value=" + value +
                '}';
    }
}
