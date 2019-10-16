import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NimiGen {
//Rotu voisi mahdollisesti olla parempi omana muuttujanaan, jolloin siihen voisi viitata useammassa metodissa
	public static void main(String[] args) {

		for (int i = 0; i < 15; i++) {
			System.out.println(compileCharacter());
		}

	}

	private static String compileCharacter() {
//Tähän voisi tehdä jonkun roturajauksen
		boolean isGod = false;
		String race = selectRace();
		String name = generateName(race, isGod);
		String selClass = "";
		String classes = "";
		String[] clArray;
		String response = "";
		Random rand = new Random();
		boolean a = rand.nextBoolean();

		List<String> classList = new ArrayList<String>();
		classList.add("warrior");
		classList.add("brawler");
		classList.add("paladin");
		classList.add("death knight");
		classList.add("demonhunter");
		classList.add("monk");
		classList.add("cultist");
		classList.add("priest");
		classList.add("dark priest");
		classList.add("sorcerer");
		classList.add("wizard");
		classList.add("warlock");
		classList.add("druid");
		classList.add("shaman");
		classList.add("thief");
		classList.add("ranger");
		classList.add("hunter");
		classList.add("bard");
		classList.add("skald");
		classList.add("merchant");
		classList.add("peasant");

		switch (race) {

		case "human":

			selClass = classList.get((int) (Math.random() * classList.size()));

			if (selClass.equals("priest") && !a) {
				isGod = true;
				return name + ", " + race + " " + selClass + " of " + generateName(race, isGod);
			} else if (selClass.equals("priest") && a) {
				isGod = true;
				return name + ", " + race + " " + selClass + " of " + generateName(race, isGod) + " " + selTitle();
			} else if (selClass.equals("dark priest") && !a) {
				isGod = true;
				return name + ", " + race + " " + selClass + " of " + generateName(race, isGod);
			} else if (selClass.equals("dark priest") && a) {
				isGod = true;
				return name + ", " + race + " " + selClass + " of " + generateName(race, isGod) + " " + selTitle();
			} else if (selClass.equals("cultist") && !a) {
				isGod = true;
				return name + ", " + race + " " + selClass + " of " + generateName(race, isGod);
			} else if (selClass.equals("cultist") && a) {
				isGod = true;
				return name + ", " + race + " " + selClass + " of " + generateName(race, isGod) + " " + selTitle();
			} else {
				isGod = true;
				return name + ", " + race + " " + selClass;
			}

		case "night elf":

			classes = "warrior,demonhunter,druid,thief,ranger,hunter,bard,merchant";
			clArray = classes.split(",");

			selClass = clArray[(int) (Math.random() * clArray.length)];

			return name + ", " + race + " " + selClass;

		case "high elf":
			classes = "warrior,paladin,demonhunter,priest,wizard,sorcerer,monk,bard,merchant";
			clArray = classes.split(",");

			selClass = clArray[(int) (Math.random() * clArray.length)];

			if (selClass.equals("priest") && !a) {
				return name + ", " + race + " " + selClass + " of " + generateName(race, isGod);
			} else if (selClass.equals("priest") && a) {
				return name + ", " + race + " " + selClass + " of " + generateName(race, isGod) + " " + selTitle();
			} else {
				return name + ", " + race + " " + selClass;
			}

		case "halfling":
			classes = "brawler,thief,hunter,bard,merchant,peasant";
			clArray = classes.split(",");
			selClass = clArray[(int) (Math.random() * clArray.length)];

			return name + ", " + race + " " + selClass;

		case "wood elf":

			selClass = classList.get((int) (Math.random() * classList.size()));

			if (selClass.equals("warrior") || selClass.equals("demonhunter") || selClass.equals("druid")
					|| selClass.equals("thief") || selClass.equals("ranger") || selClass.equals("hunter")
					|| selClass.equals("bard") || selClass.equals("merchant")) {

				return race + " " + selClass;

			} else {
				selClass = classList.get((int) (Math.random() * classList.size()));
			}

		case "dark elf":

			selClass = classList.get((int) (Math.random() * classList.size()));

			if (selClass.equals("warrior") || selClass.equals("warlock") || selClass.equals("sorcerer")
					|| selClass.equals("wizard") || selClass.equals("cultist") || selClass.equals("death knight")
					|| selClass.equals("bard") || selClass.equals("monk") || selClass.equals("merchant")) {

				if (selClass.equals("cultist") && !a) {
					return race + " " + selClass + " of " + generateName(race, isGod);
				} else if (selClass.equals("cultist") && a) {
					return race + " " + selClass + " of " + generateName(race, isGod) + " " + selTitle();
				} else {
					return race + " " + selClass;
				}

			} else {
				selClass = classList.get((int) (Math.random() * classList.size()));
			}

		case "dwarf":

			selClass = classList.get((int) (Math.random() * classList.size()));

			if (selClass.equals("warrior") || selClass.equals("demonhunter") || selClass.equals("priest")
					|| selClass.equals("paladin") || selClass.equals("thief") || selClass.equals("monk")
					|| selClass.equals("peasant") || selClass.equals("merchant") || selClass.equals("brawler")) {

				if (selClass.equals("priest") && !a) {
					return race + " " + selClass + " of " + generateName(race, isGod);
				} else if (selClass.equals("priest") && a) {
					return race + " " + selClass + " of " + generateName(race, isGod) + " " + selTitle();
				} else {
					return race + " " + selClass;
				}

			} else {
				selClass = classList.get((int) (Math.random() * classList.size()));
			}

		default:
			return null;

		}

	}

	private static String selTitle() {
//Tähän voisi tehdä jonkun roturajauksen
		List<String> eNames = new ArrayList<String>();
		eNames.add("the Pure");
		eNames.add("the Unforgiving");
		eNames.add("the Evil");
		eNames.add("the Judge");
		eNames.add("the Just");
		eNames.add("the Peaceful");
		eNames.add("the Keeper Of Heavens");
		eNames.add("the Light In The Dark");
		eNames.add("the Lord Of Darkness");
		eNames.add("the Kinslayer");
		eNames.add("the Mighty");
		eNames.add("the Puny");
		eNames.add("the Usurper");
		eNames.add("the Vile");
		eNames.add("the Trickster");
		eNames.add("the Dying Light");
		eNames.add("the Pincher");

		return eNames.get((int) (Math.random() * eNames.size()));
	}

	private static String selectRace() {

		List<String> raceList = new ArrayList<String>();
//		raceList.add("human");
//		raceList.add("night elf");
//		raceList.add("high elf");
		raceList.add("halfling");
//		raceList.add("wood elf");
//		raceList.add("dark elf");
//		raceList.add("dwarf");
//		raceList.add("halforc");
//		raceList.add("orc");
//		raceList.add("goblin");
//		raceList.add("tiefling");
//		raceList.add("kobold");
//		raceList.add("gnoll");
//		raceList.add("troll");

		return raceList.get((int) (Math.random() * raceList.size()));
	}

	private static String generateName(String race, boolean isGod) {
//Tähän voisi tehdä eri konsonantti/vokaalistringejä eri rotuja varten
		Random rand = new Random();
		String cons = "";
		String[] consAr;
		String vocs = "";
		String[] vocsAr;
		int ran = 0;
		switch (race) {

		case "human":

			ran = (int) ((Math.random() * 2) + 2);
			cons = "b,b,c,d,d,f,g,h,j,k,k,l,m,m,n,n,p,p,q,r,r,s,s,t,t,v,w,x,z";
			consAr = cons.split(",");
			vocs = "a,e,i,o,u,y";
			vocsAr = vocs.split(",");

			if (isGod) {
				return compileName(consAr, vocsAr, ran, rand);
			} else {
				return compileName(consAr, vocsAr, ran, rand) + " " + compileName(consAr, vocsAr, ran, rand);
			}
		case "night elf":

			ran = (int) ((Math.random() * 2) + 2);
			cons = "b,c,d,f,g,h,j,l,m,n,p,q,r,s,s,t";
			consAr = cons.split(",");
			vocs = "a,e,i,o,u,y,á,ó,é,ú,ý,í";
			vocsAr = vocs.split(",");

			return compileName(consAr, vocsAr, ran, rand);

		case "high elf":

			ran = (int) ((Math.random() * 3) + 3);
			cons = "b,c,d,f,g,l,m,n,q,r,s,s";
			consAr = cons.split(",");
			vocs = "a,a,a,a,a,a,e,e,e,e,e,i,i,i,i,i,o,o,o,o,o,u,u,u,u,u,y,ü,ë";
			vocsAr = vocs.split(",");

			if (isGod) {
				return compileName(consAr, vocsAr, ran, rand);
			} else {
				return compileName(consAr, vocsAr, ran, rand) + " " + compileName(consAr, vocsAr, ran, rand);
			}

		case "halfling":
			String lnParts = "ash,worthy,band,wax,brace,girdle,brown,lock,"
									+ "brush,gather,bull,roar,bunce,burrow,chubb,"
									+ "cotton,dale,gardner,good,barrel,body,bottle,"
									+ "green,span,grub,ham,son,heather,toe,high,"
									+ "hill,topple,horn,blower,wart,leagal,low,"
									+ "linden,brook,mill,bridge,new,tan,old,"
									+ "fur,ost,good,over,hill,short,wick,sire,"
									+ "tal,bot,tea,leaf,thorn,gage,tight,field,"
									+ "toss,cobble,trill,under,bough,weather,bee";
			String[] lnpsAr = lnParts.split(",");
			String firstPart = lnpsAr[rand.nextInt(lnpsAr.length)];
			ran = (int) ((Math.random() * 1) + 2);
			cons = "ba,ca,da,fa,ga,ha,ma,na,ra,sa,ta,bo,do,fo,go,mo,no,ro,so,to";
			consAr = cons.split(",");
			vocs = "e,i,u";
			vocsAr = vocs.split(",");

			return compileName(consAr, vocsAr, ran, rand) + " " + firstPart.substring(0,1).toUpperCase() + firstPart.substring(1,firstPart.length()) + lnpsAr[rand.nextInt(lnpsAr.length)] ;

		default:
			return null;
		}
//		String specVoc = "á,ó,é,ú,ö,ý,í,ü,û,â,ê,î";
//		String[] specVocList = specVoc.split(",");

	}

	private static String compileName(String[] consAr, String[] vocsAr, int ran, Random rand) {

		String name = "";

		for (int i = 1; i <= ran; i++) {

			boolean a = rand.nextBoolean();
			boolean b = rand.nextBoolean();
			boolean c = rand.nextBoolean();
			boolean d = rand.nextBoolean();

			if (a && b && c) {
				name += consAr[rand.nextInt(consAr.length)];
				name += vocsAr[rand.nextInt(vocsAr.length)];
				name += vocsAr[rand.nextInt(vocsAr.length)];

			} else if (a && !b && !c) {
				name += consAr[rand.nextInt(consAr.length)];
				name += vocsAr[rand.nextInt(vocsAr.length)];
				name += consAr[rand.nextInt(consAr.length)];

			} else if (!a && b && !c) {
				// name += vocsAr[rand.nextInt(vocsAr.length)];
				name += vocsAr[rand.nextInt(vocsAr.length)];
				name += consAr[rand.nextInt(consAr.length)];

			} else if (!a && !b && c) {
				name += vocsAr[rand.nextInt(vocsAr.length)];
				name += consAr[rand.nextInt(consAr.length)];
				name += vocsAr[rand.nextInt(vocsAr.length)];

			} else if (!a && !b && !c) {
				name += consAr[rand.nextInt(consAr.length)];
				name += vocsAr[rand.nextInt(vocsAr.length)];

			} else if (a && b && !c) {
				name += vocsAr[rand.nextInt(vocsAr.length)];
				name += consAr[rand.nextInt(consAr.length)];

			} else if (!a && b && c) {
				name += vocsAr[rand.nextInt(vocsAr.length)];

			} else if (a && !b && c) {
				name += consAr[rand.nextInt(consAr.length)];

			}

		}

		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

	}

}
