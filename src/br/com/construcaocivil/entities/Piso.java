package br.com.construcaocivil.entities;

import br.com.construcaocivil.services.Calculavel;

public class Piso implements Calculavel {

    private double valorUnitario;
    private Area area;

    public Piso(){
        this.area = new Area();
    }

    @Override
    public double valorUnitario() {
        return this.valorUnitario;
    }

    @Override
    public double quantidadeEmMetrosQuadrados() {
        return (this.area.getAlturaEmCentimetro() * this.area.getComprimentoEmCentimetro()) / 10000;
    }

    public void setValorUnitario(double valorUnitario) {
        if(valorUnitario <= 0){
            throw new IllegalArgumentException("Valor inválido! Verifique o valor: " +valorUnitario);
        }
        this.valorUnitario = valorUnitario;
    }

    public Area getArea() {
        return area;
    }
}
