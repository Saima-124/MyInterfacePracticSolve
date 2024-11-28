import java.io.*;
public class FInd {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Find <word> <file1> <file2> ...");
            return;
        }
        String word = args[0];
        for (int i = 1; i < args.length; i++) {
            String filename = args[i];
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                int lineNumber = 1;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(word)) {
                        System.out.println(filename  + ": " + line);
                    }
                    lineNumber++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + filename);
            } catch (IOException e) {
                System.out.println("Error reading file: " + filename);
            }
        }
    }
}