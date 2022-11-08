import java.util.ArrayList;

public class logic {


    static ArrayList<String> wordsinput = new ArrayList<String>();

    private static int longword = 0;
    private static int wordcount = 0;

    private static int charechercount = 0;

    public logic() {
        wordcount = 0;
        charechercount = 0;
        longword = 0;
    }

    public void setInput(String wordInput) {
        wordcount = wordcount + 1;
        charechercount = charechercount + 5;
        longword = longword + 23;
    }
    public int GetlongestWord(){

        return longword;

    }
    public int Getwordcount() {

        return wordcount;
    }

    public int Getcharcount() {

        return charechercount;

    }


    public static void WordCounter() {

        for (int i = 0; i < wordsinput.size(); i++) {

            System.out.println(wordcount++ + 1 + ": " + wordsinput.get(i));


        }


    }


    public static void CharCounter() {
        for (int c = 0; c < wordsinput.size(); c++) {
            char[] saveCharactersInArray = wordsinput.get(c).toCharArray();
            int NumberOfLetters = 0;

            for (int k = 0; k < saveCharactersInArray.length; k++) {

                NumberOfLetters++;
            }
            System.out.println(charechercount++ + 1 + ": " + "Antalet bokstäver i ordet du skrev " + NumberOfLetters);


        }


    }

    public static void LongestInput() {
        int largestString = wordsinput.get(0).length();
        for (int i = 0; i < wordsinput.size(); i++) {
            if (wordsinput.get(i).length() > largestString) {
                largestString = wordsinput.get(i).length();
                longword = i;
            }
        }
        System.out.println("det längsta ordet du skrev in är " + ": " + wordsinput.get(longword) + " och har " + largestString + " bokstäver");

    }
}