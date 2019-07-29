package com.tavisca.workshops.streaamexample1;


import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] arg){
        writeFileContents();
        readFileContents();
    }

    private static void readFileContents(){
        FileReader myFileReader = new FileReader();
        try {
            String contents = myFileReader.readFile("DataFile.txt");
            System.out.println("Content of the file is -> " + contents);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFileContents() {
        FileWriter myFileWriter = new FileWriter();
        String data = "Hello! How are you today?";
        try {
            myFileWriter.writeFile("DataFile.txt",data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
