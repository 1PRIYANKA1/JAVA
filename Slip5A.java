// Write a java program to accept list of file names through command line. Delete the 
// files having extension .txt. Display name, location and size of remaining files.

import java.io.File;

public class Slip5A {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide file names as command line arguments.");
            return;
        }

        for (String fileName : args) {
            File file = new File(fileName);

            if (file.exists() && file.isFile()) {
                if (fileName.endsWith(".txt")) {
                    if (file.delete()) {
                        System.out.println(fileName + " deleted successfully.");
                    } else {
                        System.out.println("Failed to delete " + fileName);
                    }
                } else {
                    System.out.println("Name: " + file.getName());
                    System.out.println("Location: " + file.getAbsolutePath());
                    System.out.println("Size: " + file.length() + " bytes");
                    System.out.println();
                }
            } else {
                System.out.println(fileName + " is not a valid file.");
            }
        }
    }
}
