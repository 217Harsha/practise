package Serialization;

import java.io.Serializable;

public class SerializableDemo implements Serializable {
    transient int i = 10;
    static   int j = 20;

}
