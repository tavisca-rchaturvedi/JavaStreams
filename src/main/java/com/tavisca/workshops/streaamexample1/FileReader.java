package com.tavisca.workshops.streaamexample1;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
    public String readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        String contents = "";
        try (fileInputStream){
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            contents = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents;
    }
}
