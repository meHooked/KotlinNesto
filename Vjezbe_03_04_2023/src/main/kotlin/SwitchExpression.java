public class SwitchExpression {
    public static void main (String[] args){
        int num = 200;
        switch(num){
            case 100:
                System.out.println(100);
                break;
            case 200:
                System.out.println(200);
                //break;
            case 300:
                System.out.println(300);
                break;
            default:
                System.out.println("Didn't match anything");
        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int monthNum = 3;
        switch (monthNum) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 4, 6, 9, 11 -> System.out.println(30);
            case 2 -> System.out.println(29);
            default -> System.out.println("Invalid value");
        }
    }
}
