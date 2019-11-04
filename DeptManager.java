package demo8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class DeptManager implements {
	private List<Dept> list = new ArrayList<>();

	public void create(Dept d){
		this.list.add(d);
	}
	public List<Dept> getlist() {
		return list;
	}
	
	public void delete(int deptno){
		for (int i = 0;i< list.size();i++) 
		{
			if (list.get(i).getDeptno() == deptno) {
					list.remove(list.get(i));
					break;
			}
		}
	}
	public void update(Dept newDept) {
		for (int i = 0;i< list.size();i++) 
		{
			if (list.get(i).getDeptno() == newDept.getDeptno()) {
				list.set(i,newDept);
				System.out.println("Update " + newDept);
				break;
			}
		}
	}

	public static void main(String[] args) {
		DeptManager mgr = new DeptManager();
		for(int i =1;i<=10;i++){
			Dept d = new Dept();
			d.setDeptno(i);
			d.setDname("Nameof"+i);
			if ((i % 2) ==0)
				d.setLoc("BLR");
			else
				d.setLoc("Hyd");
			mgr.create(d);
		}
		
		mgr.delete(5);
		Dept d = new Dept(1,"HR","Pune");
		mgr.update(d);
		
		for (Dept  dept : mgr.getlist()) {
			System.out.println(dept);
		}
	}
	
}
