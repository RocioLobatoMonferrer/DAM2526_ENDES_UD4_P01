package paqueteEntrega;

import java.util.ArrayList;

public class Pedido {
	private int numero;
	private EstadoPedido estado;
	private ArrayList<Producto> productos = new ArrayList<>();

	public Pedido(int numero) {
		this.numero = numero;
	}

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	public double calcularTotal() {
		double result = 0;
		for (int i = 0; i < productos.size(); i++) {
			result += productos.get(i).getPrecio();
		}
		return result;
	}

	public int getNumero() {
		return numero;
	}

	public EstadoPedido getEstado() {
		return estado;
	}

	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

}