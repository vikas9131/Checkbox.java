import java.awt.*;
import java.awt.event.*;
class Mew extends Frame
{
Mew()
{
setLayout(null);
setSize(400,400);
setVisible(true);
Checkbox c1= new Checkbox("c",false);
add(c1);
c1.setBounds(100,100,50,50);
Checkbox c2 =new Checkbox("c++",false);
c2.setBounds(100,200,50,50);
add(c2);
Checkbox c3 =new Checkbox("java",false);
c3.setBounds(100,300,50,50);
add(c3);
Checkbox c4 =new Checkbox("phython",false);
c4.setBounds(100,400,50,50);
add(c4);
addWindowListener(new WindowAdapter() 
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
);
}
public void paint(Graphics g)
{

g.drawString("Which language is best according to you",50,50);
}

public static void main(String []args)
{
Mew m1=new Mew();

}

}
