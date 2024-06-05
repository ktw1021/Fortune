package furtune;

import java.util.ArrayList;

public class Twelve_Branches {
	//12운성
	
	private static ArrayList <String> arr = new ArrayList<>();
	/**
	 * @return the arr
	 */
	public static ArrayList<String> getArr() {
		return arr;
	}

	/**
	 * @param arr the arr to set
	 */
	public static void setArr(ArrayList<String> arr) {
		Twelve_Branches.arr = arr;
	}

	public GapJa gapja;
	
	public static void Branches() {
		
		String yungan = GapJa.getYungan();
		String wolgan = GapJa.getWolgan();
		String ilgan  = GapJa.getIlgan();
		String sigan  = GapJa.getSigan();
		
		String yunji = GapJa.getYunji();
		String wolji = GapJa.getWolji();
		String ilji  = GapJa.getIlji();
		String siji  = GapJa.getSiji();
		
		
		arr.add(sigan);	arr.add(ilgan);	arr.add(wolgan); arr.add(yungan);
		arr.add(siji);	arr.add(ilji);	arr.add(wolji); arr.add(yunji);
		
		ArrayList <String> result = new ArrayList<>();
		
		for (int i = 0; i<4; i++) {
			// 천간이 갑일 경우,
			if (arr.get(1).equals("갑")) {
				if (arr.get(i+4).equals("인")) {	result.add("건록");}	
				else if (arr.get(i+4).equals("묘")) {result.add("제왕");}
				else if (arr.get(i+4).equals("진")) {result.add("쇠");}	
				else if (arr.get(i+4).equals("사")) {result.add("병");}
				else if (arr.get(i+4).equals("오")) {result.add("사");}
				else if (arr.get(i+4).equals("미")) {result.add("묘");}
				else if (arr.get(i+4).equals("신")) {result.add("절");}
				else if (arr.get(i+4).equals("유")) {result.add("태");}
				else if (arr.get(i+4).equals("술")) {result.add("양");}
				else if (arr.get(i+4).equals("해")) {result.add("장생");}
				else if (arr.get(i+4).equals("자")) {result.add("목욕");}
				else if (arr.get(i+4).equals("축")) {result.add("관대");}
			}	// 천간이 을인 경우,
			else if (arr.get(1).equals("을")) {
				if (arr.get(i+4).equals("인")) {	result.add("제왕");}	
				else if (arr.get(i+4).equals("묘")) {result.add("건록");}
				else if (arr.get(i+4).equals("진")) {result.add("관대");}	
				else if (arr.get(i+4).equals("사")) {result.add("목욕");}
				else if (arr.get(i+4).equals("오")) {result.add("장생");}
				else if (arr.get(i+4).equals("미")) {result.add("양");}
				else if (arr.get(i+4).equals("신")) {result.add("태");}
				else if (arr.get(i+4).equals("유")) {result.add("절");}
				else if (arr.get(i+4).equals("술")) {result.add("묘");}
				else if (arr.get(i+4).equals("해")) {result.add("사");}
				else if (arr.get(i+4).equals("자")) {result.add("병");}
				else if (arr.get(i+4).equals("축")) {result.add("쇠");}
			}	// 천간이 병, 정인 경우,
			else if (arr.get(1).equals("병") || arr.get(i).equals("정")) {
				if (arr.get(i+4).equals("인")) {	result.add("장생");}	
				else if (arr.get(i+4).equals("묘")) {result.add("목욕");}
				else if (arr.get(i+4).equals("진")) {result.add("관대");}	
				else if (arr.get(i+4).equals("사")) {result.add("건록");}
				else if (arr.get(i+4).equals("오")) {result.add("제왕");}
				else if (arr.get(i+4).equals("미")) {result.add("쇠");}
				else if (arr.get(i+4).equals("신")) {result.add("병");}
				else if (arr.get(i+4).equals("유")) {result.add("사");}
				else if (arr.get(i+4).equals("술")) {result.add("묘");}
				else if (arr.get(i+4).equals("해")) {result.add("절");}
				else if (arr.get(i+4).equals("자")) {result.add("태");}
				else if (arr.get(i+4).equals("축")) {result.add("양");}
			}	// 천간이 무, 기인 경우,
			else if (arr.get(1).equals("무") || arr.get(i).equals("기")) {
				if (arr.get(i+4).equals("인")) {	result.add("사");}	
				else if (arr.get(i+4).equals("묘")) {result.add("병");}
				else if (arr.get(i+4).equals("진")) {result.add("쇠");}	
				else if (arr.get(i+4).equals("사")) {result.add("제왕");}
				else if (arr.get(i+4).equals("오")) {result.add("건록");}
				else if (arr.get(i+4).equals("미")) {result.add("관대");}
				else if (arr.get(i+4).equals("신")) {result.add("목욕");}
				else if (arr.get(i+4).equals("유")) {result.add("장생");}
				else if (arr.get(i+4).equals("술")) {result.add("양");}
				else if (arr.get(i+4).equals("해")) {result.add("태");}
				else if (arr.get(i+4).equals("자")) {result.add("절");}
				else if (arr.get(i+4).equals("축")) {result.add("묘");}
			}	// 천간이 경인 경우,
			else if (arr.get(1).equals("경")) {
				if (arr.get(i+4).equals("인")) {	result.add("절");}	
				else if (arr.get(i+4).equals("묘")) {result.add("태");}
				else if (arr.get(i+4).equals("진")) {result.add("양");}	
				else if (arr.get(i+4).equals("사")) {result.add("장생");}
				else if (arr.get(i+4).equals("오")) {result.add("목욕");}
				else if (arr.get(i+4).equals("미")) {result.add("관대");}
				else if (arr.get(i+4).equals("신")) {result.add("건록");}
				else if (arr.get(i+4).equals("유")) {result.add("제왕");}
				else if (arr.get(i+4).equals("술")) {result.add("쇠");}
				else if (arr.get(i+4).equals("해")) {result.add("병");}
				else if (arr.get(i+4).equals("자")) {result.add("사");}
				else if (arr.get(i+4).equals("축")) {result.add("묘");}
			}	// 천간이 신인 경우,
			else if (arr.get(1).equals("신")) {
				if (arr.get(i+4).equals("인")) {	result.add("태");}	
				else if (arr.get(i+4).equals("묘")) {result.add("절");}
				else if (arr.get(i+4).equals("진")) {result.add("묘");}	
				else if (arr.get(i+4).equals("사")) {result.add("사");}
				else if (arr.get(i+4).equals("오")) {result.add("병");}
				else if (arr.get(i+4).equals("미")) {result.add("쇠");}
				else if (arr.get(i+4).equals("신")) {result.add("제왕");}
				else if (arr.get(i+4).equals("유")) {result.add("건록");}
				else if (arr.get(i+4).equals("술")) {result.add("관대");}
				else if (arr.get(i+4).equals("해")) {result.add("목욕");}
				else if (arr.get(i+4).equals("자")) {result.add("장생");}
				else if (arr.get(i+4).equals("축")) {result.add("양");}
			}	// 천간이 임인 경우,
			else if (arr.get(1).equals("임")) {
				if (arr.get(i+4).equals("인")) {	result.add("병");}	
				else if (arr.get(i+4).equals("묘")) {result.add("사");}
				else if (arr.get(i+4).equals("진")) {result.add("묘");}	
				else if (arr.get(i+4).equals("사")) {result.add("절");}
				else if (arr.get(i+4).equals("오")) {result.add("태");}
				else if (arr.get(i+4).equals("미")) {result.add("양");}
				else if (arr.get(i+4).equals("신")) {result.add("장생");}
				else if (arr.get(i+4).equals("유")) {result.add("목욕");}
				else if (arr.get(i+4).equals("술")) {result.add("관대");}
				else if (arr.get(i+4).equals("해")) {result.add("건록");}
				else if (arr.get(i+4).equals("자")) {result.add("제왕");}
				else if (arr.get(i+4).equals("축")) {result.add("쇠");}
			}	// 천간이 계인 경우,
			else if (arr.get(1).equals("계")) {
				if (arr.get(i+4).equals("인")) {	result.add("목욕");}	
				else if (arr.get(i+4).equals("묘")) {result.add("장생");}
				else if (arr.get(i+4).equals("진")) {result.add("양");}	
				else if (arr.get(i+4).equals("사")) {result.add("태");}
				else if (arr.get(i+4).equals("오")) {result.add("절");}
				else if (arr.get(i+4).equals("미")) {result.add("묘");}
				else if (arr.get(i+4).equals("신")) {result.add("사");}
				else if (arr.get(i+4).equals("유")) {result.add("병");}
				else if (arr.get(i+4).equals("술")) {result.add("쇠");}
				else if (arr.get(i+4).equals("해")) {result.add("제왕");}
				else if (arr.get(i+4).equals("자")) {result.add("건록");}
				else if (arr.get(i+4).equals("축")) {result.add("관대");}
			}
		}
		setArr(arr);
		System.out.println(result);
	}
}
