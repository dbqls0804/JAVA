package 런타임예외;

public class Thermostat {
	//메소드에 throw로 예외를 처리했을 경우 이 메소드를 사용할 때 예외 처리를 함
	public void setTemperature(double temp) {
		
		setMachineTemp(temp); 
		//메소드 추가 => 메소드 및 App에 throws Exception 같이 추가
		
		System.out.println("온도 세팅 : " + temp);
	}

	private void setMachineTemp(double temp) {
		if(temp < 0 || temp > 35) {
			throw new RuntimeException("온도가 비정상 입니다");
		}
		
	}
	
}
