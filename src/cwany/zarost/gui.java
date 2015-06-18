/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwany.zarost;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import jdk.nashorn.internal.parser.TokenType;


/**
 *
 * @author Sulf
 */
public class gui extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form gui
     */
    Field[][] tab;
    ArrayList<seed> lista_ziaren = new ArrayList(); 
    int iterator=0;
    boolean simulation = false;
    int number_of_seeds=0;
    int cell_size = 10; 
    public static int rows;
    public static int cols;
    boolean tmp[][];
    Color coltmp[][];
    Dimension size;
    boolean periodic = false;
    int choice;
    int rand_choice;
    boolean Stop=false;
    boolean aleate = false;
    seed blacktab[];
    seed blacktab2[];
    int count = 0;
    
    public static int get_rows()
    {
        return rows;
    }
    
    public static int get_cols()
    {
        return cols;
    }
    
    public gui() {
        initComponents();
        size = jPanel1.getSize();
        rows = size.height/cell_size;
        cols = size.width/cell_size;
        jPanel1.setLayout(new GridLayout(rows,cols));
        modify_jpanel();
        tmp = new boolean[rows][cols];
        coltmp = new Color[rows][cols];
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton5);
        buttonGroup1.add(jRadioButton6);
        buttonGroup1.add(jRadioButton7);
        buttonGroup1.add(jRadioButton8);
        jRadioButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                choice=1;
            }
        });
        jRadioButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                choice=2;
            }
        });
        jRadioButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                choice=3;
            }
        });
        jRadioButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                choice=4;
            }
        });
        jRadioButton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                choice=5;
            }
        });
        jRadioButton6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                choice=6;
            }
        });
        jRadioButton7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                choice=7;
            }
        });
        jRadioButton8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                choice=8;
            }
        });
        buttonGroup2.add(Even);
        buttonGroup2.add(Random_R);
        buttonGroup2.add(Rand_button);
        Even.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                rand_choice=3;
//Even_func();
            }
        });
        Random_R.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                rand_choice=2;
//Random_R_func(); 
            }
        });
        Rand_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                rand_choice=1;
            }
        });
        jCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                periodic = !periodic;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        Even = new javax.swing.JRadioButton();
        Random_R = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        Rand_button = new javax.swing.JRadioButton();
        Stop_button = new javax.swing.JButton();
        Still_aleate_button = new javax.swing.JButton();
        recrystalize_button = new javax.swing.JButton();
        bounds_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1107, 511));

        jPanel1.setVisible(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        jButton2.setText("Run");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Heksagonal right");

        jRadioButton3.setText("Pentagonal left");

        jButton1.setText("Set");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Von Neumann");

        jRadioButton5.setText("Heksagonal left");

        jRadioButton1.setText("Moore");

        jRadioButton8.setText("Heksagonal random");

        jRadioButton7.setText("Pentagonal random");

        jRadioButton4.setText("Pentagonal right");

        Even.setText("Evenly");
        Even.setEnabled(false);

        Random_R.setText("Random with R");
        Random_R.setEnabled(false);

        jButton4.setEnabled(false);
        jButton4.setText("Randomize");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Periodic");

        Rand_button.setEnabled(false);

        Stop_button.setText("Stop");
        Stop_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop_buttonActionPerformed(evt);
            }
        });

        Still_aleate_button.setText("Aleate still");
        Still_aleate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Still_aleate_buttonActionPerformed(evt);
            }
        });

        recrystalize_button.setText("Recrystalize");
        recrystalize_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recrystalize_buttonActionPerformed(evt);
            }
        });

        bounds_button.setText("Bounds");
        bounds_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bounds_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addGap(15, 15, 15)
                                .addComponent(Rand_button)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Random_R)
                                    .addComponent(Even))
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton7)
                                .addGap(33, 33, 33)
                                .addComponent(jCheckBox1)
                                .addGap(0, 336, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Still_aleate_button))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton8)))
                                .addGap(51, 51, 51)
                                .addComponent(Stop_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bounds_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recrystalize_button)
                                .addGap(277, 277, 277)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton7)
                    .addComponent(jButton4)
                    .addComponent(jCheckBox1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton6)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Even))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(Random_R)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Still_aleate_button))))
                            .addComponent(Rand_button)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Stop_button)
                            .addComponent(recrystalize_button)
                            .addComponent(bounds_button)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        simulation = true;
        count=0;
        gameThread();       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       for(int i=0;i<rows;i++)
           for(int j=0;j<cols;j++)
           {
               tab[i][j].is_alive(false, Color.white);
           }
       simulation=false;
       jPanel1.revalidate();
       jPanel1.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        switch (rand_choice)
        {
            case 1:
                Random_just_func();
            break;
                
            case 2:
                Random_R_func();
            break;
                
            case 3:
                Even_func();
            break;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        number_of_seeds = Integer.parseInt(jTextField1.getText());
        jButton4.setEnabled(true);
        Even.setEnabled(true);
        Random_R.setEnabled(true);
        Rand_button.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Stop_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop_buttonActionPerformed
        Stop = !Stop;
    }//GEN-LAST:event_Stop_buttonActionPerformed

    private void Still_aleate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Still_aleate_buttonActionPerformed
        aleate = !aleate;
    }//GEN-LAST:event_Still_aleate_buttonActionPerformed

    private void recrystalize_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recrystalize_buttonActionPerformed
        recrystalize();
    }//GEN-LAST:event_recrystalize_buttonActionPerformed

    private void bounds_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bounds_buttonActionPerformed
        drawbounds();
    }//GEN-LAST:event_bounds_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Even;
    private javax.swing.JRadioButton Rand_button;
    private javax.swing.JRadioButton Random_R;
    private javax.swing.JButton Still_aleate_button;
    private javax.swing.JButton Stop_button;
    private javax.swing.JButton bounds_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton recrystalize_button;
    // End of variables declaration//GEN-END:variables
    
    private void Random_just_func()
    {
        Random generator = new Random();
        
        boolean temporary[][] = new boolean[rows][cols];
       
        for(int i=0;i<number_of_seeds;i++)
        {
            temporary[generator.nextInt(rows)][generator.nextInt(cols)] = true;
        }
        
        
        for(int i=1;i<rows-1;i++)
        {
            for(int j=1;j<cols-1;j++)
            {
                if(!temporary[i][j])
                    tab[i][j].is_alive(false, Color.white);
                else
                    tab[i][j].is_alive(true, tab[i][j].random_color());
            }
        }
    }
    
    private void Even_func()
    {
        int pierw=(int) Math.sqrt(number_of_seeds);
        int borderx = rows/pierw-1;
        int bordery = cols/pierw-1;
        int counter=0;
        
        for(int i=0;i<=pierw;i++)
        {
            for(int j=0;j<=pierw && counter < number_of_seeds;j++)
            {          
                tab[i*borderx+1][j*bordery+1].is_alive(true, tab[i*borderx+1][j*bordery+1].random_color());
                counter++;
            }
        }   
    }
    
    private void Random_R_func()
    {
        boolean add;
        Random generator=new Random();  
        int R = Integer.parseInt(jTextField2.getText());
        for(int i = 0; i < number_of_seeds; i++)
        {
            int x = generator.nextInt(rows -2*R)+R;
            int y = generator.nextInt(cols-2*R)+R;
            add=true;

            for(int j=x-R; j<x+R; j++)
            {
                for(int k=y-R; k<y+R; k++)
                {
                    if(tab[j][k].alive)
                    {
                        add=false;
                        break;
                    }
                    if(!add)
                        break;
                }
            }
            if(!add)
                i--;
            else
               tab[x][y].is_alive(true, tab[x][y].random_color());
        }
    }
    
    private void modify_jpanel()
    {
        jPanel1.setVisible(true);
        tab = new Field[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {   tab[i][j] = new Field("");
                tab[i][j].setBorder(null);
                tab[i][j].setVisible(true);
                jPanel1.add(tab[i][j]);
            }
        }
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
    private void neibhourhood_moore(int i, int j)
    {   
        if(tab[i-1][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j-1].color;
        }
        
        if(tab[i-1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j].color;  
        }
        
        if(tab[i-1][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j+1].color;
        }
        
        if(tab[i][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j-1].color;
        }
        
        if(tab[i][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j+1].color;
        }
        
        if(tab[i+1][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j-1].color;
        }
        
        if(tab[i+1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j].color;
        }
        
        if(tab[i+1][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j+1].color;
        }
    }
    
    private void neibhourhood_neumann(int i, int j)
    {   
        if(tab[i-1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j].color;  
        }
        if(tab[i][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j-1].color;
        }
        if(tab[i][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j+1].color;
        }
        if(tab[i+1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j].color;
        }
    }
    
    private void neibhourhood_pentagonal_right(int i, int j)
    {   
        if(tab[i-1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j].color;  
        }
        if(tab[i-1][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j+1].color;
        }
        if(tab[i][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j+1].color;
        }
        if(tab[i+1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j].color;
        }
        if(tab[i+1][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j+1].color;
        }
    }
    
    private void neibhourhood_pentagonal_left(int i, int j)
    {
        if(tab[i-1][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j-1].color;
        }
        if(tab[i-1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j].color;  
        }
        if(tab[i][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j-1].color;
        }
        if(tab[i+1][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j-1].color;
        }
        if(tab[i+1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j].color;
        }
    }
    
    private void neibhourhood_pentagonal_up(int i, int j)
    {
        if(tab[i-1][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j-1].color;
        }
        
        if(tab[i-1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j].color;  
        }
        
        if(tab[i-1][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j+1].color;
        }
        
        if(tab[i][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j-1].color;
        }
        
        if(tab[i][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j+1].color;
        }
    }
    
    private void neibhourhood_pentagonal_bottom(int i, int j)
    {
        if(tab[i][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j-1].color;
        }
        
        if(tab[i][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j+1].color;
        }
        
        if(tab[i+1][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j-1].color;
        }
        
        if(tab[i+1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j].color;
        }
        
        if(tab[i+1][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j+1].color;
        }
    }
    
    private void neibhourhood_heksagonal_left(int i, int j)
    {   
        if(tab[i-1][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j-1].color;
        }
        if(tab[i-1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j].color;  
        }
        if(tab[i][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j-1].color;
        }
        if(tab[i][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j+1].color;
        }
        if(tab[i+1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j].color;
        }
        if(tab[i+1][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j+1].color;
        }
    }      
    
    private void neibhourhood_heksagonal_right(int i, int j)
    {   
        if(tab[i-1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j].color;  
        }
        if(tab[i-1][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i-1][j+1].color;
        }
        if(tab[i][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j-1].color;
        }
        if(tab[i][j+1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i][j+1].color;
        }
        if(tab[i+1][j-1].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j-1].color;
        }
        if(tab[i+1][j].alive)
        {
            tmp[i][j]=true;
            coltmp[i][j]=tab[i+1][j].color;
        }
    }
    
    void periodicBoundaries(){
        for(int j = 1; j < cols-1; j++)
            tab[0][j] = tab[rows-2][j];
        
        for(int j = 1; j < cols-1; j++)
            tab[rows-1][j] = tab[1][j];
        
        for(int i = 1; i < rows-1; i++)
            tab[i][0] = tab[i][cols-2];
        
        for(int i = 1; i < rows-1; i++)
            tab[i][cols-1] = tab[i][1];
        
        tab[0][0] = tab[rows-2][cols-2];
        tab[rows-1][cols-1] = tab[1][1];
        tab[rows-1][0] = tab[1][cols-2];
        tab[0][cols-1] = tab[rows-2][1];   
    }
    
    private void Aleate_func()
    {
        Random generator = new Random();
        int i = 1 + generator.nextInt(rows - 4);
        int j = 1 + generator.nextInt(cols - 4);
        while(tab[i][j].alive)
        {
            i = 1 + generator.nextInt(rows - 4);
            j = 1 + generator.nextInt(cols - 4);
        }
        tab[i][j].is_alive(true, tab[i][j].random_color());
    }
    
    private void add_bounds(int i, int j, Color color)
    {
        if(tab[i][j+1].color != color)
        {
            coltmp[i][j] = Color.black;
        }
        else if(tab[i+1][j].color != color)
        {
            coltmp[i][j] = Color.black;
        }
    }
    
    private void recrystalize()
    {
        float packets = 10;
        float A = 86710969050178.5f;
        float B = 9.41268203527779f;
        Random generator = new Random();              
        float ro;  
        boolean traf = false;
        int recr_num_count = 0;
               
        float rho_crit = (float) (4.21584*Math.exp(12)/(rows*cols));
        
        for(int i=1;i<rows-1;i++)
        {
            for(int j=1;j<cols-1;j++)
            {
                tab[i][j].alive=false;
                tab[i][j].rho = 0;
            }
        }      
               
        for(float i = 0; i < 0.2; i+=0.001){
            ro = (float) (A/B+(1-A/B)*Math.exp(-B*i));
            float pack = ro/(packets*0.8f);

            for(int g = 0; g < packets; g++){
                traf = false;

                while(!traf){
                    int x = 1 + generator.nextInt(rows-1); 
                    int y = 1 + generator.nextInt(cols-1);

                    for(int e = 0; e < blacktab2.length; e++)
                        if(blacktab2[e].x == x && blacktab2[e].y == y){
                            traf = true;
                            tab[blacktab2[e].x][blacktab2[e].y].rho += pack;
                        }
                }
            }

            pack = ro/(packets*0.2f);
            for(int g = 0; g < packets; g++){
                int x = generator.nextInt(rows); //tutaj!!!!!!!!!!!
                int y = generator.nextInt(cols);

                for(int e = 0; e < blacktab2.length; e++)
                    if(blacktab2[e].x != x || blacktab2[e].y != y)
                        tab[x][y].rho += pack;
            }

            for(int j = 1; j < cols-1; j++)
                for(int k = 1; k < rows-1; k++)
                    if(tab[k][j].rho > rho_crit)
                        if(recr_num_count < number_of_seeds)
                        {
                            tab[k][j].is_alive(true, tab[k][j].random_color());
                            recr_num_count++;
                        }
        }
    }

    private void drawbounds()
    {
        int bound_counter=0;
        if(!Stop){
            for(int i=1;i<rows-1;i++)
            {
                for(int j=1;j<cols-1;j++)
                {   
                    if(bound_counter!=5782)
                    {
                        add_bounds(i,j,tab[i][j].color);
                        bound_counter++;
                    } 

                }
            }

            for(int i=1;i<rows-1;i++)
            {
                for(int j=1;j<cols-1;j++)
                {
                    tab[i][j].is_alive(tmp[i][j], coltmp[i][j]);
                }       
            }
            
            for(int i=1;i<rows-1;i++)
            {
                for(int j=1;j<cols-1;j++)
                {
                    coltmp[i][j]=tab[i][j].color;
                }
            }
            
            blacktab = new seed[5782];

            int counter = 0;
           
            for(int i=1;i<rows-1;i++)
            {
                for(int j=1;j<cols-1;j++)
                {
                    if(tab[i][j].color == Color.black)
                    {
                        blacktab[counter++] = new seed(i,j);
                    }
                }
            }   
            
            blacktab2 = new seed[counter];
            
            for(int i=0;i<counter;i++)
                blacktab2[i] = new seed(blacktab[i].x,blacktab[i].y);
            
        } 
    }
    
    private void system()
    {
        Random generator = new Random();
        while(simulation && count<5782){
            count = 0;
            tmp = new boolean[rows][cols];
            coltmp = new Color[rows][cols];

            for(int i=1;i<rows-1;i++)
            {
                for(int j=1;j<cols-1;j++)
                {
                    tmp[i][j] = tab[i][j].alive;
                    coltmp[i][j] = tab[i][j].color;
                }
            }


            if(periodic)
                periodicBoundaries();

            if(!Stop){
            for(int i=1;i<rows-1;i++)
            {
                for(int j=1;j<cols-1;j++)
                { 
                    if(!tab[i][j].alive)//gdy żyje
                    { 
                        switch(choice)
                        {
                            case 1:
                                neibhourhood_moore(i, j);
                            break;

                            case 2:
                                neibhourhood_neumann(i,j);
                            break;

                            case 3:
                                neibhourhood_pentagonal_left(i, j);
                            break;

                            case 4:
                                neibhourhood_pentagonal_right(i, j);    
                            break;

                            case 5:
                                neibhourhood_heksagonal_left(i, j);
                            break;

                            case 6:
                                neibhourhood_heksagonal_right(i, j);
                            break;

                            case 7:
                                if(generator.nextInt(4)==0)
                                    neibhourhood_pentagonal_left(i, j);
                                else if (generator.nextInt(4)==1)
                                    neibhourhood_pentagonal_right(i, j); 
                                else if (generator.nextInt(4)==2)
                                    neibhourhood_pentagonal_bottom(i, j);
                                else if (generator.nextInt(4)==3)
                                    neibhourhood_pentagonal_up(i, j); 
                            break;

                            case 8:
                                if(generator.nextBoolean())
                                    neibhourhood_heksagonal_right(i, j);
                                else
                                    neibhourhood_heksagonal_left(i, j);
                            break;
                        } 
                    }
                }
            }

            for(int i=1;i<rows-1;i++)
            {
                for(int j=1;j<cols-1;j++)
                {
                    tab[i][j].is_alive(tmp[i][j], coltmp[i][j]);
                    if(tab[i][j].alive)
                        count++;
                }       
            }
            
            
            System.out.println(count);
            if(aleate)
                Aleate_func();
            
            try {
                Thread.sleep(600);
            } catch (InterruptedException ex) {
                Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
            }               
            }
        }
    }
    int a=0;
    void gameThread(){
        Thread t = new Thread(this);
        t.start();
   }
    
    @Override
    public void run() {
        system();
    }
}
