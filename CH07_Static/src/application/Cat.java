package application;

public class Cat {

		private String name;
		private int id; //고양이 아이디(고유한 값, 중복 불가)
		
		// 클래스명만 가지고 사용 static
		public static final String FOOD = "고양이 사료";
		
		private static int count = 0; //객체와 상관없이 바로 만들어지는 변수
		//스테틱 변수 초기값 0
		
		public Cat(String name) {
			this.name = name;
			count++; //객체 생성시 카운트 1증가!
			id = count; //고양이를 만들때마다 1씩 증가하고 그 값이 id에 들어가면 중복 안됨
			
		}

		/* public int getCount() {
			return count;
		} 카운트를 리턴 */
		
		//스테틱 메서드는 스테틱 변수만 사용 가능
		public static int getCount() {
			return count; //카운트를 리턴
		}
		
		
		@Override
		public String toString() {
			return "Cat [고양이 ID: " + id + ", 이름 = " + name + "]";
		}
		
	}

