package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return "오후서비스시작";
	}
	public String day() {
		return "낮서비스시작";
	}
	public String night() {
		return "밤서비스시작";				
	}
	
	public void service(String state) {
		switch(state) {
			case "낮" : System.out.println(day()); break;
			case "밤" : System.out.println(night()); break;
			case "오후" : System.out.println(afternoon()); break;
		}
	}
}
