package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {
		String doYouWantHappy = null;
	
	String areYouHappy = JOptionPane.showInputDialog("Are you happy?"); {
if(areYouHappy.equalsIgnoreCase("Yes")) {
	JOptionPane.showConfirmDialog(null, ("Okay, keep doing what you are doing."));
}else if(areYouHappy.equalsIgnoreCase("No")) {
	doYouWantHappy = JOptionPane.showInputDialog(null, ("Do you want to be happy?"));
}
if(doYouWantHappy.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null,("Then change something."));
}else if(doYouWantHappy.equalsIgnoreCase("No")) {
	JOptionPane.showMessageDialog(null, ("Ok, keep doing the unhappy things then."));
}
}
}
}