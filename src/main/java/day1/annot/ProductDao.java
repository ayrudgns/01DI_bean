package day1.annot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component			// bean id의 기본값은 productDao
public class ProductDao {
	@Value(value = "11")		// value 속성으로 값 지정하기, 속성 이름 생략 가능!
	private int cnt;			// setter와 무관하게 변수에 직접 값을 주는 어노테이션이므로 setter가 없어도 오류 발생 X
	@Value(value = "iphoneX")
	private String pname;
	
	// 커스텀 생성자가 없는 경우
	// 의존관계 주입은 setter로 하고, 이때는 기본생성자가 실행되고 나서 setter로 의존관계가 주입된다.
	public ProductDao() {
		System.out.println("ProductDao 기본 생성자******");
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void setCnt(int cnt) {	// 기본 데이터 타입
		this.cnt = cnt;
	}
	
	public void product() {
		System.out.println("dao product() ~~~~~~");
		System.out.println("상품[" + pname + "]을 " + cnt + " 수량으로 생산합니다.");
	}
}
