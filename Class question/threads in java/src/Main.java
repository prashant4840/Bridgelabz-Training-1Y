// WIthOut Priority
//class Main {
//    public static void main(String[] args) {
//        System.out.println("Main starts");
//        MyThread mt = new MyThread();
//        OtherThread ot = new OtherThread();
//        mt.start();
//        ot.start();
//        Thread tt = new Thread(new ThirdThread());
//        tt.start();
//        System.out.println("Main ends");
//    }
//}


// With Priority
//    public class Main {
//        public static void main(String[] args) {
//            System.out.println("Main starts");
//            MyThread mt = new MyThread();
//            OtherThread ot = new OtherThread();
//            Thread tt = new Thread(new ThirdThread());
//            mt.setPriority(Thread.MAX_PRIORITY);
//            ot.setPriority(Thread.MIN_PRIORITY);
//            tt.setPriority(Thread.NORM_PRIORITY);
//            mt.start();
//            ot.start();
//            tt.start();
//            System.out.println("Main ends");
//        }
//    }


// with StingBuilder and StringBuffer
public class Main {
    public static void main(String[] args) {
        System.out.println("Main starts");
        MyThread mt = new MyThread();
        mt.setPriority(Thread.MAX_PRIORITY);
        mt.start();
        OtherThread ot = new OtherThread();
        ot.setPriority(Thread.MIN_PRIORITY);
        ot.start();
        Thread tt = new Thread(new ThirdThread());
        tt.setPriority(Thread.NORM_PRIORITY);
        tt.start();
        System.out.println("Main End");
        StringBuffer sb = new StringBuffer("ABC");
        sb.append("DEF");
        StringBuilder sbl = new StringBuilder("ABC");
        sbl.append("XYZ");
    }
}
