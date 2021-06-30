package metodoCriaObjeto;

public class Pf {
    String nome;
    int idade;
    long cpf;
    boolean cpfOk;

    public Pf(String nome, int idade, long cpf, boolean cpfOk) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cpfOk = cpfOk;
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

    public boolean getCpfOk() {
        return cpfOk;
    }

    public void setCpfOk(boolean cpfOk) {
        this.cpfOk = cpfOk;
    }
    public void setCpf(Integer cpf){
        this.cpf = cpf;
    }
    public long getCpf(){
        return cpf;
    }
}
