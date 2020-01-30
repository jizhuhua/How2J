package how2j.EnumClass;

public class EnumClass {
    public static void main(String[] args){
//        s只有四种常量
        for (Season i : Season.values()) {
            System.out.println(i);
        }
        Season s=Season.AUTUMN;
        switch (s) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
