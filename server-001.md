WS (Web Server)

역할: 정적 콘텐츠 제공 및 클라이언트 요청 중계

처리 콘텐츠: HTML, CSS, JS, 이미지, 파일 등

주요 기능: 캐싱, 로드 밸런싱, 요청 필터링, SSL 처리

대표 제품: Nginx, Apache HTTP Server, IIS

WAS (Web Application Server)

역할: 동적 비즈니스 로직 수행 및 DB 연동

처리 콘텐츠: 서블릿, JSP, API 응답(JSON/XML) 등

주요 기능: 웹 컨테이너(서블릿 컨테이너) 동작, 트랜잭션 관리

대표 제품: Apache Tomcat, WildFly, Jetty

실무 구조: 보안 및 정적 데이터 처리 속도를 위해 앞단에 WS를 두고, 동적 처리가 필요한 요청만 뒤단의 WAS로 전달합니다.

[2] Spring 주요 특징 4가지

POJO (Plain Old Java Object)

특정 프레임워크나 기술 규약에 종속되지 않는 순수 자바 객체입니다.

객체지향적 설계를 순수하게 유지할 수 있어 테스트와 유지보수가 유연합니다.

IoC (Inversion of Control, 제어의 역전)

객체의 생성, 생명주기 관리, 의존성 결합의 제어권이 개발자가 아닌 Spring 컨테이너로 위임되는 개념입니다.

개발자가 직접 new 연산자로 객체를 생성하지 않고 컨테이너가 관리하는 객체(Bean)를 받아 사용합니다.

DI (Dependency Injection, 의존성 주입)

IoC를 구현하는 구체적인 기술로, 클래스에 필요한 객체를 외부(Spring)에서 생성해 주입해 주는 방식입니다.

객체 간 결합도를 낮추어 코드 재사용성과 단위 테스트 편의성을 극대화합니다.

AOP (Aspect-Oriented Programming, 관점 지향 프로그래밍)

핵심 비즈니스 로직과 공통 기능(로깅, 트랜잭션, 보안 등)을 분리하여 모듈화하는 기법입니다.

코드 중복을 줄이고 핵심 로직에만 집중할 수 있게 해줍니다.