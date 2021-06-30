package metodoCriaObjeto;

public class Pj {
    String nome;
    int idade;
    long cnpj;
    boolean ativo;

    public Pj(String nome, int idade, long cnpj, boolean ativo) {
        this.nome = nome;
        this.idade = idade;
        this.cnpj= cnpj;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
