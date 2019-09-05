Thinking In Java 4th Edition
=========
워낙 좋은 책으로 평이 좋아 공부 후 정리하기 위한 공간을 만든다.
- - - - -
## 목차
1. [개요](#개요)
	* [저자 서문](#저자-서문)
	* [읽기 전 기대](#읽기-전-기대)
2. [요약](#요약)
3. [참고](#참고)
	* [CONTENTS](#CONTENTS)
	* [이후](#이후)

## 개요

### 저자 서문
이 책의 의도(집필 목적)를 가장 잘 설명하고 있는 저자서문 중 일부를 발췌해본다.

> 나는 처음에 자바를 '그냥 또 다른 프로그래밍 언어'로 생각했고, 실제로 여러 면에서 그러했다. 그러나 시간이 흐르고 내가 자바를 더 깊이 파악하면서 이 언어의 근본 취지는 다른 언어와 다르다는 것을 깨닫기 시작했다.

> 프로그래밍은 복잡성을 다루는 것이다. 즉, 우리가 해결하고자 하는 문제의 복잡성으로서, 그것이 해결될 머신의 복잡성에 놓여져 있다. 이러한 복잡성 때문에 대부분의 프로그래밍 프로젝트가 실패한다. 그리고 아직까지는 내가 아는 모든 프로그래밍 언어들 중 그 어떤 것도 프로그램 개발과 유지보수의 복잡성을 극복하는 것을 주요 설계 목표로 한 것이 거의 없었다.

> 자바를 알게 되면서 인상 깊었던 것은 선(Sun) 사의 설계 목적에 있었는데, 그것은 프로그래머를 위해 복잡함을 줄이는 목표였던 것 같다. 마치 '우리는 강력한 코드를 만드는데 드는 시간과 어려움을 줄이는 데 신경 쓰고 있습니다'라고 말하는 듯 했다. 초창기에는 이러한 목표로 인해 코드의 실행 속도가 그리 빠르지 않았다(시간이 지나면서 개선되어 왔지만). 그러나 개발 시간은 놀랄 만큼 감소시켰다. 동일한 기능의 C++ 프로그램을 작성하는 데 걸리는 시간의 절반 이하가 된 것이다. 이 결과 하나만으로도 시간과 비용을 크게 절감할 수 있지만 자바는 거기서 멈추지 않는다. 멀티스레딩이나 네트워크 프로그래밍처럼 중요도가 높은 복잡한 작업들을 언어 특성이나 라이브러리에(그런 작업들을 쉽게 해줄 수 있는) 포함시키게 된 것이다. 그리고 결국은 매우 복잡한 문제까지 파고들게 된다. 즉 크로스 플랫폼 프로그램, 동적 코드 변경, 보안까지도. 그리고 이들 각각을 다양한 범위의 복잡도에 잘 맞출 수 있다. 이미 알려진 성능상의 문제에도 불구하고 자바의 약속은 굉장하다. 즉, 우리를 더욱 생산성 높은 프로그래머로 만들 수 있는 것이다.

##### [목차로 이동](#목차)

### 읽기 전 느낌
객체 지향 언어인 자바를 공부하며 책이 세 부류가 있다고 생각했다.

* 객체지향적인 프로그래밍 방법(설계의 관점)
* 자바가 어떻게 객체지향을 구현하는가 설명(자바 언어의 매커니즘)
* 자바 기본서(기술의 나열)

보통은 기본서가 대부분이었는데, 최근 [오브젝트](https://github.com/nara1030/portfolio/blob/master/docs/book/object.md)라는 책을 통해 설계 관점의 책을 접하게 되고 비슷한 시기에 자바 언어를 고찰하고 있는 이 책을 읽게 되어 다행이라는 생각이다.

##### [목차로 이동](#목차)

## 요약


##### [목차로 이동](#목차)

## 참고

### CONTENTS
목차를 보면 책의 흐름을 쉽게 기억할 수 있기에 아래 기록한다. 링크를 클릭하면 상세 요약을 정리했다.

* 1장: 객체란?
* 2장: 모든 것이 객체다
* 3장: 연산자
* 4장: 프로그램 실행 제어
* 5장: 초기화와 클린업
* 6장: 접근 제어
* 7장: 클래스 재사용하기
* 8장: 다형성
* 9장: 인터페이스
* 10장: 내부 클래스
* 11장: 객체 저장하기
* 12장: 예외를 이용한 에러 처리
* 13장: 문자열
* 14장: 타입 정보
* 15장: 제네릭
* 16장: 배열
* 17장: 컨테이너 깊이 들여다보기
* 18장: 입출력
* 19장: 열거형
* 20장: 어노테이션
* 21장: 동시성
* 22장: 그래픽 사용자 인터페이스

##### [목차로 이동](#목차)

### 이후
언어는 꾸준히 발전한다. 자바도 마찬가지인데, 이 책의 버전 정보에 대해 저자는 다음과 같이 얘기한다.

> 선(Sun) 사에서 JDK 1.5라 불렀던 자바 SE5 버전을 반영했다(따라서 이 책의 많은 코드가 종전 버전의 자바에서 컴파일되지 않을 수 있다). 이 책이 출간되기 전 자바 SE6 버전이 베타 버전으로 소개되었지만, 책에 반영하진 않았다. 주로 처리 속도와 라이브러리에 대한 것이었기 때문이다.

따라서 자바 언어의 이후 버전에 대해서는 다른 서적으로 공부했다.

* [이것이 자바다: 자바8 버전](https://github.com/nara1030/ThisIsJava/blob/master/README.md)
* .

##### [목차로 이동](#목차)