import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class vehiculos {
    private JPanel rootPanel;
    private JTextField name_vehi;
    private JTextField anio_vehi;
    private JTextField c_vehi;
    private JButton guardarButton;
    private JButton anteriorButton;
    private JButton siguienteButton;

    String na_veh;
    int anio_veh;
    double cil_veh;

    public vehiculos() {
    guardarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            List<Detalle> info=new ArrayList<>(5);
            Detalle datos =new Detalle("",0,0);

            name_vehi.setText(na_veh);
            anio_vehi.setText(String.valueOf(anio_veh));
            c_vehi.setText(String.valueOf(cil_veh));


                /*
                anio_veh=Integer.parseInt(anio_vehi.getText());
                cil_veh=Integer.parseInt(c_vehi.getText());
                   */

            for (int i=0; i<info.size(); i++){
                System.out.println("// vehiculo # " +(i+1)+" //\n");
                System.out.println("1" + info.get(i).getNa_veh());
                System.out.println("2"+info.get(i).getAnio_veh());
                System.out.println("3" + info.get(i).getCil_veh());
            }




        }
    });
    anteriorButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    siguienteButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });


}

    public static void main(String[] args) {
        JFrame frame = new JFrame("vehiculos");
        frame.setContentPane(new vehiculos().rootPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
}
