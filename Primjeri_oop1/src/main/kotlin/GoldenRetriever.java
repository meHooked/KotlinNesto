public class GoldenRetriever extends Dog {
    private String dogName = "";

    @Override
    public void bark() {
        System.out.println("Golden retriever is barking!");
        super.bark();
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String toString() {
        return "GoldenRetriever{" +
                "dogName='" + dogName + '\'' +
                ", size='" + getSize() + '\'' +
                '}';
    }
}
