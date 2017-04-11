package portfolioMgmt;

public class Portfolio {
	private String portfolioType;
	private double initialInvestment;
	private double mean;//return
	private double standardDeviation;//risk
	private double median;
	private double topTenBestCase;
	private double topTenWorstCase;
		
	public Portfolio(String portfolioType, double initialInvestment, double mean, double standardDeviation) {
		this.portfolioType=portfolioType;
		this.initialInvestment=initialInvestment;
		this.mean=mean;
		this.standardDeviation=standardDeviation;		
	}

	public String getPortfolioType() {
		return portfolioType;
	}

	public void setPortfolioType(String portfolioType) {
		this.portfolioType = portfolioType;
	}

	public double getInitialInvestment() {
		return initialInvestment;
	}

	public void setInitialInvestment(double initialInvestment) {
		this.initialInvestment = initialInvestment;
	}

	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	public double getStandardDeviation() {
		return standardDeviation;
	}

	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}

	public double getTopTenBestCase() {
		return topTenBestCase;
	}

	public void setTopTenBestCase(double topTenBestCase) {
		this.topTenBestCase = topTenBestCase;
	}

	public double getTopTenWorstCase() {
		return topTenWorstCase;
	}

	public void setTopTenWorstCase(double topTenWorstCase) {
		this.topTenWorstCase = topTenWorstCase;
	}

	@Override
	public String toString() {
		return "Portfolio [Type : " + portfolioType + " |  Median : " + median
				+ " |  10% Best Case : " + topTenBestCase
				+ " |  10% Worst Case : " + topTenWorstCase + "]";
	}

}
