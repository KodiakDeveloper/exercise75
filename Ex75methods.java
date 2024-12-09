package bookExercises;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex75methods {

	public void dollarToEuro() {

		DecimalFormat euroFormat = new DecimalFormat("€#,##0.00");

		Double amountDollar, amountEuro;

		amountDollar = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter how many dollars you have; we will use this amount to convert it into euros."));

		if (amountDollar <= 0) {

			JOptionPane.showMessageDialog(null, "Please input a value greater than zero");
		}

		else {

			amountEuro = amountDollar * 0.9466;

			JOptionPane.showMessageDialog(null, "Dollar to Euro: " + euroFormat.format(amountEuro));

		}

	}

	public void euroToDollar() {

		DecimalFormat dollarFormat = new DecimalFormat("$#,##0.00");

		Double amountDollar, amountEuro;

		amountEuro = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter how many Euros you have; we will use this amount to convert it into Dollar."));

		if (amountEuro <= 0) {

			JOptionPane.showMessageDialog(null, "Please input a value greater than zero");

		}

		else {

			amountDollar = amountEuro * 1.0565;

			JOptionPane.showMessageDialog(null, "Euro to Dollar " + dollarFormat.format(amountDollar));

		}

	}

	public void dollarToBritishPound() {

		DecimalFormat britishFormat = new DecimalFormat("£#,##0.00");

		Double amountDollar, amountBritishPound;

		amountDollar = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter how many dollars you have; we will use this amount to convert it into british pound."));

		if (amountDollar <= 0) {

			JOptionPane.showMessageDialog(null, "Please input a value greater than zero");

		}

		else {

			amountBritishPound = amountDollar * 0.7836;

			JOptionPane.showMessageDialog(null, britishFormat.format(amountBritishPound));

		}
	}

	public void britishPoundToDollar() {

		DecimalFormat dollarFormat = new DecimalFormat("$#,##0.00");

		Double amountDollar, amountBritishPound;

		amountBritishPound = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter how many british pound you have; we will use this amount to convert it into Dollar."));

		if (amountBritishPound <= 0) {

			JOptionPane.showMessageDialog(null, "Please input a value greater than zero!");
		}

		else {

			amountDollar = amountBritishPound * 1.2764;

			JOptionPane.showMessageDialog(null, dollarFormat.format(amountDollar));
		}

	}

	public void dollarToYen() {

		DecimalFormat yenFormat = new DecimalFormat("¥#,##0");

		Double amountDollar, amountYen;

		amountDollar = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter how many dollars you have; we will use this amount to convert it into Japanese Yen."));

		if (amountDollar <= 0) {
			JOptionPane.showMessageDialog(null, "Please input a value greater than zero!");
		}

		else {

			amountYen = amountDollar * 151.22;

			JOptionPane.showMessageDialog(null, yenFormat.format(amountYen));
		}

	}

	public void yenToDollar() {

		DecimalFormat dollarFormat = new DecimalFormat("$#,##0.00");

		Double amountDollar, amountYen;

		amountYen = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter how many yen you have; we will use this amount to convert it into Dollar"));

		if (amountYen <= 0) {
			JOptionPane.showMessageDialog(null, "Please input a value greater than zero!");
		}

		else {

			amountDollar = amountYen * 15.122;

			JOptionPane.showMessageDialog(null, dollarFormat.format(amountDollar));
		}

	}

	public void dollarToBrazillianReal() {

		DecimalFormat realFormat = new DecimalFormat("$#,##0.00");

		Double amountDollar, amountReal;

		amountDollar = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter how many dollar you have; we will use this amount to convert it into Brazillian Real"));

		if (amountDollar <= 0) {
			JOptionPane.showMessageDialog(null, "Please input a value greater than zero!");
		}

		else {

			amountReal = amountDollar * 6.08;

			JOptionPane.showMessageDialog(null, realFormat.format(amountReal));
		}

	}

	public void brazillianRealToDollar() {

		DecimalFormat dollarFormat = new DecimalFormat("$#,##0.00");

		Double amountDollar, amountReal;

		amountReal = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter how many Brazillian Real you have; we will use this amount to convert it into Dollar"));

		if (amountReal <= 0) {
			JOptionPane.showMessageDialog(null, "Please input a value greater than zero!");
		}

		else {

			amountDollar = amountReal * 0.16;

			JOptionPane.showMessageDialog(null, dollarFormat.format(amountDollar));
		}
	}
}
