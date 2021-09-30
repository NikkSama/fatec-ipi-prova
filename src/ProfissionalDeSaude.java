public class ProfissionalDeSaude extends Pessoa{
    private String matricula;

    public ProfissionalDeSaude(String nome, int idade, String matricula) {
        super(nome, idade);
        setMatricula(matricula);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void aplicar(Vacina vacina, Paciente paciente){
        System.out.printf("%s vacinado com %s", paciente.getNome(), vacina.getFabricante());
    }

}
