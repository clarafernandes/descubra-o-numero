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
            numeroMuitoPequeno(tentativa, numero);
        }
        if(tentativa > numero){
            numeroMuitoGrande(tentativa, numero);
        }

        tentativa = guiria.nextInt();

        if(tentativa == numero){
            desarmarBomba();
        }
        if(tentativa < numero){
            numeroMuitoPequeno(tentativa, numero);
        }
        if(tentativa > numero){
            numeroMuitoGrande(tentativa, numero);
        }

        tentativa = guiria.nextInt();

        if(tentativa == numero){
            desarmarBomba();
        }
        if(tentativa < numero){
            explodirBomba();
        }
        if(tentativa > numero){
            explodirBomba();
        }

        guiria.close();
    }

    static int definirNumero(int quantidade){
        return (int)((int)quantidade*Math.random());
    }

    static void desarmarBomba(){
        System.out.println("Bomba desarmada");
    }

    static void explodirBomba(){
        System.out.println("A bomba explodiu");
    }

    static void numeroMuitoGrande(int tentativa, int numero){
        System.out.println("Tente novamente. Esse número é muito grande");
        if(Math.abs(tentativa - numero) <= 5)
            System.out.println("Sua tentativa não foi ruim");
    }

    static void numeroMuitoPequeno(int tentativa, int numero){
        System.out.println("Tente novamente. Esse número é muito pequeno");
        if(Math.abs(tentativa - numero) <= 5)
            System.out.println("Sua tentativa não foi ruim");
    }
}
