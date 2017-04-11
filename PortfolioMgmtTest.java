package portfolioMgmt;

import org.junit.Test;

public class PortfolioMgmtTest {

	 @Test
		public void testSimulation(){
			Portfolio aggressive = new Portfolio("Aggressive", 100000, 0.094324, 0.15675);
			Portfolio conservative = new Portfolio("Conservative", 100000, 0.06189, 0.063438);
			
			PortfolioManagement agressivePortfolio = new PortfolioManagement(aggressive);
			agressivePortfolio.getProgress();
			PortfolioManagement conservativePortfolio = new PortfolioManagement(conservative);
			conservativePortfolio.getProgress();

			
			System.out.println(aggressive);
			System.out.println(conservative);
		}
}
