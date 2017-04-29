
public class Application {

	public static void main(String[] args) {
		
		PerformanceStage stage = PerformanceStage.getInstance();
		PerformanceStage stage2 = PerformanceStage.getInstance();
		
		System.out.println(stage.getCounter());
		System.out.println(stage2.getCounter());
		
	}

}
