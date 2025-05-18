package static_keyward;
public class StaticExample {

 
    private static int i = m3(); 

    static {
      m1(); 
      System.out.println("Static block");
    }

    public static void m1() {
       m2(); 
      
       System.out.println(i); 
       System.out.println("Static method m1()");
    }

    public static void m2() {
       System.out.println("Static method m2()");
      
       System.out.println(i); 
    }

    public static int m3() {
       return 10;
    }

    public void m4() {
       
       System.out.println(i); 
       m3(); 
    } 

    public static void main(String[] str) {
       m1(); 
	   m2(); 
       System.out.println("main() method");
    }
}