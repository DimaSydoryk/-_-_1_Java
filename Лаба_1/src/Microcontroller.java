
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
			Microcontroller.expirationDate = expirationDate;
			this.fullName = fullName;
			this.name = name;
		}
		Microcontroller(int yearOfCreate, int expirationDate, String fullName, String name, int rozriadnist, int taktova_Chastota) {
			this(yearOfCreate,expirationDate,fullName,name);
			this.rozriadnist = rozriadnist;
			this.taktova_Chastota = taktova_Chastota;
		}		
		public String toString(){
			return "Мікроконтроллер фірми - " + this.company_Creator + ", створений у " + this.yearOfCreate + "із тактовою частотою: " + this.taktova_Chastota + "Мгц ,і розрядністю " + this.rozriadnist + ". Термін придатності даного котроллера " + Microcontroller.expirationDate + " Років";
		}
		public String printStaticExpirationDate() {
			return "Термін придатності - " + Microcontroller.expirationDate + " років.";
		}
		public String printExpirationDate() {
			return Integer.toString(Microcontroller.expirationDate);
		}
		public void ResetValues(int yearOfCreate, int expirationDate, String fullName, String name, int rozriadnist, int taktova_Chastota) {
			this.yearOfCreate = yearOfCreate;
			Microcontroller.expirationDate = expirationDate;
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
			System.out.print(secondController.toString());
			thirdController.printStaticExpirationDate();
			secondController.printStaticExpirationDate();
		}
}

