package chap05_practice;

public class StringStack implements StackInterface {
	private String[] element;
	private int index;
	public StringStack(int capacity) {
		element = new String[capacity];
		index = 0; // ������ �� �迭�� �ε��� 
	}
	@Override
	public int length() {
		return index;
	}

	@Override
	public String pop() {
		if(index == 0) // ������ �����
			return null;
		index--; // ���� ������ ����
		return element[index];
	}

	@Override
	public boolean push(String ob) {
		if(index == element.length)
			return false; // ������ �� á��
		element[index++] = ob; // ��� ���ÿ� ���� �� ���� ������ ����
		return true;
	}
}
