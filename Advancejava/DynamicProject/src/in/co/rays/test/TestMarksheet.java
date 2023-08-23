


package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.MarksheetModel;


public class TestMarksheet {
	
	public static void main(String[] args) throws Exception { 
		
		
	//	testAdd();
	 // testDelete();
	 // testUpdate();
		testSearch();
		//testFindByRollnumber();
		
	}

	  private static void testFindByRollnumber() throws Exception {
	
		  
		  MarksheetModel model = new MarksheetModel();
		  
		  MarksheetBean bean = model.findByRoll(111);
		  
		  if (bean != null) {
			  
			
			  	System.out.println(bean.getId());
				System.out.println(bean.getName());
				System.out.println(bean.getRoll_No());
				System.out.println(bean.getPhysics());
				System.out.println(bean.getChemistry());
				System.out.println(bean.getMaths());
				  
			   
		  }
		  else {
			  System.out.println("Rollnumber does not exit");
		  }
		  
		  
	}

	private static void testSearch() throws Exception {
		
		MarksheetBean bean = new MarksheetBean();
		
		//bean.setName("s");
	//	bean.setId(1);
		//bean.setRollnumber(102);

		  MarksheetModel model = new MarksheetModel();
		  
		  
		  
		  List  list = model.search(bean,1,5);
		  
		  
		  Iterator it = list.iterator();
		  
		  while(it.hasNext()) {
			  
			 bean = (MarksheetBean) it.next();
			
			System.out.print(bean.getId());
			System.out.print("\t"+ bean.getName());
			System.out.print("\t"+bean.getRoll_No());
			System.out.print("\t"+bean.getPhysics());
			System.out.print("\t"+bean.getChemistry());
			System.out.println("\t"+bean.getMaths());
			  
			  
		  }
		  
		  
		  
	}

	private static void testUpdate() throws Exception {

		  MarksheetBean bean = new MarksheetBean();
		  
		  bean.setId(2);
		  bean.setName("Radhe");
		  bean.setRoll_No(102);;
		  bean.setPhysics(87);
		  bean.setChemistry(78);
		  bean.setMaths(89);
		  
		  MarksheetModel model = new MarksheetModel();
		  
		  model.update(bean);
	}

	private static void testDelete() throws Exception {
  MarksheetModel model = new MarksheetModel();
  model.delte(16);
	
	  }

	public static void testAdd() throws Exception {
		  
		  MarksheetBean bean = new MarksheetBean();
		  
		 
		 bean.setId(16);
		  bean.setName("Shivanshi");
		  bean.setRoll_No(105);
		  bean.setChemistry(66);
		  bean.setPhysics(77);
		  bean.setMaths(88);
		  
		  
		  MarksheetModel model = new MarksheetModel();
		  model.add(bean);
		  
	  }
	
	
}