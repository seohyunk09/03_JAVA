package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent(){ // 리턴 타입이 반드시 Home 이어야 함

        return new Home();
    }
}
