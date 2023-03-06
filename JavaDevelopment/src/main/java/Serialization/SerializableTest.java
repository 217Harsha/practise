package Serialization;

import java.io.*;

public class SerializableTest {

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        SerializableDemo serializableDemo = new SerializableDemo();
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);

        objectOutputStream.writeObject(serializableDemo);
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        SerializableDemo serializableDemo1 = (SerializableDemo) objectInputStream.readObject();

        System.out.println( serializableDemo1.i + " " + serializableDemo1.j);
    }
}
