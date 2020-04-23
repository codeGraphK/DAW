/**
 * gestionAgro
 */
public class gestionAgro {

    public static void main(String[] args) {

        // Productos Frescos
        ProductoFresco productoFresco1 = new ProductoFresco(1, "01/01/2021", "01/01/2020", "Angola");
        ProductoFresco productoFresco2 = new ProductoFresco(2, "02/01/2021", "02/01/2020", "Emiratos");
        // Productos Refrigerados
        ProductoRefri productoRefri1 = new ProductoRefri(3, "03/01/2021", "03/01/2020", "Uruguay", 0, "x0001");

        ProductoRefri productoRefri2 = new ProductoRefri(4, "04/01/2021", "04/01/2020", "Francia", -5, "x0002");

        ProductoRefri productoRefri3 = new ProductoRefri(5, "05/01/2021", "05/01/2020", "Italia", -10, "x0003");

        // Productos Congelados

        // Productos Congelados por Agua
        ProductoConge productoConge1 = new ProductoCongeAgua(6, "06/01/2021", "06/01/2020", "Lituania", -15, 50);

        ProductoConge productoConge2 = new ProductoCongeAgua(7, "07/01/2021", "07/01/2020", "Japón", -20, 30);

        // Productos Congelados por Aire
        ProductoConge productoConge3 = new ProductoCongeAire(8, "08/01/2021", "08/01/2020", "Colombia", -25, 25, 25, 25,
                25);

        ProductoConge productoConge4 = new ProductoCongeAire(9, "09/01/2021", "09/01/2020", "Brasil", -30, 25, 25, 25,
                25);

        // Productos Congelados por Nitrógeno
        ProductoConge productoConge5 = new ProductoCongeNitro(10, "10/01/2021", "10/01/2020", "Venezuela", -35,
                "conFrio", 300);

        Producto[] listProductos = { productoFresco1, productoFresco2, productoRefri1, productoRefri2, productoRefri3,
                productoConge1, productoConge2, productoConge3, productoConge4, productoConge5 };

        for (Producto producto : listProductos) {
            System.out.println(producto.toString() + "\n-------------------");
        }
    }
}