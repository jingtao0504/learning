class A {
    static {
        System.out.print("父类静态成员  ");
    }
    //初始化块，也即是非static语句块
    static {
        System.out.print("父类非静态成员  ");
    }

    public A() {
        System.out.print("父类构造方法  ");
    }
}

class B extends A {
    static {
        System.out.print("子类静态成员  ");
    }
    static  {
        System.out.print("子类非静态成员  ");
    }

    public B() {
        System.out.print("子类构造方法  ");
    }
}

public class Test {

    public static void main(String[] args) {
        A ab = new B();
        System.out.println("\n---------------------------------");
        ab = new B();
    }
}
