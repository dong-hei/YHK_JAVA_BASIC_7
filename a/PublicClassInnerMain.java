package section7_access.a;
/**
 * 접근 제어자 사용 - 클래스 레벨
 */
public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        DefaultClass1 c1 = new DefaultClass1();
        DefaultClass2 c2 = new DefaultClass2();
    }
}
