package ISA.Llyods.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Portfolio")
public class Portfolio {
	
	
	
	// CustomerId to store fund details 
	@Id
	private String id;
	
	
		//Low Risk Fund id 
		private int lowRskFund;
		
		@Override
		public String toString() {
			return "Portfolio [id=" + id + ", lowRskFund=" + lowRskFund + ", lowRskFundAmnt=" + lowRskFundAmnt
					+ ", midRskFund=" + midRskFund + ", midRskFundAmnt=" + midRskFundAmnt + ", highRskFund="
					+ highRskFund + ", highRskFundAmnt=" + highRskFundAmnt + "]";
		}


		public Portfolio() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Portfolio(String id, int lowRskFund, double lowRskFundAmnt, int midRskFund, double midRskFundAmnt,
				int highRskFund, double highRskFundAmnt) {
			super();
			this.id = id;
			this.lowRskFund = lowRskFund;
			this.lowRskFundAmnt = lowRskFundAmnt;
			this.midRskFund = midRskFund;
			this.midRskFundAmnt = midRskFundAmnt;
			this.highRskFund = highRskFund;
			this.highRskFundAmnt = highRskFundAmnt;
		}


		//Low Fund Amount detail
		private double lowRskFundAmnt;
		
		
		//Medium Risk fund id
		private int midRskFund;

		
		//Medium Fund Amount detail
		private double midRskFundAmnt;

		
		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public int getLowRskFund() {
			return lowRskFund;
		}


		public void setLowRskFund(int lowRskFund) {
			this.lowRskFund = lowRskFund;
		}


		public double getLowRskFundAmnt() {
			return lowRskFundAmnt;
		}


		public void setLowRskFundAmnt(double lowRskFundAmnt) {
			this.lowRskFundAmnt = lowRskFundAmnt;
		}


		public int getMidRskFund() {
			return midRskFund;
		}


		public void setMidRskFund(int midRskFund) {
			this.midRskFund = midRskFund;
		}


		public double getMidRskFundAmnt() {
			return midRskFundAmnt;
		}


		public void setMidRskFundAmnt(double midRskFundAmnt) {
			this.midRskFundAmnt = midRskFundAmnt;
		}


		public int getHighRskFund() {
			return highRskFund;
		}


		public void setHighRskFund(int highRskFund) {
			this.highRskFund = highRskFund;
		}


		public double getHighRskFundAmnt() {
			return highRskFundAmnt;
		}


		public void setHighRskFundAmnt(double highRskFundAmnt) {
			this.highRskFundAmnt = highRskFundAmnt;
		}


		// High Risk Fund id
		private int highRskFund;

		 
		//High Fund Amount detail
		private double highRskFundAmnt;
		







}
