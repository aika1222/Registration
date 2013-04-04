package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Registration extends JFrame{
 JLabel tfdFieldText=new JLabel("数値");
public JButton btnOK=new JButton("決定");
JTextField tfdName=new JTextField("数値を入力");
public String strdate=new String();
Double v=Double(strdate);
double ddt=Math.sin(Math.toRadians(v));

private Registration(){
this.getContentPane().setLayout(new FlowLayout());
JPanel pnlname=new JPanel();
pnlName.add(tfdFieldText);
pnlName.add(tfdName);

this.getContentPane().add(pnlName);
this.getContentPane().add(btnOK);
btnOK.addActionListener(new ActionListener()){
 public void actionPerformed(ActionEvent e){
  setEvent(e);
}
}
protected void setEvent(ActionEvent e){
JOptionPane.showMessageDialog(Registration.this,ddt);
}

/*@param args*/
public static void main(String[] args){
Registration redistration=new Registration();
redistration.setSize(240,200);
redistration.setTitle("count");
redistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
redistration.setVisible(true);
}
}






