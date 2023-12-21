package com.seg.model;

public class AutoSeguro {
    private int numeroConta; // número da apólice
    private String modeloAuto; // veiculo que a apólice e aplicada
    private String estadoAuto;

    public AutoSeguro(int numeroConta, String modeloAuto, String estadoAuto){
        this.numeroConta = numeroConta;
        this.modeloAuto = modeloAuto;
        this.estadoAuto = estadoAuto;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public String getEstadoAuto() {
        return estadoAuto;
    }

    public void setEstadoAuto(String estadoAuto) {
        this.estadoAuto = estadoAuto;
    }

    public boolean isNoFaultState(){
        return switch (getEstadoAuto()) {
            case "SP", "RJ", "BA" -> true;
            default -> false;
        };
    }
}
