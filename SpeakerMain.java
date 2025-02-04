package section7_access;
/**
 * 접근 제어자 이해1,이해2
 */
public class SpeakerMain {
    public static void main(String[] args) {
        Speaker s = new Speaker(90);
        s.showVol();

        s.volUp();
        s.showVol();

        s.volUp();
        s.showVol();

        //필드에 직접 접근 => vol을 100으로 반드시 제한해야하는데 외부에서 수정해버림 => 접근제어자 필요
//        System.out.println("vol 필드 직접 접근해 수정");
//        s.vol = 200;
//        s.showVol();
    }
}
