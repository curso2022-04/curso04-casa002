package es.cic.curso04.casa002;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BisiestoTest {

	private Bisiesto bisiesto;

	@BeforeEach
	void setUp() throws Exception {
		bisiesto = new Bisiesto();
	}

	@Test
	void test() {
		Collection<Integer> annosBisiestos = bisiesto.calularSiguienteBisiestos(20);

		assertNotNull("Tienes que tener algun año", annosBisiestos);
		assertEquals(20, annosBisiestos.size());
	}

	@Test
	void testVarios() {
		boolean valor = false;

		Object v1 = "";
		Object v2 = new String("");
		Object v3 = "";
		Objects.equals(v1,v2);
		assertTrue(v1 == v2);

		if (!valor || !(4 > 5)) {
			// Paso por aqui
		}

		int c = 0;
		int b = (valor) ? c++ : 4;
	}

}
