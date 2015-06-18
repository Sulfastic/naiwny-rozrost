/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwany.zarost;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Sulf
 */
public class Field extends JButton{

    boolean alive;
    public Color color;
    public float rho = 0;
    
    public Color random_color()
    {
        Random rand = new Random();
    
        
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        while(r==0 && g==0 && b==0)
        {
            r = rand.nextFloat();
            g = rand.nextFloat();
            b = rand.nextFloat();
        }
        
        color = new Color(r, g, b);
        return color;
    }
    
    public void is_alive(boolean what,Color color)
    {
        setBackground(color); 
        alive=what;
        this.color = color;
    }
    
    public Field(String txt) { 
        super(txt); 
        is_alive(false,Color.white);
        this.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                random_color();
                is_alive(true,color);
            }
        });
    }
}
