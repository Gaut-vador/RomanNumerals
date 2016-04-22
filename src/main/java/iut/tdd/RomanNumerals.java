package iut.tdd;

public class RomanNumerals {
	private String[] listeRomain = new String[] { "I", "IV", "V", "IX", "X" };
	private int[] listeArabe = new int[] { 1, 4, 5, 9, 10 };

	public String convertToRoman(String arabe) {

		StringBuilder roman = new StringBuilder();
		int nb = Integer.parseInt(arabe);

		for (int i = 0; i < Integer.parseInt(arabe); i++) {
			for (int index = listeArabe.length - 1; index >= 0; index--) {
				nb -= extractSymbol(roman, nb, index);
			}
		}
		return roman.toString();
	}

	private int extractSymbol(StringBuilder roman, int nb, int index) {
		int value =0;
		if (nb >= listeArabe[index]) {
			roman.append(listeRomain[index]);
			value = listeArabe[index];
		}
		return value;
	}

	public String convertFromRoman(String roman) {
		if (roman == "I")
			return "1";
		else
			return null;
	}

}
