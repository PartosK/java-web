package main;

public class Main2 {
    public static void main(String[] args) throws Exception {

        A aB = new B();

        A aC = new C();

        B bB = new B();

        B bC = new C();

        C cC = new C();

        aB.diff(1,1) == 0;
        aC.sum(1,1)==2;
        bC.mult(2,2)==4;
        bB.diff(1,2)==1;
        bC.diff(1,2) ==1;
    }
}

interface A {

    int sum(int x, int y);

}

class B implements A{

    public int diff(int x, int y){return x - y;}

    public int sum(int x, int y){return x + y;}

}

class C extends B{

    public int mult(int x, int y){return x * y;}

    public int diff(int x, int y){return y - x;}

}

