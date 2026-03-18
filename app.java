import com.mycompany.pessoa.Pessoa;

public class app {
    public static void main(String[] args) {
        System.out.println("hello world!");
        
        Pessoa p1 = new Pessoa ();
        
        p1.setNome("Vinicius Ryan");
        p1.setCpf("121.121.121-22");
        p1.setAltura(1.85);
        p1.setPeso(84);
        
        Pessoa p2 = new Pessoa ();
        p2.setNome("Marcia Fonseca");
        p2.setCpf("122.121.121-22");
        p2.setAltura(1.65);
        p2.setPeso(60);
        
        // Exibir dados da pessoa 01
        System.out.println("ola, seja bem-vindo: " + p1.getNome());
        p1.exibirIMC();
        //Exibir dados da pessoa 02
        System.out.println("Ola, seja bem-vindo: " + p2.getNome());
        p2.exibirIMC();
        
        Pessoa p3 = new Pessoa("Andre", "133.133.133-22", 1.50, 90);
        p3.exibirIMC();
        
                
    }
}



