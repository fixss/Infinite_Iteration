public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Random Number: " + r);
            if (r == 100) {
                System.out.println("Random Mumber: 100, Lets stop now, please? ");
                break;
            }
        }
    }
}
