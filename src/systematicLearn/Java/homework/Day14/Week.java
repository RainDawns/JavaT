package systematicLearn.Java.homework.Day14;

/**
 * @author lnh
 * @date 2021年06月19日 16:03
 */
public enum Week {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    public static void show(Week week){
        switch (week){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            case SUNDAY:
                System.out.println("星期天");
                break;
        }
    }

    public static void main(String[] args) {
        Week.show(Week.FRIDAY);
    }
}
