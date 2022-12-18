package _01_else_if._5_own_adventure;

import java.util.zip.CheckedInputStream;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		String begin = JOptionPane.showInputDialog("You are playing video games at around 9:00. It is already dark and impossible to see outside. You then hear banging on the glass door leading to the backyard. If you investigate, type CHECK. If you don't, type anything else.");
		if(begin.equalsIgnoreCase("CHECK")) {
			String checked = JOptionPane.showInputDialog("You carefully approch the glass door and peer outside. First you see nothing. Then a horrifing face slams against the glass looking at you with two glowing yellow eyes. \n The face begins to smile like a maniac showing sharp yellowed teeth. You scramble into the kitchen searching for anything to defend yourself. If you grab the knife, type KNIFE. If you grab the sponge, type SPONGE. If you grab the frying pan, type PAN. If you give up, type anything else.");
			if(checked.equalsIgnoreCase("KNIFE")) {
				JOptionPane.showInputDialog("The monster charged into the room towards you but you stand your ground. As it is about to strike, you drive two knifes into the eyes of the monster. It slumpes to the ground, bleeding from the eyes.\n                                           YOU WIN!");
			if(checked.equalsIgnoreCase("PAN")){
				JOptionPane.showInputDialog("The monster raced into the room. You managed to get behind it and hit it in the back of the head. You hear a sickining crack and the beast slumps to the ground.\n                                           YOU WIN!");
			if(checked.equalsIgnoreCase("SPONGE")){
				JOptionPane.showInputDialog("It's a sponge. What did you think it would do?\n                                           THE MONSTER GETS YOU.");
			}
			}
		}else {
			JOptionPane.showInputDialog("You don't check the door. In a few minutes, the thing makeing the noise breaks through the door.\n                                           THE MONSTER GETS YOU.");
		}
	}
	}
}

