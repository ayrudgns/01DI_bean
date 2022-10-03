package day1.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// BuyController를 새롭게 import 해줘야 한다!
import day1.annot.BuyController;
import day1.annot.BuyDao;
import day1.annot.ProductDao;
import day1.annot.ProductService;

public class SpringAppAnnot {

	public static void main(String[] args) {
		// bean 설정 파일을 읽어와서 bean 객체를 생성 (spring-context가 bean을 관리함)
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext
		("classpath:META-INF/spring/applicationContextAnnot.xml");		
		// 어떤 설정 파일을 읽어올건지 결정!
		
		System.out.println("1. @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		// 요청한 Bean 파일을 가져온다.
		// 위에서 만들어진 bean(객체) 중에서 id가 controller인 bean을 가져와 변수에 참조한다.
		BuyController controller =
			(BuyController)context.getBean("buyController");
		// @Component의 bean id는 클래스 이름에서 첫글자만 소문자로 자동 설정된다(기본, 변경 가능).
		
		// 메소드를 실행한다.
		controller.buy();
		System.out.println("2. @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
//		BuyDao dao = (BuyDao)context.getBean("buyDao");		// bean id로 가져오기
		BuyDao dao = context.getBean(BuyDao.class);			// bean 타입으로 가져오기 (해당 타입이 1개뿐인 경우)
					// 타입을 이미 지정해줬으므로 캐스팅 필요 X
		dao.buy();

		System.out.println("3. @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		ProductDao pdao = context.getBean(ProductDao.class);
		pdao.product();

		System.out.println("4. @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		ProductService pservice = context.getBean(ProductService.class);
		pservice.product();
		
		// 다 썼으니까 close
		context.close(); 
		
	}

}
