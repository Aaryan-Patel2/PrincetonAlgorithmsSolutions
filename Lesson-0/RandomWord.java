import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        //Initialize indices and the champion
        int i = 0;
        String champ = "";

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            boolean accept = StdRandom.bernoulli(1 / (i + 1.0));
            if (accept) {
              champ = word;
            }
            i++;
          }
          StdOut.println(champ);

        }


    }
