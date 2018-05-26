import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Relogio {
	
	public static long retornaAnguloRelogio(GregorianCalendar scan) throws ParseException {
		
		long horas;
		long valorAngMinuto = 6;
		long valorAngHora = 30;
		long minutoAngulo;
		long horaAngulo;
		
		//Realizando o calculo de angulo para cada ponteiro
		minutoAngulo = valorAngMinuto * scan.get(Calendar.MINUTE);
		horaAngulo = valorAngHora * scan.get(Calendar.HOUR);

		if(minutoAngulo < horaAngulo)
		{
			horas = horaAngulo - minutoAngulo;
		}
		else 
		{
			horas = minutoAngulo - horaAngulo;
		}
	
		return(horas);
	}
	

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		GregorianCalendar horario = (GregorianCalendar) GregorianCalendar.getInstance();
		
		long angulo1;
		long horas;
		long angulo = 360;
			
		horas = Relogio.retornaAnguloRelogio(horario);
		
		
		//Printando horario informado
		System.out.println(sdf.format(horario.getTime()));
		
		
		//Printando e realizando o calculo do maior e menor angulo
		if(horas > 0) 
		{	
			
			angulo1 = angulo - horas;
			if(horas < angulo1) 
			{
				System.out.println("O angulo das horas é:");
				System.out.printf("Menor angulo é:"+ horas + "°\nMaior angulo é:" + angulo1 + "°");
			} else {
				System.out.println("O angulo das horas é:");
				System.out.printf("Menor angulo é:"+ angulo1 + "°\nMaior angulo é:" + horas + "°");
			}
		}
		else if(horas < 0)  
		{
			
			angulo1 = angulo - horas;
			if(horas < angulo1) 
			{
				System.out.println("O angulo das horas é:");
				System.out.printf("Menor angulo é:"+ horas + "°\nMaior angulo é:" + angulo1 + "°");
			} 
			else if(horas > angulo1)
			{
				System.out.println("O angulo das horas é:");
				System.out.printf("Menor angulo é:"+ angulo1 + "°\nMaior angulo é:" + horas + "°");
			}
			else if(angulo1 == horas)  		
			{
				System.out.println("O angulo das horas é:\n180°");		
			}
			else
			{
				System.out.println("O angulo das horas é:\n 0° ou 360°");
			}
		}	
	}
}
