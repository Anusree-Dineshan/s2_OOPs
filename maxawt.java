package s2java;
import java.awt.*;
import java.net.*;
import java.awt.event.*;
class maxawt extends Frame {
	TextField tf1;
	TextField tf2;
	TextField tf3;
	TextField tf4;
	Label l1,l2,l3,l4;
	Button b,b1;
	maxawt() {
		setTitle("MAXIMUM");
		
		tf1=new TextField();
		l1=new Label("Enter First Number");
		l1.setBounds(100,45,145,20);
		tf1.setBounds(115,75,135,40);
		
		tf2=new TextField();
		l2=new Label("Enter Second Number");
		l2.setBounds(110,110,135,25);
		tf2.setBounds(100,145,145,20);
		
		tf3=new TextField();
		l3=new Label("Enter Third Number");
		l3.setBounds(120,170,125,30);
		tf3.setBounds(140,200,165,50);
		
		tf4=new TextField();
		l4=new Label("");
		l4.setBounds(133,240,145,30);
		tf4.setBounds(105,250,135,20);
		
		b=new Button("FIND");
		b.setBounds(105,278,70,40);
		
		b1=new Button("EXIT");
		b1.setBounds(195,278,70,40);
		
		add(b);
		add(b1);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(l4);
		add(tf4);
		
		setSize(400,400);
		setVisible(true);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(tf1.getText());
				int b=Integer.parseInt(tf2.getText());
				int c=Integer.parseInt(tf3.getText());
				
				if(a>b && a>c)
				{
					l4.setText("MAXIMUM =" + String.valueOf(a));
				}
				else if(b>c)
				{
                    l4.setText("MAXIMUM =" + String.valueOf(b));
                  }
              else
                {
                     l4.setText("MAXIMUM =" + String.valueOf(c));
                }
          }
       });

b1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
       System.exit(0);
   }
});
}
public static void main(String []args) {
new maxawt();
}
}
				
		
		
		
	