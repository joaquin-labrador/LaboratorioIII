package Cliente;
import java.util.UUID;
 //Genere cadenas alfanumericas random
import Cliente.invoice.Invoice;
public class Client {
     private UUID id;//Clase que genera un identificador aleatorio(Toma un valor hexadecimal)
     private String name;
     private String eMial;
     private double dcto;

    public Client() {
    }

    public Client(String name, String eMial, double dcto) {
        this.name = name;
        this.eMial = eMial;
        this.dcto = dcto;
        this.id = UUID.randomUUID();//Asigna id random en valor hexadecimal
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String geteMial() {
        return eMial;
    }

    public double getDcto() {
        return dcto;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", eMial ='" + eMial + '\'' +
                ", dcto= " + dcto +
                '}';
    }
}
