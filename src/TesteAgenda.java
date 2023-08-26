import java.util.Scanner;

public class Contato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da sua agenda: ");
        String nome = scanner.nextLine();

        Agenda agenda = new Agenda(nome);
        agenda.setContatos();

    }

}
