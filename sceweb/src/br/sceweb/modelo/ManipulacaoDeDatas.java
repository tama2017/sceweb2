package br.sceweb.modelo;
import java.util.Locale;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
public class ManipulacaoDeDatas {
public static void main(String[] args) {
Logger logger = Logger.getLogger(ManipulacaoDeDatas.class);
DateTime dateTime = new DateTime();
// Imprimindo a data no formato YYYY-MM-dd
System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd"));
// Imprimindo a data no formato YYYY-MM-dd HH:mm:ss
System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd HH:mm:ss"));
// Imprimindo o m�s
System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText());
// Imprimindo o m�s
System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsShortText());
// Imprimindo o m�s em Ingl�s
logger.info("dateTime.toString() = " + dateTime.monthOfYear().getAsText(Locale.ENGLISH));
}
}