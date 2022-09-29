package collections;

//제네릭 타입 클래스는 클래스명 다음에 <E> 가 붙음 => E타입은 모든 타입으로 변환 가능
public class Wrapper <E> {
	private E object;

	public E get() {
		return object;
	}

	public void set(E object) {
		this.object = object;
	}

}
