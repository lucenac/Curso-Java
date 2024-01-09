package application;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

    public static void main(String[] args) {
        // Obtendo a data atual
        LocalDate dataAtual = LocalDate.now();

        // Obtendo a hora atual
        LocalTime horaAtual = LocalTime.now();

        // Obtendo a data e hora atuais
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        // Exibindo a data atual
        System.out.println("Data atual: " + dataAtual);

        // Exibindo a hora atual
        System.out.println("Hora atual: " + horaAtual);

        // Exibindo a data e hora atuais
        System.out.println("Data e hora atuais: " + dataHoraAtual);

        // Formatando a data e hora atual usando um formato específico
        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(formatoPersonalizado);
        System.out.println("Data e hora formatadas: " + dataHoraFormatada);

        // Adicionando/subtraindo dias à data atual
        LocalDate dataDaquiUmaSemana = dataAtual.plus(1, ChronoUnit.WEEKS);
        LocalDate dataHaTresMeses = dataAtual.minus(3, ChronoUnit.MONTHS);
        System.out.println("Data daqui a uma semana: " + dataDaquiUmaSemana);
        System.out.println("Data há três meses: " + dataHaTresMeses);

        // Adicionando/subtraindo horas à hora atual
        LocalTime horaDaquiUmaHora = horaAtual.plusHours(1);
        LocalTime horaHaTresHoras = horaAtual.minusHours(3);
        System.out.println("Hora daqui a uma hora: " + horaDaquiUmaHora);
        System.out.println("Hora há três horas: " + horaHaTresHoras);

        // Calculando diferença entre duas datas
        LocalDate outraData = LocalDate.of(2023, 12, 25);
        long diferencaDias = ChronoUnit.DAYS.between(dataAtual, outraData);
        System.out.println("Diferença de dias entre hoje e 25/12/2023: " + diferencaDias + " dias");

        // Extração de componentes da data atual
        int diaDoMes = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();
        System.out.println("Dia do mês: " + diaDoMes);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
}
