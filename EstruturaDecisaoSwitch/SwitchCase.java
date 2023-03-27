package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite uma Letra:");
        String letra = sc.nextLine();
        switch (letra) {
        case "a": System.out.println("É uma Vogal.");
        break;
        case "e": System.out.println("É uma Vogal.");
        break;
        case "i": System.out.println("É uma Vogal.");
        break;
        case "o":System.out.println("É uma Vogal.");
        break;
        case "u": System.out.println("É uma Vogal.");
            default: System.out.println("É cosoante.");
                break;
        }
        
    }

    public void mes() {
        System.out.println("Digite o Mês (Ex: 1 = Janeiro):");
        String mes = sc.nextLine();

        switch (mes) {
            case "1": System.out.println("O Primeiro mês é Janeiro");
            break;
            case "2": System.out.println("O Segundo Mês é Fevereiro");
            break;
            case "3": System.out.println("O Terceiro mês é Março");
            break;
            case "4": System.out.println("O Quarto mês é Abril");
            break;
            case "5":System.out.println("O Quinto Mês é Maio");
            break;
            case "6":System.out.println("O Sexto Mês é Junho");
            break;
            case "7": System.out.println("O Sétimo mês é Julho");
            break;
            case "8": System.out.println("O Oitavo Mês é Agosto");
            break;
            case "9": System.out.println("O Nono mês é Setembro");
            break;
            case "10": System.out.println("O Décimo mês é Outubro");
            break;
            case "11":System.out.println("O Décimo Primeiro Mês é Novembro");
            break;
            case "12":System.out.println("O Décimo Segundo Mês é Dezembro");
            break;
            default: System.out.println(" Resposta Inválida");
                break;
        }
    }
}
