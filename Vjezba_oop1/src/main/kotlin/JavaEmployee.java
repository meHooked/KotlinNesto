import java.util.Scanner;

public class JavaEmployee {
    private String firstName;

    private Boolean isFullTime;

    public JavaEmployee(String firstName, Boolean isFullTime){
        this.firstName = firstName;
        this.isFullTime = isFullTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getFullTime() {
        System.out.println("Custom getter...");
        return isFullTime;
    }

    public void setFullTime(Boolean isFullTime) {
        System.out.println("Custom setter...");
        if(isFullTime){
            System.out.println("Are you sure it's true?");
            Scanner myObj = new Scanner(System.in);
            String input = myObj.nextLine();
            this.isFullTime = (input.charAt(0) == 'Y');
        }
    }
}
