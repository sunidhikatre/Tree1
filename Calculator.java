import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
//as
class Calculator extends JFrame implements ActionListener{
	JPanel jp1,jp2;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,be,bc;
	TextField tf;
	ScriptEngineManager mgr;
	ScriptEngine eng;
	Calculator(){
		try{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mgr=new ScriptEngineManager();
		eng=mgr.getEngineByName("JavaScript");
		
		jp1=new JPanel();
		jp2=new JPanel();
		bc=new Button("CLEAR");
		b0=new Button("0");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		ba=new Button("+");
		bs=new Button("-");
		bm=new Button("*");
		bd=new Button("/");
		be=new Button("=");
		tf=new TextField(15);
		tf.setText("");
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		ba.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		be.addActionListener(this);
		bc.addActionListener(this);
		
		jp1.add(tf);
		jp2.setLayout(new GridLayout(5,3,10,10));
		jp2.add(b1);
		jp2.add(b2);
		jp2.add(b3);
		jp2.add(b4);
		jp2.add(b5);
		jp2.add(b6);
		jp2.add(b7);
		jp2.add(b8);
		jp2.add(b9);
		jp2.add(ba);
		jp2.add(b0);
		jp2.add(bs);
		jp2.add(bm);
		jp2.add(bd);
		jp2.add(be);
		
		setLayout(new BorderLayout());
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(bc,BorderLayout.SOUTH);
		setSize(210,420);
		setVisible(true);
		}catch(Exception e){}
	}
	public void actionPerformed(ActionEvent e){
		try{
		Button b=(Button)e.getSource();
		String str;
		if(b==b1){
			str=tf.getText();
			str=str+"1";
			tf.setText(str);
		}
		else if(b==b2){
			str=tf.getText();
			str=str+"2";
			tf.setText(str);
		}
		else if(b==b3){
			str=tf.getText();
			str=str+"3";
			tf.setText(str);
		}
		else if(b==b4){
			str=tf.getText();
			str=str+"4";
			tf.setText(str);
		}
		else if(b==b5){
			str=tf.getText();
			str=str+"5";
			tf.setText(str);
		}
		else if(b==b6){
			str=tf.getText();
			str=str+"6";
			tf.setText(str);
		}
		else if(b==b7){
			str=tf.getText();
			str=str+"7";
			tf.setText(str);
		}
		else if(b==b8){
			str=tf.getText();
			str=str+"8";
			tf.setText(str);
		}
		else if(b==b9){
			str=tf.getText();
			str=str+"9";
			tf.setText(str);
		}
		else if(b==b0){
			str=tf.getText();
			str=str+"0";
			tf.setText(str);
		}
		else if(b==ba){
			str=tf.getText();
			str=str+"+";
			tf.setText(str);
		}
		else if(b==bs){
			str=tf.getText();
			str=str+"-";
			tf.setText(str);
		}
		else if(b==bm){
			str=tf.getText();
			str=str+"*";
			tf.setText(str);
		}
		else if(b==bd){
			str=tf.getText();
			str=str+"/";
			tf.setText(str);
		}
		else if(b==be){
			str=tf.getText();
			str=""+eng.eval(str);
			tf.setText(str);
		}
		else if(b==bc){
			tf.setText("");
		}
		}catch(Exception e1){}
	}
	public static void main(String args[]){
		Calculator c=new Calculator();
	}
}
