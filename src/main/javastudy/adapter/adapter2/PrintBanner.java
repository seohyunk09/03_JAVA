package javastudy.adapter.adapter2;

// PrintBanner 클래스가
// Print 추상 클래스를 상속받아(위임 받아) 어댑터 역할을 수행
public class PrintBanner extends Print {
    private Banner banner;  // Banner 객체를 위임받아 사용

    // 생성자에서 Banner 인스턴스를 생성
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    // Print의 printWeak 메서드를 Banner의 showWithParen으로 구현
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    // Print의 printStrong 메서드를 Banner의 showWithAster로 구현
    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}