import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yunfei.server.DemoProviderServer;

public class TestConsumer {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
	        context.start();
	      DemoProviderServer demoConumer =(DemoProviderServer)context.getBean("demoProviderServer");
	     String result= demoConumer.sayHello("���");
	     System.out.println("Զ�̵��ý��"+result);
	     
	     //�÷������Ѻ������zookeeper��  ������dubbo-admin����鿴
	     try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	       context.close();
	}
}
