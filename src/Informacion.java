import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Informacion {
    private JPanel rootPanel;
    private JTextField name_vehi;
    private JTextField color_vehi;
    private JTextField anio_vehi;
    private JButton guardarButton;
    private JButton anteriorButton;
    private JButton siguienteButton;

    //CREO EL ARRAY para guadara la informacion sobre veiculos
    private ArrayList<Vehiculo> info ;
    int indiceActual=0;


    public Informacion() {

        //ESPACIO DE ALAMCENAMIENTO
        info = new ArrayList();
    guardarButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            String na_veh=name_vehi.getText();
            String colorv=color_vehi.getText();
            String anio_veh= anio_vehi.getText();

            //creo objeto
            Vehiculo nuevo = new Vehiculo(na_veh, colorv, anio_veh);

            //anado el objeto dentro del array
            info.add(nuevo);

            String filePath = "detalle.txt";

            try(
                    FileOutputStream fileOut = new FileOutputStream(filePath);
                    ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            ){
                objOut.writeObject(nuevo);
                System.out.println("Archivo guardado correctamente");
            }catch (IOException ex){
                throw new RuntimeException(ex);
            }

            // Borra el contenido de los JTextField
            name_vehi.setText("");
            color_vehi.setText("");
            anio_vehi.setText("");

        }
    });
    anteriorButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (indiceActual > 0) {
                indiceActual--;
                Vehiculo detalle = info.get(indiceActual);
                System.out.println(detalle);
                name_vehi.setText(detalle.getNa_veh());
                color_vehi.setText(detalle.getColorv());
                anio_vehi.setText(detalle.getAnio_veh());

            }


        }
    });
    siguienteButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (indiceActual < info.size() - 1) {
                indiceActual++;
                Vehiculo detale    = info.get(indiceActual);
                System.out.println(detale);
                name_vehi.setText(detale.getNa_veh());
                color_vehi.setText(detale.getColorv());
                anio_vehi.setText(detale.getAnio_veh());
            }

        }
    });


}

    public static void main(String[] args) {
        JFrame frame = new JFrame("vehiculos");
        frame.setContentPane(new Informacion().rootPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
}
