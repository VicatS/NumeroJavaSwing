package bo.edu.cursojava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel etiqueta;
    private JTextField campo;
    private JButton jugar;
    private JDialog dia;
    private JLabel etiqueta2;

    public Ventana() {
        super("Juego de numeros");
        etiqueta = new JLabel("Dime un numero");
        campo = new JTextField(2);
        jugar = new JButton("Jugar");
        dia = new JDialog(this);
        //usamos variable dia para llamar propiedad tamaño
        dia.setSize(200, 100);
        etiqueta2 = new JLabel("");
        FlowLayout f = new FlowLayout();
        setLayout(f);
        add(etiqueta);
        add(campo);
        add(jugar);
        dia.add(etiqueta2);
        //metodo independiente para el boton
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar();
            }
        });
    }

    private void jugar() {
        String valor = campo.getText();
        //convertimos el valor del usuario
        int numero= Integer.parseInt(valor);
        numero++;
        etiqueta2.setText("Mi numero es  " + numero + " TE GANE");
        dia.setVisible(true);
    }
}
