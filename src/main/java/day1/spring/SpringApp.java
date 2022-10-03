package day1.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import day1.review.BuyController;
import day1.review.ProductDao;
import day1.review.ProductService;

public class SpringApp {

	public static void main(String[] args) {
		// bean 설정 파일을 읽어와서 bean 객체를 생성 (spring-context가 bean을 관리함)
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext
		("classpath:META-INF/spring/applicationContext.xml");		
		// 어떤 설정 파일을 읽어올건지 결정!
		// classpath는 [[프로젝트 폴더]]\target\classes
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		// 요청한 Bean 파일을 가져온다.
		// 위에서 만들어진 bean(객체) 중에서 id가 controller인 bean을 가져와 변수에 참조한다.
		BuyController controller =
			(BuyController)context.getBean("controller");
		// getBean 메소드 리턴타입이 Object이므로, 참조타입에 맞게 캐스팅을 해주어야 한다.
		
		// 메소드를 실행한다.
		controller.buy();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//		ProductDao pdao = (ProductDao)context.getBean("productDao2");
//		pdao.product();
		
		ProductService pservice = (ProductService)context.getBean("productService");
		pservice.product();
		
		// 다 썼으니까 close
		context.close(); 
		
	}

}
/*
	실행 결과는 다음과 같다.
	BuyDao 생성자***********
	BuyService 생성자 ************
	BuyController 생성자 *************
	controller buy() ~~~~ 
	service buy()
	dao buy()~~~~~~
	마이바티스를 이용하여 db에 연결합니다.
	--------------------------------------
	실행 순서가 위와 같은 이유는 박스에 순서대로 짐을 쌓고 위에서부터 다시 꺼낸다고 생각하면 된다.
 */ 
