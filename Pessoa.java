package com.mycompany.app;


public class Pessoa {
private String nome;
private int idade;


public Pessoa(){

}
public Pessoa(String nome, int idade){
this.nome = nome;
this.idade = idade;
}

public void mostrarDados(){
System.out.println("Nome: "+ nome + " idade: "+ idade);
}

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}


