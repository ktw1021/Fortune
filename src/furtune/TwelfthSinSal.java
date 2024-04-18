package furtune;

import java.util.ArrayList;
import java.util.Calendar;

public class TwelfthSinSal {

	private GapJa gapja;

		public static void Sal() {
			String belt = GapJa.getYunji();
			
			String siji = GapJa.getSiji();
			String ilji = GapJa.getIlji();
			String wolji = GapJa.getWolji();
			
			ArrayList<String> jiji_arr = new ArrayList<>();
			jiji_arr.add(siji);
			jiji_arr.add(ilji);
			jiji_arr.add(wolji);
			jiji_arr.add(belt);
			
			
			Calendar now = Calendar.getInstance();
			int nowYear = now.get(Calendar.YEAR);
			int jiji = nowYear%12;
			switch (jiji) {
			case 4:	jiji_arr.add("자"); break;	case 5: jiji_arr.add("축"); break;	case 6: jiji_arr.add("인"); break;	case 7: jiji_arr.add("묘"); break;
			case 8: jiji_arr.add("진"); break;	case 9: jiji_arr.add("사"); break;	case 10: jiji_arr.add("오"); break;	case 11: jiji_arr.add("미"); break;
			case 0: jiji_arr.add("신"); break;	case 1: jiji_arr.add("유"); break;	case 2: jiji_arr.add("술"); break;	case 3: jiji_arr.add("해"); break;
			}	
			
			ArrayList<String> sal = new ArrayList<>();
			
			for (int i = 0; i<5; i++) {
			if (belt.equals("인") || belt.equals("오") || belt.equals("술")) {
				switch (jiji_arr.get(i)){
				case "묘": sal.add("도화살");break; case "술":sal.add("화개살"); break;	case "사": sal.add("망신살"); break; 
				case "신": sal.add("역마살");break; case "인":sal.add("지살"); break;	case "미": sal.add("반안살"); break;
				case "오": sal.add("장성살");break; case "유":sal.add("육해살");	break;	case "축": sal.add("천살");	break;
				case "진": sal.add("월살"); break; case "자":sal.add("재살");	break;	case "해": sal.add("겁살");	break;
				default: break;
				}
			}
			else if (belt.equals("사") || belt.equals("유") || belt.equals("축")) {
				switch (jiji_arr.get(i)){
				case "오": sal.add("도화살");break; case "축":sal.add("화개살"); break;	case "신": sal.add("망신살"); break; 
				case "해": sal.add("역마살");break; case "사":sal.add("지살"); break;	case "술": sal.add("반안살"); break;
				case "유": sal.add("장성살");break; case "자":sal.add("육해살");	break;	case "진": sal.add("천살");	break;
				case "미": sal.add("월살"); break; case "묘":sal.add("재살");	break;	case "인": sal.add("겁살");	break;
				default: break;
				}
			}
			else if (belt.equals("신") || belt.equals("자") || belt.equals("진")) {
				switch (jiji_arr.get(i)){
				case "유": sal.add("도화살");break; case "진":sal.add("화개살"); break;	case "해": sal.add("망신살"); break; 
				case "인": sal.add("역마살");break; case "신":sal.add("지살"); break;	case "축": sal.add("반안살"); break;
				case "자": sal.add("장성살");break; case "묘":sal.add("육해살");	break;	case "미": sal.add("천살");	break;
				case "술": sal.add("월살"); break; case "오":sal.add("재살");	break;	case "사": sal.add("겁살");	break;
				default: break;
				}
			}
			else if (belt.equals("해") || belt.equals("묘") || belt.equals("미")) {
				switch (jiji_arr.get(i)){
				case "자": sal.add("도화살");break; case "미":sal.add("화개살"); break;	case "인": sal.add("망신살"); break; 
				case "사": sal.add("역마살");break; case "해":sal.add("지살"); break;	case "진": sal.add("반안살"); break;
				case "묘": sal.add("장성살");break; case "오":sal.add("육해살");	break;	case "술": sal.add("천살");	break;
				case "축": sal.add("월살"); break; case "유":sal.add("재살");	break;	case "신": sal.add("겁살");	break;
				default: break;
				}
			}
		}
			
			
			System.out.print(sal.get(0) + "\t" + sal.get(1) + "\t" + sal.get(2) + "\t" + sal.get(3));
			System.out.println();
			System.out.println("올해 신살: *" + sal.get(4)+"*");
			
			
	}
}
