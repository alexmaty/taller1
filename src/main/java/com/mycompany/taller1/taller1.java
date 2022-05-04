/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class taller1 extends JFrame{
    




    private JPanel panel;
    private JLabel nombre;
    private JLabel matricula;
    private JLabel carrera;
    private JLabel correo;
    private JTextField nombretx;
    private JTextField matriculatx;
    private JTextField carreratx;
    private JTextField correotx;
    private JButton limpiar;
    private JButton agregar;
    private JButton eliminar;
    private JTable tabla;
    private JScrollPane scroll ;

    public taller1() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("El mejor Titulo");
        this.setBounds(200, 200, 500, 500);//tamaño y ubicacion
        this.setLocationRelativeTo(null);//centrar ventana
        
        agregarComponentes();
       
    }

     public void agregarComponentes() {
        JPanel panel=new JPanel();
        this.getContentPane().add(panel);
        JLabel etiqueta1=new JLabel("NOMBRE: ");
        panel.add(etiqueta1);
        etiqueta1.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        JLabel etiqueta2=new JLabel("CARRERA: ");
        panel.add(etiqueta2);
        etiqueta2.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        JLabel etiqueta3=new JLabel("MATRICULA: ");
        panel.add(etiqueta3);
        etiqueta3.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        JLabel etiqueta4=new JLabel("CORREO: ");
        panel.add(etiqueta4);
        etiqueta4.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        JButton boton1=new JButton("AGREGAR");
        panel.add(boton1);
        JButton boton2=new JButton ("LIMPIAR");
         panel.add(boton2);     
        JButton boton3=new JButton ("ELIMINAR");
        panel.add(boton3);
        JTable tabla=new JTable();
        panel.add(tabla);
        JTextField texto1=new JTextField();
        panel.add(texto1);
        JTextField texto2=new JTextField();
        panel.add(texto2);
        JTextField texto3=new JTextField();
        panel.add(texto3);
        JTextField texto4=new JTextField();
        panel.add(texto4);
     
        
        
        
        
       
}
}