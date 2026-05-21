package br.edu.refactoring.estacionamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Avenida Brasil", "1500", "Centro", "Maringá", "PR", "87000-000");

        Estacionamento estacionamento = new Estacionamento("ParkTech Centro", "12.345.678/0001-90", endereco);

        Cliente cliente = new Cliente("Mariana Souza", "123.456.789-00", "(44) 99999-0000", 4200, 18, true, "Banco Acadêmico", "1234", "98765-0", "Pix");

        DadosSeguro seguro = new DadosSeguro("Seguro Total", "AP-889900", "0800-123-456");

        LocalDateTime entrada = LocalDateTime.of(2026, 6, 20, 9, 30);
        LocalDateTime saidaPrevista = LocalDateTime.of(2026, 6, 20, 12, 15);

        Veiculo veiculo = new Veiculo("ABC-1234", "Honda Civic", "Prata", entrada, saidaPrevista, seguro);

        Vaga vaga = new Vaga("A12", "Setor Azul", true, true, "Mariana Souza", LocalDateTime.of(2026, 6, 20, 9, 0));

        TicketEstacionamento ticket = new TicketEstacionamento("TCK-1001", veiculo, vaga, false, entrada, saidaPrevista);

        ReservaVaga reserva = new ReservaVaga(vaga, "Mariana Souza", LocalDateTime.of(2026, 6, 20, 9, 0));

        RegistroPagamento pagamento = new RegistroPagamento(ticket, cliente, new Valores(new BigDecimal("48.50")));

        estacionamento.imprimirDados();

        System.out.println("Cidade: " + endereco.getCidade() + " - " + endereco.getEstado());
        System.out.println("CEP: " + endereco.getCep());
    }
}