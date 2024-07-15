/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakegame;

import javax.swing.*;
import java.awt.*;
public class Snakegame extends JFrame{
    Snakegame()
    {
        super("Snake Game");
        add(new Board());//adding another class component 
        pack();//refreshes 
        
        setLocationRelativeTo(null);//relative to screen setSize
        setResizable(false);//size fixed
   
       
    }
    public static void main(String[] args) {
        new Snakegame().setVisible(true);

    }
}

