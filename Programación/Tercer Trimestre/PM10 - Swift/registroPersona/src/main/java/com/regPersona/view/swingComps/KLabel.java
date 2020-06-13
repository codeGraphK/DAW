package com.regPersona.view.swingComps;

import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class KLabel extends JLabel {

    private static final long serialVersionUID = 1L;

    public KLabel(String message) {
        super(message);
        setFont(new FontUIResource("Arial", 1, 9));
        setForeground(new ColorUIResource(248, 248, 242));
    }

}