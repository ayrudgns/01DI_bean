package day1.annot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component		// bean id는 buyDao로 자동 설정!
public class BuyDao {
	
	private String dbFactory;	// String타입의 프로퍼티
	
	// @Value 값으로 넘길 값 미리 주기!
	public BuyDao(@Value("마이바티스") String dbFactory) {
		System.out.println("BuyDao 생성자***********");
		this.dbFactory = dbFactory;
	}
	
	public void setDbFactory(String dbFactory) {
		this.dbFactory = dbFactory;
	}
	
	public void buy() {
		System.out.println("dao buy()~~~~~~");
		System.out.println(dbFactory + "를 이용하여 db에 연결합니다.");
	}


}
