package methodOverloading2;

public class Chocolate {
		private String company;
		private int cocoaPercentage;
        private int price;
        private int fatPercentage;
        
		public Chocolate(String company, int cocoaPercentage, int fatPercentage, int price) {
			super();
			this.company = company;
			this.cocoaPercentage = cocoaPercentage;
			this.price = price;
			this.fatPercentage = fatPercentage;
		}

		public String getCompany() {
			System.out.println("Name of the company :"+company);
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public int getCocoaPercentage() {
			System.out.println("Percentage of cocoa present in Chocolate is "+cocoaPercentage+" %");
			return cocoaPercentage;
		}

		public void setCocoaPercentage(int cocoaPercentage) {
			this.cocoaPercentage = cocoaPercentage;
		}

		public int getPrice() {
			System.out.println("Price of the Chocolate "+price+".Rs");
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getFatPercentage() {
			System.out.println("Percentage of fat present in Chocolate is "+fatPercentage+" %");
			return fatPercentage;
		}

		public void setFatPercentage(int fatPercentage) {
			this.fatPercentage = fatPercentage;
		}
      
}
