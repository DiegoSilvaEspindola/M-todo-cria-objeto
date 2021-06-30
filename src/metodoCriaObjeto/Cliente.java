package metodoCriaObjeto;

public class Cliente {
    public  Pj Pj;
    public  Pf Pf;

    public void criaPj(String nome, int idade, long cnpj, boolean ativo){
        this.Pj = new Pj (nome, idade, cnpj, ativo );
    }

    public void criaPf( String nome, int idade, long cpf, boolean cpfOk){
        this.Pf = new Pf(nome, idade, cpf, cpfOk);
    }


}
