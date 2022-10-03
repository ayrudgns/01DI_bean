package day1.review;

public class ProductDao {
	
	private int cnt;
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
