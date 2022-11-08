import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in slumpmässiga ord." + "\nNär du känner dig klar skriv \"Stop\".");
        String wordInput = scan.nextLine();

        logic myInput = new logic();
        while (!wordInput.equals("Stop")) {
            logic.wordsinput.add(wordInput);
            wordInput = scan.nextLine();


        }
        if (wordInput.equals("Stop")) {
            System.out.println("Dessa ord skrev du in");


        }

        logic.WordCounter();
        logic.CharCounter();
        logic.LongestInput();

    }

}
