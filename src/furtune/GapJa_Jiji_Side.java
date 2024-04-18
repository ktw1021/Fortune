package furtune;

public class GapJa_Jiji_Side {

	private GapJa gapJa;
	
	public GapJa_Jiji_Side(GapJa gapJa) {
		this.gapJa = gapJa;
	}
	
	public static void sideJiji() {
		String yunji = GapJa.getYunji();
		String wolji = GapJa.getWolji();
		String ilji  = GapJa.getIlji();
		String siji  = GapJa.getSiji();
		
		String coexist = "";
		
		if (yunji.equals(wolji)) {
			switch(yunji) {
			case "자": coexist="자자병존: "; break; case "축": coexist="축축병존: "; break; case "인": coexist="인인병존: "; break;
			case "묘": coexist="묘묘병존: "; break; case "진": coexist="진진병존: "; break; case "사": coexist="사사병존: "; break;
			case "오": coexist="오오병존: "; break; case "미": coexist="미미병존: "; break; case "신": coexist="신신병존: "; break;
			case "유": coexist="유유병존: "; break; case "술": coexist="술술병존: "; break; case "해": coexist="해해병존: "; break;
			}
		}
		else if (wolji.equals(ilji)) {
			switch(wolji) {
			case "자": coexist="자자병존: "; break; case "축": coexist="축축병존: "; break; case "인": coexist="인인병존: "; break;
			case "묘": coexist="묘묘병존: "; break; case "진": coexist="진진병존: "; break; case "사": coexist="사사병존: "; break;
			case "오": coexist="오오병존: "; break; case "미": coexist="미미병존: "; break; case "신": coexist="신신병존: "; break;
			case "유": coexist="유유병존: "; break; case "술": coexist="술술병존: "; break; case "해": coexist="해해병존: "; break;
			}
		}
		else if (ilji.equals(siji)) {
			switch(ilji) {
			case "자": coexist="자자병존: "; break; case "축": coexist="축축병존: "; break; case "인": coexist="인인병존: "; break;
			case "묘": coexist="묘묘병존: "; break; case "진": coexist="진진병존: "; break; case "사": coexist="사사병존: "; break;
			case "오": coexist="오오병존: "; break; case "미": coexist="미미병존: "; break; case "신": coexist="신신병존: "; break;
			case "유": coexist="유유병존: "; break; case "술": coexist="술술병존: "; break; case "해": coexist="해해병존: "; break;
			}
		}
		System.out.println(coexist);
	}
	
}
