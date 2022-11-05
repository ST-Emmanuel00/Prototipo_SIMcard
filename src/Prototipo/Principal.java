package Prototipo;

public class Principal {
    public static void main(String[] args) {

        // Prueba 1: Resultado: ----
        SIMCard cliente = new SIMCard("3218298707");
        cliente.toString();

        // Prueba 2: Resultado: ----
        cliente.recargarSaldo(50000); // Se debe agregar el saldo
        cliente.toString();

        // Prueba 3: Resultado: ----
        cliente.comprarDatos(12); // Se debe consumir saldo
        cliente.toString();

        // Prueba 4: Resultado: ----
        cliente.consumirDatos(3); // debe permanecer igual por que el celular esta apagado
        cliente.toString();

        // Prueba 5: Resultado: ----
        cliente.gestionarEncendido(); // Debe cambiar ele stado del celular
        cliente.toString();

        // Prueba 6: Resultado: ----
        cliente.llamar(125); // Debe disminuir el saldo
        cliente.toString();

        // Prueba 7: Resultado: ----
        cliente.gestionarModoAvion();
        cliente.gestionarDatos(); // los datos moviles no se deben encender
        cliente.toString();

        // Prueba 8: Resultado: ----
        cliente.gestionarModoAvion();
        cliente.gestionarDatos();
        cliente.toString(); // Se debe apagar el modo avion y activar los datos moviles

        // Prueba 10: Resultado: ----

        cliente.consumirDatos(3);
        cliente.toString(); // Debe restar 3 GB a saldoDatos

    }
}
