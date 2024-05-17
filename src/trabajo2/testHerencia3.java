package trabajo2;

//Francisco Escurra 5920140 11/05/2024
/*Crear una clase testHerencia3 con el método main donde se creen: dos productos frescos,
tres productos refrigerados y cinco productos congelados (2 de ellos congelados por agua,
otros 2 por aire y 1 por nitrógeno). Mostrar la información de cada producto por pantalla.
No debe repetir datos*/
public class testHerencia3 {

	public static void main(String[] args) {
		ProductoFresco productoFresco1 = new ProductoFresco("02/02/2022", "123", "02/02/2021", "España");
		ProductoFresco productoFresco2 = new ProductoFresco("03/03/2022", "124", "03/03/2021", "Francia");

		ProductoRefrigerado productoRefrigerado1 = new ProductoRefrigerado("04/04/2022", "125", "04/04/2021", "Italia",
				"1234", 5.5);
		ProductoRefrigerado productoRefrigerado2 = new ProductoRefrigerado("05/05/2022", "126", "05/05/2021",
				"Alemania",
				"1235", 6.5);
		ProductoRefrigerado productoRefrigerado3 = new ProductoRefrigerado("06/06/2022", "127", "06/06/2021",
				"Portugal",
				"1236", 7.5);

		ProductoCongeladoAgua productoCongeladoAgua1 = new ProductoCongeladoAgua("07/07/2022", "128", "07/07/2021",
				"Rusia", -5.5, 5.5);
		ProductoCongeladoAgua productoCongeladoAgua2 = new ProductoCongeladoAgua("08/08/2022", "129", "08/08/2021",
				"China", -6.5, 6.5);

		ProductoCongeladoAire productoCongeladoAire1 = new ProductoCongeladoAire("09/09/2022", "130", "09/09/2021",
				"Japon", -7.5, 75, 25, 5.5, 5.5);
		ProductoCongeladoAire productoCongeladoAire2 = new ProductoCongeladoAire("10/10/2022", "131", "10/10/2021",
				"Corea", -8.5, 65, 35, 5.5, 5.5);

		ProductoCongeladoNitrogeno productoCongeladoNitrogeno = new ProductoCongeladoNitrogeno("11/11/2022", "132",
				"11/11/2021", "India", -9.5, "Congelacion ultra rapida", 10.5);

		productoFresco1.mostrarInformacion();
		productoFresco2.mostrarInformacion();
		productoRefrigerado1.mostrarInformacion();
		productoRefrigerado2.mostrarInformacion();
		productoRefrigerado3.mostrarInformacion();
		productoCongeladoAgua1.mostrarInformacion();
		productoCongeladoAgua2.mostrarInformacion();
		productoCongeladoAire1.mostrarInformacion();
		productoCongeladoAire2.mostrarInformacion();
		productoCongeladoNitrogeno.mostrarInformacion();

	}

}