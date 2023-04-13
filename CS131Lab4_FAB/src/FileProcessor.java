import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor {
    private String fileName;
    private int stringLength;
    private ArrayList<String> stringList;
    private Scanner input;

    public FileProcessor(String fileName, int stringLength) {
        setFileName(fileName);
        setStringLength(stringLength);
        stringList = new ArrayList<>();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getStringLength() {
        return stringLength;
    }

    public void setStringLength(int stringLength) {
        if (stringLength < 5) {
            this.stringLength = 5;
        } else {
            this.stringLength = stringLength;
        }
    }

    public int getArrayListSize() {
        return stringList.size();
    }

    public void processFile() {
        try {
            input = new Scanner(new java.io.File(fileName));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.length() > stringLength) {
                    throw new StringTooLongException("String is too long!");
                }
                stringList.add(line);
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (StringTooLongException e) {
            System.out.println(e.getMessage());
        }
    }
}