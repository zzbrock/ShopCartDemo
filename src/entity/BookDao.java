package entity;

import java.util.Map;


public class BookDao {

    //��ȡ������鼮��Map����
    public Map getAll() {
        return BookDB.getAll();
    }

    //���ݹؼ��ֻ�ȡĳ���鼮
    public Book find(String id) {
        return BookDB.getAll().get(id);
    }
}
