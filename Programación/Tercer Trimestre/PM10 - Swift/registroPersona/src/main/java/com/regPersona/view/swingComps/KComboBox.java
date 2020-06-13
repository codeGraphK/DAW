package com.regPersona.view.swingComps;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class KComboBox<E> extends JComboBox<E> {

    private static final long serialVersionUID = 1L;

    public KComboBox() {
        super();
        setOpaque(false);
        setFont(new FontUIResource("Arial", 0, 9));
        setBackground(new ColorUIResource(68, 71, 90));
        setForeground(new ColorUIResource(248, 248, 242));
        setBorder(BorderFactory.createCompoundBorder(getBorder(), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
    }

}