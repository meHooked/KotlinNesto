import java.util.ArrayList;
import java.util.List;

public class JavaCar {

    private String color;
    private String model;
    private Integer year;
    private static List<Integer> years;

    static {
        years = new ArrayList<>();
    }

    public JavaCar(String color, String model, Integer year){
        this.color = color;
        this.model = model;
        this.year = year;
        years.add(this.year);
    }
    public void drive(){
        System.out.println(color + " " + model + " is driving");
    }

    public void park(){
        System.out.println(color + " " + model + " is parking");
    }

    public static int getAverageYear(){
        int total = 0;
        for(Integer year : years){
            total += year;
        }
        return total / years.size();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }
}
