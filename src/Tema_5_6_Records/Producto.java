package Tema_5_6_Records;

    public record Producto(int id, String nombre, double precio) {

        public Producto {
            if (id <= 0) {
                throw new IllegalArgumentException("El id debe ser positivo.");
            }

            if (nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacio.");
            }

            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo.");
            }
        }

        public Producto aplicarDescuento(double porcentaje) {
            if (porcentaje < 0 || porcentaje > 100) {
                throw new IllegalArgumentException("Descuento invalido (debe ser 0-100)");
            }
            double nuevoPrecio = this.precio * (1 - (porcentaje / 100));

            return new Producto(this.id, this.nombre, nuevoPrecio);
        }
    }

