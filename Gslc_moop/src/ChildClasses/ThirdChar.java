package ChildClasses;
import Interfaces.IDriver;
public class ThirdChar extends BaseChara implements IDriver{

	public ThirdChar(String Name,String Description) {
		super(Name,Description);
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(this.Name+" is driving right now");
	}

}
