package overriding;

public class CovariantDemo {
    public static void main(String[] args) {
        A a = new B ();
        a.returnClass();
        a.returnClassA();

        B b = new B ();
        b.returnClassB();

    }
}

class A {

    A returnClass(){
        System.out.println("In Class A");
        return new A();
    }

    A returnClassA(){
        System.out.println("In Class A again");
        return new A();
    }

}

class B extends A {

    A returnClass(){
        System.out.println("In Class B");
        return new B();
    }

    A returnClassB(){
        System.out.println("In Class B again");
        return new B();
    }

}

