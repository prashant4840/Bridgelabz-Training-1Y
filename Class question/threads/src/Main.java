class Main {
    public static void main(String[] args) {

        System.out.println("Main starts");

        MyThread mt = new MyThread();
        OtherThread ot = new OtherThread();

        mt.start();
        ot.start();

        Thread tt = new Thread(new ThirdThread());
        tt.start();

        System.out.println("Main ends");
    }
}