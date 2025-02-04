package section7_access.a;
/**
 * 접근 제어자 사용 - 클래스 레벨
 * 클래스는 public, default만 사용가능
 * public 클래스는 반드시 파일명과 이름이 같아야 한다.
 * public 클래스는 하나만 만들수 있음
 * default 클래스는 무한정 만들수 있음
 */
public class PublicClass {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        DefaultClass1 c1 = new DefaultClass1();
        DefaultClass2 c2 = new DefaultClass2(); // 같은 패키지 내에서 사용가능
    }
}

class DefaultClass1{

}

class DefaultClass2{

}
