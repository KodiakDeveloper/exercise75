package bookExercises;

import javax.swing.JOptionPane;

public class Ex75 {

	public static void main(String[] args) {

		String userAnswer;

		Ex75methods ex = new Ex75methods();

		int userChoice;

		do {

			userChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
					"CONVERSION" + "\n1 - US Dollar to Euro" + "\n2 - Euro to US Dollar"
							+ "\n3 - US Dollar to British Pound" + "\n4 - British Pound to US Dollar"
							+ "\n5 - US Dollar to Japanese Yen" + "\n6 - Japanese Yen to US Dollar"
							+ "\n7 - US Dollar to Brazilian Real" + "\n8 - Brazillian Real to US Dollar"));

			switch (userChoice) {

			case 1:

				ex.dollarToEuro();

				break;

			case 2:

				ex.euroToDollar();

				break;

			case 3:

				ex.dollarToBritishPound();

				break;

			case 4:

				ex.britishPoundToDollar();

				break;

			case 5:

				ex.dollarToYen();

				break;

			case 6:

				ex.yenToDollar();

				break;

			case 7:

				ex.dollarToBrazillianReal();

				break;

			case 8:

				ex.brazillianRealToDollar();

				break;

			default:

				JOptionPane.showMessageDialog(null, "You have not selected any present currency.");
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
