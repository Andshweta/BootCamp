package ISA.Llyods.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Portfolio")
public class Portfolio {
	
	
	
		// CustomerId to store fund details 
		@Id
		private String id;
	
	
		//Low Risk Fund id 
		private int lowRskFundId;
	

		//Low Fund Amount detail
		private double lowRskFundAmnt;
		
		private String sortCode;		
	

	
		private int isaAccountNumber;
		
	

		//Medium Risk fund id
		private int midRskFundId;

		
		//Medium Fund Amount detail
		private double midRskFundAmnt;

		

		public Portfolio() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Portfolio(String id, int lowRskFundId, double lowRskFundAmnt, String sortCode, int isaAccountNumber,
				int midRskFundId, double midRskFundAmnt, int highRskFundId, double highRskFundAmnt) {
			super();
			this.id = id;
			this.lowRskFundId = lowRskFundId;
			this.lowRskFundAmnt = lowRskFundAmnt;
			this.sortCode = sortCode;
			this.isaAccountNumber = isaAccountNumber;
			this.midRskFundId = midRskFundId;
			this.midRskFundAmnt = midRskFundAmnt;
			this.highRskFundId = highRskFundId;
			this.highRskFundAmnt = highRskFundAmnt;
		}


		@Override
		public String toString() {
			return "Portfolio [id=" + id + ", lowRskFundId=" + lowRskFundId + ", lowRskFundAmnt=" + lowRskFundAmnt
					+ ", sortCode=" + sortCode + ", isaAccountNumber=" + isaAccountNumber + ", midRskFundId="
					+ midRskFundId + ", midRskFundAmnt=" + midRskFundAmnt + ", highRskFundId=" + highRskFundId
					+ ", highRskFundAmnt=" + highRskFundAmnt + "]";
		}


		// High Risk Fund id
		private int highRskFundId;

		 
		//High Fund Amount detail
		private double highRskFundAmnt;


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public int getLowRskFundId() {
			return lowRskFundId;
		}


		public void setLowRskFundId(int lowRskFundId) {
			this.lowRskFundId = lowRskFundId;
		}


		public double getLowRskFundAmnt() {
			return lowRskFundAmnt;
		}


		public void setLowRskFundAmnt(double lowRskFundAmnt) {
			this.lowRskFundAmnt = lowRskFundAmnt;
		}


		public String getSortCode() {
			return sortCode;
		}


		public void setSortCode(String sortCode) {
			this.sortCode = sortCode;
		}


		public int getIsaAccountNumber() {
			return isaAccountNumber;
		}


		public void setIsaAccountNumber(int isaAccountNumber) {
			this.isaAccountNumber = isaAccountNumber;
		}


		public int getMidRskFundId() {
			return midRskFundId;
		}


		public void setMidRskFundId(int midRskFundId) {
			this.midRskFundId = midRskFundId;
		}


		public double getMidRskFundAmnt() {
			return midRskFundAmnt;
		}


		public void setMidRskFundAmnt(double midRskFundAmnt) {
			this.midRskFundAmnt = midRskFundAmnt;
		}


		public int getHighRskFundId() {
			return highRskFundId;
		}


		public void setHighRskFundId(int highRskFundId) {
			this.highRskFundId = highRskFundId;
		}


		public double getHighRskFundAmnt() {
			return highRskFundAmnt;
		}


		public void setHighRskFundAmnt(double highRskFundAmnt) {
			this.highRskFundAmnt = highRskFundAmnt;
		}
		







}
