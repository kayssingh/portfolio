package portfolioMgmt;


public class PortfolioManagement {
	
	private Portfolio portfolio;
	private PortfolioProgress pp;
	
	private double inflation;
	private long simulations;
	private int periods;
	
	public PortfolioManagement(Portfolio portfolio) {
		this.portfolio = portfolio;
		PortfolioProgress pp = new PortfolioProgress(portfolio.getMean(),portfolio.getStandardDeviation());
		this.pp = pp;
		this.inflation = 0.035;// 3.5% inflation
		this.periods = 20;//20 yrs 
		this.simulations = 10000;
	}

	public void getProgress() {
		for (int i = 0; i < simulations; i++) {
			double simResult = portfolio.getInitialInvestment();																
			for (int j = 0; j < periods; j++) {
				
				// get next random sample return for the portfolio
				double r = pp.nextSampleReturn();

				// end of period value
				simResult = (1 + r) * simResult;

				// adjust for inflation
				simResult = (1 - inflation) * simResult;
			}
			// save result
			pp.saveProgress(simResult);
		}

		portfolio.setMedian(pp.getPercentile(50));
		portfolio.setTopTenWorstCase(pp.getPercentile(10));
		portfolio.setTopTenBestCase(pp.getPercentile(90));
	}

	public double getInflation() {
		return inflation;
	}

	public void setInflation(double inflation) {
		this.inflation = inflation;
	}

	public long getSimulations() {
		return simulations;
	}

	public void setSimulations(long simulations) {
		this.simulations = simulations;
	}

	public int getPeriods() {
		return periods;
	}

	public void setPeriods(int periods) {
		this.periods = periods;
	}


}
