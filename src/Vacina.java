public class Vacina {
    private String descricao;
    private String lote;
    private String fabricante;

    public Vacina(String descricao, String lote, String fabricante) {
        setDescricao (descricao);
        setLote (lote);
        setFabricante(fabricante);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
