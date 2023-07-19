interface A {
    void method1();
    void method2();
    interface B {
    void method3();
    void method4();
    }}
    abstract class demo20 implements B{
         public void method3(){
    System.out.println("From method-3");
        public void method4(){
    System.out.println("From method-4");
    }
    }