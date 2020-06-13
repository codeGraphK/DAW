package com.regPersona.view.swingComps;

import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class KButton extends JButton {

    private static final long serialVersionUID = 1L;

    public KButton(String title) {
        super(title);
        setFont(new FontUIResource("Arial", 1, 9));
        setContentAreaFilled(false);
        setBackground(new ColorUIResource(98, 114, 164));
        setForeground(new ColorUIResource(248, 248, 242));
        setBorder(BorderFactory.createLineBorder(new ColorUIResource(189, 147, 249)));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(getBackground().darker());
        } else if (getModel().isRollover()) {
            g.setColor(getBackground().brighter());
        } else {
            g.setColor(getBackground());
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

}