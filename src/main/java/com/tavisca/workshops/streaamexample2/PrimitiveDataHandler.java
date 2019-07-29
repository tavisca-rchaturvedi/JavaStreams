package com.tavisca.workshops.streaamexample2;

import java.io.*;

public class PrimitiveDataHandler {

    public static void main(String[] args) throws FileNotFoundException {
        writeToFile("HardcodedOutput.txt");
        readFromFile("HardcodedOutput.txt"); 
    }

    public static void writeToFile(String fileName) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        DataOutputStream writer = new DataOutputStream(fileOutputStream);
        try (writer){
            writer.writeChar('t');
            writer.writeFloat(1.2f);
            writer.writeDouble(1.2);
        } catch (IOException e) {
            System.out.println("Exception occured " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileName) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        DataInputStream reader = new DataInputStream(fileInputStream);

        StringBuilder contents = new StringBuilder();
        try (reader){
            char i = reader.readChar();
            float f = reader.readFloat();
            double d = reader.readDouble();

            System.out.println("Character " + i);
            System.out.println("float " + f);
            System.out.println("double " + d);

        } catch (IOException e) {
            System.out.println("Exception occured " + e.getMessage());
            e.printStackTrace();
        }


    }
}
