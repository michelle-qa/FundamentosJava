package fundamentos;

import javax.sound.midi.Soundbank;

import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada;

public class calculos{
    public static void main(String[] args){
        System.out.println("Deseja calcular tabuada? <S/N>");
        String resposta = entrada.next();
        System.out.println("Resposta: + resposta");
       switch (resposta){
           case "S":
           case "s":
               tabuada();
               break;
           default:
               System.out.println("Digitou outro texto diferente de \"s\"");
        }

     }
}

