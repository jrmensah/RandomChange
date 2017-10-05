import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args)
    {
        Random r = new Random();

        output("Generate a random integer between 5 and 95");

        for (int i=5; i <= 95;)
        {
            int randomInt = r.nextInt(1);
            System.out.println("Generated number:" + randomInt);
        }

        System.out.println("Done.");
    }
    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}
