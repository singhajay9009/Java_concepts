package fielDirectorySystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSystemDir {

    public static void main(String[] args) throws IOException {

        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        File file = new File(dir + "/GeneralPrograms/abc.txt");
        file.createNewFile();
    }
}
