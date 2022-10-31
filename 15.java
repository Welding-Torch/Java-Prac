import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Q15 extends Frame{
public Q15(){
setTitle("Student Register Form");
JLabel l = new JLabel("Register a new Student");
Font font = new Font("Calibre",Font.BOLD,16);
l.setFont(font);
l.setBounds(100,40,200,60);
add(l);
Label l1 = new Label("Name");
l1.setBounds(40,100,50,30);
add(l1);
TextField t1 = new TextField();
t1.setBounds(180,100,200,30);
add(t1);
Label l2 = new Label("Gender");
l2.setBounds(40,140,50,30);
add(l2);
CheckboxGroup cbg = new CheckboxGroup();
Checkbox cb1 = new Checkbox("Male",cbg,false);
cb1.setBounds(170,140,100,30);
add(cb1);
Checkbox cb2 = new Checkbox("Female",cbg,false);
cb2.setBounds(280,140,100,30);
add(cb2);
Label l3 = new Label("Mail ID");
l3.setBounds(40,180,50,30);
add(l3);
TextField t2 = new TextField();
t2.setBounds(180,180,200,30);
add(t2);
Label l4 = new Label("Mobile No");
l4.setBounds(40,220,70,30);
add(l4);
TextField t3 = new TextField();
t3.setBounds(180,220,200,30);
add(t3);
Label l5 = new Label("Password");
l5.setBounds(40,260,70,30);
add(l5);
JPasswordField jp1 = new JPasswordField();
jp1.setBounds(180,260,200,30);
add(jp1);
Label l6 = new Label("Re Password");
l6.setBounds(40,300,90,30);
add(l6);

JPasswordField jp2 = new JPasswordField();
jp2.setBounds(180,300,200,30);
add(jp2);
Label l7 = new Label("Courses");
l7.setBounds(40,340,90,30);
add(l7);
Choice c1 = new Choice();
c1.setBounds(180,340,200,30);
c1.add("ME/M-TECH");
c1.add("BE/B-TECH");
add(c1);
Label l8 = new Label("Branches");
l8.setBounds(40,380,90,30);
add(l8);
Choice c2 = new Choice();
c2.setBounds(180,380,200,30);
c2.add("CSE");
c2.add("IT");
c2.add("AI&DS");
add(c2);
Label l9 = new Label("Semester");
l9.setBounds(40,420,90,30);
add(l9);
Choice c3 = new Choice();
c3.setBounds(180,420,200,30);
c3.add("I");
c3.add("II");
c3.add("III");
add(c3);
Button b = new Button("REGISTER");
b.setBounds(180,460,200,30);
add(b);
setSize(800,600);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter() {
@Override
public void windowClosing(WindowEvent e) {
dispose();
}
});
}
public static void main(String[] args) {
Q15 r1 = new Q15();
}