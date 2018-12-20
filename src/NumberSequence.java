
public class NumberSequence implements Runnable {
    int numberCount;
    int previousNumb;
    int nextNumb;

    NumberSequence(int a, int b, int c) {
        numberCount = c;
        previousNumb = a;
        nextNumb = b;
    }

    public void run() {
        System.out.println(previousNumb);
        System.out.println(nextNumb);
        for (int a = 1; a < numberCount; a++) {
            System.out.println(previousNumb + nextNumb);
            previousNumb = nextNumb;
            nextNumb = previousNumb+nextNumb;

        }
    }

}

