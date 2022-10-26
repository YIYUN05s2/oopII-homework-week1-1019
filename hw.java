package ch5hw;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJframe extends JFrame{
	private JPanel P1,P2;
	int sum=2;
	MyJframe(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Picture!");
		setBounds(200,100,800,500);
		
		JPanel P1=new JPanel();
		P1.setLayout(new FlowLayout());
		setContentPane(P1);
		
		//JPanel P2=new JPanel();
		//P2.setLayout(new FlowLayout());
		//setContentPane(P2);
		
		JLabel l1=new JLabel("2.jpg");
		P1.add(l1);

		ImageIcon img1=new ImageIcon("..\\new oop\\src\\ch5hw\\1.jpg");
		JLabel l2=new JLabel(img1);
		l2.setIcon(img1);
		
		ImageIcon img2=new ImageIcon("..\\new oop\\src\\ch5hw\\2.jpg");
		JLabel l3=new JLabel(img2);
		l3.setIcon(img2);
		P1.add(l3);
		
		ImageIcon img3=new ImageIcon("..\\new oop\\src\\ch5hw\\3.jpg");
		JLabel l4=new JLabel(img3);
		l4.setIcon(img3);
		
		JButton b1=new JButton("<");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum-=1;
				if(sum==1) {
					l3.setVisible(false);
					P1.remove(l3);
					P1.add(l2);
					l2.setVisible(true);
					l1.setText("1.jpg");
				}
				else if(sum==2){
					l4.setVisible(false);
					P1.remove(l4);
					P1.add(l3);
					l3.setVisible(true);
					l1.setText("2.jpg");
				}
				else if(sum==3){
					l4.setVisible(false);
					P1.remove(l4);
					P1.add(l4);
					l4.setVisible(true);
					l1.setText("3.jpg");
				}
				else {
					JOptionPane.showMessageDialog(null,"下面沒有照片了哦","警告", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		P1.add(b1);
		
		JButton b2=new JButton(">");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum+=1;
				if(sum==3) {
					l3.setVisible(false);
					P1.remove(l3);
					P1.add(l4);
					l4.setVisible(true);
					l1.setText("3.jpg");
				}
				else if(sum==2){
					l2.setVisible(false);
					P1.remove(l2);
					P1.add(l3);
					l3.setVisible(true);
					l1.setText("2.jpg");
				}
				else if(sum==1) {
					l2.setVisible(false);
					P1.remove(l2);
					P1.add(l2);
					l2.setVisible(true);
					l1.setText("1.jpg");
				}
				else {
					JOptionPane.showMessageDialog(null,"超過照片上限了哦","警告", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		P1.add(b2);
		
		setVisible(true);
		
	}
}
public class hw{
	public static void main(String[] args) {
		MyJframe f1=new MyJframe();
	}
}