package adapter.adapter1;

public class PrintBanner extends Banner implements Print {

    private Banner banner; // 위임 객체
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
        @Override
        public void printWeak() {
            banner.showWithParen(); // 기능 위임
        }
        @Override
        public void printStrong() {
            banner.showWithAster(); // 기능 위임
        }

    }
