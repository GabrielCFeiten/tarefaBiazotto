package br.edu.refactoring.estacionamento;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DataHoraEstacionamento {

    private LocalDateTime dataHora;

    public DataHoraEstacionamento(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // Formata a data e hora
    public String formatar() {
        return dataHora.getDayOfMonth() + "/"
                + dataHora.getMonthValue() + "/"
                + dataHora.getYear() + " "
                + dataHora.getHour() + ":"
                + String.format("%02d", dataHora.getMinute());
    }

    // Define horário especial
    public boolean isHorarioEspecial() {
        return dataHora.getDayOfWeek() == DayOfWeek.SATURDAY
                || dataHora.getDayOfWeek() == DayOfWeek.SUNDAY
                || dataHora.getHour() < 7
                || dataHora.getHour() >= 22;
    }

    // Retorna o LocalDateTime original
    public LocalDateTime getValorOriginal() {
        return dataHora;
    }
}