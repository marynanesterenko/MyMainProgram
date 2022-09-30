package JavaPractice;

public class RollingTheDice {
    public static void main(String[] args) {
        int roll;
        String message = "Here are the 100 random rolls of the dice: ";
        System.out.println(message);
        for (int i=0; i<100; i++) {
            roll = randomInt(1, 6);
            System.out.println(roll + " ");
        }

        System.out.println();
    }

    public static int randomInt (int low, int high)
    {
        int result = (int)(Math.random())
                * (high - low + 1) + low;
        return result;
    }
}
