package inheritance;

public class InheritenceSample {

    public static void main(String[] args) {
        BMW b = (BMW)new Car(); /// will result in ClassCastException
      //  b.run();

       Car b1 = new BMW();
     //  b1.show()  ---->>> This is not possible because show method is not present in parent class
    }

}
