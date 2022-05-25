class use {
    synchronized void print(String tname) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hey" + tname + i);

        }
    }
}

class t1 extends Thread {
    use t1;

    t1(use p) {
        t1 = p;
    }

    @Override
    public void run() {
        t1.print("t1");
        ;
    }
}

class t2 extends Thread {
    use t2;

    t2(use p) {
        t2 = p;
    }

    @Override
    public void run() {
        t2.print("t2");
    }
}

class t3 implements Runnable {
    use t3;

    t3(use p) {
        t3 = p;
    }

    @Override
    public void run() {
        t3.print("t3");
    }
}

public class Threadprac {
    public static void main(String[] args) {
        System.out.println("start");

        use obj = new use();
        t1 obj1 = new t1(obj);
        t2 obj2 = new t2(obj);
        Thread obj3 = new Thread(new t3(obj));
        obj1.start();
        obj2.start();
        obj3.start();

        System.out.println("end");
    }
}
