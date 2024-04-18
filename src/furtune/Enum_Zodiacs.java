package furtune;

public enum Enum_Zodiacs {
	
    자("쥐", "-", "水", "겨울", "11월", "대설, 동지", "23~01", "0˚(북)", "황종", "壬(임·10), 癸(계·20)"),
    축("소", "-", "土", "겨울", "12월", "소한, 대한", "01~03", "30˚(북동북)", "대려", "癸(계·9), 辛(신·3), 己(기·18)"),
    인("호랑이", "+", "木", "봄", "1월", "입춘, 우수", "03~05", "60˚(동북동)", "태주", "戊(무·7), 丙(병·7), 甲(갑·16)"),
    묘("토끼", "-", "木", "봄", "2월", "경칩, 춘분", "05~07", "90˚(동)", "협종", "甲(갑·10), 乙(을·20)"),
    진("용", "+", "土", "봄", "3월", "청명, 곡우", "07~09", "120˚(동남동)", "고선", "乙(을·9), 癸(계·3), 戊(무·18)"),
    사("뱀", "+", "火", "여름", "4월", "입하, 소만", "09~11", "150˚(남남동)", "중려", "戊(무·7), 庚(경·7), 丙(병·16)"),
    오("말", "-", "火", "여름", "5월", "망종, 하지", "11~13", "180˚(남)", "유빈", "丙(병·10), 己(기·9), 丁(정·11)"),
    미("양", "-", "土", "여름", "6월", "소서, 대서", "13~15", "210˚(남남서)", "임종", "丁(정·9), 乙(을·3), 己(기·18)"),
    신("원숭이", "+", "金", "가을", "7월", "입추, 처서", "15~17", "240˚(서남서)", "이칙", "戊(무·7), 壬(임·7), 庚(경·16)"),
    유("닭", "-", "金", "가을", "8월", "백로, 추분", "17~19", "270˚(서)", "남려", "庚(경·10), 辛(신·20)"),
    술("개", "+", "土", "가을", "9월", "한로, 상강", "19~21", "300˚(서북서)", "무역", "辛(신·9), 丁(정·3), 戊(무·18)"),
    해("돼지", "+", "水", "겨울", "10월", "입동, 소설", "21~23", "330˚(북북서)", "응종", "戊(무·7), 甲(갑·7), 壬(임·16)");

    private final String animal;
    private final String yinYang;
    private final String element;
    private final String season;
    private final String month;
    private final String solarTerms;
    private final String time;
    private final String direction;
    private final String musicalNote;
    private final String heavenlyStems;

    Enum_Zodiacs(String animal, String yinYang, String element, String season, String month,
                  String solarTerms, String time, String direction, String musicalNote, String heavenlyStems) {
        this.animal = animal;
        this.yinYang = yinYang;
        this.element = element;
        this.season = season;
        this.month = month;
        this.solarTerms = solarTerms;
        this.time = time;
        this.direction = direction;
        this.musicalNote = musicalNote;
        this.heavenlyStems = heavenlyStems;
    }

    public String getAnimal() {
        return animal;
    }
    public String getYinYang() {
        return yinYang;
    }
    public String getElement() {
        return element;
    }
    public String getSeason() {
        return season;
    }
    public String getMonth() {
        return month;
    }
    public String getSolarTerms() {
        return solarTerms;
    }
    public String getTime() {
        return time;
    }
    public String getDirection() {
        return direction;
    }
    public String getMusicalNote() {
        return musicalNote;
    }
    public String getHeavenlyStems() {
        return heavenlyStems;
    }
}
