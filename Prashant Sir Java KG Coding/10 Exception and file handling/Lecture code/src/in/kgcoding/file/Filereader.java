package in.kgcoding.file;

import java.io.FileWriter;

import java.io.IOException;

public class Filereader {
    public static void main(String[] args){
        String myfile = "hello.txt";
        try{
            FileWriter writer = new FileWriter(myfile);
            writer.write("Hello this is test ");
            writer.flush();
            writer.close();

        }catch(IOException e){
            System.out.println("exception occurred "+e.getMessage());
        }
    }
}
