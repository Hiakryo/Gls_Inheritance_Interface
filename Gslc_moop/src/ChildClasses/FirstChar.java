package ChildClasses;
import Interfaces.IChef;
public class FirstChar extends BaseChara implements IChef{

	public FirstChar(String Name,String Description) {
		super(Name,Description);
	}

	

	@Override
	public void cook() {
	
		System.out.println(this.Name+" is cooking right now");
	}

}
