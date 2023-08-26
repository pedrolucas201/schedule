import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da sua agenda: ");
        String nome = scanner.nextLine();

        Agenda agenda = new Agenda(nome);
        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Escreva as informaçoes do contato " + (i+1));
            Contato c = new Contato();

            System.out.println("Digite o nome do contato: ");
            nome = scanner.nextLine();
            c.setNome(nome);

            System.out.println("Digite o número do contato: ");
            String telefone = scanner.nextLine();
            c.setTelefone(telefone);

            System.out.println("Digite o e-mail do contato: ");
            String email = scanner.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }
        agenda.setContatos(contatos);

        if (agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }

}
