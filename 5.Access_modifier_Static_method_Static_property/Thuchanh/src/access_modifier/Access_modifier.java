package access_modifier;

public class Access_modifier {
//    class A{
//
//        private int data=40;
//
//        private void msg(){System.out.println("Hello java");}
//
//
//
//    }


//package pack;
//
//    class A{
//
//        void msg(){System.out.println("Hello");}
//
//    }
//
//
//
//
//package mypack;
//
//import pack.*;
//
//    class B{
//
//        public static void main(String args[]){
//
//            A obj = new A();//Compile Time Error
//
//            obj.msg();//Compile Time Error
//
//        }
//
//    }


//    public static class A {
//
//        protected void msg() {
//            System.out.println("Hello");
//        }
//
//    }
//
//    static class B extends A {
//
//        public static void main(String args[]) {
//
//            B obj = new B();
//
//            obj.msg();
//
//        }
//
//    }

//    public class Simple{
//
//        public static void main(String args[]){
//
//            B obj=new B();
//
//            System.out.println(obj.data);//Compile Time Error
//
//            obj.msg();//Compile Time Error
//
//        }
//
//    }
//}

    public static class A{

        public void msg(){System.out.println("Hello");}

    }

    static class B{

        public static void main(String args[]){

            A obj = new A();

            obj.msg();

        }

    }
}