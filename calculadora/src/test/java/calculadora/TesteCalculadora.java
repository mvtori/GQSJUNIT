package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class TesteCalculadora {

	@Test
	void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.SomaInteiros(2, 2));
	}
	

	void trêsSomaCincoEsperaOito() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(3, 5) == 8);

	}

	@Test
	void seteSubtraiDoisEsperaCinco() {
		Calculadora c = new Calculadora();
		assertEquals(5, c.SubtraiInteiros(7, 2));
	}

	
	@Test
	void trêsSubtraiDoisEsperaUm() {
		Calculadora c = new Calculadora();
		assertTrue(c.SubtraiInteiros(3, 2) == 1);

	}
	@Test
	void doisMultiplicaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.MultiplicaInteiros(2, 2));
	}
    @Test
	void quatroMultiplicaQuatroEsperaDezesseis() {
		Calculadora c = new Calculadora();
		assertTrue(c.MultiplicaInteiros(4, 4) == 16);
	}
    @Test
	void doisDivideDoisEsperaUm() {
		Calculadora c = new Calculadora();
		assertEquals(1, c.DivideInteiros(2, 2));
	}
    @Test
	void quatroDivideDoisEsperaDois () {
		Calculadora c = new Calculadora();
		assertTrue(c.DivideInteiros(4, 2) == 2);
	}

	}
