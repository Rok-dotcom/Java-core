package in.kgcoding.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the file name you want to read : ");
        String filename = s.next();

        try (FileReader reader = new FileReader(filename)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found " + filename);
        } catch (IOException e) {
            System.out.println("An error is occurred " + e.getMessage());
        }
    }
}