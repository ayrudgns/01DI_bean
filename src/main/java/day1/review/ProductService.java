package day1.review;

public class ProductService {
	
	private ProductDao dao;
	
	// 커스텀 생성자가 없는 경우
	public ProductService() {
		System.out.println("ProductService 기본 생성자*************");
	}
	
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}
	
	public void product() {
		System.out.println("service product() ~~~~~~");
		dao.product();
	}
	
}
