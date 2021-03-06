package zemian.javastarter.fileio;

import zemian.javastarter.AppException;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public void writeFile(String fileName, String text) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch(IOException e) {
            throw new AppException("Failed to writte file: " + fileName, e);
        }
    }
}
