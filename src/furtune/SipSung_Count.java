package furtune;

import java.util.ArrayList;
import java.util.List;

public class SipSung_Count {
	
	private SipSung sipsung;
	
	public SipSung_Count(SipSung sipsung) {
		this.sipsung=sipsung;
	}
	
	public static void Count_SipSung() {
		
		SipSung s1 = new SipSung("비겁",GapJa_YukChin.getBigup());
		SipSung s2 = new SipSung("식상",GapJa_YukChin.getSiksang());
		SipSung s3 = new SipSung("재성",GapJa_YukChin.getJaesung());
		SipSung s4 = new SipSung("관성",GapJa_YukChin.getGwansung());
		SipSung s5 = new SipSung("인성",GapJa_YukChin.getInsung());
		
		ArrayList <SipSung> ss = new ArrayList<>();
		ss.add(s1);ss.add(s2);ss.add(s3);ss.add(s4);ss.add(s5);
		
		ArrayList <Integer> sipsang = new ArrayList <>();
		sipsang.add(GapJa_YukChin.getBigup());sipsang.add(GapJa_YukChin.getSiksang());sipsang.add(GapJa_YukChin.getJaesung());sipsang.add(GapJa_YukChin.getGwansung());sipsang.add(GapJa_YukChin.getInsung());
		ArrayList <String> sipsang_String = new ArrayList <>();
		sipsang_String.add("비겁");sipsang_String.add("식상");sipsang_String.add("재성");
		sipsang_String.add("관성");sipsang_String.add("인성");
		
		for (int i = 0; i<5; i++) {
			System.out.print(ss.get(i).getSipsung());
			System.out.print(":");
			System.out.print(ss.get(i).getSipsung_num());
			if (ss.get(i).getSipsung_num()>2) {
			System.out.print("(과다) ");
			}
			else if (ss.get(i).getSipsung_num()<=2 && ss.get(i).getSipsung_num()>0) {
				System.out.print("(적정) ");
				}
			else if (ss.get(i).getSipsung_num()==0) {
				System.out.print("(부족) ");
				}
			
		}
		System.out.println();
	}
}
