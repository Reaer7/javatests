package com.gmail.reater.last.test.serializingtest;

import java.io.Serial;
import java.io.Serializable;

public class TargetSer implements Serializable {

    @Serial
    private static final long serialVersionUID = 2658876107593437166L;

    private int intField;
    private String strField;
    private FieldOfTargetSerClass field;
    private transient int transField;
//    private int transField;

    public TargetSer(int i, String s, FieldOfTargetSerClass f, int trn) {
        this.intField = i;
        this.strField = s;
        this.field = f;
        this.transField = trn;
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
