
/*
 * Computer�� �߰����, keyboard, mouse, monitor... ���� ��ǰ�� �ܸ����� �Ͽ� ������ �� �ִ�
 * Computer�� ��Ÿ ��ǰ ��� ���� �޼��带 �̿��� �� �ְ�, ��Ʈ�� Computer�� �̿��ϸ� ��ü ���� ���� �� �ִ�
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
    
    // ��ǻ���� ���ݰ� ���� �Һ��� ����
    int computerPrice = computer.getPrice();
    int computerPower = computer.getPower();
    System.out.println("Computer Price: " + computerPrice + "����");
    System.out.println("Computer Power: " + computerPower + "W");
  }
}
