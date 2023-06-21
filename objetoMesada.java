package mesada3;

public class objetoMesada {
    
     String nome;
     int idade;
     double mesada;

    public objetoMesada() {
        this.nome = nome;
        this.idade = idade;
        this.mesada = mesada;
        
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

    public double getMesada() {
        return mesada;
    }

    public void setMesada(double mesada) {
        this.mesada = mesada;
    }

    @Override
    public String toString() {
        return "objetoMesada{" + "nome=" + nome + ", idade=" + idade + ", mesada=" + mesada + '}';
    }
    
    
    
}
