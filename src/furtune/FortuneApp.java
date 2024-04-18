package furtune;

import java.io.IOException;
import java.util.Scanner;

public class FortuneApp {
	
	private GapJa_YukChin yukchin;
	
	public FortuneApp(GapJa_YukChin yukchin) {
		this.yukchin=yukchin;
	}
	
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        InputDate gapja = new InputDate();
        
        System.out.print("연도를 입력하세요: ");
        gapja.inputYear = scanner.next();
        System.out.print("월을 입력하세요: ");
        gapja.inputMonth = scanner.next();
        System.out.print("일을 입력하세요: ");
        gapja.inputDay = scanner.next();
        System.out.print("시를 입력하세요: ");
        gapja.inputHour = scanner.nextInt();
        
        Api_Lunar_Caller api_Lunar_Caller = new Api_Lunar_Caller();
        try {
            // API 호출을 통해 결과를 받아옵니다.
            String result = api_Lunar_Caller.callApi
            		(gapja.inputYear, gapja.inputMonth, gapja.inputDay);
            
            // 결과를 XmlParser 객체에 전달하여 파싱하고 출력합니다.
            Api_Lunar_XmlParser parser = new Api_Lunar_XmlParser();
            parser.parseXmlString(result, gapja.inputHour); // parseXmlString 호출.
        } catch (Exception e) {
            e.printStackTrace();
        }


    	TwelfthSinSal.Sal();
    	SipSung_Count.Count_SipSung();
    	GapJa_Chungan_Side.sideChungan();
    	GapJa_Jiji_Side.sideJiji();
    	Twelve_Branches.Branches();
    	
    	// ApiExplorer 인스턴스 생성 및 API 호출
//        ApiExplorer apiExplorer = new ApiExplorer();
//        String xmlData = apiExplorer.Api_Explore(gapja.inputYear, gapja.inputMonth);

        // XML 데이터 파싱 및 결과 처리
//        try {
//            Api_SolarTerms_XmlParser.parseXml(xmlData);
//        } catch (Exception e) {
//            System.err.println("XML 파싱 중 오류가 발생했습니다: " + e.getMessage());
//        } 
        scanner.close();
    }

		

}
