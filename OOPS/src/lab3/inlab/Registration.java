package lab3.inlab;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registration extends JFrame implements ActionListener

{

JLabel l1, l2, l3,l4,l5;

JTextField tf1, tf2;

JRadioButton Male,Female;

JButton btn1, btn2;

JPanel panel;

JComboBox <String>cb;

Registration()

{

String[] petStrings = { "","BT", "CE", "CSE", "ECE", "EEE", "ECM","ME","PE" };

setVisible(true);

setSize(700, 700);

setLayout(null);

panel = new JPanel();

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setTitle("Student Registration Form in Java");

l1 = new JLabel("Student Registration Form in Java");

l1.setForeground(Color.blue);

l1.setFont(new Font("Serif", Font.BOLD, 20));

l2 = new JLabel("Name:");

l3 = new JLabel("ID :");

l4 = new JLabel("Gender :");

l5 = new JLabel("Branch :");

ButtonGroup buttonGroup = new ButtonGroup();

Male = new JRadioButton("Male");

buttonGroup.add(Male);

panel.add(Male);

Female = new JRadioButton("Female");

buttonGroup.add(Female);

Male.setSelected(true);

panel.add(Female);

cb = new JComboBox<String>(petStrings);

cb.setSelectedIndex(0);

tf1 = new JTextField("");

tf2 = new JTextField("");

btn1 = new JButton("Submit");

btn2 = new JButton("Clear");

btn1.addActionListener(this);

btn2.addActionListener(this);

cb.addActionListener(this);

l1.setBounds(100, 30, 400, 30);

l2.setBounds(80, 70, 200, 30);

l3.setBounds(80, 110, 200, 30);

l4.setBounds(80, 140, 200, 30);

l5.setBounds(80, 190, 200, 30);

tf1.setBounds(300, 70, 200, 30);

tf2.setBounds(300, 110, 200, 30);

panel.setBounds(300,140,200,30);

cb.setBounds(300, 190, 200, 30);

btn1.setBounds(80, 230, 100, 30);

btn2.setBounds(300, 230, 100, 30);

add(l1);

add(l2);

add(tf1);

add(l3);

add(tf2);

add(l3);

add(tf2);

add(l4);

add(panel);

add(l5);

add(cb);

add(btn1);

add(btn2);

setBounds(50,20,600,400);

}

public void actionPerformed(ActionEvent e)

{

if (e.getSource() == btn1)

{

String st1="",st2="",st3="",st4="";

st1 = tf1.getText();

if(st1.equals(""))

{

JOptionPane.showMessageDialog(this,"Enter Name");

return;

}

st2 = tf2.getText();

if(st2.equals(""))

{

JOptionPane.showMessageDialog(this,"Enter ID");

return;

}

if(Male.isSelected())

st3 = Male.getText();

if(Female.isSelected())

st3 = Female.getText();

st4 = (String)cb.getSelectedItem();

if(st4.equals(""))

{

JOptionPane.showMessageDialog(this,"Select Branch");

return;

}

JOptionPane.showMessageDialog(this,"Name : "+ st1+"\nID :"+st2+"\nGender :"+st3+"\nDepartment :"+st4);

}

else if(e.getSource()==btn2)

{

tf1.setText("");

tf2.setText("");

cb.setSelectedIndex(0);

Male.setSelected(true);

}

}

public static void main(String args[])

{

new Registration();

}

}