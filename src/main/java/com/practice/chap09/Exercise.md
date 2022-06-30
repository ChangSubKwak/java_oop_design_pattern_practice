# 연습문제 풀이
## 1-1. 클래스 기능 설명
### Battery : ConcreteObserver 를 관리 하는 클래스
- Observer 인 BatteryLevelDisplay 와 연관 또는 집약 관계
- Observer 인 LowBatteryWarning 와 연관 또는 집약 관계

### BatteryLevelDisplay
- Battery 의 변경을 통보받는 클래스
- 변경을 통보 받으면 Battery 의 레벨을 출력 

### LowBatteryWarning
- Battery 의 변경을 통보받는 클래스
- 변경을 통보 받으면 Battery 의 레벨이 낮은지 확인 후 경고

## 1-2. 3개 클래스를 클래스 다이어 그램으로 표현하라.
### 그림 추가 예정 


## 1-3. 다음 프로그램의 실행 결과를 작성하라.
### 결과
```text
Level : 80
Level : 30
Level : 20
<Warning> Low Battery: 20 Compared with 30
```

## 1-4. Battery 클래스의 설계 취약점을 OCP 측면에서 설명하라. 그리고 Battery 클래스의 코드 중에서 OCP 를 위반하는 부분을 명시하라
### 설계취약점
- Battery 클래스의 레벨이 가득 차있는지 아닌지를 확인하는 기능을 추가하려고 한다면 Battery 클래스의 수정이 필요함
- 기능 추가로 Subject 에 해당하는 클래스 변경이 일어나면 "기존의 코드를 변경하지 말고 기능 추가를 해야하는" OCP 법칙에 위배됨

### Battery 클래스의 OCP 위반 부분
- BatteryLevelDisplay 와 LowBatteryWarning 클래스를 인터페이스나 추상클래스로 변경하여 update() 함수를 추상화하면 기능이 추가되어도 기존 코드에 변경이 일어나지 않음
```java
private BatteryLevelDisplay display;
private LowBatteryWarning warning;
```

## 1-5. Battery 클래스 설계의 취약점을 옵서버 패턴을 활용해 개선하는 방법을 설명하라.
### 설계 개선하기 
- BatteryObserver 인터페이스를 선언하고 update() 메서드를 선언
- BatteryObserver 의 구상클래스를 BatteryLevelDisplay, LowBatteryWarning 로 선언

## 1-6. Battery 클래스, BatteryLevelDisplay 클래스, LowBatteryWarning 클래스의 설계를 옵서버 패턴을 활용해 개선한 모습을 클래스 다이어그램으로 표현하라.
### 그림 추가 예정


## 1-7. 옵서버 패턴을 활용해 개선한 설계에서 옵서버 패턴의 각 구성 요소에 대응하는 클래스를 명시하라.
### Subject : Battery
### Observer : BatteryObserver
### ConcreteObserver : BatteryLevelDisplay, LowBatteryDisplay

## 1-8. 옵서버 패턴을 활용해 개선한 설계를 바탕으로 Battery 클래스, BatteryLevelDisplay 클래스, LowBatteryWarning 클래스를 이용하도록 기존의 Client 클래스를 재작성하라.
### 코드 작성