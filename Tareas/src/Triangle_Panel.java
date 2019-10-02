
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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Triangle_Panel extends JFrame {
	
	public Triangle_Panel(){
		super("Getting triangle area");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelExtra pe = new PanelExtra();
		this.add(pe);
		this.add(new ConfiguracionPanel(pe), BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) { 
		 Triangle_Panel ep = new Triangle_Panel();
	 }
	
	
	
	
//Clase de la Espiral
class PanelExtra extends JPanel {
	private int lados;
	private int radio;
	private int vertices;
	private int centro;

	public PanelExtra(){
		super();
		this.lados = 18;
		this.radio = 200;
		this.vertices = 8;
		this.centro = 400;
		this.setPreferredSize(new Dimension(800, 800));
	}
	
	
//Llama metodos
	public void paint(Graphics g) { // Espiral
		super.paintComponent(g); 
		this.Poligono(g);
	 }
	
//Setters
	public void set_x1(int vertices){
		this.vertices = vertices;
		repaint();
	}
	
	public void set_x2(int radio){
		this.radio = radio;
		repaint();
	}
	
	public void set_x3(int lados){
		this.lados = lados;
		repaint();
	}
	
	public void set_y1(int vertices){
		this.vertices = vertices;
		repaint();
	}
	
	public void set_y2(int radio){
		this.radio = radio;
		repaint();
	}
	
	public void set_y3(int lados){
		this.lados = lados;
		repaint();
	}
	
//Poligono
	public void Poligono(Graphics g){
		/*
	 	g.setColor(Color.BLACK);
	 	g.drawLine(int x1, int y1, int x2, int y2);
	 	g.drawLine(int x2, int y2, int x3, int y3);
	 	g.drawLine(int x3, int y3, int x1, int y1);
	 	*/
	}
	

}


//Clase Configuracion
class ConfiguracionPanel extends JPanel implements ChangeListener{
	private PanelExtra pd = new PanelExtra();
	
	private JLabel x1_label,
				   x2_label,
				   x3_label,
				   y1_label,
				   y2_label,
				   y3_label;
					
	
	
	private JSlider x1_slider,
					x2_slider,
					x3_slider,
					y1_slider,
					y2_slider,
					y3_slider;
	
	
	private JButton btconfigurar;
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

		
		//x1_slider
		this.x1_slider = new JSlider(JSlider.VERTICAL, 0, 200, 0);
        this.x1_slider.setMinorTickSpacing(10);
        this.x1_slider.setMajorTickSpacing(40);
        this.x1_slider.setPaintTicks(true);
        this.x1_slider.setPaintLabels(true);
        this.x1_slider.addChangeListener(this);
        
        
        //x2_slider
        this.x2_slider = new JSlider(JSlider.VERTICAL, 0, 200, 0);
        this.x2_slider.setMinorTickSpacing(10);
        this.x2_slider.setMajorTickSpacing(40);
        this.x2_slider.setPaintTicks(true);
        this.x2_slider.setPaintLabels(true);
        this.x2_slider.addChangeListener(this);
        
        //x3_slider
        this.x3_slider = new JSlider(JSlider.VERTICAL, 0, 200, 0);
        this.x3_slider.setMinorTickSpacing(10);
        this.x3_slider.setMajorTickSpacing(40);
        this.x3_slider.setPaintTicks(true);
        this.x3_slider.setPaintLabels(true);
        this.x3_slider.addChangeListener(this);
        
      //y1_slider
		this.y1_slider = new JSlider(JSlider.VERTICAL, 0, 200, 0);
        this.y1_slider.setMinorTickSpacing(10);
        this.y1_slider.setMajorTickSpacing(40);
        this.y1_slider.setPaintTicks(true);
        this.y1_slider.setPaintLabels(true);
        this.y1_slider.addChangeListener(this);
        
        
        //y2_slider
        this.y2_slider = new JSlider(JSlider.VERTICAL, 0, 200, 0);
        this.y2_slider.setMinorTickSpacing(10);
        this.y2_slider.setMajorTickSpacing(40);
        this.y2_slider.setPaintTicks(true);
        this.y2_slider.setPaintLabels(true);
        this.y2_slider.addChangeListener(this);
        
        //y3_slider
        this.y3_slider = new JSlider(JSlider.VERTICAL, 0, 200, 0);
        this.y3_slider.setMinorTickSpacing(10);
        this.y3_slider.setMajorTickSpacing(40);
        this.y3_slider.setPaintTicks(true);
        this.y3_slider.setPaintLabels(true);
        this.y3_slider.addChangeListener(this);
        
		
		//Add		
        
		this.add(x1_label);
		this.add(this.x1_slider);
		
		this.add(x2_label);
		this.add(this.x2_slider);

		
		this.add(x3_label);
		this.add(this.x3_slider);
		
		this.add(y1_label);
		this.add(this.y1_slider);
		
		this.add(y2_label);
		this.add(this.y2_slider);

		
		this.add(y3_label);
		this.add(this.y3_slider);
				
	}
	
	public void stateChanged(ChangeEvent e) {
		this.pd.set_x1(this.x1_slider.getValue());
		this.pd.set_x2(this.x2_slider.getValue());
		this.pd.set_x3(this.x3_slider.getValue());
		this.pd.set_y1(this.y1_slider.getValue());
		this.pd.set_y2(this.y2_slider.getValue());
		this.pd.set_y3(this.y3_slider.getValue());
	}
	
}
 
}