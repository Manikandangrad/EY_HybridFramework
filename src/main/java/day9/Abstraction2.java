package day9;
//Abstraction using --interface--
public interface Abstraction2 {
    int add(int i,int j);
    int sub(int k,int l);
    default int mul(int m,int n)
    {
        return m*n;
    }
    static int div(int o, int p)
    {
        return o/p;
    }
}
