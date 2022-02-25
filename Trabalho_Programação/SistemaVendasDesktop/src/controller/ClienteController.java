/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import view.ClienteForm;
import static view.MainForm.jDesktopPane;

/**
 *
 * @author Nasser
 */
public class ClienteController implements ActionListener {

    public ClienteController(ClienteForm clienteForm) {

        ClienteForm form = new ClienteForm();
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
