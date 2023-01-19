import entities.TaxPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    List<TaxPlayer> list = new ArrayList<>();

    System.out.print("Quantos contribuintes voce vai digitar? ");
    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
      System.out.println("Digite os dados do " + (i + 1) + "ª contribuinte: ");

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

      TaxPlayer tax = new TaxPlayer(
          salary,
          services,
          capital,
          health,
          education);

      list.add(tax);
     
    clearConsole();
    }

    int i = 0;
    for (TaxPlayer x : list) {
      System.out.println("Resumo do " + (i + 1) + "º contribuinte:");
      System.out.println(x);
      i++;
    }

    sc.close();
  }
  public static void clearConsole(){
    // limpa o terminal java.
      System.out.print("\033[H\033[2J");                    
      System.out.flush(); 
  }
}
