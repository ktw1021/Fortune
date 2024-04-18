package furtune;

public class SolarTerm {
    private String dateName;
    private String locdate;

    // 생성자
    public SolarTerm(String dateName, String locdate) {
        this.dateName = dateName;
        this.locdate = locdate;
    }

    // dateName의 getter
    public String getDateName() {
        return dateName;
    }

    // locdate의 getter
    public String getLocdate() {
        return locdate;
    }

    // 객체의 정보를 문자열로 반환
    @Override
    public String toString() {
        return "SolarTerm{" +
                "dateName='" + dateName + '\'' +
                ", locdate='" + locdate + '\'' +
                '}';
    }
}
