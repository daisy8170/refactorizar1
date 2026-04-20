package Empregado;

public class Empregado {
    private String nome;
    private int horas;
    private int horasextra;
    private cargoEmpregado cargo;

    // Xenera automaticamente un Constructor
    public Empregado(cargoEmpregado cargo, int horas, int horasextra, String nome) {
        this.cargo = cargo;
        this.horas = horas;
        this.horasextra = horasextra;
        this.nome = nome;
    }


    // Despois de que funcione, refactoriza movendo o método calculoHoras() para que
    // sexa a clase CargoEmpregado quen calcule as horas, e non a clase Empregado
    public double calculoHoras() {
        if (cargo.getCargo().equals("Supervisor")) {
            return horas + horasextra * 2;
        }
        if (cargo.getCargo().equals("Dependente")) {
            return horas + horasextra * 1.5;
        }
        return horas + horasextra * 1.1;
    }

    // Xenera automaticamente os métodos get e set para cada atributo da clase
    public double getSoldo() {
        return cargo.geteurosPorHora() * calculoHoras();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public cargoEmpregado getCargo() {
        return cargo;
    }

    public void setCargo(cargoEmpregado cargo) {
        this.cargo = cargo;
    }

}