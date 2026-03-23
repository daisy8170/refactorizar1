//Reduccion loxica

public class paxina74_daisy {
    public static void main(String[] args) {
        datosPerro("Stixs", "Macho");
    }

    /**
     * Mostra o saudo dun can e os seus datos
     * @see REFACTORIZADO
     */
    static void datosPerro(String nome, String sexo) {
        saudoPerro();
        infoPerro(nome, sexo);
    }

    /**
     * Mostra a informacion dun can
     * @param nome
     * @param sexo
     * @see REFACTORIZADO
     */
    static void infoPerro(String nome, String sexo) {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
    }

    /**
     * Mostra o saudo dun can
     * @see REFACTORIZADO
     */
    static void saudoPerro() {
        System.out.println("Guau, guau");
    }
}