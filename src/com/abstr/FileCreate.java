package com.abstr;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileCreate {

    public static void main(String[] args) {
        String data= "Welcometo java";
        try {
        FileOutputStream file = new FileOutputStream("Sample.txt");
        byte b[]=data.getBytes();
        file.write(b);
        file.close();
            System.out.println("Created");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
