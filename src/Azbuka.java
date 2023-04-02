import java.util.Random;
import java.util.Scanner;

public class Azbuka {
    public static void main(String[] args) {
        Random random = new Random();
        char bukva = (char) (random.nextInt(26) + 'a'); // izbira slucajna bukva

        Scanner tastatura = new Scanner(System.in);
        int obidi = 0;
        while (true) {
            System.out.print("Pogodi ja slucajnata bukva: ");
            char izbor = tastatura.next().charAt(0);
            obidi++;

            if (izbor == bukva) {
                System.out.println("Chestito, ja pogodivte bukvata.");
                break;
            } else {
                System.out.println("Pogreshna bukva, obidete se povtorno.");
            }
        }

        System.out.println("Broj na obidi: " + obidi);
    }
}