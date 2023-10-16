import java.io.File;
import java.util.Arrays;

public class Slip8A {
    public static void main(String[] args) {
       File directory = new File("C:\\Users\\Admin\\Desktop\\JAVA Sem 5");

        if (directory.isDirectory()) {
            Arrays.stream(directory.listFiles(f -> f.isFile() && f.getName().toLowerCase().endsWith(".txt")))
                  .map(File::getName)
                  .forEach(System.out::println);
        } else {
            System.out.println("Directory not found");
        }
    }
}
