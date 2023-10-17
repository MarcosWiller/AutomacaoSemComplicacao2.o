package transferencia;

public class Cliente {
    private String nome;
    private String cpf;
    private String rg;

    //metodo construtor, atribui valores as variaveis e permite que outras classe usem esse valores caso estanciem esse metodo
    //public todo mundo pode usar

    public Cliente(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    //getter ou get esta retornando o valor
    // se tivesse o set, ele permite realizar alterações no valor
    // o is retornaria um valor booleano (true ou false)

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}
