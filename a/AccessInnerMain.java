package section7_access.a;
/**
 * 접근 제어자 사용 - 필드, 메소드
 */
public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData d = new AccessData();

        //public 호출 가능
        d.publicField = 1;
        d.publicMethod();

        //같은 패키지 : default 호출 가능
        d.defaultField = 2;
        d.defaultMethod();

        //private 호출 불가
//        d.privateField = 3;
//        d.privateMethod();
        
        //public 메소드기 때문에 호출 가능
        d.innerAccess();
    }
}
