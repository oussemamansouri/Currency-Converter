package nouha;

import java.awt.*;
import java.awt.event.*;
public class Tunis implements ActionListener {
	
	
	Frame F;
	TextField T1,T2;
	Button B,B2;	
	Choice ch;
	Panel P1,P2 ;
	Label l1 ;
	
	public Tunis(){
	F=new Frame("conversion des monnaies");
	T1=new TextField("valeur");
	ch=new Choice();

	T1.setSize(50,40);
	B=new Button("convert");
	B2=new Button("Annuler");
	T2=new TextField("    ");
	T2.setSize(50,40);
	P1=new Panel(new FlowLayout());
	P2=new Panel(new FlowLayout());	
	F.setSize(450,300);
	F.setLayout(new BorderLayout());
	l1=new Label ("TND");
		
	}
	public void creer_interface() {
	P1.add(T1);
	T1.selectAll();
	ch.add("EURO");
	ch.add("DOLLAR");
	P1.add(ch);
	P1.add(B);
	T2.setEditable(false);
	P1.add(T2);
	P1.add(l1);
	B.addActionListener(this);
	F.addWindowListener(new Fermer1());
	B2.addActionListener(this);
	P2.add(B2);
	F.add(P1,BorderLayout.NORTH);
	F.add(P2,BorderLayout.SOUTH);	
	
	F.show();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==B) {
			Double v1=Double.parseDouble(T1.getText());
			if (ch.getSelectedItem()=="EURO") {
			T2.setText(String.valueOf(v1*3.26))	;	
			}
			else {
				T2.setText(String.valueOf(v1*2.88));
			}
		}
		else 
		if(e.getSource()==B2) {
			T2.setText("0");
			T1.setText("0");
			ch.select(0);	
		}
		
	}
	
public static void main(String[] args) {
Tunis i=new Tunis();
	i.creer_interface();
	
	
}

}

class Fermer1 extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

