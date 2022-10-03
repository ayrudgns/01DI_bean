package day1.review;

public class BuyService {
	
	private BuyDao dao;		// 의존관계의 클래스 : BuyService 객체는 BuyDao 객체를 사용한다.
	
	
	// 의존관계 주입 : 생성자 또는 setter
	public BuyService(BuyDao dao) {
		System.out.println("BuyService 생성자 ************");
		this.dao = dao;
	}
	
	public void setDao(BuyDao dao) {
		this.dao = dao;
	}
	
	// 일반 메소드
	public void buy() {
		System.out.println("service buy()");
		dao.buy();
	}
	

}
