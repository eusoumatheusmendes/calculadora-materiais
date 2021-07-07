package br.com.construcaocivil.test;

import br.com.construcaocivil.entities.CalculadoraDeMateriais;
import br.com.construcaocivil.entities.Piso;
import br.com.construcaocivil.entities.Tijolo;

public class Testadora {

    public static void main(String[] args) {
        Piso piso = new Piso();

        piso.setValorUnitario(40);
        piso.getArea().setAlturaEmCentimetro(64);
        piso.getArea().setComprimentoEmCentimetro(64);

        Tijolo tijolo = new Tijolo();
        tijolo.getArea().setComprimentoEmCentimetro(26);
        tijolo.getArea().setAlturaEmCentimetro(19);
        tijolo.setValorUnitario(1);

        CalculadoraDeMateriais calculadoraDeMateriais = new CalculadoraDeMateriais();

        double quantidade2 = calculadoraDeMateriais.getQuantidadeNecessaria(121, tijolo);

        System.out.println("Quantidade de tijolos " +quantidade2);

        double quantidade = calculadoraDeMateriais.getQuantidadeNecessaria(121, piso);

        System.out.println("Quantidade de piso " +quantidade);

        System.out.println("Valor em pisos " +calculadoraDeMateriais.getValorAproximado(121, piso));

        System.out.println("Valor em tijolos " +calculadoraDeMateriais.getValorAproximado(121, tijolo));

        System.out.println("Total em materiais: " +calculadoraDeMateriais.getGetTotalEmMateriais());
    }
}
