package es.cic.curso04.casa002;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class Bisiesto {

	public Collection<Integer> calularSiguienteBisiestos(int cuantos) {
		Collection<Integer> annoBisiestos = new HashSet<>();

		GregorianCalendar calendario = new GregorianCalendar();
		int annoActual = calendario.get(Calendar.YEAR);
		int cuantosBisiestosMeFaltanPorCalcular = cuantos;

		while (cuantosBisiestosMeFaltanPorCalcular > 0) {
			if (calendario.isLeapYear(annoActual)) {
				annoBisiestos.add(annoActual);
				--cuantosBisiestosMeFaltanPorCalcular;
			}
			annoActual++;
		}

		return annoBisiestos;
	}
	
}