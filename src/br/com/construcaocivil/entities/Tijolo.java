package br.com.construcaocivil.entities;

import br.com.construcaocivil.services.Calculavel;

public class Tijolo implements Calculavel {

    private double valorUnitario;
    private Area area;

    public Tijolo(){
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setValorUnitario(double valorUnitario) {
        if(valorUnitario <= 0){
            throw new IllegalArgumentException("Valor inválido! Verifique o valor: " +valorUnitario);
        }
        this.valorUnitario = valorUnitario;
    }
}
