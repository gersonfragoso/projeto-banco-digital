package org.gerson.bancoDigital.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HoraFormatter {
    public static String getHoraFormatada() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatter);
    }
}