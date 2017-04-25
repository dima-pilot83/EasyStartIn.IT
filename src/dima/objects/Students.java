package dima.objects;


public class Students extends Human{

	private String group;

	public Students(String name, String lastname, int age, boolean sex, String group) {
		super(name, lastname, age, sex);
		this.group = group;
	}

	public Students() {
		super();
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return  super.toString()+" [group=" + group + "]";
	}
	
}
