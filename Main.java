package br.edu.refactoring.estacionamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento(
                "ParkTech Centro",
                "12.345.678/0001-90",
                "Avenida Brasil",
                "1500",
                "Centro",
                "Maringá",
                "PR",
                "87000-000");

        Cliente cliente = new Cliente(
                "Mariana Souza",
                "123.456.789-00",
                "(44) 99999-0000",
                4200,
                18,
                true,

        Veiculo veiculo = new Veiculo(
                "ABC-1234",
                "Honda Civic",
                "Prata",
                LocalDateTime.of(2026, 6, 20, 9, 30),
                LocalDateTime.of(2026, 6, 20, 12, 15),

        Vaga vaga = new Vaga(
                "A12",
                "Setor Azul",
                true,
                "Mariana Souza",
                LocalDateTime.of(2026, 6, 20, 9, 0));


        estacionamento.imprimirDados();
        System.out.println();

        cliente.imprimirResumo();
        System.out.println();

        veiculo.imprimirDados();
        System.out.println();

        ticket.imprimirTicket();
        System.out.println();

        System.out.println();

        System.out.println();

        pagamento.imprimirComprovante();
    }
}