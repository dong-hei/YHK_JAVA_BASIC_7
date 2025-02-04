package section7_access.b;

import section7_access.a.AccessData;

/**
 * 접근 제어자 사용 - 필드, 메소드
 */
public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData d = new AccessData();

        //public 호출 가능
        d.publicField = 1;
        d.publicMethod();

        //다른 패키지 : default 호출 불가능
//        d.defaultField = 2;
//        d.defaultMethod();

        //private 호출 불가
//        d.privateField = 3;

        //public 메소드이기 때문에 호출 가능
        d.innerAccess();
    }
}
