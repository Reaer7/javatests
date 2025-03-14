package com.gmail.reater.last.test.serializingtest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class FieldOfTargetExtClass implements Externalizable {

    private int fieldInt;
    private String fieldString;

    public FieldOfTargetExtClass(int i, String s) {
        this.fieldInt = i;
        this.fieldString = s;
    }

    public FieldOfTargetExtClass() {}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(fieldInt);
        out.writeUTF(fieldString);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        this.fieldInt = in.readInt();
        this.fieldString = in.readUTF();
    }

    @Override
    public String toString() {
        return "{FieldOfTargetClass = " +
                "fieldId = " + fieldInt +
                ", fieldString='" + fieldString + "'}";
    }
}
