public class TraditionalSwitchStatement {
    public static void main(String[] args) {
        System.out.println(getQuarter("1"));

    }
    public static void switchStatmentPractice(){
        int myNumber = 4;
        switch (myNumber){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Number " + myNumber);
                break;
            default:
                System.out.println("The number you selected is outside of the range of 1-5");
                break;
        }
    }

    public static String getQuarter(String month){
        String quarter= "";

        switch (month){
            case "January", "February", "March" -> quarter = month + " is in the 1st quarter";
            case "April", "May", "June" -> quarter = month + " is in the 2nd quarter";
            case "July", "August", "September" -> quarter = month + " is in the 3rd quarter";
            case "October", "November", "December" -> quarter = month + " is in the 4th quarter";
            default -> System.out.println("Your month selected " + month + " did not fall within the parameters");
        }
        return quarter;
    }
}
