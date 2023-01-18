import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.TaxPlayer;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc  = new Scanner(System.in);

        TaxPlayer taxPlayer = new TaxPlayer();
        List<TaxPlayer> list = new ArrayList<>();

        System.out.print("Quantos contribuintes voce vai digitar? :");
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.println("Digite os dados do "+(i+1)+"ª contribuinte: ");

            System.out.print("Renda anual com salário: ");
            double salary = sc.nextDouble();

            System.out.print("Renda anual com prestação de servico: ");
            double services = sc.nextDouble();

            System.out.print("Renda anual com ganho de capital: ");
            double capital = sc.nextDouble();

            System.out.print("gastos médicos: ");
            double health = sc.nextDouble();

            System.out.print("gastos educacionais: ");
            double education = sc.nextDouble();

            TaxPlayer tax = new TaxPlayer(salary, services, capital, health, education);

            list.add(tax);
        }

        sc.close();
    }
}
