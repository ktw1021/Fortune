package furtune;
//천간병존
public class GapJa_Chungan_Side {

	private GapJa gapJa;
	
	public GapJa_Chungan_Side(GapJa gapJa) {
		this.gapJa=gapJa;
	}
	
	public static void sideChungan() {
		String yungan = GapJa.getYungan();
		String wolgan = GapJa.getWolgan();
		String ilgan  = GapJa.getIlgan();
		String sigan  = GapJa.getSigan();
		
		String coexist = "";
		
		if (yungan.equals(wolgan)) {
			switch(yungan) {
			case "갑": coexist="갑갑병존: "; break; case "을": coexist="을을병존: "; break;
			case "병": coexist="병병병존: "; break; case "정": coexist="정정병존: "; break;
			case "무": coexist="무무병존: "; break; case "기": coexist="기기병존: "; break;
			case "경": coexist="경경병존: "; break; case "신": coexist="신신병존: "; break;
			case "임": coexist="임임병존: "; break; case "계": coexist="계계병존: "; break;
			}
		}
			else if (wolgan.equals(ilgan)) {
				switch(wolgan) {
				case "갑": coexist="갑갑병존: "; break; case "을": coexist="을을병존: "; break;
				case "병": coexist="병병병존: "; break; case "정": coexist="정정병존: "; break;
				case "무": coexist="무무병존: "; break; case "기": coexist="기기병존: "; break;
				case "경": coexist="경경병존: "; break; case "신": coexist="신신병존: "; break;
				case "임": coexist="임임병존: "; break; case "계": coexist="계계병존: "; break;
				}
			}
			else if (ilgan.equals(sigan)) {
				switch(ilgan) {
				case "갑": coexist="갑갑병존: "; break; case "을": coexist="을을병존: "; break;
				case "병": coexist="병병병존: "; break; case "정": coexist="정정병존: "; break;
				case "무": coexist="무무병존: "; break; case "기": coexist="기기병존: "; break;
				case "경": coexist="경경병존: "; break; case "신": coexist="신신병존: "; break;
				case "임": coexist="임임병존: "; break; case "계": coexist="계계병존: "; break;
				}
			}
		
		System.out.print(coexist+"\t");
		
		
		}
		
	}
	
