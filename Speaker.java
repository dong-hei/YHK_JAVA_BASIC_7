package section7_access;

/**
 * 접근 제어자 이해1, 이해2
 */

public class Speaker {
    private int vol; //private으로 해당 클래스 내부에서만 호출 가능

    Speaker(int vol){
        this.vol = vol;
    }
    
    void volUp(){
        if (vol >= 100){
            System.out.println("더 이상 음량을 증가할 수 없습니다. 최대 음량 입니다.");
        } else {
            vol += 10;
            System.out.println("음량 10 증가");
        }
    }
    void volDown(){
        if (vol < 0){
            System.out.println("더 이상 음량을 줄일수 없습니다. 최소 음량입니다.");
        } else{
            vol -= 10;
            System.out.println("= volDown 호출 =");
        }
    }

    void showVol(){
        System.out.println("= 현재 음량 : " + vol + "=");

    }}
