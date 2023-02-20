class Fraccion {

	int num;
	int den;

	Fraccion() {

	}

	Fraccion(int n, int d) {
		n = num;
		d = den;
	}

	Fraccion(String fracion) {
		String partes[] = fracion.split("/");
		num = Integer.parseInt(partes[0]);
		den = Integer.parseInt(partes[1]);

	}

}