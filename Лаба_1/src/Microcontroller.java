
public class Microcontroller {
		int taktova_Chastota;
		int rozriadnist;
		String company_Creator;
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name= name;
		}
		protected int yearOfCreate; //YEAR
		protected String fullName;
		public static int expirationDate; //in Years
		Microcontroller() {
			taktova_Chastota = 1024;
			rozriadnist = 64;
			company_Creator = "ASUSTek";
			name = "Microcontroller" + company_Creator;
			yearOfCreate = 2000;
			expirationDate = 5;
			fullName = "company_Creator" + "Microcontroller" + Integer.toString(yearOfCreate) + "till" + Integer.toString(yearOfCreate + expirationDate);
		}
		Microcontroller(int yearOfCreate, int expirationDate, String fullName, String name) {
			this.yearOfCreate = yearOfCreate;
			this.expirationDate = expirationDate;
			this.fullName = fullName;
			this.name = name;
		}
		Microcontroller(int yearOfCreate, int expirationDate, String fullName, String name, int rozriadnist, int taktova_Chastota) {
			this(yearOfCreate,expirationDate,fullName,name);
			this.rozriadnist = rozriadnist;
			this.taktova_Chastota = taktova_Chastota;
		}		
		public String toString(String company_Creator, int rozriadnist, int taktova_Chastota,int expirationDate, int yearOfCreate){
			return "Мікроконтроллер фірми - " + company_Creator + ", створений у " + yearOfCreate + "із тактовою частотою: " + taktova_Chastota + "Мгц ,і розрядністю " + rozriadnist + ". Термін придатності даного котроллера " + expirationDate + " Років";
		}
		public String printStaticExpirationDate() {
			return "Термін придатності - " + this.expirationDate + " років.";
		}
		public String printExpirationDate() {
			return Integer.toString(this.expirationDate);
		}
		public void ResetValues(int yearOfCreate, int expirationDate, String fullName, String name, int rozriadnist, int taktova_Chastota) {
			this.yearOfCreate = yearOfCreate;
			this.expirationDate = expirationDate;
			this.fullName = fullName;
			this.name = name;
			this.rozriadnist = rozriadnist;
			this.taktova_Chastota = taktova_Chastota;
		}
		public static void main(String[] args) {
			Microcontroller NewController = new Microcontroller();
			NewController.ResetValues(1990, 10, "Dell NewController from 1990 year", "dell", 64, 8064);
			Microcontroller secondController = new Microcontroller(1975, 15, "new Controller from Second constructor", "HP");
			Microcontroller thirdController = new Microcontroller(1975, 15, "new Controller from Second constructor", "HP", 64, 8064);
			secondController.toString();
			thirdController.printStaticExpirationDate();
			secondController.printStaticExpirationDate();
		}
}

