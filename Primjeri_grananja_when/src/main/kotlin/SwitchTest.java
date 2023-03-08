public class SwitchTest {


    SwitchTest(){

    }
    public static void sayHello(){
        System.out.println("Hello from Java");
    }
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 0:
            case 1:
                System.out.println(x);
                break;
            default:
                System.out.println("not 0 or 1");
        }
    }
}
