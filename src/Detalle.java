public class Detalle {
    String na_veh;
    int anio_veh;
    double cil_veh;

    public Detalle(String na_veh, int anio_veh, double cil_veh) {
        this.na_veh = na_veh;
        this.anio_veh = anio_veh;
        this.cil_veh = cil_veh;
    }

    public String getNa_veh() {
        return na_veh;
    }

    public void setNa_veh(String na_veh) {
        this.na_veh = na_veh;
    }

    public int getAnio_veh() {
        return anio_veh;
    }

    public void setAnio_veh(int anio_veh) {
        this.anio_veh = anio_veh;
    }

    public double getCil_veh() {
        return cil_veh;
    }

    public void setCil_veh(double cil_veh) {
        this.cil_veh = cil_veh;
    }
}
