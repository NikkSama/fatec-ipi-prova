public class Principal {
    public static void main(String[] args) {
        Vacina vacina = new Vacina("vacina covid-19", "53", "Pfizer");
        ProfissionalDeSaude profissionalDeSaude = new ProfissionalDeSaude("Maria", 27, "11223344");
        Paciente pessoa = new Paciente("João", 43);

        profissionalDeSaude.aplicar(vacina, pessoa);

    }
}
