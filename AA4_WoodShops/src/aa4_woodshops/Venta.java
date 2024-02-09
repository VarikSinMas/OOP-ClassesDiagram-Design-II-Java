package aa4_woodshops;
import java.util.Date;
import java.util.List;

public class Venta {
    private int numeroTicket;
    private Date fecha;
    private Cliente cliente;
    private List<LineaTicket> lineasDetalle;

    public Venta(int numeroTicket, Date fecha, Cliente cliente, List<LineaTicket> lineasDetalle) {
        this.numeroTicket = numeroTicket;
        this.fecha = fecha;
        this.cliente = cliente;
        this.lineasDetalle = lineasDetalle;
    }

    // Agrega otros métodos y lógica según sea necesario.
}
