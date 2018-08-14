package lab4;

public class ex1 {
    public static void  B(String msg){
        System.out.println(msg);


    }//E


    public static void main(String[] args) {
        System.out.println("Hello Main.");
        //call A()
        A();
        System.out.println("Hello Main. 2");
        //call B()
        B("KIW");
        //call C()
        int num = C(10,10);
        System.out.println(num);
        System.out.println(C(20,20));


    }//main
    public static void  A(){
        //method body
        System.out.println("Hello A.");
    }

        public static int C(int x, int y){
        System.out.println("Hello C.");
        return x+y;





        }//C




}//class
