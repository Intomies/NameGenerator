import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NimiGen {
//Rotu voisi mahdollisesti olla parempi omana muuttujanaan, jolloin siihen voisi viitata useammassa metodissa
	public static void main(String[] args) {

		for (int i = 0; i < 15; i++) {
			System.out.println(compileName() + " " + compileName() + ", " + selectClassAndRace());
		}

	}

	private static String selectClassAndRace() {
//Tähän voisi tehdä jonkun roturajauksen
		String race = selectRace();
		String selClass = "";
		Random rand = new Random();
		boolean a = rand.nextBoolean();

		List<String> classList = new ArrayList<String>();
		classList.add("warrior");
		classList.add("paladin");
		classList.add("demonhunter");
		classList.add("monk");
		classList.add("priest");
		classList.add("sorcerer");
		classList.add("wizard");
		classList.add("druid");
		classList.add("shaman");
		classList.add("thief");
		classList.add("ranger");
		classList.add("hunter");
		classList.add("bard");
		classList.add("skald");
		classList.add("peasant");

		switch (race) {

		case "human":

			selClass = classList.get((int) (Math.random() * classList.size()));

			if (selClass.equals("priest") && !a) {
				return race + " " + selClass + " of " + compileName();
			} else if (selClass.equals("priest") && a) {
				return race + " " + selClass + " of " + compileName() + " " + selTitle();
			} else {
				return race + " " + selClass;
			}

		case "night elf":

			selClass = classList.get((int) (Math.random() * classList.size()));

			if (selClass.equals("warrior") || selClass.equals("demonhunter") || selClass.equals("druid")
					|| selClass.equals("thief") || selClass.equals("ranger") || selClass.equals("hunter")
					|| selClass.equals("bard")) {

				return race + " " + selClass;

			} else {
				selClass = classList.get((int) (Math.random() * classList.size()));
			}

		case "high elf":

			selClass = classList.get((int) (Math.random() * classList.size()));

			if (selClass.equals("warrior") || selClass.equals("demonhunter") || selClass.equals("sorcerer")
					|| selClass.equals("wizard") || selClass.equals("priest") || selClass.equals("paladin")
					|| selClass.equals("bard") || selClass.equals("monk")) {

				if (selClass.equals("priest") && !a) {
					return race + " " + selClass + " of " + compileName();
				} else if (selClass.equals("priest") && a) {
					return race + " " + selClass + " of " + compileName() + " " + selTitle();
				} else {
					return race + " " + selClass;
				}

			} else {
				selClass = classList.get((int) (Math.random() * classList.size()));
			}

		case "wood elf":

		case "dark elf":

		case "dwarf":

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
		raceList.add("human");
		raceList.add("night elf");
		raceList.add("high elf");
		raceList.add("wood elf");
		raceList.add("dark elf");
		raceList.add("dwarf");
		raceList.add("halfling");
		raceList.add("halforc");
		raceList.add("orc");
		raceList.add("goblin");
		raceList.add("tiefling");
		raceList.add("kobold");
		raceList.add("gnoll");
		raceList.add("troll");

		return raceList.get((int) (Math.random() * raceList.size()));
	}

	private static String compileName() {
//Tähän voisi tehdä eri konsonantti/vokaalistringejä eri rotuja varten
		Random rand = new Random();

		String consonants = "bbcddfghjkklmmnnppqrrssttvwxz";
		List<String> consonantList = new ArrayList<String>();
		for (int i = 0; i < consonants.length(); i++) {
			int j = 1 + i;

			if (j > consonants.length()) {
				j = consonants.length();
			}
			String c = consonants.substring(i, j);
			consonantList.add(c);
		}

		String vocals = "aaaeeeiiiooouuuyyy";
		List<String> vocalList = new ArrayList<String>();
		for (int i = 0; i < vocals.length(); i++) {

			int j = 1 + i;

			if (j > vocals.length()) {
				j = vocals.length();
			}

			String v = vocals.substring(i, j);
			vocalList.add(v);

		}

		String specVoc = "á,ó,é,ú,ö,ý,í,ü,û,â,ê,î";
		String[] specVocList = specVoc.split(",");

		String name = "";
		int ran = (int) ((Math.random() * 3) + 2);

		for (int i = 1; i <= ran; i++) {

			boolean a = rand.nextBoolean();
			boolean b = rand.nextBoolean();
			boolean c = rand.nextBoolean();
			boolean d = rand.nextBoolean();

			if (a && b && c) {
				name += consonantList.get(rand.nextInt(consonantList.size()));
				name += vocalList.get(rand.nextInt(vocalList.size()));
				name += vocalList.get(rand.nextInt(vocalList.size()));

			} else if (a && !b && !c) {
				name += consonantList.get(rand.nextInt(consonantList.size()));
				name += vocalList.get(rand.nextInt(vocalList.size()));
				name += consonantList.get(rand.nextInt(consonantList.size()));

			} else if (!a && b && !c) {
				name += vocalList.get(rand.nextInt(vocalList.size()));
				name += vocalList.get(rand.nextInt(vocalList.size()));
				name += consonantList.get(rand.nextInt(consonantList.size()));

			} else if (!a && !b && c) {
				name += vocalList.get(rand.nextInt(vocalList.size()));
				name += consonantList.get(rand.nextInt(consonantList.size()));
				name += vocalList.get(rand.nextInt(vocalList.size()));

			} else if (!a && !b && !c) {
				name += consonantList.get(rand.nextInt(consonantList.size()));
				name += vocalList.get(rand.nextInt(vocalList.size()));

			} else if (a && b && !c) {
				name += vocalList.get(rand.nextInt(vocalList.size()));
				name += consonantList.get(rand.nextInt(consonantList.size()));

			} else if (!a && b && c) {
				name += vocalList.get(rand.nextInt(vocalList.size()));

			} else if (a && !b && c) {
				name += consonantList.get(rand.nextInt(consonantList.size()));

				name += specVocList[rand.nextInt(specVocList.length)];

			} /*
				 * else if (a && b && c && d){
				 * 
				 * int k = (int) Math.random() * specVocList.length; System.out.println(k); if
				 * (k == 0) { k = 1; } name += specVocList[k]; System.out.println("12345");
				 * 
				 * }
				 */

		}

		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}

}
