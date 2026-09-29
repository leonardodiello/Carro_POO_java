import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.print("Digite o nome do dono do carro: ");
        String nome = scanner.next();

        System.out.print("Digite o nome do modelo do carro: ");
        String modelo = scanner.next();

        System.out.print("Digite o nome da marca do carro: ");
        String marca = scanner.next();

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();

        System.out.print("Digite a quilometragem do carro: ");
        float km = scanner.nextFloat();

        Carro corrola = new Carro(nome, modelo, marca, ano, km);

        corrola.infoGeral();

        System.out.println(corrola.getDono());
        System.out.println(corrola.getModelo());
        System.out.println(corrola.getMarca());
        System.out.println(corrola.getAno());
        System.out.println(corrola.getKm());
    }
}