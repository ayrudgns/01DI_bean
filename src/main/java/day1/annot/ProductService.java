package day1.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component				// bean id의 기본값은 productService
public class ProductService {
//	@Autowired
	private ProductDao dao;		// 커스텀 생성자가 없을 때, dao의 의존관계 주입이 자동으로 되는지 확인하기
								// 정답은 X, 자동 주입 어노테이션 @Autowired 필요
								// @Autowired의 위치는 변수선언 또는 setter 중 하나 선택 (보통은 후자)

	// 커스텀 생성자가 없는 경우
	public ProductService() {
		System.out.println("ProductService 기본 생성자*************");
	}
	
	@Autowired
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}
	
	public void product() {
		System.out.println("service product() ~~~~~~");
		dao.product();
	}
	
}
