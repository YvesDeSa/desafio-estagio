package desafio;

public class FaturamentoPorEstado {
	 public static void main(String[] args) {
	        double faturamentoSP = 67836.43;
	        double faturamentoRJ = 36678.66;
	        double faturamentoMG = 29229.88;
	        double faturamentoES = 27165.48;
	        double faturamentoOutros = 19849.53;

	        double totalFaturamento = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

	        double percentualSP = (faturamentoSP / totalFaturamento) * 100;
	        double percentualRJ = (faturamentoRJ / totalFaturamento) * 100;
	        double percentualMG = (faturamentoMG / totalFaturamento) * 100;
	        double percentualES = (faturamentoES / totalFaturamento) * 100;
	        double percentualOutros = (faturamentoOutros / totalFaturamento) * 100;

	        System.out.println("Percentual de representação do faturamento por estado:");
	        System.out.println("SP: " + percentualSP + "%");
	        System.out.println("RJ: " + percentualRJ + "%");
	        System.out.println("MG: " + percentualMG + "%");
	        System.out.println("ES: " + percentualES + "%");
	        System.out.println("Outros: " + percentualOutros + "%");
	    }
}
