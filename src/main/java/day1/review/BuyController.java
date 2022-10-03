package day1.review;


public class BuyController {
	
	
	private BuyService service;		
				// 프로퍼티가 클래스타입일 때 의존관계가 생성된다.
				// BuyController가 BuyService 클래스를 사용하는 것을 "의존관계가 있다" 고 표현한다.
	
	// 프로퍼티에 객체를 참조시키는 방법 (객체를 참조시키는 순간이 언제인가?) : 1) 생성자  2) setter
	// -> 클래스 타입일 때는 이것을 "의존관계 주입"(Dependency Injection, DI) 이라 한다.
	
	// 1) 생성자 사용
	public BuyController(BuyService service) {
		System.out.println("BuyController 생성자 *************");
		this.service = service;		// 객체 참조
	}
	
	// 2) setter 사용
	public void setService(BuyService service) {
		this.service = service;		// 객체 참조
	}
	
	public void buy() {
		System.out.println("controller buy() ~~~~");
		service.buy();		// 참조되는 객체가 없으면 service 변수는 null 반환 -> NullpointerException 
	}
	
}
