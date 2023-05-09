package day9;

public class AbstractImplements2 implements Abstraction2 {

    @Override
    public int add(int i, int j) {
        return i+j;
    }

    @Override
    public int sub(int k, int l) {
        return k-l;
    }
}
