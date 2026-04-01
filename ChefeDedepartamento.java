package com.mycompany.app;

public class ChefeDedepartamento extends funcionario {
    private String departamento;
    
    public ChefeDedepartamento(String nome, int idade, double salario, String departamento){
        super(nome, idade, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("trabalho no departamento: "+ departamento);
    }
    
    
}
