
public class Tester {

	public static void main(String[] args) {
		RoachMotel motel = RoachMotel.getInstance();
		System.out.println(motel);
		
		RoachColony rc1 = new RoachColony("colony 1", 100, 1.5);
		System.out.println(rc1);
		String[] a1 = {"foodbar"};
		Room rm1 = motel.checkin(rc1, "regular", a1);
		System.out.println(rm1);
		rm1.setDoNotDisturb(true);
		
		RoachColony rc2 = new RoachColony("colony 2", 200, 0.75);
		System.out.println(rc2);
		String[] a2 = {"spa","foodbar","autorefill","shower"};
		Room rm2 = motel.checkin(rc2, "Suite",a2);
		System.out.println(rm2);
		
		rc1.party();
		motel.clean();
		
		RoachColony rc3 = new RoachColony("colony 3", 1000, 1.1);
		RoachColony rc4 = new RoachColony("colony 4", 1200, 1.2);
		RoachColony rc5 = new RoachColony("colony 5", 1300, 1.05);
		RoachColony rc6 = new RoachColony("colony 6", 1400, 0.8);
		RoachColony rc7 = new RoachColony("colony 7", 1500, 1.9);
		RoachColony rc8 = new RoachColony("colony 8", 700, 3.0);
		
		Room rm3 = motel.checkin(rc3, "deluxe", a1);
		Room rm4 = motel.checkin(rc4, "regular", a1);
		Room rm5 = motel.checkin(rc5, "regular", a1);
		Room rm6 = motel.checkin(rc6, "regular", a1);
		Room rm7 = motel.checkin(rc7, "regular", a1);
		System.out.println(rm7);
		motel.clean();
		motel.checkout(rm3, new RoachPal("Greasy Joe", "GJ@ymail.com"));
		motel.checkout(rm2, new RoachPal("Francesco", "Frank@sbcglobal.net"));
		motel.clean();
		rc4.party();
		motel.clean();
		motel.checkout(rm4, new MasterRoach("Gustavo","696","0123456789101112", "10/23"));
		
		System.out.println(motel.getLog());
	}
}
