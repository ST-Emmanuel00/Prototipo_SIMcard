package Prototipo;

public class SIMCard {

    // Atributos

    private String empresaTelefonica = "HI";
    private double saldo = 0;
    private String numeroTelefonico;
    private boolean celularApagado = true;
    private boolean modoAvionActivado = false;
    private  boolean datosActivados = false;
    private int saldoDatos = 0;

    private boolean consumirDatos = true;

    private  boolean llamadasActivadas = true;

    // Contructor

    public SIMCard(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public SIMCard() {
    }

    // Setter

    public void setEmpresaTelefonica(String empresaTelefonica) {
        this.empresaTelefonica = empresaTelefonica;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }

    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }

    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }

    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }

    public void setLlamadasActivadas(boolean llamadasActivadas) {
        this.llamadasActivadas = llamadasActivadas;
    }

    public void setConsumirDatos(boolean consumirDatos) {
        this.consumirDatos = consumirDatos;
    }

    // Getter

    public String getEmpresaTelefonica() {
        return empresaTelefonica;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public boolean isCelularApagado() {
        return celularApagado;
    }

    public boolean isModoAvionActivado() {
        return modoAvionActivado;
    }

    public boolean isDatosActivados() {
        return datosActivados;
    }

    public int getSaldoDatos() {
        return saldoDatos;
    }

    public boolean isLlamadasActivadas() {
        return llamadasActivadas;
    }

    public boolean isConsumirDatos() {
        return consumirDatos;
    }

    // Metodos

    // Requerimiento 5

    public void comprarDatos(int c) {

        if (c * 3000 >= 3000) {

            if (c <= 10) {

                saldo = (saldo - (c * 3000));

            }

            else if (c > 10 && c <= 30) {

                saldo = (saldo - ((10 * 3000) + ((c - 10) * 2500)));

            }

            else if (saldoDatos > 30) {

                saldo = (saldo - ((20 * 3000) + ((saldoDatos - 20) * 1500 )));

            }
        }

        else {}

    }

    // Requerimientos 6

    public void consumirDatos(int s) {

        if (s <= 60) {

            saldo = (saldo -  (s * 1));

        }

        else if (s > 60) {

            saldo = (saldo - ((s * 1) + ((s-60) + (s * 0.5))));

        }

    }
    // Requerimientos 6

    public void llamar(int s) {

        if (s <= 60) {

            saldo = saldo - (s * 1);

        }

        else if (s > 60) {

            saldo = (saldo - ((60 * 1) + ((s * 0.5) - 60 )));

        }
    }

    public void recargarSaldo(double s) {

        if (s > 0) {

            saldo = saldo + s;
        }
    }

    // Requerimientos 1 y 4

    public void gestionarEncendido() {

        if (this.celularApagado == true || this.modoAvionActivado == true) {

            this.llamadasActivadas = false;
            this.datosActivados = false;

        }

        else if (this.celularApagado == true) {

            this.celularApagado = false;
            this.modoAvionActivado = false;
            this.datosActivados = false;

        }

        else if (this. celularApagado == false) {

            this.celularApagado = true;
            this.datosActivados = this.datosActivados;
        }
    }

    // Requerimientos 3

    public void gestionarModoAvion() {

        if (this.modoAvionActivado == true && this.datosActivados == true) {

            this.modoAvionActivado = false;
            this.datosActivados = false;

        }

        else if (modoAvionActivado == true) {

            this.datosActivados = false;
            this.modoAvionActivado = false;
        }

        else if (modoAvionActivado == false) {

            this.modoAvionActivado = true;
            this.datosActivados = true;
        }
    }

    // Rquerimientos 2

    public void gestionarDatos() {

        if (this.datosActivados == false) {

            this.datosActivados = true;

        }

        else if (this.datosActivados == true) {

            this.datosActivados = false;

        }
    }

    @Override
    public String toString() {
        return "SIMCard{" +
                "empresaTelefonica='" + empresaTelefonica + '\'' +
                ", saldo=" + saldo +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                ", celularApagado=" + celularApagado +
                ", modoAvionActivado=" + modoAvionActivado +
                ", datosActivados=" + datosActivados +
                ", saldoDatos=" + saldoDatos +

                '}';
    }
}
