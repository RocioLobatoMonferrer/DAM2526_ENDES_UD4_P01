package paqueteEntrega;

public class Main {
	public void main() {
		Pedido pd1 = new Pedido(1);
		Producto pro1 = new Producto("Teclado", 25.50);
		Producto pro2 = new Producto("Ratón", 15.00);
		EstadoPedido estado = null;

		pd1.agregarProducto(pro1);
		pd1.agregarProducto(pro2);

		System.out.println("PEDIDO:");
		System.out.println("NÚMERO DE ID: " + pd1.getNumero());
		System.out.println("ESTADO DEL PEDIDO: " + estado.PENDIENTE);
		System.out.println("PRECIO TOTAL: " + pd1.calcularTotal());

		pd1.setEstado(estado.ENVIADO);

		System.out.println("\nESTADO DEL PEDIDO: " + pd1.getEstado());
	}

	public static void main(String[] args) {
		new Main().main();
	}

}
