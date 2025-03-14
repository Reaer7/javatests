package com.gmail.reater.last.test.serializingtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializedSer();
        deserializedSer();

        System.out.println("\n");

        serializedExt();
        deserializedExt();
    }

    private static void serializedSer() throws IOException {
        TargetSer target = new TargetSer(112,
                                         "bzzz",
                                         new FieldOfTargetSerClass(13, "Friday"),
                                         52
        );
        System.out.println(target);

        var fileOutput = new FileOutputStream("./ser_obj.txt");
        var objectOutput = new ObjectOutputStream(fileOutput);
        objectOutput.writeObject(target);
        fileOutput.flush();
        objectOutput.flush();
    }

    private static void serializedExt() throws IOException {
        TargetExt target = new TargetExt(112,
                                         "bzzz",
                                         new FieldOfTargetExtClass(13, "Friday"),
                                         52
        );
        System.out.println(target);

        var fileOutput = new FileOutputStream("./ser_obj.txt");
        var objectOutput = new ObjectOutputStream(fileOutput);
        objectOutput.writeObject(target);
        fileOutput.flush();
        objectOutput.flush();
    }

    private static void deserializedSer() throws IOException, ClassNotFoundException {
        var fileInput = new FileInputStream("./ser_obj.txt");
        var objectInput = new ObjectInputStream(fileInput);
        TargetSer deserializeTarget = (TargetSer) objectInput.readObject();
        fileInput.close();
        objectInput.close();

        System.out.println(deserializeTarget);
    }

    private static void deserializedExt() throws IOException, ClassNotFoundException {
        var fileInput = new FileInputStream("./ser_obj.txt");
        var objectInput = new ObjectInputStream(fileInput);
        TargetExt deserializeTarget = (TargetExt) objectInput.readObject();
        fileInput.close();
        objectInput.close();

        System.out.println(deserializeTarget);
    }
}
