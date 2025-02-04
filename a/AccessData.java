package section7_access.a;
/**
 * 접근 제어자 사용 - 필드, 메소드
 */
public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod(){
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod(){
        System.out.println("privateMethod 호출 " + privateField);
    }
    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300; // private이 있어도 innerAccess()메소드가 public 이기 때문에 public 판정
        publicMethod();
        defaultMethod();
        privateMethod();// private이 있어도 innerAccess()메소드가 public 이기 때문에 public 판정
    }
}
