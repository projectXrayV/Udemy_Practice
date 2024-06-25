public class Main {
    public static void main(String[] args) {
        int myNumber = 4;
        switch (myNumber){
            case 1 -> System.out.println("Number 1");
            case 2 -> System.out.println("Number 2");
            case 3, 4, 5 -> {
                System.out.println("Number 3, 4, 5");
                System.out.println("Actually Number " + myNumber);
            }
            default -> System.out.println("Not a number between 1-5");
        }
    }
}
