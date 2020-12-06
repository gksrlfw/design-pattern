
/*
 * Computer를 중간노드, keyboard, mouse, monitor... 등의 부품을 단말노드로 하여 진행할 수 있다
 * Computer와 기타 부품 모두 같은 메서드를 이용할 수 있고, 루트의 Computer를 이용하면 전체 값을 얻을 수 있다
 */

public class Client {
  public static void main(String[] args) {
    ComputerDevice keyboard = new Keyboard(5, 2);
    ComputerDevice mouse = new Mouse(100, 70);
    
    Computer computer = new Computer();
    computer.addComponent(keyboard);
    computer.addComponent(mouse);
    
    ComputerDevice keyboard2 = new Keyboard(5, 2);
    ComputerDevice mouse2 = new Mouse(100, 70);
    Computer computer2 = new Computer();
    computer2.addComponent(keyboard2);
    computer2.addComponent(mouse2);
    
    computer.addComponent(computer2);
    
    // 컴퓨터의 가격과 전력 소비량을 구함
    int computerPrice = computer.getPrice();
    int computerPower = computer.getPower();
    System.out.println("Computer Price: " + computerPrice + "만원");
    System.out.println("Computer Power: " + computerPower + "W");
  }
}
