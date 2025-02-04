package section7_access.b;


import section7_access.a.PublicClass;
/**
 * 접근 제어자 사용 - 클래스 레벨
 */
public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
//        DefaultClass1 c1 = new DefaultClass1(); // 다른 패키지에서 접근 불가
//        DefaultClass2 c2 = new DefaultClass2();
    }
}
