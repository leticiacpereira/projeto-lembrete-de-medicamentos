public class Medicamento {
    private String nome;
    private String dose;
    private String horario;
    private boolean administrado;

    public Medicamento(String nome, String dose, String horario) {
        this.nome = nome;
        this.dose = dose;
        this.horario = horario;
        this.administrado = false;
    }

    public void administrar() {
        this.administrado = true;
        System.out.println("Medicamento registrado como administrado.");
    }

    public void mostrar() {
        System.out.println("Medicamento: " + nome);
        System.out.println("Dose: " + dose);
        System.out.println("Horario: " + horario);
        if (administrado) {
            System.out.println("Status: Administrado");
        } else {
            System.out.println("Status: Pendente");
        }
    }
}
