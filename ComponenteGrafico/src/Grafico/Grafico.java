package Grafico;

import sequencia.ISequencia;

public class Grafico implements IGrafico {

	private boolean preenchido;
	private char caracter;
	private int N;
	
	public Grafico(){
		preenchido = true;
		caracter = '*';
	}
	
	@Override
	public void plot() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean estaPreenchido() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPreenchido(boolean estaPreenchido) {
		// TODO Auto-generated method stub

	}

	@Override
	public char getCaracter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCaracter(char caracter) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getN() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setN(int N) {
		// TODO Auto-generated method stub

	}

	@Override
	public void connect(ISequencia sequencia) {
		// TODO Auto-generated method stub

	}

}
