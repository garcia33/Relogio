import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Relogio2 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		GregorianCalendar horario = (GregorianCalendar) GregorianCalendar.getInstance();
		
		int maiorAngulo;
		int menorAngulo;
		int horas;
		int angulo = 360;
		int minutos;
		int valorAngMinuto = 6;
		int valorAngHora = 30;
		int minutoAngulo;
		int horaAngulo;
		
		
		//Recebendo e validando as horas
		System.out.println("Informe a hora desejada(de 00 a 23):");
		Scanner hora = new Scanner(System.in);
		horas = hora.nextInt();
		
		while(horas > 23 || horas < 0 ) {
			System.out.println("Valor da hora informado está incorreto.");
			System.out.println("Informe a hora desejada(de 00 a 23):");
			horas = hora.nextInt();
		}
		horario.set(Calendar.HOUR_OF_DAY, horas);
		
		//Recebendo e valindo os minutos
		System.out.println("Informe o minuto desejado(de 00 a 59):");
		Scanner minuto = new Scanner(System.in);
		minutos = minuto.nextInt();
		
		while(minutos > 59 || minutos < 0) {
			System.out.println("Valor dos minutos informado está incorreto.");
			System.out.println("Informe o minuto desejada(de 00 a 59):");
			minutos = minuto.nextInt();
		}
		horario.set(Calendar.MINUTE, minutos);
		
		/*-------------------------------------------------------*/	
		
		//Printando horario informado
		System.out.println(sdf.format(horario.getTime()));
		
		//Realizando o calculo de angulo para cada poneiro
		minutoAngulo = valorAngMinuto * horario.get(Calendar.MINUTE);
		horaAngulo = valorAngHora * horario.get(Calendar.HOUR);	
		
		
		//Printando e realizando o calculo do maior e menor angulo
		if(minutoAngulo > horaAngulo) 
		{	
			menorAngulo = minutoAngulo - horaAngulo;
			maiorAngulo = angulo - menorAngulo;
			if(menorAngulo < maiorAngulo) 
			{
				System.out.println("O angulo das horas é:");
				System.out.printf("Menor angulo é:"+ menorAngulo + "°\nMaior angulo é:" + maiorAngulo + "°");
			} else {
				System.out.println("O angulo das horas é:");
				System.out.printf("Menor angulo é:"+ maiorAngulo + "°\nMaior angulo é:" + menorAngulo + "°");
			}
		}
		else if(minutoAngulo < horaAngulo)  
		{
			menorAngulo = horaAngulo - minutoAngulo;
			maiorAngulo = angulo - menorAngulo;
			if(menorAngulo < maiorAngulo) 
			{
				System.out.println("O angulo das horas é:");
				System.out.printf("Menor angulo é:"+ menorAngulo + "°\nMaior angulo é:" + maiorAngulo + "°");
			} else {
				System.out.println("O angulo das horas é:");
				System.out.printf("Menor angulo é:"+ maiorAngulo + "°\nMaior angulo é:" + menorAngulo + "°");
			}
		}
		else
		{
			System.out.println("O angulo das horas é:\n 0° ou 360°");
		}	
	}
}
