package com.myself10._enum;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/20 15:30
 */

interface  info {
    void info();
}
public enum SeasonTest implements  info {

    SPRING("春天","春暖花开"){
        public void  info(){
            System.out.println("春天真美丽");
        }
    },
    SUMMER("夏天","夏日燕燕"){      public void  info(){
        System.out.println("春天真美丽");
    }},
    AUTUMN("秋天","秋高气爽"){      public void  info(){
        System.out.println("春天真美丽");
    }},

    WINTER("冬天","冬天可美"){      public void  info(){
        System.out.println("春天真美丽");
    }};


    private final String name;
    private final   String interpret;

    SeasonTest(String name, String interpret) {
        this.name = name;
        this.interpret = interpret;
    }

    @Override
    public String toString() {
        return "SeasonTest{" +
                "name='" + name + '\'' +
                ", interpret='" + interpret + '\'' +
                '}';
    }


}
class  SeasonTest1 {
    public static void main(String[] args) {
        System.out.println(SeasonTest.SPRING);
//name
        System.out.println(SeasonTest.SPRING.name());
//value
        System.out.println(SeasonTest.valueOf("AUTUMN"));

        SeasonTest[] values = SeasonTest.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }


        //ordinal
        System.out.println(SeasonTest.AUTUMN.ordinal());


        SeasonTest.SPRING.info();
    }

}
