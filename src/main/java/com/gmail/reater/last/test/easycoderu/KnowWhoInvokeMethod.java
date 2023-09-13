package com.gmail.reater.last.test.easycoderu;

public class KnowWhoInvokeMethod {

    public static void main(String[] args) {
        var a = new A.Base(new Three.Wrapper(new Three.Base()), new Four.Base());
//        var a = new A.Base((new Three.Base()), new Four.Base());

//        a.one();
        a.two();
    }
}

interface A {

    void one();
    void two();

    class Base implements A {
        private final Three three;
        private final Four four;

        public Base(final Three three, final Four four) {
            this.three = three;
            this.four = four;
        }

        @Override
        public void one() {
            three.show();
        }

        @Override
        public void two() {
            three.show();
            four.log();
        }
    }
}

interface Three {

    void show();

    class Base implements Three {

        @Override
        public void show() {
            System.out.println("Hello World");
        }
    }

    class Wrapper implements Three {

        private final Three three;

        public Wrapper(final Three three) {
            this.three = three;
        }

        @Override
        public void show() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StackTraceElement callingOutside = stackTrace[2];
            String methodName = callingOutside.getMethodName();
            String className = callingOutside.getClassName().substring(callingOutside.getClassName().lastIndexOf('.') + 1);

            boolean isWrongMethodName = !"one".equals(methodName);
            String wrongMethodNameMessage = "method should be called from method named \"one\", but was " + methodName;
            boolean isWrongClassName = !className.startsWith("A");
            String wrongClassNameMessage = "method should be called from interface with name starts with \"A\", but was " + className;

            if (isWrongClassName && isWrongMethodName) {
                throw new IllegalStateException(wrongMethodNameMessage + "\n" + wrongClassNameMessage);
            }
            if (isWrongMethodName) {
                throw new IllegalStateException(wrongMethodNameMessage);
            }
            if (isWrongClassName) {
                throw new IllegalStateException(wrongClassNameMessage);
            }
            three.show();
        }
    }
}

interface Four {

    void log();

    class Base implements Four {

        @Override
        public void log() {
            System.out.println("logging from four interface");
        }
    }
}