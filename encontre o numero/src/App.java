import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("******** Bem-vindo ao Encontre o Número! ********");
        System.out.println("* Decifre o enigma ou coisas ruins acontecerão! *");

        int quantidade = 50;

        System.out.println("Número maior que 0 e menor que "+quantidade);

        int tentativas = 3;
        int tempo = 60;

        int numero = definirNumero(quantidade);

        Scanner guiria = new Scanner(System.in);
        System.out.println("Tentativa 1:");
        int tentativa = guiria.nextInt();
        if(tentativa == numero){
            desarmarBomba();
        }

        if(tentativa < numero){
            System.out.println("Tente novamente. Esse número é muito pequeno!");
        }
        if(tentativa > numero){
            System.out.println("Tente novamente. Esse número é muito grande");
        }

        tentativa = guiria.nextInt();

        if(tentativa == numero){
            desarmarBomba();
        }
        if(tentativa < numero){
            System.out.println("Tente novamente. Esse número é muito pequeno!");
        }
        if(tentativa > numero){
            System.out.println("Tente novamente. Esse número é muito grande");
        }

        tentativa = guiria.nextInt();

        if(tentativa == numero){
            desarmarBomba();
        }
        if(tentativa < numero){
            System.out.println("A bomba explodiu!");
        }
        if(tentativa > numero){
            System.out.println("A bomba explodiu!");
        }

        guiria.close();
    }  

    static int definirNumero(int quantidade){
        return (int)((int)quantidade*Math.random());
    }

    static void desarmarBomba(){
        System.out.println("Bomba desarmada");
    }
}
