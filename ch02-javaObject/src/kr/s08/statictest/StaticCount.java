package kr.s08.statictest;

public class StaticCount {
	//인스턴스 변수(멤버변수):*객체에 포함되는 변수 객체가 생성될 때 메모리에 올라감
	int c;
	//static(클래스 변수): *객체에 포함되지 않음_static 영역에 올라가서 누적, 호출만 하면 메모리로 올라감
	static int count;
	
	//생성자: 객체 생성 후 매번 초기화
	public StaticCount() {
		c++;
		count++;
	}
}
/* 메모리 공간
 *	stack(참조변수)	heap(객체)		static(공유_초기화 안함,객체 포함 안됨)
 * 
 *					static count	count=1
 *	sc1	 ->			c=0_++1
 *	sc2  -> 		c=0_++1			count=2_1++1(기존 count 사용)
 *	sc3  ->			c=0_++1			count=3_1++1++1(기존 count 사용)
 */
