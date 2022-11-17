# Just_TechBlog_API

## 2022-11-08 initialized( parkgeuntae )
#### JAVA version : 17

#### Language level( SDK ) : 17

#### JDK( Java Development Kit ) 9부터 11까지...
- New Garbage Collector 추가 및 ZGC 추가의 장점 : JDK 11부터 공개되었고, “Stop-The-World”로 인한 성능저하를 개선하기 위한 목적을 가지고 Oracle에서 개발됨.
- Collection Factory Method 강화 : Set, List, Map 인터페이스에 Immutable 생성할 수 있는 새로운 메서드가 추가 됨으로 아래와 같이 차이점을 나타냄
> map.put("", ""); -> 
>   Map<String, String> map
    = Map.of("", "", "", "");

- Spring Webflux: 기존 Servlet API를 기반으로 한 HTTP API가 아닌 Reactive Stream기반 통신을 지원하는 Spring MVC 모듈.
- 신규 문자열 메서드 추가 : isBlank -> 문자열이 비어있거나 공백이면 True 반환, repeat -> 문자열을 파라미터로 주어진 수 만큼 반복 등 strip( 문자열 공백 제거 ), stripLeading( 문자열 앞의 공백 제거 ), stripTrailing( 문자열 뒤의 공백을 제거 )등...

###### New Garbage Collector, ZGC 추가 됨의 특징
- 대기 시간이 짧은 Application에 적합한 Garbage Collection.
- Thread가 실행 중일 때 동시 작업을 수행하기에 모든 작업을 동시에 수행. (병렬 처리)
- 처리 시간이 10ms를 초과하지 않아 짧은 지연시간을 보장.
- 8MB부터 16TB까지의 Heap 크기를 지원.

* 적용방법 *
Java Application 실행 시 다음 옵션 실행 (기본 설정: G1GC)
> java -XX:+UseZGC -jar Application.java


#### JDK( Java Development Kit ) 17의 장점
- 2021년 9월 새로 공개한 LTS(Long-Term Support) 버전으로 오라클 JDK 기준 2029년 9월까지 지원한다.
- JAVA Support 기간이 길다 : 현재는 8버전의 지원기간이 17버전보다 상대적으로 조금 더 길지만 17 버전 또한 그렇게 짧지 않다.
- 신규 버전을 위한 대비 가능 : 현재 사용 중인 버전의 지원 종료일이 다가와도 다른 LTS 버전을 도입해야할 시점에 8버전에서 바로 최신 버전으로 가는 것 보다 17버전까지의 기술 적응을 완료한 상태에서 마이그레이션한다면 그에 따른 영향이 최소화 될 것이라 생각된다.
- 텍스트 블록 기능 추가의 장점 : 기존 String을 여러 줄 작성할 때 사용하는 기능으로 가독성 있는 코드를 작성하게 도와준다는 장점이 있다.
- Record Data class 추가 됨 : immutable 객체를 생성하는 새로운 유형의 클래스로 기존 toString, equals, hashCode Method에 대한 구현을 자동 제공.
- Stream.toList() 기능 추가 : 기존, Stream을 List로 변환 시 Collectors에서 기능을 찾아 사용했다면 Java17 부터는 Collectors호출 없이 toList()만으로 변환이 가능하다.



#### Build Management Tool : Gradle
- Gradle 사용 이유
빌드, 프로젝트 구성/관리, 테스트, 배포 도구
안드로이드 앱의 공식 빌드 시스템
빌드 속도가 Maven에 비해 10~100배 가량 빠름
JAVA, C/C++M Python 등을 지원
빌트툴인 Ant Builder와 Groovy 스크립트 기반으로 만들어져 기존 Ant의 역할과 배포 스크립트의 기능을 모두 사용 가능

#### * 라이브러리 추가 *
1. h2 database
2. lombok
3. Springboot helper
4. Spring Web

## 2022-11-09 수정사항( parkgeuntae )
- 프로젝트명, 패키지명 수정

## 2022-11-18 기능추가( parkgeuntae )
- 회원가입, 회원조회 기능 추가
#### 라이브러리 삭제
- h2 database 라이브러리 삭제
