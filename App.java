package com.mycompany.app;

public class App {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("joao", 15);
        p1.mostrarDados();
        
        
        //Informações via encapsulamento - setters
        Pessoa p2 = new Pessoa();
        p2.setNome("maria");
        p2.setIdade(48);
        p2.mostrarDados();
        
        funcionario f1 = new funcionario("maria", 50, 3750);
        f1.mostrarDados();
        System.out.println("salario: "+ f1.getSalario());
        
        
        ChefeDedepartamento cd = new ChefeDedepartamento("marcio", 70, 5000.00, "RH");
        cd.mostrarDados();
        
        
        
        
    }
}
