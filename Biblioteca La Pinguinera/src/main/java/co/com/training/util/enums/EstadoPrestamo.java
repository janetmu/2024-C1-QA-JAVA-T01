package co.com.training.util.enums;

public enum EstadoPrestamo {

    ESTADO_UNO("SOLICITADO"),
    ESTADO_DOS("REALIZADO"),
    ESTADO_TRES("FINALIZADO");

    private String value;

    private EstadoPrestamo(String estadoPrestamo) {
        this.value = estadoPrestamo;
    }

    public String getvalue() {
        return value;
    }
}
