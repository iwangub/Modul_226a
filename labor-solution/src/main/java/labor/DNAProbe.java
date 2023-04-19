package labor;

import java.time.LocalDate;

public class DNAProbe implements DNA {
	
	private static final int COST_DELETE = 2;
	private static final int COST_INSERT = 2;
	private static final int COST_REPLACE = 3;
	
	private String sequence;
	private LocalDate discoveryDate;
	private Place discoveryPlace;
	private String description;

	public DNAProbe(String sequence, 
			LocalDate discoveryDate, 
			Place discoveryPlace) {
		this(sequence, discoveryDate, discoveryPlace, true);
	}

	DNAProbe(String sequence, 
			LocalDate discoveryDate, 
			Place discoveryPlace, 
			boolean validate) {
		if (validate && !isValidSequence(sequence)) {
			throw new IllegalArgumentException(sequence);
		}

		this.sequence = sequence;
		this.discoveryDate = discoveryDate;
		this.discoveryPlace = discoveryPlace;
	}

	public int evolDistance(DNA dna) {
		if (dna == null) {
			throw new NullPointerException("DNA NULL!");
		}
		String x = this.sequence;
		String y = dna.getSequence();
		int m = x.length() + 1;
		int n = y.length() + 1;
		int[][] memo = new int[m][n];
		
		// Initialisierung der Basis Transformationen:
		memo[0][0] = 0;
	
		int c = COST_DELETE;
		for (int i = 1; i < m; i++) {
			memo[i][0] = c;
			c += 2;
		}
		
		c = COST_INSERT;
		for (int i = 1; i < n; i++) {
			memo[0][i] = c;
			c += 2;
		}
		
		// Berechnung der kompletten Memo Tabelle
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				// Kosten Mutation: Einfuegen
				int ins = memo[i][j - 1] + COST_INSERT;
				// Kosten Mutation: Loeschen
				int del = memo[i - 1][j] + COST_DELETE;
				// Kosten Mutation: Ersetzen von unterschiedlichen Basen.
				int repl = memo[i - 1][j - 1] + COST_REPLACE;
				// Kosten Mutation: Ersetzen von gleichen Basen, gratis
				if (x.charAt(i - 1) == y.charAt(j - 1)) {
					repl = memo[i - 1][j - 1];
				}
				// Speichern die Mutation mit minimalen Kosten:
				// min(del,ins,repl)
				memo[i][j] = Math.min(Math.min(del,ins),repl);
			}
		}
		return memo[m-1][n-1];
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSequence() {
		return sequence;
	}

	public LocalDate getDiscoveryDate() {
		return discoveryDate;
	}

	public Place getDiscoveryPlace() {
		return discoveryPlace;
	}

	public String toString() {
		return sequence;
	}

	public static boolean isValidSequence(String dna) {
		// Sequenz startet mit ATG
		if (!dna.startsWith("ATG"))
			return false;
		// Sequenzlaenge durch 3 teilbar
		if (dna.length() % 3 != 0)
			return false;
		// Sequenz beinhaltet nur A,T,G,C und
		// hat kein Stopgen im Mittelteil
		for (int i = 3; i < dna.length() - 3; i++) {
			if ((dna.charAt(i) != 'A') && 
					(dna.charAt(i) != 'T') && 
					(dna.charAt(i) != 'G') && 
					(dna.charAt(i) != 'C')) {
				return false;
			}
			if (i % 3 == 0) {
				String codon = dna.substring(i, i + 3);
				if (codon.equals("TAA") ||
						codon.equals("TAG") ||
						codon.equals("TGA")) {
					return false;
				}
			}
		}
		// Sequenz endet mit Stopgen	
		if (dna.endsWith("TAA") ||
				dna.endsWith("TAG") ||
				dna.endsWith("TGA")) {
			return true;
		}
		return false;
	}
}
