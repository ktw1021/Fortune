package furtune;

public enum Enum_HeavenlyStems {
    갑("+", "木", "90˚(동)", "청"),
    을("-", "木", "90˚(동)", "청"),
    병("+", "火", "180˚(남)", "적"),
    정("-", "火", "180˚(남)", "적"),
    무("+", "土", "중앙", "황"),
    기("-", "土", "중앙", "황"),
    경("+", "金", "270˚(서)", "백"),
    신("-", "金", "270˚(서)", "백"),
    임("+", "水", "0˚(북)", "흑"),
    계("-", "水", "0˚(북)", "흑");

    private final String yinYang; // -+
    private final String element; // 원소
    private final String direction; // 방향
    private final String color; // 색상

    Enum_HeavenlyStems(String yinYang, String element, String direction, String color) {
        this.yinYang = yinYang;
        this.element = element;
        this.direction = direction;
        this.color = color;
    }
    
    public String getYinYang() {
        return yinYang;
    }

    public String getElement() {
        return element;
    }

    public String getDirection() {
        return direction;
    }

    public String getColor() {
        return color;
    }
    
}
