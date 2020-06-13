package com.regPersona.view.swingComps;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import java.awt.Shape;
import java.awt.Graphics;
import java.awt.geom.RoundRectangle2D;

public class KTextField extends JTextField {

    private static final long serialVersionUID = 1L;
    private Shape shape;

    public KTextField(int size) {
        super(size);
        setOpaque(false);
        setFont(new FontUIResource("Arial", 0, 9));
        setBackground(new ColorUIResource(68, 71, 90));
        setForeground(new ColorUIResource(248, 248, 242));
        setBorder(BorderFactory.createCompoundBorder(getBorder(), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
    }

    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(new ColorUIResource(255, 121, 198));
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
    }

    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
        }
        return shape.contains(x, y);
    }
}