package com.seg.model;

public class AutoPolicyApplicationTest {
    public static void main(String[] args) {
        AutoSeguro seg1 = new AutoSeguro(10102030, "Fiat Palio", "SP");
        AutoSeguro seg2 = new AutoSeguro(20203050, "Chevrolet Cobatt", "BA");

        segInNoFaultState(seg1);
        segInNoFaultState(seg2);


    }

    private static void segInNoFaultState(AutoSeguro seg) {
        System.out.println(" O seguro do carro:");
        System.out.printf("Conta #: %d; Carro: %s; State %s %s a no-fault state%n%n",
                seg.getNumeroConta(), seg.getModeloAuto(), seg.getEstadoAuto(),
                (seg.isNoFaultState() ? "é" : "Não é"));
    }
}
