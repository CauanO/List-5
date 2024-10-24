import java.util.Arrays;
import java.util.Scanner;

public class Crecente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite um numero: ");
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        System.out.println("Numeros em ordem crescente:" + (Arrays.toString(n)));
    }
}
