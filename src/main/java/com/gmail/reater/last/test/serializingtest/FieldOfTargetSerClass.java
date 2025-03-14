package com.gmail.reater.last.test.serializingtest;

import java.io.Serializable;

public class FieldOfTargetSerClass implements Serializable {

    private int fieldInt;
    private String fieldString;

    public FieldOfTargetSerClass(int i, String s) {
        this.fieldInt = i;
        this.fieldString = s;
    }

    @Override
    public String toString() {
        return "{FieldOfTargetClass = " +
                "fieldId = " + fieldInt +
                ", fieldString='" + fieldString + "'}";
    }
}
