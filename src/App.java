import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double num1, num2, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        num1 = sc.nextDouble();
        System.out.println("Insira o segundo numero");
        num2 = sc.nextDouble();
        soma = num1 + num2;
        System.out.println("A soma do dois numeros é: " +soma);
        sc.close();  
    }
}
