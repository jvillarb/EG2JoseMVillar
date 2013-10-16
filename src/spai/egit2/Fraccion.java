package spai.egit2;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos es igual al
 * producto de medios
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre sí
 * 
 * Reducir varias fracciones a común denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a común
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que
 * tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La división de dos fracciones es otra fracción que tiene: Por numerador el
 * producto de los extremos. Por denominador el producto de los medios. Invertir
 * fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraccion {
	private int numerador;

	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fraccion() {
		this(1, 1);
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public double decimal() {
		return (double) numerador / denominador;
	}

	public boolean isPropias() {
		return false;
	}

	public boolean isImpropias() {
		return false;
	}

	public Fraccion multiplicacion(Fraccion f1, Fraccion f2) {
		return new Fraccion(f1.getNumerador() * f2.getNumerador(),
				f1.getDenominador() * f2.getDenominador());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominador;
		result = prime * result + numerador;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraccion other = (Fraccion) obj;
		if (denominador != other.denominador)
			return false;
		if (numerador != other.numerador)
			return false;
		return true;
	}
}
