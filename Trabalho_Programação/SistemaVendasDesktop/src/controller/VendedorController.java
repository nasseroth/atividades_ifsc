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
import view.VendedorForm;
import static view.MainForm.jDesktopPane;

/**
 *
 * @author Nasser
 */
public class VendedorController implements ActionListener {

    public VendedorController(VendedorForm vendedorForm) {

        VendedorForm form = new VendedorForm();
        centralizarForm(form);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
