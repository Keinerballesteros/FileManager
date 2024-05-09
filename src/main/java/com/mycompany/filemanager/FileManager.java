

package com.mycompany.filemanager;

import java.io.FileReader;
import java.io.IOException;


public class FileManager {

    public static void main(String[] args) throws IOException {
        String path = "./data.txt";
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(path);
            int value = fileReader.read();
            while(value != -1){
                System.out.print((char)value);
                value = fileReader.read();
            }
        } catch(IOException e){
            System.out.println("Ha ocurrido un error");
        } finally{
            if(fileReader != null){
                fileReader.close();
            }
        }
    }
}
