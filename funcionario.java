package com.mycompany.app;

public class funcionario extends Pessoa{
    private double salario;
    
    public funcionario(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
        
    }
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println(" Salario: "+ getSalario());
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }
    
    
}
