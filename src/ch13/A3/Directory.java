package ch13.A3;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
    private String name;                    // ���丮�� �̸�
    private Vector dir = new Vector();      // Ƽ���丮 ��Ʈ���� ����
    public Directory(String name) {         // ������
        this.name = name;
    }
    public String getName() {               // �̸��� ��´�.
        return name;
    }
    public int getSize() {                  // ����� ��´�.
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {         // ��Ʈ���� �߰�
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {      // Iterator�� ����
        return dir.iterator();
    }
    public void accept(Visitor v) {         // �湮�ڸ� �޾Ƶ���
        v.visit(this);
    }
}