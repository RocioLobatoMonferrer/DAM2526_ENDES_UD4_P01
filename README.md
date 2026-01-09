# UML - PRÁCTICA 1 – Introducción a UML y POO 
### Por: Rocío Lobato Monferrer - 1ºDAM 

## Diagrama UML 
![UML](UML_Entregas.png)

## Cuestiones de Análisis
### 1. ¿Qué tipo de relación se define en el diagrama UML entre Pedido y Producto?

En este caso, se nos presenta que un Pedido está formado por ningún o varios productos, mientras que un Producto es único para cada pedido. Por lo tanto, nos encontramos ante una relación de tipo asociación, ya que gracias al pedido obtenemos los productos y los productos son únicos para el pedido. 


### 2. ¿Qué significa la cardinalidad indicada en esa relación?

La cardinalidad de la relación Pedido y Producto consiste en que Pedido es "0..*" o "cero o varios", es decir, un pedido tiene varios o ningún producto, mientras que Producto es "1" o "uno y solo uno", es decir, un producto solo está en un pedido.


### 3. ¿Qué otros tipos de cardinalidad se pueden definir en UML?

Además de "0..*" y "1", en UML existen las siguientes cardinalidades:

- "0..1" o "Cero o uno": La cardinalidad solo puede ser de cero o uno, por ejemplo, un pedido solo puede tener cero o un producto.
  
- "N..M" o "Desde N hasta M": La cardinalidad puede ser desde dos números cualquiera dentro de un intervalo, por ejemplo, un pedido solo puede tener desde 0 hasta 10 productos.
  
- "1..*" o "Uno o varios (mínimo 1)": La cardinalidad puede ser uno o varios, por ejemplo, un pedido solo puede tener uno o varios productos. 


### 4. ¿Qué diferencias existen entre una asociación, una agregación y una composición?

Existen distintos tipos de relaciones en un diagrama de UML, los cuales son:

- Asociación:
  
- Agregación:
  
- Composición: 
