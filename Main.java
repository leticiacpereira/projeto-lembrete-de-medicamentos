import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== MEDCONTROL ===");
        
        System.out.print("Nome do paciente: ");
        String paciente = scanner.nextLine();
        
        System.out.print("Nome do cuidador: ");
        String nomeCuidador = scanner.nextLine();
        Cuidador cuidador = new Cuidador(nomeCuidador);
        
        System.out.print("Nome do medicamento: ");
        String nomeMedicamento = scanner.nextLine();
        
        System.out.print("Dose: ");
        String dose = scanner.nextLine();
        
        System.out.print("Horario: ");
        String horario = scanner.nextLine();
        
        Medicamento medicamento = new Medicamento(nomeMedicamento, dose, horario);
        
        System.out.println("\n=== AGENDA ===");
        System.out.println("Paciente: " + paciente);
        cuidador.apresentar();
        medicamento.mostrar();
        
        System.out.print("\nO medicamento foi administrado? (s/n): ");
        String resposta = scanner.nextLine();
        
        if (resposta.equalsIgnoreCase("s")) {
            medicamento.administrar();
        } else {
            System.out.println("Administracao nao registrada.");
        }
        
        System.out.println("\n=== SITUACAO FINAL ===");
        medicamento.mostrar();
        
        scanner.close();
    }
}
