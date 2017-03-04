package test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <br />��������set�������String���ͺ�8������������͹��˵��ظ�����,�����ŵ����������Ͷ���
 * ����Ҫ��дhashCode������equals����,��equals�Ƚ����ʱ��
 * ���ȥ�Ƚ�hashCodeֵ hashCode��ֵ ���һ�µĻ�,�򲻻���set
 * @author yxx
 */
public class ListSetMap {  
    
    public static void main(String[] args) {  
        Set<String> nameSet = new HashSet<String>();  
        nameSet.add("����");  
        nameSet.add("����");  
        nameSet.add("����");  
        nameSet.add("����");  
          
        // ������ ����  ����  ����  
        for(String name : nameSet){  
            System.out.print(name + "\t");  
        }  
        System.out.println();
        
        // List����ȥ���ظ���������  
        List<String> nameList = new ArrayList<String>();  
        nameList.add("����");  
        nameList.add("����");  
        nameList.add("����");  
        nameList.add("����");  
        nameSet.addAll(nameList);  
          
        // ������ ����  ����  ����  ����  
        for(String name : nameSet){  
            System.out.print(name + "\n");  
        }  
          
        // ȥ����ź��û���һ���� ������Ҫ��д equals ���� �� hashCode����  
        User admin = new User(1, "admin");  
        User user = new User(2, "user");  
        User user1 = new User(2, "user");  
        User admin1 = new User(3, "admin");  
          
          
        Set<User> userSet = new HashSet<User>();  
        userSet.add(admin);  
        userSet.add(user);  
        userSet.add(admin1);  
        userSet.add(user1);  
        // ������ admin1  admin3  user2  
        for(User u : userSet){  
            System.out.print(u.username + u.id + "\t");  
        }  
          
        System.out.println(user.equals(null));  
    }  
}  
  
class User{  
      
    protected Integer id;  
      
    protected String username;  
      
    public User(Integer id, String username){  
        this.id = id;  
        this.username = username;  
    }  
  
  
    /** 
     * �������������User �Ļ� �򷵻�true ȥ�Ƚ�hashCodeֵ 
     */  
    @Override  
    public boolean equals(Object obj) {  
        if(obj == null) return false;  
        if(this == obj) return true;  
        if(obj instanceof User){   
            User user =(User)obj;  
//          if(user.id = this.id) return true; // ֻ�Ƚ�id  
            // �Ƚ�id��username һ��ʱ�ŷ���true ֮����ȥ�Ƚ� hashCode  
            if(user.id == this.id && user.username.equals(this.username)) return true;  
            }  
        return false;  
    }  
  
  
  
    /** 
     * ��дhashcode ���������ص�hashCode ��һ�����϶�Ϊ��ͬ�Ķ��� 
     */  
    @Override  
    public int hashCode() {  
//      return id.hashCode(); // ֻ�Ƚ�id��idһ���Ͳ���ӽ�����  
        return id.hashCode() * username.hashCode();  
    }  
  
      
}  