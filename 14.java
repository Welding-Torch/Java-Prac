//Question no.14
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Main{
public Main()
{
Frame frame = new Frame("Applet program");
Label l1 = new Label("Applet");
l1.setBounds(10,30,50,30);
Label l2 = new Label("Name :");
l2.setBounds(10,60,50,30);
TextField t1 = new TextField();
t1.setBounds(70,60,80,30);
Label l3 = new Label("Address :");
l3.setBounds(10,100,65,30);
TextField t2 = new TextField();
t2.setBounds(80,100,80,30);
Label l4 = new Label("Birthday :");
l4.setBounds(10,140,70,30);
TextField t3 = new TextField();
t3.setBounds(80,140,80,30);
Label l5 = new Label("Gender :");
l5.setBounds(10,180,65,30);
Choice c1 = new Choice();
c1.setBounds(70,180,100,30);
c1.add("Male");
c1.add("Female");
c1.add("Prefer not to say");
Label l6 = new Label("Job :");
l6.setBounds(10,220,30,30);
CheckboxGroup cbg = new CheckboxGroup();
Checkbox cb1 = new Checkbox("Student",cbg,false);
cb1.setBounds(40,220,80,30);
Checkbox cb2 = new Checkbox("Teacher",cbg,false);
cb2.setBounds(120,220,100,30);
Button b1 = new Button("Register");
b1.setBounds(0,260,85,30);
Button b2 = new Button("Exit");
b2.setBounds(86,260,85,30);
Label l7 = new Label("Applet started.");
l7.setBounds(10,550,100,30);
frame.add(l1);
frame.add(l2);
frame.add(t1);
frame.add(l3);
frame.add(t2);
frame.add(l4);
frame.add(t3);
frame.add(l5);
frame.add(c1);
frame.add(l6);
frame.add(cb1);
frame.add(cb2);
frame.add(b1);
frame.add(b2);
frame.add(l7);
frame.setSize(800,600);
frame.setLayout(null);
frame.setVisible(true);
frame.addWindowListener(new WindowAdapter() {
@Override
public void windowClosing(WindowEvent e) {
frame.dispose();
}
});
}
public static void main (String[] args)
{
Main obj1 = new Main();
}
}
