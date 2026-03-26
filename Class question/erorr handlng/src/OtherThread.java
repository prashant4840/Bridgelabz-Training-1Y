public class OtherThread extends Thread {

    @Override
    public void run() {
        char ch = 'A';

        for (int i = 0; i <= 10; i++) {
            System.out.println(ch);
            ch++;
        }
    }
}