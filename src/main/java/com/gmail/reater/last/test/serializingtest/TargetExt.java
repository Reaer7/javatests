package com.gmail.reater.last.test.serializingtest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serial;

public class TargetExt implements Externalizable {

    @Serial
    private static final long serialVersionUID = 2658876107593437166L;

    private int intField;
    private String strField;
    private FieldOfTargetExtClass field;
    private transient int transField;
//    private int transField;

    public TargetExt(int i, String s, FieldOfTargetExtClass f, int trn) {
        this.intField = i;
        this.strField = s;
        this.field = f;
        this.transField = trn;
    }

    public TargetExt() {}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(intField);
        out.writeUTF(strField);
        out.writeObject(field);
        out.writeInt(transField);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.intField = in.readInt();
        this.strField = in.readUTF();
        this.field = (FieldOfTargetExtClass) in.readObject();
        this.transField = in.readInt();
    }

    @Override
    public String toString() {
        return "{Target = " +
                "integerField: " + intField +
                ", stringField: " + strField +
                ", transientField: " + transField +
                ", customObjectField: " + field.toString() + "}";
    }
}
