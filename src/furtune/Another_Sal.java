package furtune;

import java.util.ArrayList;

public class Another_Sal {
	
	private static ArrayList<String> siju_sal = new ArrayList<>();
	private static ArrayList<String> ilju_sal = new ArrayList<>();
	private static ArrayList<String> wolju_sal = new ArrayList<>();
	private static ArrayList<String> yunju_sal = new ArrayList<>();
	
	public static ArrayList<String> getSiju_sal() {return siju_sal;}
	public static void setSiju_sal(ArrayList<String> siju_sal) {Another_Sal.siju_sal = siju_sal;}
	public static ArrayList<String> getIlju_sal() {return ilju_sal;}
	public static void setIlju_sal(ArrayList<String> ilju_sal) {Another_Sal.ilju_sal = ilju_sal;}
	public static ArrayList<String> getWolju_sal() {return wolju_sal;}
	public static void setWolju_sal(ArrayList<String> wolju_sal) {Another_Sal.wolju_sal = wolju_sal;}
	public static ArrayList<String> getYunju_sal() {return yunju_sal;}
	public static void setYunju_sal(ArrayList<String> yunju_sal) {Another_Sal.yunju_sal = yunju_sal;}
	

	public static void Another_SinSal(ArrayList <String> arr) {
		
		
		//	일간 대 지지 신살 - *시주 위치* 
	//	천을귀인, 건록, 양인, 금여록, 암록, 문창, 학당
		if (arr.get(1).equals("갑")) {
			if (arr.get(4).equals("축") || arr.get(4).equals("미")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("인")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("묘")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("진")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("해")) {siju_sal.add("암록");siju_sal.add("학당");}
			else if (arr.get(4).equals("사")) {siju_sal.add("문창");}
			}
		else if (arr.get(1).equals("을")) {
			if (arr.get(4).equals("자") || arr.get(4).equals("신")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("묘")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("진")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("사")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("술")) {siju_sal.add("암록");}
			else if (arr.get(4).equals("오")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("해")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("병")) {
			if (arr.get(4).equals("해") || arr.get(4).equals("유")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("사")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("오")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("미")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("인")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("정")) {
			if (arr.get(4).equals("해") || arr.get(4).equals("유")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("오")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("미")) {siju_sal.add("양인");siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("유")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("인")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("무")) {
			if (arr.get(4).equals("축") || arr.get(4).equals("미")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("사")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("오")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("미")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("인")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("기")) {
			if (arr.get(4).equals("자")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("오")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("미")) {siju_sal.add("양인");siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("금여록");siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("유")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("인")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("경")) {
			if (arr.get(4).equals("축") || arr.get(4).equals("미")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("신")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("유")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("술")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("사")) {siju_sal.add("암록");siju_sal.add("학당");}
			else if (arr.get(4).equals("해")) {siju_sal.add("문창");}
			}
		else if (arr.get(1).equals("신")) {
			if (arr.get(4).equals("인") || arr.get(4).equals("오")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("유")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("술")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("해")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("진")) {siju_sal.add("암록");}
			else if (arr.get(4).equals("자")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("사")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("임")) {
			if (arr.get(4).equals("사") || arr.get(4).equals("묘")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("해")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("자")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("축")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("인")) {siju_sal.add("문창");siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("계")) {
			if (arr.get(4).equals("사")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("자")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("축")) {siju_sal.add("양인");siju_sal.add("암록");}
			else if (arr.get(4).equals("인")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("묘")) {siju_sal.add("문창");siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("신")) {siju_sal.add("학당");}
			}
	
		//	일간 대 지지 신살 - *일주 위치* 
		//	천을귀인, 건록, 양인, 금여록, 암록, 문창, 학당
		if (arr.get(1).equals("갑")) {
			if (arr.get(5).equals("축") || arr.get(5).equals("미")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("묘")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("진")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("암록");ilju_sal.add("학당");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("문창");}
			}
		else if (arr.get(1).equals("을")) {
			if (arr.get(5).equals("자") || arr.get(5).equals("신")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("묘")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("진")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("술")) {ilju_sal.add("암록");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("병")) {
			if (arr.get(5).equals("해") || arr.get(5).equals("유")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("미")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("정")) {
			if (arr.get(5).equals("해") || arr.get(5).equals("유")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("미")) {ilju_sal.add("양인");ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("유")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("무")) {
			if (arr.get(5).equals("축") || arr.get(5).equals("미")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("미")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("기")) {
			if (arr.get(5).equals("자")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("미")) {ilju_sal.add("양인");ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("금여록");ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("유")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("경")) {
			if (arr.get(5).equals("축") || arr.get(5).equals("미")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("유")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("술")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("암록");ilju_sal.add("학당");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("문창");}
			}
		else if (arr.get(1).equals("신")) {
			if (arr.get(5).equals("인") || arr.get(5).equals("오")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("유")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("술")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("진")) {ilju_sal.add("암록");}
			else if (arr.get(5).equals("자")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("임")) {
			if (arr.get(5).equals("사") || arr.get(5).equals("묘")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("자")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("축")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("문창");ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("계")) {
			if (arr.get(5).equals("사")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("자")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("축")) {ilju_sal.add("양인");ilju_sal.add("암록");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("묘")) {ilju_sal.add("문창");ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("학당");}
			}
		//	일간 대 지지 신살 - *월주 위치* 
		//	천을귀인, 건록, 양인, 금여록, 암록, 문창, 학당
		if (arr.get(1).equals("갑")) {
			if (arr.get(6).equals("축") || arr.get(6).equals("미")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("묘")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("진")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("암록");wolju_sal.add("학당");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("문창");}
			}
		else if (arr.get(1).equals("을")) {
			if (arr.get(6).equals("자") || arr.get(6).equals("신")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("묘")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("진")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("술")) {wolju_sal.add("암록");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("병")) {
			if (arr.get(6).equals("해") || arr.get(6).equals("유")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("미")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("정")) {
			if (arr.get(6).equals("해") || arr.get(6).equals("유")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("미")) {wolju_sal.add("양인");wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("유")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("무")) {
			if (arr.get(6).equals("축") || arr.get(6).equals("미")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("미")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("기")) {
			if (arr.get(6).equals("자")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("미")) {wolju_sal.add("양인");wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("금여록");wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("유")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("경")) {
			if (arr.get(6).equals("축") || arr.get(6).equals("미")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("유")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("술")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("암록");wolju_sal.add("학당");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("문창");}
			}
		else if (arr.get(1).equals("신")) {
			if (arr.get(6).equals("인") || arr.get(6).equals("오")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("유")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("술")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("진")) {wolju_sal.add("암록");}
			else if (arr.get(6).equals("자")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("임")) {
			if (arr.get(6).equals("사") || arr.get(6).equals("묘")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("자")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("축")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("문창");wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("계")) {
			if (arr.get(6).equals("사")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("자")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("축")) {wolju_sal.add("양인");wolju_sal.add("암록");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("묘")) {wolju_sal.add("문창");wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("학당");}
			}
			//		일간 대 지지 신살 - *연주 위치* 
			//	천을귀인, 건록, 양인, 금여록, 암록, 문창, 학당
			if (arr.get(1).equals("갑")) {
				if (arr.get(7).equals("축") || arr.get(7).equals("미")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("묘")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("진")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("암록");yunju_sal.add("학당");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("문창");}
				}
			else if (arr.get(1).equals("을")) {
				if (arr.get(7).equals("자") || arr.get(7).equals("신")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("묘")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("진")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("암록");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("병")) {
				if (arr.get(7).equals("해") || arr.get(7).equals("유")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("미")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("정")) {
				if (arr.get(7).equals("해") || arr.get(7).equals("유")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("미")) {yunju_sal.add("양인");yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("유")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("무")) {
				if (arr.get(7).equals("축") || arr.get(7).equals("미")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("미")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("기")) {
				if (arr.get(7).equals("자")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("미")) {yunju_sal.add("양인");yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("금여록");yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("유")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("경")) {
				if (arr.get(7).equals("축") || arr.get(7).equals("미")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("유")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("암록");yunju_sal.add("학당");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("문창");}
				}
			else if (arr.get(1).equals("신")) {
				if (arr.get(7).equals("인") || arr.get(7).equals("오")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("유")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("진")) {yunju_sal.add("암록");}
				else if (arr.get(7).equals("자")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("임")) {
				if (arr.get(7).equals("사") || arr.get(7).equals("묘")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("자")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("축")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("문창");yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("계")) {
				if (arr.get(7).equals("사")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("자")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("축")) {yunju_sal.add("양인");yunju_sal.add("암록");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("묘")) {yunju_sal.add("문창");yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("학당");}
				}
			
			//월지신살
			//월지-시간
			if (arr.get(6).equals("자")) {
				if (arr.get(0).equals("사")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("임")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("술")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("축") || arr.get(0).equals("진")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(0).equals("경")) {siju_sal.add("천덕");siju_sal.add("월덕");}
				else if (arr.get(0).equals("자")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("축") || arr.get(0).equals("진")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
				if (arr.get(0).equals("정")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("병")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("축")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("해") || arr.get(0).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(0).equals("신")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("갑")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("인")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("해") || arr.get(0).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(0).equals("미")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("임")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("묘")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("해") || arr.get(0).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(0).equals("신")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("경")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("진")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("묘") || arr.get(0).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(0).equals("해")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("병")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("사")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("묘") || arr.get(0).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(0).equals("갑")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("갑")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("오")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("묘") || arr.get(0).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(0).equals("계")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("임")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("미")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("인") || arr.get(0).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(0).equals("인")) {siju_sal.add("천덕"); siju_sal.add("급각살");}
				else if (arr.get(0).equals("경")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("신")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(0).equals("병")) {siju_sal.add("천덕");siju_sal.add("월덕");}
				else if (arr.get(0).equals("유")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("인") || arr.get(0).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(0).equals("을")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("갑")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("술")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("진") || arr.get(0).equals("축")) {siju_sal.add("급각살");}
			}
			//월지신살
			//월지-시지
			if (arr.get(6).equals("자")) {
				if (arr.get(4).equals("술")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("축") || arr.get(4).equals("진")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(4).equals("자")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("축") || arr.get(4).equals("진")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
				if (arr.get(4).equals("축")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("해") || arr.get(4).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(4).equals("인")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("해") || arr.get(4).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(4).equals("묘")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("해") || arr.get(4).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(4).equals("진")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("묘") || arr.get(4).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(4).equals("사")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("묘") || arr.get(4).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(4).equals("오")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("묘") || arr.get(4).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(4).equals("미")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("인") || arr.get(4).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(4).equals("인")) {siju_sal.add("급각살");}
				else if (arr.get(4).equals("신")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(4).equals("유")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("인") || arr.get(4).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(4).equals("술")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("진") || arr.get(4).equals("축")) {siju_sal.add("급각살");}
			}
			//월지신살
			//월지-일간
			if (arr.get(6).equals("자")) {
				if (arr.get(2).equals("사")) {ilju_sal.add("천덕");}
				else if (arr.get(2).equals("임")) {ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(2).equals("경")) {ilju_sal.add("천덕");ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(2).equals("정")) {ilju_sal.add("천덕");}
					else if (arr.get(2).equals("병")) {ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(2).equals("신")) {ilju_sal.add("천덕");}
				else if (arr.get(2).equals("갑")) {ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(2).equals("미")) {ilju_sal.add("천덕");}
				else if (arr.get(2).equals("임")) {ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(2).equals("신")) {ilju_sal.add("천덕");}
				else if (arr.get(2).equals("경")) {ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(2).equals("해")) {ilju_sal.add("천덕");}
				else if (arr.get(2).equals("병")) {ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(2).equals("갑")) {ilju_sal.add("천덕");}
				else if (arr.get(2).equals("갑")) {ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(2).equals("계")) {ilju_sal.add("천덕");}
				else if (arr.get(2).equals("임")) {ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(2).equals("경")) {ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(2).equals("병")) {ilju_sal.add("천덕");ilju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(2).equals("을")) {ilju_sal.add("천덕");}
				else if (arr.get(2).equals("갑")) {ilju_sal.add("월덕");}
			}
			//월지신살
			//월지-일지
			if (arr.get(6).equals("자")) {
				if (arr.get(5).equals("사")) {ilju_sal.add("천덕");}
				else if (arr.get(5).equals("술")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("축") || arr.get(5).equals("진")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(5).equals("자")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("축") || arr.get(5).equals("진")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(5).equals("축")) {ilju_sal.add("천의성");}
					else if (arr.get(5).equals("해") || arr.get(5).equals("자")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(5).equals("인")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("해") || arr.get(5).equals("자")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(5).equals("묘")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("해") || arr.get(5).equals("자")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(5).equals("진")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("묘") || arr.get(5).equals("미")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(5).equals("사")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("묘") || arr.get(5).equals("미")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(5).equals("오")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("묘") || arr.get(5).equals("미")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(5).equals("미")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("인") || arr.get(5).equals("술")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(5).equals("인")) {ilju_sal.add("천덕"); ilju_sal.add("급각살");}
				else if (arr.get(5).equals("신")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("술")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(5).equals("유")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("인") || arr.get(5).equals("술")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(5).equals("술")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("진") || arr.get(5).equals("축")) {ilju_sal.add("급각살");}
			}
			//월지신살
			//월지-월간
			if (arr.get(6).equals("자")) {
				if (arr.get(2).equals("사")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("임")) {wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(2).equals("경")) {wolju_sal.add("천덕");wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(2).equals("정")) {wolju_sal.add("천덕");}
					else if (arr.get(2).equals("병")) {wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(2).equals("신")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("갑")) {wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(2).equals("미")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("임")) {wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(2).equals("신")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("경")) {wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(2).equals("해")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("병")) {wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(2).equals("갑")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("갑")) {wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(2).equals("계")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("임")) {wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(2).equals("인")) {wolju_sal.add("천덕"); wolju_sal.add("급각살");}
				else if (arr.get(2).equals("경")) {wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(2).equals("병")) {wolju_sal.add("천덕");wolju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(2).equals("을")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("갑")) {wolju_sal.add("월덕");}
			}
			//월지신살
			//월지-연간
			if (arr.get(6).equals("자")) {
				if (arr.get(3).equals("사")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("임")) {yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(3).equals("경")) {yunju_sal.add("천덕");yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(3).equals("정")) {yunju_sal.add("천덕");}
					else if (arr.get(3).equals("병")) {yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(3).equals("신")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("갑")) {yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(3).equals("미")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("임")) {yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(3).equals("신")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("경")) {yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(3).equals("해")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("병")) {yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(3).equals("갑")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("갑")) {yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(3).equals("계")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("임")) {yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(3).equals("인")) {yunju_sal.add("천덕"); yunju_sal.add("급각살");}
				else if (arr.get(3).equals("경")) {yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(3).equals("병")) {yunju_sal.add("천덕");yunju_sal.add("월덕");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(3).equals("을")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("갑")) {yunju_sal.add("월덕");}
			}
			//월지신살
			//월지-연지
			if (arr.get(6).equals("자")) {
				if (arr.get(7).equals("사")) {yunju_sal.add("천덕");}
				if (arr.get(7).equals("술")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("축") || arr.get(7).equals("진")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(7).equals("자")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("축") || arr.get(7).equals("진")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(7).equals("축")) {yunju_sal.add("천의성");}
					else if (arr.get(7).equals("해") || arr.get(7).equals("자")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(7).equals("신")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("해") || arr.get(7).equals("자")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(7).equals("묘")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("해") || arr.get(7).equals("자")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(7).equals("진")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("묘") || arr.get(7).equals("미")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(7).equals("해")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("묘") || arr.get(7).equals("미")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(7).equals("오")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("묘") || arr.get(7).equals("미")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(7).equals("미")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("인") || arr.get(7).equals("술")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(7).equals("인")) {yunju_sal.add("천덕"); yunju_sal.add("급각살");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(7).equals("유")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("인") || arr.get(7).equals("술")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(7).equals("술")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("진") || arr.get(7).equals("축")) {yunju_sal.add("급각살");}
			}
			
			// 일지신살
		// 일지-시간
		if (arr.get(5).equals("자")) {
			if (arr.get(0).equals("유")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("인")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("사")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("축")) {
			if (arr.get(0).equals("오")) {siju_sal.add("귀문관살(일)");siju_sal.add("원진살");}
			else if (arr.get(0).equals("묘")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("유")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("인")) {
			if (arr.get(0).equals("미")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("진")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("축")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("묘")) {
			if (arr.get(0).equals("신")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("사")) {siju_sal.add("격각살");siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("진")) {
			if (arr.get(0).equals("해")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("오")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("유")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("사")) {
			if (arr.get(0).equals("술")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("미")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("축")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("오")) {
			if (arr.get(0).equals("축")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("신")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("사")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("미")) {
			if (arr.get(0).equals("인")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("유")) {siju_sal.add("격각살");siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("신")) {
			if (arr.get(0).equals("묘")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("술")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("축")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("유")) {
			if (arr.get(0).equals("자")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("해")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("사")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("술")) {
			if (arr.get(0).equals("사")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("자")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("유")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("해")) {
			if (arr.get(0).equals("진")) {siju_sal.add("귀문관살(일)");}
			else if (arr.get(0).equals("축")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("축")) {siju_sal.add("암금적살");}
		}
		
		// 일지신살
		// 일지-시지
				if (arr.get(5).equals("자")) {
					if (arr.get(4).equals("유")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("인")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("사")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(4).equals("오")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("묘")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("유")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(4).equals("미")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("진")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("축")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(4).equals("신")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("사")) {siju_sal.add("격각살");siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(4).equals("해")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("오")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("유")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(4).equals("술")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("미")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("축")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(4).equals("축")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("신")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("사")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(4).equals("인")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("유")) {siju_sal.add("격각살");siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(4).equals("묘")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("술")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("축")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(4).equals("자")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("해")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("사")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(4).equals("사")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("자")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("유")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(4).equals("진")) {siju_sal.add("귀문관살(일)");}
					else if (arr.get(4).equals("축")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("축")) {siju_sal.add("암금적살");}
				}
				// 일지신살
				// 일지-일간
				if (arr.get(5).equals("자")) {
					if (arr.get(2).equals("유")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("인")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("사")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(2).equals("오")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("묘")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("유")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(2).equals("미")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("진")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(2).equals("신")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("사")) {ilju_sal.add("격각살");ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(2).equals("해")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("오")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("유")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(2).equals("술")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("미")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(2).equals("축")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("신")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("사")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(2).equals("인")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("유")) {ilju_sal.add("격각살");ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(2).equals("묘")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("술")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(2).equals("자")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("해")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("사")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(2).equals("사")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("자")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("유")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(2).equals("진")) {ilju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("축")) {ilju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {ilju_sal.add("암금적살");}
				}
				// 일지신살
				// 일지-월간
				if (arr.get(5).equals("자")) {
					if (arr.get(2).equals("유")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("인")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(2).equals("오")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("묘")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(2).equals("미")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("진")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(2).equals("신")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("사")) {wolju_sal.add("격각살");wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(2).equals("해")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("오")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(2).equals("술")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("미")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(2).equals("축")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("신")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(2).equals("인")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("유")) {wolju_sal.add("격각살");wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(2).equals("묘")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("술")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(2).equals("자")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("해")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(2).equals("사")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("자")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(2).equals("진")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("암금적살");}
				}
				// 일지신살
				// 일지-월지
				if (arr.get(5).equals("자")) {
					if (arr.get(6).equals("유")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("인")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(6).equals("오")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("묘")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(6).equals("미")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("진")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(6).equals("신")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("격각살");wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(6).equals("해")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("오")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(6).equals("술")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("미")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(6).equals("축")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("신")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(6).equals("인")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("격각살");wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(6).equals("묘")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("술")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(6).equals("자")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("해")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(6).equals("사")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("자")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(6).equals("진")) {wolju_sal.add("귀문관살(일)");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("암금적살");}
				}
				// 일지신살
				// 일지-연간
				if (arr.get(5).equals("자")) {
					if (arr.get(3).equals("유")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("인")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(3).equals("오")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("묘")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(3).equals("미")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("진")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(3).equals("신")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("사")) {yunju_sal.add("격각살");yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(3).equals("해")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("오")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(3).equals("술")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("미")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(3).equals("축")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("신")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(3).equals("인")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("유")) {yunju_sal.add("격각살");yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(3).equals("묘")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("술")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(3).equals("자")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("해")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(3).equals("사")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("자")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(3).equals("진")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("암금적살");}
				}
				// 일지신살
				// 일지-연지
				if (arr.get(5).equals("자")) {
					if (arr.get(7).equals("유")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("인")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(7).equals("오")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("묘")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(7).equals("미")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("진")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(7).equals("신")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("격각살");yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(7).equals("해")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("오")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(7).equals("술")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("미")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(7).equals("축")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("신")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(7).equals("인")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("유")) {yunju_sal.add("격각살");yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(7).equals("묘")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("술")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(7).equals("자")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("해")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(7).equals("사")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("자")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(7).equals("진")) {yunju_sal.add("귀문관살(일)");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("암금적살");}
				}
				
				
				// 연지신살(연지-시간)
				
				if(arr.get(7).equals("자")) {
					if (arr.get(0).equals("인")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("술")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("축")) {
					if (arr.get(0).equals("묘")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("해")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("인")) {
					if (arr.get(0).equals("진")) {	siju_sal.add("상문");	}
					else if (arr.get(0).equals("자")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("묘")) {
					if (arr.get(0).equals("사")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("축")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("진")) {
					if (arr.get(0).equals("오")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("인")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("사")) {
					if (arr.get(0).equals("미")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("묘")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("오")) {
					if (arr.get(0).equals("신")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("진")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("미")) {
					if (arr.get(0).equals("유")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("사")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("신")) {
					if (arr.get(0).equals("술")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("오")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("유")) {
					if (arr.get(0).equals("해")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("미")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("술")) {
					if (arr.get(0).equals("자")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("신")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("해")) {
					if (arr.get(0).equals("축")) {siju_sal.add("상문");}
					else if (arr.get(0).equals("유")) {siju_sal.add("조객");}}
				
				// 연지신살(연지-시지)
				
				if(arr.get(7).equals("자")) {
					if (arr.get(4).equals("인")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("술")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("축")) {
					if (arr.get(4).equals("묘")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("해")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("인")) {
					if (arr.get(4).equals("진")) {	siju_sal.add("상문");	}
					else if (arr.get(4).equals("자")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("묘")) {
					if (arr.get(4).equals("사")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("축")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("진")) {
					if (arr.get(4).equals("오")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("인")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("사")) {
					if (arr.get(4).equals("미")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("묘")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("오")) {
					if (arr.get(4).equals("신")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("진")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("미")) {
					if (arr.get(4).equals("유")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("사")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("신")) {
					if (arr.get(4).equals("술")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("오")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("유")) {
					if (arr.get(4).equals("해")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("미")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("술")) {
					if (arr.get(4).equals("자")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("신")) {siju_sal.add("조객");}}
				else if (arr.get(7).equals("해")) {
					if (arr.get(4).equals("축")) {siju_sal.add("상문");}
					else if (arr.get(4).equals("유")) {siju_sal.add("조객");}}
				
				// 연지신살(연지-일지)
				
				if(arr.get(7).equals("자")) {
					if (arr.get(5).equals("인")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("술")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("축")) {
					if (arr.get(5).equals("묘")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("해")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("인")) {
					if (arr.get(5).equals("진")) {	ilju_sal.add("상문");	}
					else if (arr.get(5).equals("자")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("묘")) {
					if (arr.get(5).equals("사")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("축")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("진")) {
					if (arr.get(5).equals("오")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("인")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("사")) {
					if (arr.get(5).equals("미")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("묘")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("오")) {
					if (arr.get(5).equals("신")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("진")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("미")) {
					if (arr.get(5).equals("유")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("사")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("신")) {
					if (arr.get(5).equals("술")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("오")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("유")) {
					if (arr.get(5).equals("해")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("미")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("술")) {
					if (arr.get(5).equals("자")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("신")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("해")) {
					if (arr.get(5).equals("축")) {ilju_sal.add("상문");}
					else if (arr.get(5).equals("유")) {ilju_sal.add("조객");}}
				
				// 연지신살(연지-일간)
				
				if(arr.get(7).equals("자")) {
					if (arr.get(2).equals("인")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("술")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("축")) {
					if (arr.get(2).equals("묘")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("해")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("인")) {
					if (arr.get(2).equals("진")) {	ilju_sal.add("상문");	}
					else if (arr.get(2).equals("자")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("묘")) {
					if (arr.get(2).equals("사")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("축")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("진")) {
					if (arr.get(2).equals("오")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("인")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("사")) {
					if (arr.get(2).equals("미")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("묘")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("오")) {
					if (arr.get(2).equals("신")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("진")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("미")) {
					if (arr.get(2).equals("유")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("사")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("신")) {
					if (arr.get(2).equals("술")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("오")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("유")) {
					if (arr.get(2).equals("해")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("미")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("술")) {
					if (arr.get(2).equals("자")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("신")) {ilju_sal.add("조객");}}
				else if (arr.get(7).equals("해")) {
					if (arr.get(2).equals("축")) {ilju_sal.add("상문");}
					else if (arr.get(2).equals("유")) {ilju_sal.add("조객");}}
				
				
				// 연지신살(연지-월지)
				
				if(arr.get(7).equals("자")) {
					if (arr.get(6).equals("인")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("술")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("축")) {
					if (arr.get(6).equals("묘")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("해")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("인")) {
					if (arr.get(6).equals("진")) {	wolju_sal.add("상문");	}
					else if (arr.get(6).equals("자")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("묘")) {
					if (arr.get(6).equals("사")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("진")) {
					if (arr.get(6).equals("오")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("인")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("사")) {
					if (arr.get(6).equals("미")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("묘")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("오")) {
					if (arr.get(6).equals("신")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("진")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("미")) {
					if (arr.get(6).equals("유")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("신")) {
					if (arr.get(6).equals("술")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("오")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("유")) {
					if (arr.get(6).equals("해")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("미")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("술")) {
					if (arr.get(6).equals("자")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("신")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("해")) {
					if (arr.get(6).equals("축")) {wolju_sal.add("상문");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("조객");}}
				
				// 연지신살(연지-월간)
				
				if(arr.get(7).equals("자")) {
					if (arr.get(2).equals("인")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("술")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("축")) {
					if (arr.get(2).equals("묘")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("해")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("인")) {
					if (arr.get(2).equals("진")) {	wolju_sal.add("상문");	}
					else if (arr.get(2).equals("자")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("묘")) {
					if (arr.get(2).equals("사")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("진")) {
					if (arr.get(2).equals("오")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("인")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("사")) {
					if (arr.get(2).equals("미")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("묘")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("오")) {
					if (arr.get(2).equals("신")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("진")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("미")) {
					if (arr.get(2).equals("유")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("사")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("신")) {
					if (arr.get(2).equals("술")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("오")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("유")) {
					if (arr.get(2).equals("해")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("미")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("술")) {
					if (arr.get(2).equals("자")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("신")) {wolju_sal.add("조객");}}
				else if (arr.get(7).equals("해")) {
					if (arr.get(2).equals("축")) {wolju_sal.add("상문");}
					else if (arr.get(2).equals("유")) {wolju_sal.add("조객");}}
				
				// 연지신살(연지-연간)
				
				if(arr.get(7).equals("자")) {
					if (arr.get(3).equals("인")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("술")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("축")) {
					if (arr.get(3).equals("묘")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("해")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("인")) {
					if (arr.get(3).equals("진")) {	yunju_sal.add("상문");	}
					else if (arr.get(3).equals("자")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("묘")) {
					if (arr.get(3).equals("사")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("진")) {
					if (arr.get(3).equals("오")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("인")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("사")) {
					if (arr.get(3).equals("미")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("묘")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("오")) {
					if (arr.get(3).equals("신")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("진")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("미")) {
					if (arr.get(3).equals("유")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("사")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("신")) {
					if (arr.get(3).equals("술")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("오")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("유")) {
					if (arr.get(3).equals("해")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("미")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("술")) {
					if (arr.get(3).equals("자")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("신")) {yunju_sal.add("조객");}}
				else if (arr.get(7).equals("해")) {
					if (arr.get(3).equals("축")) {yunju_sal.add("상문");}
					else if (arr.get(3).equals("유")) {yunju_sal.add("조객");}}
				
				
				//	방위신살
				//	연지 기준 - 시지
				if (arr.get(7).equals("인") || arr.get(7).equals("묘") || arr.get(7).equals("진")) {
					if (arr.get(4).equals("사")) {siju_sal.add("고신");}
					else if (arr.get(4).equals("축")) {siju_sal.add("과숙");}
					else if (arr.get(4).equals("오") ) {siju_sal.add("격각");}}
				else if (arr.get(7).equals("사") || arr.get(7).equals("오") || arr.get(7).equals("미")) {
					if (arr.get(4).equals("신") ) {siju_sal.add("고신");}
					else if (arr.get(4).equals("진")) {siju_sal.add("과숙");}
					else if (arr.get(4).equals("유") ) {siju_sal.add("격각");}}
				else if (arr.get(7).equals("신") || arr.get(7).equals("유") || arr.get(7).equals("술")) {
					if (arr.get(4).equals("해") ) {siju_sal.add("고신");}
					else if (arr.get(4).equals("미")) {siju_sal.add("과숙");}
					else if (arr.get(4).equals("자") ) {siju_sal.add("격각");}}
				else if (arr.get(7).equals("해") || arr.get(7).equals("자") || arr.get(7).equals("축")) {
					if (arr.get(4).equals("인") ) {siju_sal.add("고신");}
					else if (arr.get(4).equals("술")) {siju_sal.add("과숙");}
					else if (arr.get(4).equals("묘") ) {siju_sal.add("격각");}}
				
//				연지 기준 - 일지
				if (arr.get(7).equals("인") || arr.get(7).equals("묘") || arr.get(7).equals("진")) {
					if (arr.get(5).equals("사")) {ilju_sal.add("고신");}
					else if (arr.get(5).equals("축")) {ilju_sal.add("과숙");}
					else if (arr.get(5).equals("오") ) {ilju_sal.add("격각");}}
				else if (arr.get(7).equals("사") || arr.get(7).equals("오") || arr.get(7).equals("미")) {
					if (arr.get(5).equals("신") ) {ilju_sal.add("고신");}
					else if (arr.get(5).equals("진")) {ilju_sal.add("과숙");}
					else if (arr.get(5).equals("유") ) {ilju_sal.add("격각");}}
				else if (arr.get(7).equals("신") || arr.get(7).equals("유") || arr.get(7).equals("술")) {
					if (arr.get(5).equals("해") ) {ilju_sal.add("고신");}
					else if (arr.get(5).equals("미")) {ilju_sal.add("과숙");}
					else if (arr.get(5).equals("자") ) {ilju_sal.add("격각");}}
				else if (arr.get(7).equals("해") || arr.get(7).equals("자") || arr.get(7).equals("축")) {
					if (arr.get(5).equals("인") ) {ilju_sal.add("고신");}
					else if (arr.get(5).equals("술")) {ilju_sal.add("과숙");}
					else if (arr.get(5).equals("묘") ) {ilju_sal.add("격각");}}
				
//				연지 기준 - 월지
				if (arr.get(7).equals("인") || arr.get(7).equals("묘") || arr.get(7).equals("진")) {
					if (arr.get(6).equals("사")) {wolju_sal.add("고신");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("과숙");}
					else if (arr.get(6).equals("오") ) {wolju_sal.add("격각");}}
				else if (arr.get(7).equals("사") || arr.get(7).equals("오") || arr.get(7).equals("미")) {
					if (arr.get(6).equals("신") ) {wolju_sal.add("고신");}
					else if (arr.get(6).equals("진")) {wolju_sal.add("과숙");}
					else if (arr.get(6).equals("유") ) {wolju_sal.add("격각");}}
				else if (arr.get(7).equals("신") || arr.get(7).equals("유") || arr.get(7).equals("술")) {
					if (arr.get(6).equals("해") ) {wolju_sal.add("고신");}
					else if (arr.get(6).equals("미")) {wolju_sal.add("과숙");}
					else if (arr.get(6).equals("자") ) {wolju_sal.add("격각");}}
				else if (arr.get(7).equals("해") || arr.get(7).equals("자") || arr.get(7).equals("축")) {
					if (arr.get(6).equals("인") ) {wolju_sal.add("고신");}
					else if (arr.get(6).equals("술")) {wolju_sal.add("과숙");}
					else if (arr.get(6).equals("묘") ) {wolju_sal.add("격각");}}
				
				
				// 일간신살
				// 일간 대 지지
				// 일간-시지
				if (arr.get(1).equals("갑")) {
					if (arr.get(4).equals("오")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("사")) {siju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("을")) {
					if (arr.get(4).equals("신")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("자")) {siju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("병")) {
					if (arr.get(4).equals("인")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("신")) {siju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("정")) {
					if (arr.get(4).equals("미")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("술")) {siju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("무")) {
					if (arr.get(4).equals("진")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("묘")) {siju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("기")) {
					if (arr.get(4).equals("진")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("사")) {siju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("경")) {
					if (arr.get(4).equals("술")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("자")) {siju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("신")) {
					if (arr.get(4).equals("유")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("신")) {siju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("임")) {
					if (arr.get(4).equals("자")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("술")) {siju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("계")) {
					if (arr.get(4).equals("신")) {siju_sal.add("홍염살");}
					else if (arr.get(4).equals("묘")) {siju_sal.add("낙정관살");}}
				
				//일간-일지
				if (arr.get(1).equals("갑")) {
					if (arr.get(5).equals("오")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("사")) {ilju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("을")) {
					if (arr.get(5).equals("신")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("자")) {ilju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("병")) {
					if (arr.get(5).equals("인")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("신")) {ilju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("정")) {
					if (arr.get(5).equals("미")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("술")) {ilju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("무")) {
					if (arr.get(5).equals("진")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("묘")) {ilju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("기")) {
					if (arr.get(5).equals("진")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("사")) {ilju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("경")) {
					if (arr.get(5).equals("술")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("자")) {ilju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("신")) {
					if (arr.get(5).equals("유")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("신")) {ilju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("임")) {
					if (arr.get(5).equals("자")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("술")) {ilju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("계")) {
					if (arr.get(5).equals("신")) {ilju_sal.add("홍염살");}
					else if (arr.get(5).equals("묘")) {ilju_sal.add("낙정관살");}}
				
				// 일간-월지
				if (arr.get(1).equals("갑")) {
					if (arr.get(6).equals("오")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("을")) {
					if (arr.get(6).equals("신")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("자")) {wolju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("병")) {
					if (arr.get(6).equals("인")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("신")) {wolju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("정")) {
					if (arr.get(6).equals("미")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("술")) {wolju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("무")) {
					if (arr.get(6).equals("진")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("묘")) {wolju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("기")) {
					if (arr.get(6).equals("진")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("경")) {
					if (arr.get(6).equals("술")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("자")) {wolju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("신")) {
					if (arr.get(6).equals("유")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("신")) {wolju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("임")) {
					if (arr.get(6).equals("자")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("술")) {wolju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("계")) {
					if (arr.get(6).equals("신")) {wolju_sal.add("홍염살");}
					else if (arr.get(6).equals("묘")) {wolju_sal.add("낙정관살");}}
				
				// 일간-연지
				if (arr.get(1).equals("갑")) {
					if (arr.get(7).equals("오")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("을")) {
					if (arr.get(7).equals("신")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("자")) {yunju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("병")) {
					if (arr.get(7).equals("인")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("신")) {yunju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("정")) {
					if (arr.get(7).equals("미")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("술")) {yunju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("무")) {
					if (arr.get(7).equals("진")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("묘")) {yunju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("기")) {
					if (arr.get(7).equals("진")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("경")) {
					if (arr.get(7).equals("술")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("자")) {yunju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("신")) {
					if (arr.get(7).equals("유")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("신")) {yunju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("임")) {
					if (arr.get(7).equals("자")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("술")) {yunju_sal.add("낙정관살");}}
				else if (arr.get(1).equals("계")) {
					if (arr.get(7).equals("신")) {yunju_sal.add("홍염살");}
					else if (arr.get(7).equals("묘")) {yunju_sal.add("낙정관살");}}
				
				
				// 사주 기둥으로 보는 신살
				// *괴강살(경진, 임진, 무술, 경술, 임술)
				
				// 시주 기둥
				if (arr.get(0).equals("경") || arr.get(0).equals("임")) {
					if (arr.get(4).equals("진") || arr.get(4).equals("술")) {siju_sal.add("괴강");}}
				else if (arr.get(0).equals("무")) 
					if (arr.get(4).equals("술")) {siju_sal.add("괴강");}
				
				// 일주 기둥
				if (arr.get(1).equals("경") || arr.get(1).equals("임")) {
					if (arr.get(5).equals("진") || arr.get(5).equals("술")) {ilju_sal.add("괴강");}}
				else if (arr.get(1).equals("무")) 
					if (arr.get(5).equals("술")) {ilju_sal.add("괴강");}
				
				// 월주 기둥
				if (arr.get(2).equals("경") || arr.get(2).equals("임")) {
					if (arr.get(6).equals("진") || arr.get(6).equals("술")) {wolju_sal.add("괴강");}}
				else if (arr.get(2).equals("무")) 
					if (arr.get(6).equals("술")) {wolju_sal.add("괴강");}
				
				// 연주 기둥
				if (arr.get(3).equals("경") || arr.get(3).equals("임")) {
					if (arr.get(7).equals("진") || arr.get(7).equals("술")) {yunju_sal.add("괴강");}}
				else if (arr.get(3).equals("무")) 
					if (arr.get(7).equals("술")) {yunju_sal.add("괴강");}
				
				
				// *백호대살(갑진, 무진, 병술, 임술, 정축, 계축, 을미)
				
				// 시주 기둥
				if (arr.get(0).equals("갑") || arr.get(0).equals("무")) {
					if (arr.get(4).equals("진")) {siju_sal.add("백호대살");}}
				else if (arr.get(4).equals("술")) {
					if (arr.get(0).equals("병") || arr.get(0).equals("임")) {siju_sal.add("백호대살");}}
				else if (arr.get(4).equals("축")) {
					if (arr.get(0).equals("정") || arr.get(0).equals("계")) {siju_sal.add("백호대살");}}
				else if (arr.get(0).equals("을")) {
					if (arr.get(4).equals("미")) {siju_sal.add("백호대살");}}
				
				// 일주 기둥
				if (arr.get(1).equals("갑") || arr.get(1).equals("무")) {
					if (arr.get(5).equals("진")) {ilju_sal.add("백호대살");}}
				else if (arr.get(5).equals("술")) {
					if (arr.get(1).equals("병") || arr.get(1).equals("임")) {ilju_sal.add("백호대살");}}
				else if (arr.get(5).equals("축")) {
					if (arr.get(1).equals("정") || arr.get(1).equals("계")) {ilju_sal.add("백호대살");}}
				else if (arr.get(1).equals("을")) {
					if (arr.get(5).equals("미")) {ilju_sal.add("백호대살");}}
				
				// 월주 기둥
				if (arr.get(2).equals("갑") || arr.get(2).equals("무")) {
					if (arr.get(6).equals("진")) {wolju_sal.add("백호대살");}}
				else if (arr.get(6).equals("술")) {
					if (arr.get(2).equals("병") || arr.get(2).equals("임")) {wolju_sal.add("백호대살");}}
				else if (arr.get(6).equals("축")) {
					if (arr.get(2).equals("정") || arr.get(2).equals("계")) {wolju_sal.add("백호대살");}}
				else if (arr.get(2).equals("을")) {
					if (arr.get(6).equals("미")) {wolju_sal.add("백호대살");}}
				
				// 연주 기둥
				if (arr.get(3).equals("갑") || arr.get(3).equals("무")) {
					if (arr.get(7).equals("진")) {yunju_sal.add("백호대살");}}
				else if (arr.get(7).equals("술")) {
					if (arr.get(3).equals("병") || arr.get(3).equals("임")) {yunju_sal.add("백호대살");}}
				else if (arr.get(7).equals("축")) {
					if (arr.get(3).equals("정") || arr.get(3).equals("계")) {yunju_sal.add("백호대살");}}
				else if (arr.get(3).equals("을")) {
					if (arr.get(7).equals("미")) {yunju_sal.add("백호대살");}}
				
				
				// *공망(일주 기준으로 다른 지지가 술해, 신유, 오미, 진사, 인묘, 자축)
				
				// 갑자 세트 - 술해 공망
				if ((arr.get(1).equals("갑") && arr.get(5).equals("자")) ||
					(arr.get(1).equals("을") && arr.get(5).equals("축")) ||
					(arr.get(1).equals("병") && arr.get(5).equals("인")) ||
					(arr.get(1).equals("정") && arr.get(5).equals("묘")) ||
					(arr.get(1).equals("무") && arr.get(5).equals("진")) ||
					(arr.get(1).equals("기") && arr.get(5).equals("사")) ||
					(arr.get(1).equals("경") && arr.get(5).equals("오")) ||
					(arr.get(1).equals("신") && arr.get(5).equals("미")) ||
					(arr.get(1).equals("임") && arr.get(5).equals("신")) ||
					(arr.get(1).equals("계") && arr.get(5).equals("유"))	) {
					// 시지, 월지, 연지 중에서, 술 or 해가 있을 경우, 술해공망 
						if ((arr.get(4).equals("술") || arr.get(4).equals("해")) ||
							(arr.get(6).equals("술") || arr.get(6).equals("해")) ||
							(arr.get(7).equals("술") || arr.get(7).equals("해")) ) 
						{siju_sal.add("술해공망");}}
				
				// 갑술 세트 - 신유 공망
				if ((arr.get(1).equals("갑") && arr.get(5).equals("술")) ||
					(arr.get(1).equals("을") && arr.get(5).equals("해")) ||
					(arr.get(1).equals("병") && arr.get(5).equals("자")) ||
					(arr.get(1).equals("정") && arr.get(5).equals("축")) ||
					(arr.get(1).equals("무") && arr.get(5).equals("인")) ||
					(arr.get(1).equals("기") && arr.get(5).equals("묘")) ||
					(arr.get(1).equals("경") && arr.get(5).equals("진")) ||
					(arr.get(1).equals("신") && arr.get(5).equals("사")) ||
					(arr.get(1).equals("임") && arr.get(5).equals("오")) ||
					(arr.get(1).equals("계") && arr.get(5).equals("미"))	) {
					// 시지, 월지, 연지 중에서, 신 or 유가 있을 경우, 신유공망 
						if ((arr.get(4).equals("신") || arr.get(4).equals("유")) ||
							(arr.get(6).equals("신") || arr.get(6).equals("유")) ||
							(arr.get(7).equals("신") || arr.get(7).equals("유")) ) 
						{siju_sal.add("신유공망");}}

				// 갑신 세트 - 오미 공망
				if ((arr.get(1).equals("갑") && arr.get(5).equals("신")) ||
					(arr.get(1).equals("을") && arr.get(5).equals("유")) ||
					(arr.get(1).equals("병") && arr.get(5).equals("술")) ||
					(arr.get(1).equals("정") && arr.get(5).equals("해")) ||
					(arr.get(1).equals("무") && arr.get(5).equals("자")) ||
					(arr.get(1).equals("기") && arr.get(5).equals("축")) ||
					(arr.get(1).equals("경") && arr.get(5).equals("인")) ||
					(arr.get(1).equals("신") && arr.get(5).equals("묘")) ||
					(arr.get(1).equals("임") && arr.get(5).equals("진")) ||
					(arr.get(1).equals("계") && arr.get(5).equals("사"))	) {
					// 시지, 월지, 연지 중에서, 오 or 미가 있을 경우, 오미공망 
						if ((arr.get(4).equals("오") || arr.get(4).equals("미")) ||
							(arr.get(6).equals("오") || arr.get(6).equals("미")) ||
							(arr.get(7).equals("오") || arr.get(7).equals("미")) ) 
						{siju_sal.add("오미공망");}}

				// 갑오 세트 - 진사 공망
				if ((arr.get(1).equals("갑") && arr.get(5).equals("오")) ||
					(arr.get(1).equals("을") && arr.get(5).equals("미")) ||
					(arr.get(1).equals("병") && arr.get(5).equals("신")) ||
					(arr.get(1).equals("정") && arr.get(5).equals("유")) ||
					(arr.get(1).equals("무") && arr.get(5).equals("술")) ||
					(arr.get(1).equals("기") && arr.get(5).equals("해")) ||
					(arr.get(1).equals("경") && arr.get(5).equals("자")) ||
					(arr.get(1).equals("신") && arr.get(5).equals("축")) ||
					(arr.get(1).equals("임") && arr.get(5).equals("인")) ||
					(arr.get(1).equals("계") && arr.get(5).equals("묘"))	) {
					// 시지, 월지, 연지 중에서, 진 or 사가 있을 경우, 진사공망 
						if ((arr.get(4).equals("진") || arr.get(4).equals("사")) ||
							(arr.get(6).equals("진") || arr.get(6).equals("사")) ||
							(arr.get(7).equals("진") || arr.get(7).equals("사")) ) 
						{siju_sal.add("진사공망");}}

				// 갑진 세트 - 인묘 공망
				if ((arr.get(1).equals("갑") && arr.get(5).equals("진")) ||
					(arr.get(1).equals("을") && arr.get(5).equals("사")) ||
					(arr.get(1).equals("병") && arr.get(5).equals("오")) ||
					(arr.get(1).equals("정") && arr.get(5).equals("미")) ||
					(arr.get(1).equals("무") && arr.get(5).equals("신")) ||
					(arr.get(1).equals("기") && arr.get(5).equals("유")) ||
					(arr.get(1).equals("경") && arr.get(5).equals("술")) ||
					(arr.get(1).equals("신") && arr.get(5).equals("해")) ||
					(arr.get(1).equals("임") && arr.get(5).equals("자")) ||
					(arr.get(1).equals("계") && arr.get(5).equals("축"))	) {
					// 시지, 월지, 연지 중에서, 인 or 묘가 있을 경우, 인묘공망 
						if ((arr.get(4).equals("인") || arr.get(4).equals("묘")) ||
							(arr.get(6).equals("인") || arr.get(6).equals("묘")) ||
							(arr.get(7).equals("인") || arr.get(7).equals("묘")) ) 
						{siju_sal.add("인묘공망");}}

				// 갑인 세트 - 자축 공망
				if ((arr.get(1).equals("갑") && arr.get(5).equals("인")) ||
					(arr.get(1).equals("을") && arr.get(5).equals("묘")) ||
					(arr.get(1).equals("병") && arr.get(5).equals("진")) ||
					(arr.get(1).equals("정") && arr.get(5).equals("사")) ||
					(arr.get(1).equals("무") && arr.get(5).equals("오")) ||
					(arr.get(1).equals("기") && arr.get(5).equals("미")) ||
					(arr.get(1).equals("경") && arr.get(5).equals("신")) ||
					(arr.get(1).equals("신") && arr.get(5).equals("유")) ||
					(arr.get(1).equals("임") && arr.get(5).equals("술")) ||
					(arr.get(1).equals("계") && arr.get(5).equals("해"))	) {
					// 시지, 월지, 연지 중에서, 자 or 축이 있을 경우, 자축공망 
						if ((arr.get(4).equals("자") || arr.get(4).equals("축")) ||
							(arr.get(6).equals("자") || arr.get(6).equals("축")) ||
							(arr.get(7).equals("자") || arr.get(7).equals("축")) ) 
						{siju_sal.add("자축공망");}}

				// 고란살
				// 일주 기둥이 아래와 같을 경우
				if (arr.get(1).equals("정") && arr.get(5).equals("사")) {ilju_sal.add("고란살");}
				else if (arr.get(1).equals("무") && arr.get(5).equals("신")) {ilju_sal.add("고란살");}
				else if (arr.get(1).equals("신") && arr.get(5).equals("해")) {ilju_sal.add("고란살");}
				else if (arr.get(1).equals("갑") && arr.get(5).equals("인")) {ilju_sal.add("고란살");}
				
				// 음착살
				// 일주 기둥이 아래와 같을 경우
				if (arr.get(1).equals("계") && (arr.get(5).equals("사") || arr.get(5).equals("해"))) {ilju_sal.add("음착살");}
				else if (arr.get(1).equals("정") && (arr.get(5).equals("미") || arr.get(5).equals("축"))) {ilju_sal.add("음착살");}
				else if (arr.get(1).equals("신") && arr.get(5).equals("묘") || arr.get(5).equals("유")) {ilju_sal.add("음착살");}
				
				// 양차살
				// 일주 기둥이 아래와 같을 경우
				if (arr.get(1).equals("임") && (arr.get(5).equals("진")) || arr.get(5).equals("술")) {ilju_sal.add("양차살");}
				else if (arr.get(1).equals("병") && (arr.get(5).equals("오")) || arr.get(5).equals("자")) {ilju_sal.add("양차살");}
				else if (arr.get(1).equals("무") && (arr.get(5).equals("인")) || arr.get(5).equals("신")) {ilju_sal.add("양차살");}
				
				// 귀문관살 추가
				// 연지 기준으로, 타지에 있을 경우
				if (arr.get(7).equals("자")) {
					if (arr.get(4).equals("유")) {siju_sal.add("귀문관살");}
					if (arr.get(6).equals("유")) {wolju_sal.add("귀문관살");}}
				if (arr.get(7).equals("축")) {
					if (arr.get(4).equals("오")) {siju_sal.add("귀문관살");siju_sal.add("원진살");}
					if (arr.get(6).equals("오")) {wolju_sal.add("귀문관살");wolju_sal.add("원진살");}}
				if (arr.get(7).equals("인")) {
					if (arr.get(4).equals("미")) {siju_sal.add("귀문관살");}
					if (arr.get(6).equals("미")) {wolju_sal.add("귀문관살");}}
				if (arr.get(7).equals("묘")) {
					if (arr.get(4).equals("신")) {siju_sal.add("귀문관살");siju_sal.add("원진살");}
					if (arr.get(6).equals("신")) {wolju_sal.add("귀문관살");wolju_sal.add("원진살");}}
				if (arr.get(7).equals("진")) {
					if (arr.get(4).equals("해")) {siju_sal.add("귀문관살");siju_sal.add("원진살");}
					if (arr.get(6).equals("해")) {wolju_sal.add("귀문관살");wolju_sal.add("원진살");}}
				if (arr.get(7).equals("사")) {
					if (arr.get(4).equals("술")) {siju_sal.add("귀문관살");siju_sal.add("원진살");}
					if (arr.get(6).equals("술")) {wolju_sal.add("귀문관살");wolju_sal.add("원진살");}}
				
				if (arr.get(7).equals("유")) {
					if (arr.get(4).equals("자")) {siju_sal.add("귀문관살");}
					if (arr.get(6).equals("자")) {wolju_sal.add("귀문관살");}}
				if (arr.get(7).equals("오")) {
					if (arr.get(4).equals("축")) {siju_sal.add("귀문관살");siju_sal.add("원진살");}
					if (arr.get(6).equals("축")) {wolju_sal.add("귀문관살");wolju_sal.add("원진살");}}
				if (arr.get(7).equals("미")) {
					if (arr.get(4).equals("인")) {siju_sal.add("귀문관살");}
					if (arr.get(6).equals("인")) {wolju_sal.add("귀문관살");}}
				if (arr.get(7).equals("신")) {
					if (arr.get(4).equals("묘")) {siju_sal.add("귀문관살");siju_sal.add("원진살");}
					if (arr.get(6).equals("묘")) {wolju_sal.add("귀문관살");wolju_sal.add("원진살");}}
				if (arr.get(7).equals("해")) {
					if (arr.get(4).equals("진")) {siju_sal.add("귀문관살");siju_sal.add("원진살");}
					if (arr.get(6).equals("진")) {wolju_sal.add("귀문관살");wolju_sal.add("원진살");}}
				if (arr.get(7).equals("술")) {
					if (arr.get(4).equals("사")) {siju_sal.add("귀문관살");siju_sal.add("원진살");}
					if (arr.get(6).equals("사")) {wolju_sal.add("귀문관살");wolju_sal.add("원진살");}}
				
				// 귀문관살
				// 일지 기준- 연지에 있을 경우
				if (arr.get(5).equals("자")) {
					if (arr.get(7).equals("유")) {ilju_sal.add("귀문관살");}}
				if (arr.get(5).equals("축")) {
					if (arr.get(7).equals("오")) {ilju_sal.add("귀문관살");ilju_sal.add("원진살");}}
				if (arr.get(5).equals("인")) {
					if (arr.get(7).equals("미")) {ilju_sal.add("귀문관살");}}
				if (arr.get(5).equals("묘")) {
					if (arr.get(7).equals("신")) {ilju_sal.add("귀문관살");ilju_sal.add("원진살");}}
				if (arr.get(5).equals("진")) {
					if (arr.get(7).equals("해")) {ilju_sal.add("귀문관살");ilju_sal.add("원진살");}}
				if (arr.get(5).equals("사")) {
					if (arr.get(7).equals("술")) {ilju_sal.add("귀문관살");ilju_sal.add("원진살");}}
				
				// 반대
				if (arr.get(5).equals("유")) {
					if (arr.get(7).equals("자")) {ilju_sal.add("귀문관살");}}
				if (arr.get(5).equals("오")) {
					if (arr.get(7).equals("축")) {ilju_sal.add("귀문관살");ilju_sal.add("원진살");}}
				if (arr.get(5).equals("미")) {
					if (arr.get(7).equals("인")) {ilju_sal.add("귀문관살");}}
				if (arr.get(5).equals("신")) {
					if (arr.get(7).equals("묘")) {ilju_sal.add("귀문관살");ilju_sal.add("원진살");}}
				if (arr.get(5).equals("해")) {
					if (arr.get(7).equals("진")) {ilju_sal.add("귀문관살");ilju_sal.add("원진살");}}
				if (arr.get(5).equals("술")) {
					if (arr.get(7).equals("사")) {ilju_sal.add("귀문관살");ilju_sal.add("원진살");}}
			
				// 나머지 원진(일->타지)
				if (arr.get(5).equals("자")) {
					if (arr.get(4).equals("미")) {siju_sal.add("원진살");}
					else if (arr.get(6).equals("미")) {wolju_sal.add("원진살");}
					else if (arr.get(7).equals("미")) {yunju_sal.add("원진살");}}
				if (arr.get(5).equals("인")) {
					if (arr.get(4).equals("유")) {siju_sal.add("원진살");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("원진살");}
					else if (arr.get(7).equals("유")) {yunju_sal.add("원진살");}}
				// 타지->일
				if (arr.get(5).equals("미")) {
					if (arr.get(4).equals("자")) {siju_sal.add("원진살");}
					else if (arr.get(6).equals("자")) {wolju_sal.add("원진살");}
					else if (arr.get(7).equals("자")) {yunju_sal.add("원진살");}}
				if (arr.get(5).equals("유")) {
					if (arr.get(4).equals("인")) {siju_sal.add("원진살");}
					else if (arr.get(6).equals("인")) {wolju_sal.add("원진살");}
					else if (arr.get(7).equals("인")) {yunju_sal.add("원진살");}}
				
				// 현침살
				// 천간지지에 갑, 신, 묘, 오, 신 포함할 경우
				if (arr.get(0).equals("갑") || arr.get(0).equals("신")) {siju_sal.add("현침살");}
				if (arr.get(1).equals("갑") || arr.get(1).equals("신")) {ilju_sal.add("현침살");}
				if (arr.get(2).equals("갑") || arr.get(2).equals("신")) {wolju_sal.add("현침살");}
				if (arr.get(3).equals("갑") || arr.get(3).equals("신")) {yunju_sal.add("현침살");}
				
				if (arr.get(4).equals("신") || arr.get(4).equals("묘") || arr.get(4).equals("오")) {siju_sal.add("현침살");}
				if (arr.get(5).equals("신") || arr.get(5).equals("묘") || arr.get(5).equals("오")) {ilju_sal.add("현침살");}
				if (arr.get(6).equals("신") || arr.get(6).equals("묘") || arr.get(6).equals("오")) {wolju_sal.add("현침살");}
				if (arr.get(7).equals("신") || arr.get(7).equals("묘") || arr.get(7).equals("오")) {yunju_sal.add("현침살");}
				
				// 문곡귀인
				// 일간-지지
				if (arr.get(1).equals("갑")) {
					if (arr.get(4).equals("해")) {siju_sal.add("문곡귀인");}
					else if (arr.get(5).equals("해")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(6).equals("해")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(7).equals("해")) {ilju_sal.add("문곡귀인");}}
				if (arr.get(1).equals("을")) {
					if (arr.get(4).equals("자")) {siju_sal.add("문곡귀인");}
					else if (arr.get(5).equals("자")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(6).equals("자")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(7).equals("자")) {ilju_sal.add("문곡귀인");}}
				if (arr.get(1).equals("병") || arr.get(1).equals("무")) {
					if (arr.get(4).equals("인")) {siju_sal.add("문곡귀인");}
					else if (arr.get(5).equals("인")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(6).equals("인")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(7).equals("인")) {ilju_sal.add("문곡귀인");}}
				if (arr.get(1).equals("정") || arr.get(1).equals("기")) {
					if (arr.get(4).equals("묘")) {siju_sal.add("문곡귀인");}
					else if (arr.get(5).equals("묘")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(6).equals("묘")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(7).equals("묘")) {ilju_sal.add("문곡귀인");}}
				if (arr.get(1).equals("경")) {
					if (arr.get(4).equals("사")) {siju_sal.add("문곡귀인");}
					else if (arr.get(5).equals("사")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(6).equals("사")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(7).equals("사")) {ilju_sal.add("문곡귀인");}}
				if (arr.get(1).equals("신")) {
					if (arr.get(4).equals("오")) {siju_sal.add("문곡귀인");}
					else if (arr.get(5).equals("오")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(6).equals("오")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(7).equals("오")) {ilju_sal.add("문곡귀인");}}
				if (arr.get(1).equals("임")) {
					if (arr.get(4).equals("신")) {siju_sal.add("문곡귀인");}
					else if (arr.get(5).equals("신")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(6).equals("신")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(7).equals("신")) {ilju_sal.add("문곡귀인");}}
				if (arr.get(1).equals("계")) {
					if (arr.get(4).equals("유")) {siju_sal.add("문곡귀인");}
					else if (arr.get(5).equals("유")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(6).equals("유")) {ilju_sal.add("문곡귀인");}
					else if (arr.get(7).equals("유")) {ilju_sal.add("문곡귀인");}}
				
				// 효신살
				// 일간-일지
				if (arr.get(1).equals("갑")) { 
					if (arr.get(5).equals("자")) {ilju_sal.add("효신살");}	}
				if (arr.get(1).equals("을")) { 
					if (arr.get(5).equals("해")) {ilju_sal.add("효신살");}	}
				if (arr.get(1).equals("병")) { 
					if (arr.get(5).equals("인")) {ilju_sal.add("효신살");}	}
				if (arr.get(1).equals("정")) { 
					if (arr.get(5).equals("묘")) {ilju_sal.add("효신살");}	}
				if (arr.get(1).equals("무")) { 
					if (arr.get(5).equals("오")) {ilju_sal.add("효신살");}	}
				if (arr.get(1).equals("기")) { 
					if (arr.get(5).equals("사")) {ilju_sal.add("효신살");}	}
				if (arr.get(1).equals("경")) { 
					if (arr.get(5).equals("진") || arr.get(5).equals("술")) {ilju_sal.add("효신살");}	}
				if (arr.get(1).equals("신")) { 
					if (arr.get(5).equals("미") || arr.get(5).equals("축")) {ilju_sal.add("효신살");}	}
				if (arr.get(1).equals("임")) { 
					if (arr.get(5).equals("신")) {ilju_sal.add("효신살");}	}
				if (arr.get(1).equals("계")) { 
					if (arr.get(5).equals("유")) {ilju_sal.add("효신살");}	}
				
				// 천라지망
				// 일지에 진사, 월지or시지에 술해
				// 일지에 술해, 월지or시지에 진사
				if (arr.get(5).equals("진") || arr.get(5).equals("사")) {
					if (arr.get(4).equals("술") || arr.get(4).equals("해")) {siju_sal.add("천라지망");}
					else if (arr.get(6).equals("술") || arr.get(6).equals("해")) {wolju_sal.add("천라지망");}}
				if (arr.get(5).equals("술") || arr.get(5).equals("해")) {
					if (arr.get(4).equals("진") || arr.get(4).equals("사")) {siju_sal.add("천라지망");}
					else if (arr.get(6).equals("진") || arr.get(6).equals("사")) {wolju_sal.add("천라지망");}}
				
				
				setSiju_sal(siju_sal);
				setIlju_sal(ilju_sal);
				setWolju_sal(wolju_sal);
				setYunju_sal(yunju_sal);
				
				System.out.print(getSiju_sal());
				System.out.print(getIlju_sal());
				System.out.print(getWolju_sal());
				System.out.print(getYunju_sal());
//				
	}
}
		

	
