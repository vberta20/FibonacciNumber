public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {
            NumberSequence numbersequence= new NumberSequence((int)(Math.random()*10),(int)(Math.random()*10),10);
            Thread thread = new Thread(numbersequence);
            thread.start();






            }






        }
}
