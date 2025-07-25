package io.github.boettgi14;

import java.util.ArrayList;

public class DartsScorer {

	// Spielparameter
	private int initialScore;
	private int ending;
	private int initialSets;
	private int sets;
	private int initialLegs;
	private int legs;

	// Spieler 1
	private int player1Score;
	private int player1Sets;
	private int player1Legs;
	private int player1ThrowsLeft;
	private ArrayList<Double> player1AverageAL;
	private double player1Average;
	private String player1Factor1;
	private String player1Points1;
	private String player1Factor2;
	private String player1Points2;
	private String player1Factor3;
	private String player1Points3;

	// Spieler 2
	private int player2Score;
	private int player2Sets;
	private int player2Legs;
	private int player2ThrowsLeft;
	private ArrayList<Double> player2AverageAL;
	private double player2Average;
	private String player2Factor1;
	private String player2Points1;
	private String player2Factor2;
	private String player2Points2;
	private String player2Factor3;
	private String player2Points3;

	// Punkte die einen Wurf fuer einen Checkout darstellen
	private int[] checkoutNumbers = {
			60, 57, 54, 51, 48, 45, 42, 39, 36, 33, 30, 27, 24, 21, 18, 15, 12, 9, 6, 3, // Triples 0-19
			50, 40, 38, 36, 34, 32, 30, 28, 26, 24, 22, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2, // Doubles 20-41
			25, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 // Singles 42-53
	};

	/**
	 * Initialisierung eines Dartspiels fuer 2 Spieler.
	 * 
	 * @param initialScore der Score der beim Spielen auf 0 gesetzt werden muss
	 * @param ending       der noetige Checkout/Endwurf um den Score auf 0 zu setzen
	 *                     (1 fuer Straight-Out, 2 fuer Double-Out, 3 für
	 *                     Master-Out)
	 * @param initialSets  die Anzahl der Sets die erreicht werden muss um das Spiel
	 *                     zu gewinnen
	 * @param initialLegs  die Anzahl der Legs die erreicht werden muss um ein Set
	 *                     zu gewinnen
	 */
	public DartsScorer(int initialScore, int ending, int initialSets, int initialLegs) {
		// Spielparamter
		this.initialScore = initialScore;
		this.ending = ending;
		this.initialSets = initialSets;
		this.sets = initialSets;
		this.initialLegs = initialLegs;
		this.legs = initialLegs;

		// Spieler 1
		this.player1Score = initialScore;
		player1ThrowsLeft = 3;
		player1AverageAL = new ArrayList<Double>();
		player1Average = 0;
		player1Factor1 = "X";
		player1Points1 = "X";
		player1Factor2 = "X";
		player1Points2 = "X";
		player1Factor3 = "X";
		player1Points3 = "X";

		// Spieler 2
		this.player2Score = initialScore;
		player2ThrowsLeft = 0;
		player2AverageAL = new ArrayList<Double>();
		player2Average = 0;
		player2Factor1 = "X";
		player2Points1 = "X";
		player2Factor2 = "X";
		player2Points2 = "X";
		player2Factor3 = "X";
		player2Points3 = "X";
	}

	/**
	 * Registrierung eines Wurfs mit Pruefung ob Punktzahl nicht unterworfen wurde
	 * und ob noetiger Endwurf erfuellt wurde.
	 * Wenn Score auf 0 gesetzt wird, werden Sets und Legs des Spielers angepasst.
	 * 
	 * @param player     die Kennung des Spielers der geworfen hat (1 oder 2)
	 * @param points     die beim Wurf erzielten Punkte ohne Faktor
	 * @param multiplier der Faktor der beim Wurf erzielt wurde (1 fuer Single, 2
	 *                   fuer Double, 3 fuer Triple)
	 * @return true, wenn der Wurf erfolgreich war und false, wenn nicht
	 */
	public boolean scoreThrow(int player, int points, int multiplier) {
		int score = points * multiplier; // score ist zusammengerechnete Punktzahl des Wurfes
		if (player == 1) { // Spieler 1
			switch (ending) { // Pruefung welches Ende erreicht werden muss
				case 1: // Straight-Out
					if (player1Score - score >= 0) { // Wurf setzt Score nicht auf 0
						player1Score = player1Score - score;
						if (player1Score == 0) { // Wurf setzt Score auf 0
							player1Legs = player1Legs + 1;
							player1ThrowsLeft = 0;
							player1Score = initialScore;
							player2Score = initialScore;
							if (player1Legs == initialLegs) { // noetige Legs fuer Set erreicht
								player1Sets = player1Sets + 1;
								player1Legs = 0;
								player2Legs = 0;
								player1Score = initialScore;
								player2Score = initialScore;
							}
						}
						return true; // Wurf erfolgreich
					} else {
						return false; // Wurf nicht erfolgreich
					}
				case 2: // Double-Out
					if (player1Score - score >= 2) { // Wurf setzt Score nicht auf 0
						player1Score = player1Score - score;
						return true; // Wurf erfolgreich
					} else if (player1Score - score == 0 && multiplier == 2) { // noetiger Faktor fuer Spielende
																				// erreicht
						player1Score = player1Score - score;
						if (player1Score == 0) { // Wurf setzt Score auf 0
							player1Legs = player1Legs + 1;
							player1ThrowsLeft = 0;
							player1Score = initialScore;
							player2Score = initialScore;
							if (player1Legs == initialLegs) { // noetige Legs fuer Set erreicht
								player1Sets = player1Sets + 1;
								player1Legs = 0;
								player2Legs = 0;
								player1Score = initialScore;
								player2Score = initialScore;
							}
						}
						return true; // Wurf erfolgreich
					} else {
						return false; // Wurf nicht erfolgreich
					}
				case 3: // Master-Out
					if (player1Score - score >= 2) { // Wurf setzt Score nicht auf 0
						player1Score = player1Score - score;
						return true; // Wurf erfolgreich
					} else if (player1Score - score == 0 && multiplier >= 2) { // noetiger Faktor fuer Spielende
																				// erreicht
						player1Score = player1Score - score;
						if (player1Score == 0) { // Wurf setzt Score auf 0
							player1Legs = player1Legs + 1;
							player1ThrowsLeft = 0;
							player1Score = initialScore;
							player2Score = initialScore;
							if (player1Legs == initialLegs) { // noetige Legs fuer Set erreicht
								player1Sets = player1Sets + 1;
								player1Legs = 0;
								player2Legs = 0;
								player1Score = initialScore;
								player2Score = initialScore;
							}
						}
						return true; // Wurf erfolgreich
					} else {
						return false; // Wurf nicht erfolgreich
					}
				default:
					return false;
			}
		} else { // Spieler 2
			switch (ending) { // Pruefung welches Ende erreicht werden muss
				case 1: // Straight-Out
					if (player2Score - score >= 0) { // Wurf setzt Score nicht auf 0
						player2Score = player2Score - score;
						if (player2Score == 0) { // Wurf setzt Score auf 0
							player2Legs = player2Legs + 1;
							player1Score = initialScore;
							player2Score = initialScore;
							if (player2Legs == initialLegs) { // noetige Legs fuer Set erreicht
								player2Sets = player2Sets + 1;
								player1Legs = 0;
								player2Legs = 0;
								player1Score = initialScore;
								player2Score = initialScore;
							}
						}
						return true; // Wurf erfolgreich
					} else {
						return false; // Wurf nicht erfolgreich
					}
				case 2: // Double-Out
					if (player2Score - score >= 2) { // Wurf setzt Score nicht auf 0
						player2Score = player2Score - score;
						return true; // Wurf erfolgreich
					} else if (player2Score - score == 0 && multiplier == 2) { // noetiger Faktor fuer Spielende
																				// erreicht
						player2Score = player2Score - score;
						if (player2Score == 0) { // Wurf setzt Score auf 0
							player2Legs = player2Legs + 1;
							player2ThrowsLeft = 0;
							player1Score = initialScore;
							player2Score = initialScore;
							if (player2Legs == initialLegs) { // noetige Legs fuer Set erreicht
								player2Sets = player2Sets + 1;
								player1Legs = 0;
								player2Legs = 0;
								player1Score = initialScore;
								player2Score = initialScore;
							}
						}
						return true; // Wurf erfolgreich
					} else {
						return false; // Wurf nicht erfolgreich
					}
				case 3: // Master-Out
					if (player2Score - score >= 2) { // Wurf setzt Score nicht auf 0
						player2Score = player2Score - score;
						return true; // Wurf erfolgreich
					} else if (player2Score - score == 0 && multiplier >= 2) { // noetiger Faktor fuer Spielende
																				// erreicht
						player2Score = player2Score - score;
						if (player2Score == 0) { // Wurf setzt Score auf 0
							player2Legs = player2Legs + 1;
							player2ThrowsLeft = 0;
							player1Score = initialScore;
							player2Score = initialScore;
							if (player2Legs == initialLegs) { // noetige Legs fuer Set erreicht
								player2Sets = player2Sets + 1;
								player1Legs = 0;
								player2Legs = 0;
								player1Score = initialScore;
								player2Score = initialScore;
							}
						}
						return true; // Wurf erfolgreich
					} else {
						return false; // Wurf nicht erfolgreich
					}
				default:
					return false;
			}
		}
	}

	/**
	 * Errechnen des Checkouts/der noetigen Wuerfe, um den jeweiligen Score beider
	 * Spieler, abhaengig von dem jeweiligen Ending, auf 0 zu setzen.
	 * Setzt den jeweiligen Faktor und die Punktzahl der 3 Wuerfe fest.
	 * Bei zu hohem Score um diesen mit 3 Wuerfen auf 0 zu setzen oder wenn weniger
	 * als 3 Wuerfe noetig sind um den Score auf 0 zu setzen, werden die Variablen
	 * auf "X" gesetzt.
	 */
	public void checkoutCalculator() {
		if (ending == 1 && player1Score <= 180) { // Straight-Out fuer Spieler 1
			int tmpScore = player1Score; // Score des Spielers
			ArrayList<Integer> tmpArray = new ArrayList<Integer>(); // Array fuer Checkout-Punktzahlen
			for (int k = 1; k <= 3; k++) { // 3 Wuerfe
				tmpArray.clear();
				if (tmpScore == 0) { // weniger als 3 Wuerfe fuer Checkout noetig
					if (k == 2) { // Ende bei 2. Wurf
						player1Factor2 = "X";
						player1Points2 = "X";
						player1Factor3 = "X";
						player1Points3 = "X";
					} else if (k == 3) { // Ende bei 3. Wurf
						player1Factor3 = "X";
						player1Points3 = "X";
					}
				}
				for (int m = 0; m < checkoutNumbers.length; m++) { // Eintragen moeglicher Checkout-Punktzahlen in Array
					if (checkoutNumbers[m] <= tmpScore) {
						tmpArray.add(m);
					}
				}
				for (int n = 0; n < tmpArray.size(); n++) { // Setzen von Faktor und Punkten fuer Wurf
					if (checkoutNumbers[tmpArray.get(n)] % 3 == 0) { // Triple
						if (k == 1) { // 1. Wurf
							player1Factor1 = "Triple";
							player1Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						} else if (k == 2) { // 2. Wurf
							player1Factor2 = "Triple";
							player1Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						} else if (k == 3) { // 3. Wurf
							player1Factor3 = "Triple";
							player1Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						}
					} else if (checkoutNumbers[tmpArray.get(n)] % 2 == 0) { // Double
						if (k == 1) { // 1. Wurf
							player1Factor1 = "Double";
							player1Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 2) { // 2. Wurf
							player1Factor2 = "Double";
							player1Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 3) { // 3. Wurf
							player1Factor3 = "Double";
							player1Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						}
					} else if (checkoutNumbers[tmpArray.get(n)] % 1 == 0) { // Single
						if (k == 1) { // 1. Wurf
							player1Factor1 = "Single";
							player1Points1 = "" + checkoutNumbers[tmpArray.get(n)];
						} else if (k == 2) { // 2. Wurf
							player1Factor2 = "Single";
							player1Points2 = "" + checkoutNumbers[tmpArray.get(n)];
						} else if (k == 3) { // 3. Wurf
							player1Factor3 = "Single";
							player1Points3 = "" + checkoutNumbers[tmpArray.get(n)];
						}
					}
					tmpScore = tmpScore - checkoutNumbers[tmpArray.get(n)]; // uebrigen Score anpassen
					n = tmpArray.size(); // Schleife beenden
				}
			}
		} else if (ending == 2 && player1Score <= 170) { // Double-Out fuer Spieler 1
			int tmpScore = player1Score; // Score des Spielers
			ArrayList<Integer> tmpArray = new ArrayList<Integer>(); // Array fuer Checkout-Punktzahlen
			for (int k = 1; k <= 3; k++) { // 3 Wuerfe
				tmpArray.clear();
				if (tmpScore == 0) { // weniger als 3 Wuerfe fuer Checkout noetig
					if (k == 2) { // Ende bei 2. Wurf
						player1Factor2 = "X";
						player1Points2 = "X";
						player1Factor3 = "X";
						player1Points3 = "X";
					} else if (k == 3) { // Ende bei 3. Wurf
						player1Factor3 = "X";
						player1Points3 = "X";
					}
				}
				for (int m = 0; m < checkoutNumbers.length; m++) { // Eintragen moeglicher Checkout-Punktzahlen in Array
					if (checkoutNumbers[m] <= tmpScore) {
						tmpArray.add(m);
					}
				}
				for (int n = 0; n < tmpArray.size(); n++) { // Setzen von Faktor und Punkten fuer Wurf
					if ((tmpScore - checkoutNumbers[tmpArray.get(n)]) == 0
							&& (checkoutNumbers[tmpArray.get(n)] % 2) == 0) { // Wurf setzt Score auf 0 mit Doppel-Out
						if (k == 1) { // 1. Wurf
							player1Factor1 = "Double";
							player1Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 2) { // 2. Wurf
							player1Factor2 = "Double";
							player1Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 3) { // 3. Wurf
							player1Factor3 = "Double";
							player1Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						}
						tmpScore = tmpScore - checkoutNumbers[tmpArray.get(n)]; // uebrigen Score anpassen
						n = tmpArray.size(); // Schleife beenden
					} else if ((tmpScore - checkoutNumbers[tmpArray.get(n)]) != 0
							&& ((tmpScore - checkoutNumbers[tmpArray.get(n)]) % 2) == 0) { // Wurf setzt Score nicht auf
																							// 0 und ermoeglicht
																							// Doppel-Out
						if (checkoutNumbers[tmpArray.get(n)] % 3 == 0) { // Triple
							if (k == 1) { // 1. Wurf
								player1Factor1 = "Triple";
								player1Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
							} else if (k == 2) { // 2. Wurf
								player1Factor2 = "Triple";
								player1Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
							} else if (k == 3) { // 3. Wurf
								player1Factor3 = "Triple";
								player1Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
							}
						} else if (checkoutNumbers[tmpArray.get(n)] % 2 == 0) { // Double
							if (k == 1) { // 1. Wurf
								player1Factor1 = "Double";
								player1Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
							} else if (k == 2) { // 2. Wurf
								player1Factor2 = "Double";
								player1Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
							} else if (k == 3) { // 3. Wurf
								player1Factor3 = "Double";
								player1Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
							}
						} else if (checkoutNumbers[tmpArray.get(n)] % 1 == 0) { // Single
							if (k == 1) { // 1. Wurf
								player1Factor1 = "Single";
								player1Points1 = "" + checkoutNumbers[tmpArray.get(n)];
							} else if (k == 2) { // 2. Wurf
								player1Factor2 = "Single";
								player1Points2 = "" + checkoutNumbers[tmpArray.get(n)];
							} else if (k == 3) { // 3. Wurf
								player1Factor3 = "Single";
								player1Points3 = "" + checkoutNumbers[tmpArray.get(n)];
							}
						}
						tmpScore = tmpScore - checkoutNumbers[tmpArray.get(n)]; // uebrigen Score anpassen
						n = tmpArray.size(); // Schleife beenden
					}
				}
			}
		} else if (ending == 3 && player1Score <= 180) { // Master-Out fuer Spieler 1
			int tmpScore = player1Score; // Score des Spielers
			ArrayList<Integer> tmpArray = new ArrayList<Integer>(); // Array fuer Checkout-Punktzahlen
			for (int k = 1; k <= 3; k++) { // 3 Wuerfe
				tmpArray.clear();
				if (tmpScore == 0) { // weniger als 3 Wuerfe fuer Checkout noetig
					if (k == 2) { // Ende bei 2. Wurf
						player1Factor2 = "X";
						player1Points2 = "X";
						player1Factor3 = "X";
						player1Points3 = "X";
					} else if (k == 3) { // Ende bei 3. Wurf
						player1Factor3 = "X";
						player1Points3 = "X";
					}
				}
				for (int m = 0; m <= 41; m++) { // Eintragen moeglicher Checkout-Punktzahlen ohne Singles in Array
					if (checkoutNumbers[m] <= tmpScore) {
						tmpArray.add(m);
					}
				}
				for (int n = 0; n < tmpArray.size(); n++) { // Setzen von Faktor und Punkten fuer Wurf
					if (checkoutNumbers[tmpArray.get(n)] % 3 == 0) { // Triple
						if (k == 1) { // 1. Wurf
							player1Factor1 = "Triple";
							player1Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						} else if (k == 2) { // 2. Wurf
							player1Factor2 = "Triple";
							player1Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						} else if (k == 3) { // 3. Wurf
							player1Factor3 = "Triple";
							player1Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						}
					} else if (checkoutNumbers[tmpArray.get(n)] % 2 == 0) { // Double
						if (k == 1) { // 1. Wurf
							player1Factor1 = "Double";
							player1Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 2) { // 2. Wurf
							player1Factor2 = "Double";
							player1Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 3) { // 3. Wurf
							player1Factor3 = "Double";
							player1Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						}
					}
					tmpScore = tmpScore - checkoutNumbers[tmpArray.get(n)]; // uebrigen Score anpassen
					n = tmpArray.size(); // Schleife beenden
				}
			}
		} else { // Checkout fuer Spieler 1 nicht moeglich
			player1Factor1 = "X";
			player1Points1 = "X";
			player1Factor2 = "X";
			player1Points2 = "X";
			player1Factor3 = "X";
			player1Points3 = "X";
		}
		if (ending == 1 && player2Score <= 180) { // Straight-Out fuer Spieler 2
			int tmpScore = player2Score; // Score des Spielers
			ArrayList<Integer> tmpArray = new ArrayList<Integer>(); // Array fuer Checkout-Punktzahlen
			for (int k = 1; k <= 3; k++) { // 3 Wuerfe
				tmpArray.clear();
				if (tmpScore == 0) { // weniger als 3 Wuerfe fuer Checkout noetig
					if (k == 2) { // Ende bei 2. Wurf
						player2Factor2 = "X";
						player2Points2 = "X";
						player2Factor3 = "X";
						player2Points3 = "X";
					} else if (k == 3) { // Ende bei 3. Wurf
						player2Factor3 = "X";
						player2Points3 = "X";
					}
				}
				for (int m = 0; m < checkoutNumbers.length; m++) { // Eintragen moeglicher Checkout-Punktzahlen in Array
					if (checkoutNumbers[m] <= tmpScore) {
						tmpArray.add(m);
					}
				}
				for (int n = 0; n < tmpArray.size(); n++) { // Setzen von Faktor und Punkten fuer Wurf
					if (checkoutNumbers[tmpArray.get(n)] % 3 == 0) { // Triple
						if (k == 1) { // 1. Wurf
							player2Factor1 = "Triple";
							player2Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						} else if (k == 2) { // 2. Wurf
							player2Factor2 = "Triple";
							player2Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						} else if (k == 3) { // 3. Wurf
							player2Factor3 = "Triple";
							player2Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						}
					} else if (checkoutNumbers[tmpArray.get(n)] % 2 == 0) { // Double
						if (k == 1) { // 1. Wurf
							player2Factor1 = "Double";
							player2Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 2) { // 2. Wurf
							player2Factor2 = "Double";
							player2Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 3) { // 3. Wurf
							player2Factor3 = "Double";
							player2Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						}
					} else if (checkoutNumbers[tmpArray.get(n)] % 1 == 0) { // Single
						if (k == 1) { // 1. Wurf
							player2Factor1 = "Single";
							player2Points1 = "" + checkoutNumbers[tmpArray.get(n)];
						} else if (k == 2) { // 2. Wurf
							player2Factor2 = "Single";
							player2Points2 = "" + checkoutNumbers[tmpArray.get(n)];
						} else if (k == 3) { // 3. Wurf
							player2Factor3 = "Single";
							player2Points3 = "" + checkoutNumbers[tmpArray.get(n)];
						}
					}
					tmpScore = tmpScore - checkoutNumbers[tmpArray.get(n)]; // uebrigen Score anpasse
					n = tmpArray.size(); // Schleife beenden
				}
			}
		} else if (ending == 2 && player2Score <= 170) { // Double-Out fuer Spieler 2
			int tmpScore = player2Score; // Score des Spielers
			ArrayList<Integer> tmpArray = new ArrayList<Integer>(); // Array fuer Checkout-Punktzahlen
			for (int k = 1; k <= 3; k++) { // 3 Wuerfe
				tmpArray.clear();
				if (tmpScore == 0) { // weniger als 3 Wuerfe fuer Checkout noetig
					if (k == 2) { // Ende bei 2. Wurf
						player2Factor2 = "X";
						player2Points2 = "X";
						player2Factor3 = "X";
						player2Points3 = "X";
					} else if (k == 3) { // Ende bei 3. Wurf
						player2Factor3 = "X";
						player2Points3 = "X";
					}
				}
				for (int m = 0; m < checkoutNumbers.length; m++) { // Eintragen moeglicher Checkout-Punktzahlen in Array
					if (checkoutNumbers[m] <= tmpScore) {
						tmpArray.add(m);
					}
				}
				for (int n = 0; n < tmpArray.size(); n++) { // Setzen von Faktor und Punkten fuer Wurf
					if ((tmpScore - checkoutNumbers[tmpArray.get(n)]) == 0
							&& (checkoutNumbers[tmpArray.get(n)] % 2) == 0) { // Wurf setzt Score auf 0 mit Doppel-Out
						if (k == 1) { // 1. Wurf
							player2Factor1 = "Double";
							player2Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 2) { // 2. Wurf
							player2Factor2 = "Double";
							player2Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 3) { // 3. Wurf
							player2Factor3 = "Double";
							player2Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						}
						tmpScore = tmpScore - checkoutNumbers[tmpArray.get(n)]; // uebrigen Score anpassen
						n = tmpArray.size(); // Schleife beenden
					} else if ((tmpScore - checkoutNumbers[tmpArray.get(n)]) != 0
							&& ((tmpScore - checkoutNumbers[tmpArray.get(n)]) % 2) == 0) { // Wurf setzt Score nicht auf
																							// 0 und ermoeglicht
																							// Doppel-Out
						if (checkoutNumbers[tmpArray.get(n)] % 3 == 0) { // Triple
							if (k == 1) { // 1. Wurf
								player2Factor1 = "Triple";
								player2Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
							} else if (k == 2) { // 2. Wurf
								player2Factor2 = "Triple";
								player2Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
							} else if (k == 3) { // 3. Wurf
								player2Factor3 = "Triple";
								player2Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
							}
						} else if (checkoutNumbers[tmpArray.get(n)] % 2 == 0) { // Double
							if (k == 1) { // 1. Wurf
								player2Factor1 = "Double";
								player2Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
							} else if (k == 2) { // 2. Wurf
								player2Factor2 = "Double";
								player2Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
							} else if (k == 3) { // 3. Wurf
								player2Factor3 = "Double";
								player2Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
							}
						} else if (checkoutNumbers[tmpArray.get(n)] % 1 == 0) { // Single
							if (k == 1) { // 1. Wurf
								player2Factor1 = "Single";
								player2Points1 = "" + checkoutNumbers[tmpArray.get(n)];
							} else if (k == 2) { // 2. Wurf
								player2Factor2 = "Single";
								player2Points2 = "" + checkoutNumbers[tmpArray.get(n)];
							} else if (k == 3) { // 3. Wurf
								player2Factor3 = "Single";
								player2Points3 = "" + checkoutNumbers[tmpArray.get(n)];
							}
						}
						tmpScore = tmpScore - checkoutNumbers[tmpArray.get(n)]; // uebrigen Score anpassen
						n = tmpArray.size(); // Schleife beenden
					}
				}
			}
		} else if (ending == 3 && player2Score <= 180) { // Master-Out fuer Spieler 2
			int tmpScore = player2Score; // Score des Spielers
			ArrayList<Integer> tmpArray = new ArrayList<Integer>(); // Array fuer Checkout-Punktzahlen
			for (int k = 1; k <= 3; k++) { // 3 Wuerfe
				tmpArray.clear();
				if (tmpScore == 0) { // weniger als 3 Wuerfe fuer Checkout noetig
					if (k == 2) { // Ende bei 2. Wurf
						player2Factor2 = "X";
						player2Points2 = "X";
						player2Factor3 = "X";
						player2Points3 = "X";
					} else if (k == 3) { // Ende bei 3. Wurf
						player2Factor3 = "X";
						player2Points3 = "X";
					}
				}
				for (int m = 0; m <= 41; m++) { // Eintragen moeglicher Checkout-Punktzahlen ohne Singles in Array
					if (checkoutNumbers[m] <= tmpScore) {
						tmpArray.add(m);
					}
				}
				for (int n = 0; n < tmpArray.size(); n++) { // Setzen von Faktor und Punkten fuer Wurf
					if (checkoutNumbers[tmpArray.get(n)] % 3 == 0) { // Triple
						if (k == 1) { // 1. Wurf
							player2Factor1 = "Triple";
							player2Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						} else if (k == 2) { // 2. Wurf
							player2Factor2 = "Triple";
							player2Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						} else if (k == 3) { // 3. Wurf
							player2Factor3 = "Triple";
							player2Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 3);
						}
					} else if (checkoutNumbers[tmpArray.get(n)] % 2 == 0) { // Double
						if (k == 1) { // 1. Wurf
							player2Factor1 = "Double";
							player2Points1 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 2) { // 2. Wurf
							player2Factor2 = "Double";
							player2Points2 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						} else if (k == 3) { // 3. Wurf
							player2Factor3 = "Double";
							player2Points3 = "" + (checkoutNumbers[tmpArray.get(n)] / 2);
						}
					}
					tmpScore = tmpScore - checkoutNumbers[tmpArray.get(n)]; // uebrigen Score anpasse
					n = tmpArray.size(); // Schleife beenden
				}
			}
		} else { // Checkout fuer Spieler 2 nicht moeglich
			player2Factor1 = "X";
			player2Points1 = "X";
			player2Factor2 = "X";
			player2Points2 = "X";
			player2Factor3 = "X";
			player2Points3 = "X";
		}
	}

	public int getInitialScore() {
		return initialScore;
	}

	public void setInitialScore(int initialScore) {
		this.initialScore = initialScore;
	}

	public int getEnding() {
		return ending;
	}

	public int getInitialSets() {
		return initialSets;
	}

	public void setInitialSets(int initialSets) {
		this.initialSets = initialSets;
	}

	public void setEnding(int ending) {
		this.ending = ending;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public int getInitialLegs() {
		return initialLegs;
	}

	public void setInitialLegs(int initialLegs) {
		this.initialLegs = initialLegs;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getPlayer1Score() {
		return player1Score;
	}

	public void setPlayer1Score(int player1Score) {
		this.player1Score = player1Score;
	}

	public int getPlayer1Sets() {
		return player1Sets;
	}

	public void setPlayer1Sets(int player1Sets) {
		this.player1Sets = player1Sets;
	}

	public int getPlayer1Legs() {
		return player1Legs;
	}

	public void setPlayer1Legs(int player1Legs) {
		this.player1Legs = player1Legs;
	}

	public int getPlayer1ThrowsLeft() {
		return player1ThrowsLeft;
	}

	public void setPlayer1ThrowsLeft(int player1ThrowsLeft) {
		this.player1ThrowsLeft = player1ThrowsLeft;
	}

	public double getPlayer1Average() {
		return player1Average;
	}

	public void setPlayer1Average(double player1Average) {
		this.player1Average = player1Average;
	}

	public ArrayList<Double> getPlayer1AverageAL() {
		return player1AverageAL;
	}

	public void setPlayer1AverageAL(ArrayList<Double> player1AverageAL) {
		this.player1AverageAL = player1AverageAL;
	}

	public String getPlayer1Factor1() {
		return player1Factor1;
	}

	public void setPlayer1Factor1(String player1Factor1) {
		this.player1Factor1 = player1Factor1;
	}

	public String getPlayer1Points1() {
		return player1Points1;
	}

	public void setPlayer1Points1(String player1Points1) {
		this.player1Points1 = player1Points1;
	}

	public String getPlayer1Factor2() {
		return player1Factor2;
	}

	public void setPlayer1Factor2(String player1Factor2) {
		this.player1Factor2 = player1Factor2;
	}

	public String getPlayer1Points2() {
		return player1Points2;
	}

	public void setPlayer1Points2(String player1Points2) {
		this.player1Points2 = player1Points2;
	}

	public String getPlayer1Factor3() {
		return player1Factor3;
	}

	public void setPlayer1Factor3(String player1Factor3) {
		this.player1Factor3 = player1Factor3;
	}

	public String getPlayer1Points3() {
		return player1Points3;
	}

	public void setPlayer1Points3(String player1Points3) {
		this.player1Points3 = player1Points3;
	}

	public int getPlayer2Score() {
		return player2Score;
	}

	public void setPlayer2Score(int player2Score) {
		this.player2Score = player2Score;
	}

	public int getPlayer2Sets() {
		return player2Sets;
	}

	public void setPlayer2Sets(int player2Sets) {
		this.player2Sets = player2Sets;
	}

	public int getPlayer2Legs() {
		return player2Legs;
	}

	public void setPlayer2Legs(int player2Legs) {
		this.player2Legs = player2Legs;
	}

	public int getPlayer2ThrowsLeft() {
		return player2ThrowsLeft;
	}

	public void setPlayer2ThrowsLeft(int player2ThrowsLeft) {
		this.player2ThrowsLeft = player2ThrowsLeft;
	}

	public double getPlayer2Average() {
		return player2Average;
	}

	public void setPlayer2Average(double player2Average) {
		this.player2Average = player2Average;
	}

	public ArrayList<Double> getPlayer2AverageAL() {
		return player2AverageAL;
	}

	public void setPlayer2AverageAL(ArrayList<Double> player2AverageAL) {
		this.player2AverageAL = player2AverageAL;
	}

	public String getPlayer2Factor1() {
		return player2Factor1;
	}

	public void setPlayer2Factor1(String player2Factor1) {
		this.player2Factor1 = player2Factor1;
	}

	public String getPlayer2Points1() {
		return player2Points1;
	}

	public void setPlayer2Points1(String player2Points1) {
		this.player2Points1 = player2Points1;
	}

	public String getPlayer2Factor2() {
		return player2Factor2;
	}

	public void setPlayer2Factor2(String player2Factor2) {
		this.player2Factor2 = player2Factor2;
	}

	public String getPlayer2Points2() {
		return player2Points2;
	}

	public void setPlayer2Points2(String player2Points2) {
		this.player2Points2 = player2Points2;
	}

	public String getPlayer2Factor3() {
		return player2Factor3;
	}

	public void setPlayer2Factor3(String player2Factor3) {
		this.player2Factor3 = player2Factor3;
	}

	public String getPlayer2Points3() {
		return player2Points3;
	}

	public void setPlayer2Points3(String player2Points3) {
		this.player2Points3 = player2Points3;
	}

}
