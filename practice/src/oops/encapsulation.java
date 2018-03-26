package oops;

public class encapsulation {
      private int id;
      private String name;
      
    public int getId() {
		return id;
	}
    public void setId(int id) {
		this.id = id;
	}
    public String getName() {
		return name;
	}
       public void setName(String name) {
		this.name = name;
	}
      public static void main(String[] args) {
    	  encapsulation e=new encapsulation();
    	  e.setId(1);
    	  e.setName("avinash");
    	  System.out.println(e.getId());
    	  System.out.println(e.getName());
		
		
	}

}
