import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        
        // create a new FileProcessor object with the file name and string length
        FileProcessor fp = new FileProcessor("GoodString.txt", 5);
        
        // test the getters and setters
        System.out.println("File name: " + fp.getFileName());
        System.out.println("String length: " + fp.getStringLength());
        
        // test the processFile() method
        fp.processFile();
        
    }
    
}