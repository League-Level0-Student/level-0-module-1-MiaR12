package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String happyBirthday = JOptionPane.showInputDialog("What day is your birthday? (mm/dd)");
	if(happyBirthday.equals ("10/24")) {
	  JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	else {
	             
	JOptionPane.showMessageDialog(null, "Happy UnBirthday");}

}
}


