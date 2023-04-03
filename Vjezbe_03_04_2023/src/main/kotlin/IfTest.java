public class IfTest {
    public static void main(String[] args){
        int a = 10;
        int b = 26;

        int greaterNumber;

        if(a > b){
            greaterNumber = a;
        } else {
            greaterNumber = b;
        }
        System.out.println("Greater number is " + greaterNumber);
        final int greaterNumber2 = (a > b)? a : b;
        System.out.println("Greater number is " + greaterNumber2);
    }
}
