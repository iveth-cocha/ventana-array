import java.io.Serializable;
public class Vehiculo implements Serializable {
    String na_veh;
    String colorv;
    String anio_veh ;

    public Vehiculo(String na_veh, String colorv, String anio_veh) {
        this.na_veh = na_veh;
        this.colorv = colorv;
        this.anio_veh=anio_veh;
    }

    public String getNa_veh() {
        return na_veh;
    }

    public void setNa_veh(String na_veh) {
        this.na_veh = na_veh;
    }

    public String getColorv() {
        return colorv;
    }

    public void setColorv(String colorv) {
        this.colorv = colorv;
    }

    public String getAnio_veh() {
        return anio_veh;
    }

    public void setAnio_veh(String anio_veh) {
        this.anio_veh = anio_veh;
    }
}
