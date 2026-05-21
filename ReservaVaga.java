package br.edu.refactoring.estacionamento;

import java.time.LocalDateTime;

public class ReservaVaga {

    private Vaga vaga;
    private Cliente cliente;
    private String nomeClienteReserva;
    private LocalDateTime horarioReserva;

    public ReservaVaga(Vaga vaga, String nomeClienteReserva, LocalDateTime horarioReserva) {
        this.vaga = vaga;
        this.nomeClienteReserva = nomeClienteReserva;
        this.horarioReserva = horarioReserva;
    }

    public void imprimirReserva() {
        System.out.println("Reserva da vaga: " + vaga.getCodigo());
        System.out.println("Setor: " + vaga.getSetor());
        System.out.println("Cliente da reserva: " + nomeClienteReserva);
        System.out.println("Horário da reserva: " + horarioReserva);
    }

    public Vaga getVaga() {
        return vaga;
    }

    public String getNomeClienteReserva() {
        return nomeClienteReserva;
    }

    public LocalDateTime getHorarioReserva() {
        return horarioReserva;
    }
}
