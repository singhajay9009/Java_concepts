package Serialize;


import java.io.*;

public class SerializeSample implements Serializable {

    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fout = new FileOutputStream("/Users/ajaysingh/Study/Git_Repos_main/Java_concepts/sample.ser", true);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            StudentSer stu = new StudentSer(101, "Ricky");
            out.writeObject(stu);

            out.close();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try{
            FileInputStream fin = new FileInputStream("/Users/ajaysingh/Study/Git_Repos_main/Java_concepts/sample.ser");
            ObjectInputStream objIn = new ObjectInputStream(fin);

            StudentSer stu1 = (StudentSer) objIn.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
