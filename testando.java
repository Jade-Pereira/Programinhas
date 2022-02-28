
public class testando{ 

public static void main(String[] args) {
    
    System.out.println("Um dos meus primeiros programas em Java");
    System.out.println(" Projetos em evolução ");
    System.out.println("Bem-Vindo ao zoologico");

    

    Cobra cascavel = new Cobra();
    cascavel.setCor("laranja");
    cascavel.setTamanho(1.5);
    cascavel.setTemVeneno(true);


    System.out.println("A cascavel tem " + cascavel.getTamanho()+ " cm");
    System.out.println("A cascavel tem veneno? " + cascavel.getTemVeneno());
    System.out.println("A cascavel é " + cascavel.getCor());
    System.out.println("---------------------------");
    
    Aranha escovinha = new Aranha();
    escovinha.setCor("preto");
    escovinha.setTamanho(0.5);
    escovinha.setTemVeneno(false);
    escovinha.setN_de_patas(8);

    System.out.println("A escovinha tem a cor " + escovinha.getCor());
    System.out.println("A escovinha tem o tamanho de "+ escovinha.getTamanho()+ " cm");
    System.out.println("A escovinha tem "+ escovinha.getN_de_patas() + " patas");
    System.out.println("-----------------------");

    Tigre tigreza = new Tigre();
    tigreza.setCor("branco e dourado");
    tigreza.setPatas(4);
    tigreza.setPeso(220);
    tigreza.setTamanho(9.0);
    tigreza.setComprimento(2.70);

    
    System.out.println("a tigreza tem "+ tigreza.getPatas()+ " patas");
    System.out.println("a tigreza tem "+ tigreza.getTamanho()+ " cm de tamanho");
    System.out.println("a tigreza tem "+ tigreza.getPeso()+ "kg");
    System.out.println("a tigreza tem "+ tigreza.getComprimento()+ "cm de comprimento");
    System.out.println("---------------------------");

    Macaco mico = new Macaco();
    mico.setAltura (4.99);
    mico.setPeso (50.0);
    mico.setPelo ("marrom e laranja");
    mico.setNome("Mico-JuJu");
    
    System.out.println(mico.getNome());
    System.out.println("o peso da "+ mico.getNome() + " é "+ mico.getPeso() +"kg");
    System.out.println("a altura da "+ mico.getNome()+" é "+ mico.getAltura() +"cm");
    System.out.println(mico.getNome() + " tem o pelo da cor "+ mico.getPelo());
}
}