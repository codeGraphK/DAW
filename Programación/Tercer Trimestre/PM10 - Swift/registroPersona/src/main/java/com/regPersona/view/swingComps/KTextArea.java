package com.regPersona.view.swingComps;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class KTextArea extends JTextArea {

    private static final long serialVersionUID = 1L;

    public KTextArea() {
        super();
        setBackground(new ColorUIResource(68, 71, 90));
        setForeground(new ColorUIResource(248, 248, 242));
        setBorder(BorderFactory.createLineBorder(new ColorUIResource(80, 250, 123)));
        setFont(new FontUIResource("Arial", 0, 9));
        setEditable(false);
    }

}