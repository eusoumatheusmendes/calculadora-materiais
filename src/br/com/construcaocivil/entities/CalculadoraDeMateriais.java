package br.com.construcaocivil.entities;

import br.com.construcaocivil.services.Calculavel;

public class CalculadoraDeMateriais {

    private double getTotalEmMateriais;

    public double getQuantidadeNecessaria(double areaASerContruidaEmMetrosQuadrados, Calculavel calculavel){
        double quantidadeNecessaria = areaASerContruidaEmMetrosQuadrados /
                calculavel.quantidadeEmMetrosQuadrados();
        return quantidadeNecessaria;
    }

    public double getValorAproximado(double areaASerContruidaEmMetrosQuadrados, Calculavel calculavel){
        double quantidadeNecessaria = areaASerContruidaEmMetrosQuadrados /
                calculavel.quantidadeEmMetrosQuadrados();
        this.getTotalEmMateriais += quantidadeNecessaria * calculavel.valorUnitario();
        return quantidadeNecessaria * calculavel.valorUnitario();
    }

    public double getGetTotalEmMateriais(){
        return this.getTotalEmMateriais;
    }
}
