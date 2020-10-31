package com.bjpowernote.array.demo04;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 14:31
 */
class A {
    public String show(D obj){
    return ("A and D");
    }

    public String show(A obj){
    return ("A and A");
    }

}

class B extends A {

    public String show(B obj){
    return ("B and B");
    }

    public String show(A obj){
    return ("B and A");
    }

}
class C extends B{}
class D extends B{}
public class E {
    public static void main(String [] args)
    {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println(a1.show(b));   //①
        //a1是A类的一个实例化对象，所以this指向A，
        // 然后查找this.show(b),由于没有这个方法，所以到super.show(b)，
        // 但是由于A类没有超类了，所以到this.show(super b),
        // 由于b的超类是A，所以相当于this.show(A),
        // 然后在A类中查找到了这个方法，于是输出A and A。
        System.out.println(a1.show(c));   //②
        System.out.println(a1.show(d));   //③
        System.out.println(a2.show(b));   //④
        System.out.println(a2.show(c));   //⑤
        System.out.println(a2.show(d));  // ⑥
        System.out.println(b.show(b));    //⑦
        System.out.println(b.show(c));    //⑧
        System.out.println(b.show(d));    //⑨

    }

}
/*
（三）答案



        ①   A and A

        ②   A and A

        ③   A and D

        ④   B and A

        ⑤   B and A

        ⑥   A and D

        ⑦   B and B

        ⑧   B and B

        ⑨   A and D*/
