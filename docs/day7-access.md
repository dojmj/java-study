### 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.

**`private`**

- 모든 외부 호출을 막음
- `private` 이 붙은 경우 해당 클래스 내부에서만 호출 가능

**`default`** (package-private)

- 같은 패키지 안에서 호출은 허용
- 접근 제어자를 명시하지 않으면 `default` 가 적용됨

**`protected`**

- 같은 패키지 안에서 호출은 허용
- 패키지가 달라도 상속 관계의 호출은 허용

**`public`**

- 모든 회부 호출 허용

순서대로 **`private`** 이 가장 많이 차단하고, **`public`** 이 가장 많이 허용함.

`private` → `default` → `protected` → `public`

**접근 제어자 예시**

```java
public class Speaker { //클래스 레벨
	private int volume; //필드
	
	public Speaker(int volume){} //생성자
	
	public void volumeUp() {} //메서드
	public void volumeDown() {}
	public void ShowVolume() {}
}
```

> 참고: 좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약을 제공하는 프로그램이다.
>

**접근 제어자 사용 - 클래스 레벨**

- 규칙
    - 클래스 레벨의 접근 제어자는 `public` , `default` 만 사용할 수 있음
    - `public` 클래스는 반드시 파일명과 이름이 같아야 함
        - 하나의 자바 파일에 `public` 클래스는 하나만 등장할 수 있음
            - 하나의 자바 파일에 `default` 접근 제어자를 사용하는 클래스는 무한정 만들 수 있음

### 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화

→ 결론: 접근 제어자를 통해 데이터를 모두 숨기고 캡슐화를 하여 데이터를 안전하게 보호하는 것은 물론이고, 개발자 입장에서 기능을 사용하는 복잡도도 낮출 수 있게 됨. 

[접근제어자 + 캡슐화를 잘 사용하자!]

*생성자 빠른 생성 단축키: `command` + `n`

*메서드 빠른 생성 단축키: 메서드가 없어서 오류난 곳에서 `option` + `enter`

*Introduce Variable(변수꺼내기?) : `option` + `command` + `v`