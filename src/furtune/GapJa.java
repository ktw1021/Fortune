package furtune;

import java.util.ArrayList;

public class GapJa {
	
	private String ilju;
	private static String ilgan;
	private static String ilji;
	private static String yungan;
	private static String yunji;
	private static String wolgan;
	private static String wolji;
	private static String sigan;
	private static String siji;

	
	
	public static String getYungan() {
		return yungan;
	}
	public static void setYungan(String newYungan) {
		yungan = newYungan;
	}
	public static String getYunji() {
		return yunji;
	}
	public static void setYunji(String newYunji) {
		yunji = newYunji;
	}
	public static String getSiji() {
		return siji;
	}
	public static void setSiji(String newSiji) {
		siji = newSiji;
	}
	public static String getWolgan() {
		return wolgan;
	}
	public static void setWolgan(String newWolgan) {
		wolgan = newWolgan;
	}
	public static String getWolji() {
		return wolji;
	}
	public static void setWolji(String newWolji) {
		wolji = newWolji;
	}
	public static String getSigan() {
		return sigan;
	}
	public static void setSigan(String newSigan) {
		sigan = newSigan;
	}
	
    public String getIlju() {
		return ilju;
	}
	public void setIlju(String ilju) {
		this.ilju = ilju;
	}
	public static String getIlgan() {
		return ilgan;
	}
	public static void setIlgan(String newIlgan) {
		ilgan = newIlgan;
	}
	public static String getIlji() {
		return ilji;
	}
	public static void setIlji(String newIlji) {
		ilji = newIlji;
	}
	
	
	public static void transformer(String lunYear, String lunMonth, String lunDay, double inputHour) {

    //	연간
    int chungan1 = Integer.parseInt(lunYear)%10;
	
	switch (chungan1) {
	case 4:	setYungan("갑"); break;	case 5:	setYungan("을"); break;	case 6:	setYungan("병"); break;	case 7:	setYungan("정"); break;
	case 8:	setYungan("무"); break;	case 9:	setYungan("기"); break;	case 0:	setYungan("경"); break;	case 1:	setYungan("신"); break;
	case 2:	setYungan("임"); break;	case 3:	setYungan("계"); break;
	}	
	
    //	월간	
	int chungan2 = Integer.parseInt(lunMonth);
	if (yungan.equals("갑") || yungan.equals("기")) { 
	switch(chungan2) { 
	case 1:	setWolgan("병"); break; case 2: setWolgan("정"); break; case 3: setWolgan("무"); break;
	case 4: setWolgan("기"); break; case 5: setWolgan("경"); break; case 6: setWolgan("신"); break;
	case 7:	setWolgan("임"); break; case 8: setWolgan("계"); break; case 9: setWolgan("갑"); break;
	case 10: setWolgan("을"); break; case 11: setWolgan("병"); break; case 12: setWolgan("정"); break;}
	}
	else if (yungan.equals("을") || yungan.equals("경")) {
		switch (chungan2) {
		case 1:	setWolgan("무"); break; case 2: setWolgan("기"); break; case 3: setWolgan("경"); break;
		case 4: setWolgan("신"); break; case 5: setWolgan("임"); break; case 6: setWolgan("계"); break;
		case 7:	setWolgan("갑"); break; case 8: setWolgan("을"); break; case 9: setWolgan("병"); break;
		case 10: setWolgan("정"); break; case 11: setWolgan("무"); break; case 12: setWolgan("기"); break;}
		}
	else if (yungan.equals("병") || yungan.equals("신")) {
		switch(chungan2) {
		case 1: setWolgan("경"); break; case 2: setWolgan("신"); break; case 3: setWolgan("임"); break;
		case 4: setWolgan("계"); break; case 5: setWolgan("갑"); break; case 6: setWolgan("을"); break;
		case 7:	setWolgan("병"); break; case 8: setWolgan("정"); break; case 9: setWolgan("무"); break;
		case 10: setWolgan("기"); break; case 11: setWolgan("경"); break; case 12: setWolgan("신"); break;}
		}
	else if (yungan.equals("정") || yungan.equals("임")) {
		switch(chungan2) {
		case 1: setWolgan("임"); break; case 2: setWolgan("계"); break; case 3: setWolgan("갑"); break;
		case 4: setWolgan("을"); break; case 5: setWolgan("병"); break; case 6: setWolgan("정"); break;
		case 7:	setWolgan("무"); break; case 8: setWolgan("기"); break; case 9: setWolgan("경"); break;
		case 10: setWolgan("신"); break; case 11: setWolgan("임"); break; case 12: setWolgan("계"); break;}
		}
	else if (yungan.equals("무") || yungan.equals("계")) {
		switch(chungan2) {
		case 1: setWolgan("갑"); break; case 2: setWolgan("을"); break; case 3: setWolgan("병"); break;
		case 4: setWolgan("정"); break; case 5: setWolgan("무"); break; case 6: setWolgan("기"); break;
		case 7:	setWolgan("경"); break; case 8: setWolgan("신"); break; case 9: setWolgan("임"); break;
		case 10: setWolgan("계"); break; case 11: setWolgan("갑"); break; case 12: setWolgan("을"); break;}	
		}
	
	//	연지
	int jiji = Integer.parseInt(lunYear)%12;
	switch (jiji) {
	case 4:	setYunji("자"); break;	case 5: setYunji("축"); break;	case 6: setYunji("인"); break;	case 7: setYunji("묘"); break;
	case 8: setYunji("진"); break;	case 9: setYunji("사"); break;	case 10: setYunji("오"); break;	case 11: setYunji("미"); break;
	case 0: setYunji("신"); break;	case 1: setYunji("유"); break;	case 2: setYunji("술"); break;	case 3: setYunji("해"); break;
	}	
	
    //	월지
	int wol = Integer.parseInt(lunMonth);
	switch(wol) {
	case 11: setWolji("자"); break; case 12: setWolji("축"); break; case 1: setWolji("인"); break;
	case 2: setWolji("묘"); break; case 3: setWolji("진"); break; case 4: setWolji("사"); break;
	case 5: setWolji("오"); break; case 6: setWolji("미"); break; case 7: setWolji("신"); break;
	case 8: setWolji("유"); break; case 9: setWolji("술"); break; case 10: setWolji("해"); break;
	}
	//	API적시된 대로 일간-일지 도출
	StringBuilder sb = new StringBuilder(lunDay);
	ilgan = String.valueOf(sb.charAt(0));
	ilji = String.valueOf(sb.charAt(1));
	
	//	시지
	double si=inputHour;
	if (si>=23 || si<1) {setSiji("자");}	else if (si>=1 && si<3) {setSiji("축");}	else if (si>=3 && si<5) {setSiji("인");}
	else if (si>=5 && si<7) {setSiji("묘");}	else if (si>=7 && si<9) {setSiji("진");}	else if (si>=9 && si<11) {setSiji("사");}
	else if (si>=11 && si<13) {setSiji("오");}	else if (si>=13 && si<15) {setSiji("미");}	else if (si>=15 && si<17) {setSiji("신");}
	else if (si>=17 && si<19) {setSiji("유");}	else if (si>=19 && si<21) {setSiji("술");}	else if (si>=21 && si<23) {setSiji("해");}
	
//	시간
	if (ilgan.equals("갑") || ilgan.equals("기")) {
		if (si>=23 || si<1) {setSigan("갑");}	else if (si>=1 && si<3) {setSigan("을");}	else if (si>=3 && si<5) {setSigan("병");}
		else if (si>=5 && si<7) {setSigan("정");}	else if (si>=7 && si<9) {setSigan("무");}	else if (si>=9 && si<11) {setSigan("기");}
		else if (si>=11 && si<13) {setSigan("경");}	else if (si>=13 && si<15) {setSigan("신");}	else if (si>=15 && si<17) {setSigan("임");}
		else if (si>=17 && si<19) {setSigan("계");}	else if (si>=19 && si<21) {setSigan("갑");}	else if (si>=21 && si<23) {setSigan("을");}
		}
	else if (ilgan.equals("을") || ilgan.equals("경")) {
		if (si>=23 || si<1) {setSigan("병");}	else if (si>=1 && si<3) {setSigan("정");}	else if (si>=3 && si<5) {setSigan("무");}
		else if (si>=5 && si<7) {setSigan("기");}	else if (si>=7 && si<9) {setSigan("경");}	else if (si>=9 && si<11) {setSigan("신");}
		else if (si>=11 && si<13) {setSigan("임");}	else if (si>=13 && si<15) {setSigan("계");}	else if (si>=15 && si<17) {setSigan("갑");}
		else if (si>=17 && si<19) {setSigan("을");}	else if (si>=19 && si<21) {setSigan("병");}	else if (si>=21 && si<23) {setSigan("정");}
		}
	else if (ilgan.equals("병") || ilgan.equals("신")) 
		{if (si >= 23 || si < 1) { setSigan("무"); } else if (si >= 1 && si < 3) { setSigan("기"); } else if (si >= 3 && si < 5) { setSigan("경"); }
	    else if (si >= 5 && si < 7) { setSigan("신"); } else if (si >= 7 && si < 9) { setSigan("임"); } else if (si >= 9 && si < 11) { setSigan("계"); }
	    else if (si >= 11 && si < 13) { setSigan("갑"); } else if (si >= 13 && si < 15) { setSigan("을"); } else if (si >= 15 && si < 17) { setSigan("병"); } 
	    else if (si >= 17 && si < 19) { setSigan("정"); } else if (si >= 19 && si < 21) { setSigan("무"); } else if (si >= 21 && si < 23) { setSigan("기"); }
	} 
	else if (ilgan.equals("정") || ilgan.equals("임")) {
		if (si >= 23 || si < 1) { setSigan("경"); } else if (si >= 1 && si < 3) { setSigan("신"); } else if (si >= 3 && si < 5) { setSigan("임"); }
	    else if (si >= 5 && si < 7) { setSigan("계"); } else if (si >= 7 && si < 9) { setSigan("갑"); } else if (si >= 9 && si < 11) { setSigan("을"); }
	    else if (si >= 11 && si < 13) { setSigan("병"); } else if (si >= 13 && si < 15) { setSigan("정"); } else if (si >= 15 && si < 17) { setSigan("무"); }
	    else if (si >= 17 && si < 19) { setSigan("기"); } else if (si >= 19 && si < 21) { setSigan("경"); } else if (si >= 21 && si < 23) { setSigan("신"); }
	} 
	else if (ilgan.equals("무") || ilgan.equals("계")) {
	    if (si >= 23 || si < 1) { setSigan("임"); } else if (si >= 1 && si < 3) { setSigan("계"); } else if (si >= 3 && si < 5) { setSigan("갑"); }
	    else if (si >= 5 && si < 7) { setSigan("을"); } else if (si >= 7 && si < 9) { setSigan("병"); } else if (si >= 9 && si < 11) { setSigan("정"); }
	    else if (si >= 11 && si < 13) { setSigan("무"); } else if (si >= 13 && si < 15) { setSigan("기"); } else if (si >= 15 && si < 17) { setSigan("경"); }
	    else if (si >= 17 && si < 19) { setSigan("신"); } else if (si >= 19 && si < 21) { setSigan("임"); } else if (si >= 21 && si < 23) { setSigan("계"); }
	}
	
	// 천간의 오행 추출
	String sigan_Element = (Enum_HeavenlyStems.valueOf(sigan)).getElement();
	String ilgan_Element = (Enum_HeavenlyStems.valueOf(ilgan)).getElement();
	String wolgan_Element = (Enum_HeavenlyStems.valueOf(wolgan)).getElement();
	String yungan_Element = (Enum_HeavenlyStems.valueOf(yungan)).getElement();
	
	// 지지의 오행 추출
	String siji_Element = (Enum_Zodiacs.valueOf(siji)).getElement();
	String ilji_Element = (Enum_Zodiacs.valueOf(ilji)).getElement();
	String wolji_Element = (Enum_Zodiacs.valueOf(wolji)).getElement();
	String yunji_Element = (Enum_Zodiacs.valueOf(yunji)).getElement();
	
	// 천간의 음양 추출
	String yungan_YinYang = (Enum_HeavenlyStems.valueOf(GapJa.getYungan())).getYinYang();
	String wolgan_YinYang = (Enum_HeavenlyStems.valueOf(GapJa.getWolgan())).getYinYang();
	String ilgan_YinYang = (Enum_HeavenlyStems.valueOf(GapJa.getIlgan())).getYinYang();
	String sigan_YinYang = (Enum_HeavenlyStems.valueOf(GapJa.getSigan())).getYinYang();
	
	// 지지의 음양 추출
	String yunji_YinYang = (Enum_Zodiacs.valueOf(GapJa.getYunji())).getYinYang();
	String wolji_YinYang = (Enum_Zodiacs.valueOf(GapJa.getWolji())).getYinYang();
	String ilji_YinYang = (Enum_Zodiacs.valueOf(GapJa.getIlji())).getYinYang();
	String siji_YinYang = (Enum_Zodiacs.valueOf(GapJa.getSiji())).getYinYang();
	
	// 천간지지의 음양 리스트화(일간 기준으로 순서대로 정렬)
	ArrayList<String> yinYang_lst = new ArrayList<>();
	yinYang_lst.add(ilgan_YinYang);	yinYang_lst.add(sigan_YinYang);	yinYang_lst.add(wolgan_YinYang);yinYang_lst.add(yungan_YinYang); 
	yinYang_lst.add(siji_YinYang);	yinYang_lst.add(ilji_YinYang);	yinYang_lst.add(wolji_YinYang);	yinYang_lst.add(yunji_YinYang); 
	

	// 추출된 천간지지의 음양오행을, 육친 클래스에서 처리하여 반환

	

	
	System.out.printf("*시주*\t*일주*\t*월주*\t*연주*%n");
	//	4개 기둥 위쪽에 천간의 십신 호출
	GapJa_YukChin.YukChin_Chungan();
	//	각 천간지지 마다 오행과 음양을 표시 
	System.out.printf("%s%s%s \t %s%s%s \t %s%s%s \t %s%s%s%n"
					+ "%s%s%s \t %s%s%s \t %s%s%s \t %s%s%s%n",
					sigan, sigan_Element, sigan_YinYang,		ilgan, ilgan_Element, ilgan_YinYang,
					wolgan, wolgan_Element,  wolgan_YinYang,	yungan, yungan_Element, yungan_YinYang,
					siji, siji_Element, siji_YinYang,			ilji, ilji_Element, ilji_YinYang,	
					wolji, wolji_Element, wolji_YinYang,		yunji, yunji_Element, yunji_YinYang);
	
	
	GapJa_YukChin.YukChin_jiji(yinYang_lst);
    
}
}
