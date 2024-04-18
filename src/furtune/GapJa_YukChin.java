package furtune;

import java.util.ArrayList;


public class GapJa_YukChin {

	private static int bigup;
	private static int siksang;
	private static int jaesung;
	private static int gwansung;
	private static int insung;
	
	
	//	GapJa_Chungan_YinYang 클래스에서 천간지지의 음양 정보 받기.
	//	천간지지의 enum에서 직접 각 오행 값을 추출. 
	private static ArrayList<String> element_lst = new ArrayList<>();
	//	천간의 오행 추출
	public static String ilgan_element = Enum_HeavenlyStems.valueOf(GapJa.getIlgan()).getElement(); 
	private static String sigan_element = (Enum_HeavenlyStems.valueOf(GapJa.getSigan())).getElement();	
	private static String wolgan_element = (Enum_HeavenlyStems.valueOf(GapJa.getWolgan())).getElement();
	private static String yungan_element = (Enum_HeavenlyStems.valueOf(GapJa.getYungan())).getElement();
		
	//	지지의 오행 추출
	private static String siji_element =(Enum_Zodiacs.valueOf(GapJa.getSiji())).getElement();
	private static String ilji_element  = (Enum_Zodiacs.valueOf(GapJa.getIlji())).getElement();	
	private static String wolji_element = (Enum_Zodiacs.valueOf(GapJa.getWolji())).getElement();	
	private static String yunji_element = (Enum_Zodiacs.valueOf(GapJa.getYunji())).getElement(); 
	
	// 천간의 음양 추출
	private static ArrayList<String> yinYang_lst = new ArrayList<>();
	private static String yungan_YinYang = Enum_HeavenlyStems.valueOf(GapJa.getYungan()).getYinYang();
	private static String wolgan_YinYang = (Enum_HeavenlyStems.valueOf(GapJa.getWolgan())).getYinYang();
	private static String ilgan_YinYang = (Enum_HeavenlyStems.valueOf(GapJa.getIlgan())).getYinYang();
	private static String siganYinYang = (Enum_HeavenlyStems.valueOf(GapJa.getSigan())).getYinYang();
	
	// 지지의 음양 추출
	private static String yunji_YinYang = (Enum_Zodiacs.valueOf(GapJa.getYunji())).getYinYang();
	private static String wolji_YinYang = (Enum_Zodiacs.valueOf(GapJa.getWolji())).getYinYang();
	private static String ilji_YinYang = (Enum_Zodiacs.valueOf(GapJa.getIlji())).getYinYang();
	private static String siji_YinYang = (Enum_Zodiacs.valueOf(GapJa.getSiji())).getYinYang();
	


	public static void YukChin_Chungan() {

		//	천간지지의 오행 추출을 ArrayList에 추가
		element_lst.add(ilgan_element); element_lst.add(sigan_element);	
		element_lst.add(wolgan_element); element_lst.add(yungan_element);
		element_lst.add(siji_element);	element_lst.add(ilji_element);	
		element_lst.add(wolji_element);	element_lst.add(yunji_element); 
		
		//	천간지지의 음양을 ArrayList에 추가
		yinYang_lst.add(ilgan_YinYang);	yinYang_lst.add(siganYinYang);	
		yinYang_lst.add(wolgan_YinYang);yinYang_lst.add(yungan_YinYang);
		yinYang_lst.add(siji_YinYang);	yinYang_lst.add(ilji_YinYang);	
		yinYang_lst.add(wolji_YinYang);	yinYang_lst.add(yunji_YinYang);
		
		
		//	결과값을 저장할 육친 어레이
		ArrayList<String> yukchin = new ArrayList<>();
		
		// 결과값이 아신인 일간 먼저 추가
		String ilgan = "아신"; 
		yukchin.add(ilgan);
		
		
		//	(0)비겁, (1)식상, (2)재성, (3)관성, (4)인성 카운트
		//	시간부터 연지까지 차례로 루프
		for (int i = 1; i<4; i++) {
			
			// 비견 조건(일간과 음양, 오행이 같음)
			if (element_lst.get(0).equals(element_lst.get(i)) && yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				yukchin.add("비견");
				bigup++;
			}
			// 겁재 조건(일간과 오행이 같고, 음양이 다름)
			else if (element_lst.get(0).equals(element_lst.get(i)) && !yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				yukchin.add("겁재");
				bigup++;
			}
			// 그 후, 음양이 같을 경우, 1- 식신(일간이 생), 2-편재(일간이 극), 3-편관(일간을 극), 4-편인(일간을 생)  
			else if (yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				// '화'의 경우,
				if (element_lst.get(0).equals("火")) {
					if (element_lst.get(i).equals("土")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("편인");insung++;}
					}
				// '수'의 경우,
				else if (element_lst.get(0).equals("水")) {
					if (element_lst.get(i).equals("木")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("편인");insung++;}}
				// '목'의 경우,
				else if (element_lst.get(0).equals("木")) {
					if (element_lst.get(i).equals("火")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("편인");insung++;}
				}
				// '금'의 경우,
				else if (element_lst.get(0).equals("金")) {
					if (element_lst.get(i).equals("水")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("편인");insung++;}
				}
				// '토'의 경우,
				else if (element_lst.get(0).equals("土")) {
					if (element_lst.get(i).equals("金")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("편인");insung++;}
				}
			}
			//	음양이 다를 경우, 1-상관(일간이 생), 2-정재(일간이 극), 3-정관(일간을 극), 4-정인(일간을 생)
			else if (!yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				// '화'의 경우,
				if (element_lst.get(0).equals("火")) {
					if (element_lst.get(i).equals("土")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("정인");insung++;}
				}
				// '수'의 경우,
				else if (element_lst.get(0).equals("水")) {
					if (element_lst.get(i).equals("木")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("정인");insung++;}
				}
				// '목'의 경우,
				else if (element_lst.get(0).equals("木")) {
					if (element_lst.get(i).equals("火")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("정인");insung++;}
				}
				// '금'의 경우,
				else if (element_lst.get(0).equals("金")) {
					if (element_lst.get(i).equals("水")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("정인");insung++;}
				}
				// '토'의 경우,
				else if (element_lst.get(0).equals("土")) {
					if (element_lst.get(i).equals("金")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("정인");insung++;}
				}
			}
		}
		System.out.printf("%s   \t%s   \t%s   \t%s%n",yukchin.get(1),yukchin.get(0),yukchin.get(2),yukchin.get(3));
	}
	public static void YukChin_jiji(ArrayList <String> yinYang_lst) {
		

		//	결과값을 저장할 육친 어레이
		ArrayList<String> yukchin = new ArrayList<>();
		
		
		//	시간부터 연지까지 차례로 루프
		for (int i = 4; i<8; i++) {
			
			// 비견 조건(일간과 음양, 오행이 같음)
			if (element_lst.get(0).equals(element_lst.get(i)) && yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				yukchin.add("비견");
				bigup++;
			}
			// 겁재 조건(일간과 오행이 같고, 음양이 다름)
			else if (element_lst.get(0).equals(element_lst.get(i)) && !yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				yukchin.add("겁재");
				bigup++;
			}
			// 그 후, 음양이 같을 경우, 1- 식신(일간이 생), 2-편재(일간이 극), 3-편관(일간을 극), 4-편인(일간을 생)  
			else if (yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				// '화'의 경우,
				if (element_lst.get(0).equals("火")) {
					if (element_lst.get(i).equals("土")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("편인");insung++;}
				}
				// '수'의 경우,
				else if (element_lst.get(0).equals("水")) {
					if (element_lst.get(i).equals("木")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("편인");insung++;}
				}
				// '목'의 경우,
				else if (element_lst.get(0).equals("木")) {
					if (element_lst.get(i).equals("火")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("편인");insung++;}
				}
				// '금'의 경우,
				else if (element_lst.get(0).equals("金")) {
					if (element_lst.get(i).equals("水")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("편인");insung++;}
				}
				// '토'의 경우,
				else if (element_lst.get(0).equals("土")) {
					if (element_lst.get(i).equals("金")) {yukchin.add("식신");siksang++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("편재");jaesung++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("편관");gwansung++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("편인");insung++;}
				}
			}
			//	음양이 다를 경우, 1-상관(일간이 생), 2-정재(일간이 극), 3-정관(일간을 극), 4-정인(일간을 생)
			else if (!yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				// '화'의 경우,
				if (element_lst.get(0).equals("火")) {
					if (element_lst.get(i).equals("土")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("정인");insung++;}
				}
				// '수'의 경우,
				else if (element_lst.get(0).equals("水")) {
					if (element_lst.get(i).equals("木")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("정인");insung++;}
				}
				// '목'의 경우,
				else if (element_lst.get(0).equals("木")) {
					if (element_lst.get(i).equals("火")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("金")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("정인");insung++;}
				}
				// '금'의 경우,
				else if (element_lst.get(0).equals("金")) {
					if (element_lst.get(i).equals("水")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("土")) {yukchin.add("정인");insung++;}
				}
				// '토'의 경우,
				else if (element_lst.get(0).equals("土")) {
					if (element_lst.get(i).equals("金")) {yukchin.add("상관");siksang++;}
					else if (element_lst.get(i).equals("水")) {yukchin.add("정재");jaesung++;}
					else if (element_lst.get(i).equals("木")) {yukchin.add("정관");gwansung++;}
					else if (element_lst.get(i).equals("火")) {yukchin.add("정인");insung++;}
				}
			}
		}
		System.out.printf("%s   \t%s   \t%s   \t%s%n", yukchin.get(0), yukchin.get(1), yukchin.get(2), yukchin.get(3));
		
		setBigup(bigup);setSiksang(siksang);setJaesung(jaesung);setGwansung(gwansung);setInsung(insung);
	}
	

	
	public static int getBigup() {
		return bigup;
	}
	public static void setBigup(int bigup) {
		GapJa_YukChin.bigup = bigup;
	}
	public static int getSiksang() {
		return siksang;
	}
	public static void setSiksang(int siksang) {
		GapJa_YukChin.siksang = siksang;
	}
	public static int getJaesung() {
		return jaesung;
	}
	public static void setJaesung(int jaesung) {
		GapJa_YukChin.jaesung = jaesung;
	}
	public static int getGwansung() {
		return gwansung;
	}
	public static void setGwansung(int gwansung) {
		GapJa_YukChin.gwansung = gwansung;
	}
	public static int getInsung() {
		return insung;
	}
	public static void setInsung(int insung) {
		GapJa_YukChin.insung = insung;
	}
	
}
