//---------------------------------------------------------------------------------------------------------VENTANA
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Triangle_Box extends JFrame {
	
	public Triangle_Box(){
		super("Getting triangle area");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelExtra pe = new PanelExtra();
		this.add(pe);
		this.add(new ConfiguracionPanel(pe), BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) { 
		 Triangle_Box ep = new Triangle_Box();
	 }
	
	
	

//-------------------------------------------------------------------------------------------------------CONTROLES
//Clase Configuracion
class ConfiguracionPanel extends JPanel implements ActionListener{
	
	private PanelExtra pd = new PanelExtra();
	
	private JLabel x1_label,
				   x2_label,
				   x3_label,
				   y1_label,
				   y2_label,
				   y3_label,
				   area_label;
	

	private JTextField x1_tf,
					   x2_tf,
					   x3_tf,
					   y1_tf,
					   y2_tf,
					   y3_tf;

	private JButton btnCalcula;
	
	public ConfiguracionPanel(PanelExtra pd){
		super();
		this.pd = pd;
		this.setPreferredSize(new Dimension(200,800));
		this.setBackground(Color.GRAY);
		
		//New
		this.x1_label = new JLabel("x1");
		this.x2_label= new JLabel("x2");
		this.x3_label = new JLabel("x3");
		this.y1_label = new JLabel("y1");
		this.y2_label= new JLabel("y2");
		this.y3_label = new JLabel("y3");
		this.area_label = new JLabel("y3");
		
		this.x1_tf = new JTextField(10);
		this.x2_tf = new JTextField(10);
		this.x3_tf = new JTextField(10);
		this.y1_tf = new JTextField(10);
		this.y2_tf = new JTextField(10);
		this.y3_tf = new JTextField(10);
		
		
		
		

		this.btnCalcula=new JButton("Calcula Area");
		this.btnCalcula.addActionListener(this);
		
		//Add		
        
		this.add(x1_label);
		this.add(x1_tf);
				
		this.add(y1_label);
		this.add(y1_tf);
			
		this.add(x2_label);
		this.add(x2_tf);
		
		this.add(y2_label);
		this.add(y2_tf);

		
		this.add(x3_label);
		this.add(x3_tf);
		
		this.add(y3_label);
		this.add(y3_tf);
		
		this.add(btnCalcula);
		
		this.add(area_label);
		
		x1_label.setLocation(50, 20);
		x2_label.setLocation(100, 20);
		x3_label.setLocation(50, 20);
		y1_label.setLocation(50, 20);
		y2_label.setLocation(50, 20);
		y3_label.setLocation(50, 20);
	}

	public void actionPerformed(ActionEvent e) {
		
		
		Triangle tri = new Triangle(Double.parseDouble(x1_tf.getText()),Double.parseDouble(x2_tf.getText()), Double.parseDouble(x3_tf.getText()), Double.parseDouble(y1_tf.getText()), Double.parseDouble(y2_tf.getText()), Double.parseDouble(y3_tf.getText()));
				area_label.setText("Area: " + String.valueOf(tri.get_Area()));   //Concatenar area
			}
			
	}		
}


//-------------------------------------------------------------------------------------------------------------PANEL	
//Clase 
class PanelExtra extends JPanel {


	public PanelExtra(){
		super();
		
		this.setPreferredSize(new Dimension(800, 800));
	}
	
	
//Llama metodos
	public void paintComponent(Graphics g) { 
		super.paintComponent(g); 
		this.Pinta_Triangulo(g);
	 }
	
//Setters
	/*
	public void set_x1(int x1){
		this.x1 = x1;
		repaint();
	}
	
	public void set_x2(int x2){
		this.x2 = x2;
		repaint();
	}
	
	public void set_x3(int x3){
		this.x3 = x3;
		repaint();
	}
	
	public void set_y1(int y1){
		this.y1 = y1;
		repaint();
	}
	
	public void set_y2(int y2){
		this.y2 = y2;
		repaint();
	}
	
	public void set_y3(int y3){
		this.y3 = y3;
		repaint();
	}
	*/
	
//Pinta_Triangulo
	public void Pinta_Triangulo(Graphics g){
		/*
	 	g.setColor(Color.BLACK);
	 	g.drawLine(tri.v1.get_x(), tri.v1.get_y(), tri.v2.get_x(), tri.v2.get_y());
	 	g.drawLine(tri.v2.get_x(), tri.v2.get_y(), tri.v3.get_x(), tri.v3.get_y());
	 	g.drawLine(tri.v3.get_x(), tri.v3.get_y(), tri.v1.get_x(), tri.v1.get_y());
	 	*/
	}
	

}

 
