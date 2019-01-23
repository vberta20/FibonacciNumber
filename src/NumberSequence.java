
public class NumberSequence implements Runnable {
    int numberCount;
    int previousNumb;
    int nextNumb;
    boolean canRun;


    NumberSequence(int a, int b, int c) {
        numberCount = c;
        previousNumb = a;
        nextNumb = b;
    }

    public void run() {
        System.out.println(previousNumb);
        System.out.println(nextNumb);
        for (int a = 2; a < numberCount; a++) {
            System.out.println(previousNumb + nextNumb);
            int savedNum = previousNumb;
            previousNumb = nextNumb;
            nextNumb = savedNum+nextNumb;
                canRun = true;
            try {
                // wait 1 second (which is same as 1000 milliseconds)
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        }
        System.out.println("");
    }


}

