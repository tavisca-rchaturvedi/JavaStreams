package com.tavisca.workshops.streaamexample1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
    public String readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        StringBuilder contents = new StringBuilder();

        try (bufferedInputStream){
            byte[] buffer = new byte[8];
            while(bufferedInputStream.read(buffer) > 0){
                System.out.println(new String(buffer));
                contents.append(new String(buffer));
                buffer = new byte[8];
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents.toString();
    }
}
