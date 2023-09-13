package com.gmail.reater.last.test.other;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            new Integer(null);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
            return;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
//        } catch (Integer e) {
//            System.out.println("Integer");
//            return;
        }
    }
}
