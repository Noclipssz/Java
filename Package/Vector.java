package Package;
import java.util.Scanner;
import java.util.ArrayList;
public class Vector{
    Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> vector = new ArrayList<>();
    public void Main(){
        int i = 0;
        boolean ve = true;
        do {
            i++;
            int j = sc.nextInt();
            if (j != 0) {
                if (j < 0 ) { vector.add(j);
                }
            } else { ve = false; break;
            }
        }   while (ve == true);
        printVector();
    }

    public void printVector(){
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) != 0) {
                System.out.println("Vector " + i + ": " + vector.get(i));
            }
        }
    }

}
