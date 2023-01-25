package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Label;
import java.awt.Panel;

public class DesignEEx1 extends MFrame2{
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	Panel panel1, panel2, panel3;
	
	public DesignEEx1() {
		super(250,150);
		
		Panel p1, p2;
		label = new Label("과일중에 선택", Label.CENTER);
		label.setBackground(Color.green);
		cbg = new CheckboxGroup();
		p1 = new Panel();
		p1.add(cb1 = new Checkbox("사과", cbg, false));
		p1.add(cb2 = new Checkbox("딸기", cbg, true));
		p1.add(cb3 = new Checkbox("포도", cbg, true));
		panel1.setBackground(MColor.rColor());
		add(panel1,BorderLayout.NORTH);
		
		label = new Label("과일중에 선택",Label.CENTER);
		panel1.add(label);
		panel2 = new Panel();
		
		add(panel2,BorderLayout.CENTER);
		setTitle("디자인 예제1");
		
		panel3 = new Panel();
		btn1 = new Button("Start");
		btn2 = new Button("end");
		btn1.setBounds(80, 110, 35, 30);
		btn2.setBounds(120, 110, 35, 30);
		panel3.add(btn1);
		panel3.add(btn2);
		add(panel3,BorderLayout.SOUTH);
		validate();
	}	

	public static void main(String[] args) {
		new DesignEx1();
	}

}

