/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import view.VendasForm;
import static view.MainForm.jDesktopPane;

/**
 *
 * @author Nasser
 */
public class VendasController implements ActionListener {
    

    public VendasController(VendasForm vendasForm) {

        VendasForm form = new VendasForm();
        centralizarForm(form);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //fazer aqui a captura dos eventos como F1
    }
    
    void centralizarForm(JInternalFrame frame) {
        jDesktopPane.add(frame);
        Dimension dimension = jDesktopPane.getSize();
        Dimension dimensionFrame = frame.getSize();
        frame.setLocation((dimension.width - dimensionFrame.width) / 2,
                (dimension.height - dimensionFrame.height) / 2);
        frame.show();
    }
}
