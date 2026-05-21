package br.edu.refactoring.estacionamento;

public class RegistroPagamento {

    private TicketEstacionamento ticket;
    private Cliente cliente;
    private Valores valor;

    public RegistroPagamento(
            TicketEstacionamento ticket,
            Cliente cliente,
            Valores valor) {

        this.ticket = ticket;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void imprimirComprovante() {
        System.out.println("Pagamento do ticket: " + ticket.getCodigo()
        );
        System.out.println("Cliente: " + cliente.getNome()
        );
        System.out.println("Valor: " + valor.formatarEmReais()
        );
        if (valor.isAltoValor()) {
            System.out.println("Classificação: pagamento de alto valor"
            );
        } else {
            System.out.println("Classificação: pagamento comum"
            );
        }
    }

    public TicketEstacionamento getTicket() {
        return ticket;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Valores getValor() {
        return valor;
    }
}