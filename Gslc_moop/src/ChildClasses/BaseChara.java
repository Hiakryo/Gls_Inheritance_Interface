package ChildClasses;

public class BaseChara {
	protected String Name;
	protected String Description;
	
	public BaseChara(String Name, String Description) {
		this.Name=Name;
		this.Description=Description;
	}
	public void getinfo()
	{
		System.out.println(this.Name+", "+this.Description);
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
