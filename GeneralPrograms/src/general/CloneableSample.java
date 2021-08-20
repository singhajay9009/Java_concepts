package general;

public class CloneableSample implements Cloneable {

    private String name;
    private String address;
    private int age;

    public CloneableSample(int age, String name, String address){
        this.age = age;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "CloneableSample{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("in overridden clone method...");
        return super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableSample cloneableSample = new CloneableSample(22, "Robin", "123 new street");

        CloneableSample cloneableSample1 = (CloneableSample) cloneableSample.clone();

        System.out.println(cloneableSample);
        System.out.println("===== Cloned Object ====");
        System.out.println(cloneableSample1);

    }

}
