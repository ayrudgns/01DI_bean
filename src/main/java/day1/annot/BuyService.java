package day1.annot;

import org.springframework.stereotype.Component;

@Component			// bean id는 buyService로 자동 설정!
public class BuyService {
	
	private BuyDao dao;		// 의존관계의 클래스 : BuyService 객체는 BuyDao 객체를 사용한다.
	
	// @Component를 사용할 때는, 커스텀 생성자가 있다면 의존관계가 자동으로 주입된다(타입으로 매칭된다).
	// @Autowired는 생략 가능!
	
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
