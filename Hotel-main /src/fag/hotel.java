package fag;

import java.util.ArrayList;
import java.util.List;

public class hotel {
    private List<quarto> quartos;
    private List<reserva> reservas;

    public hotel() {
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarquarto(quarto q) {
        quartos.add(q);
    }

    public void fazerreserva(reserva r) {
        reservas.add(r);
        System.out.println("Reserva feita: " + r);
    }

    public void listarocupacaoquartos() {
        for (reserva r : reservas) {
            System.out.println(r);
        }
    }

    public void realizarcheckin(String nomehospede) {
        System.out.println("Check-in realizado para " + nomehospede);
    }

    public void realizarcheckout(String nomehospede) {
        System.out.println("Check-out realizado para " + nomehospede);
    }

    public void gerarhistoricoreservas(String nomehospede) {
        System.out.println("Histórico de reservas para " + nomehospede + ":");
        for (reserva r : reservas) {
            if (r.getnomehospede().equals(nomehospede)) {
                System.out.println(r);
            }
        }
    }
}
