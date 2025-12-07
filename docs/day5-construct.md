### this

- 매개변수의 이름과 멤버변수의 이름이 같은 경우 `this` 를 사용해서 둘을 명확하게 구분해야 함.

```java
package construct;

public class MemberInit {
    String name; //멤버변수
    int age; //멤버변수
    int grade; //멤버변수

    void initMember(String name, int age, int grade) { //매개변수
        name = name; //이 경우 앞의 name은 멤버변수, 뒤의 name은 매개변수 -> 이름이 같아 구분이 되지 않음
        age = age;
        grade = grade;
    }
}
```

```java
package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name; //this를 사용해서 멤버변수임을 명시적으로 가리킴
        this.age = age;
        this.grade = grade;
    }
}
```

- `this` 는 인스턴스 자기 자신, 즉 멤버 변수를 사용한다는 것을 가리킴.
- 만약, 멤버변수의 이름과 매개변수의 이름이 같지 않다면 `this` 는 생략 가능

### 생성자

- **객체 생성과 초기값 할당을 동시에 하게 해줌**
- 생성사는 메서드와 유사하지만 차이점이 있음
    - 생성자 이름 = 클래스 이름. 즉, 생성자의 첫 글자는 대문자.
    - 생성자는 반환 타입이 없다. 비워두어야 함.
- 생성자 호출
    - 생성자는 인스턴스(객체)를 생성하고 나서 즉시 호출됨.

        ```java
        new 생성자이름(생성자에 맞는 인수 목록)
        
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        ```

    - 이렇게 하면 인스턴스를 생성하고 즉시 해당 생성자를 호출. 즉, new 키워드로 메모리에 인스턴스를 생성함과 동시에 생성자 호출
- 생성자 장점
    - 중복 호출 제거

        ```java
        //생성자 등장 전
        MemberInit member = new MemberInit();
        member.initMember("user1", 15, 90);
        
        //생성자 등장 후
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        ```

    - 제약 - 생성자 호출 필수
        - 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 함.

          → 생성자를 사용하면 필수값 입력을 보장할 수 있다.

            ```java
            MemberConstruct member3 = new MemberConstruct(); //컴파일 오류 발생
            member3.name = "user1";
            ```

            ```java
            //컴파일 오류 메시지
            no suitable constructor found for MemberConstruct(no arguments)
            ```

- 기본 생성자
    - 매개변수가 없는 생성자
    - 클래스에 생성자가 하나도 없으면 자바 컴파일러가 알아서 기본 생성자를 만듦
    - 단, 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않음
- 오버로딩과 this()
    - 생성자도 메서드 오버로딩처럼 매개변수만 다르게 해서 같은 이름의 여러 생성자를 만들 수 있음
    - `this()` 를 사용하면 생성자 대부에서 다른 생성자를 호출할 수 있음 → 자신의 생성자를 호출
    - `this()` 는 생성자에서만 사용 가능
    - 규칙: **`this()` 는 생성자 코드의 첫줄에만 작성할 수 있음**

*무슨 파라미터 필요한지 : `command` + `p`