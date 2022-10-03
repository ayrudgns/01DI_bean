package day1.review;


public class JavaMain {
	public static void main(String[] args) {
		
		// controller 클래스 테스트 (순서 중요!! 의존관계를 순서대로 생성하기 때문, 순서 그냥 변경하면 오류 발생)
		BuyDao dao = new BuyDao("Mybatis");
		BuyService service = new BuyService(dao);	// 의존관계 주입
		BuyController shop = new BuyController(service);  // 의존관계 주입
		
		// 위와 같이 객체를 생성하고 의존관계를 설정하는 것을 객체들의 "강한 결합"이라 한다.
		// --> main 소스에서 설정한다.
		
		shop.buy();

		// 애플리케이션 실행은 여러환경에서 실행하게 되며, 데이베이스 연결도 다른 서버 / 다른 계정들을 사용하면서 실행된다.
		// controller에서 사용하는 service 클래스를 변경해야 하거나
		// service에서 사용하는 dao클래스를 변경해야 하는 상황이 생기는 경우,
		// 기본적인 방법으로는 코드를 수정하는 것이지만, 비효율적이다.
		
		// spring 프레임워크는 의존관계 주입을 spring에서 관리하는 방법으로 한다.
	}
// Controller는 사용자의 요청을 받으며, 요청에 따른 비즈니스 로직은 Service에서 실행한다.
// 비즈니스 로직을 처리하는 Service에서 데이터베이스와 같은 물리적 저장소의 데이터를 처리하는 경우, Dao에서 처리한다.
// Service는 필요에 따라서 사용하며, 없을 수도 있다.
	
}
