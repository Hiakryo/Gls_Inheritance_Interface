package ChildClasses;
import Interfaces.IWorker;
public class FourthChar extends BaseChara implements IWorker {

	public FourthChar(String Name,String Description) {
		super(Name,Description);
	}
	

	@Override
	public void work()
	{
		System.out.println(this.Name + " is working right now");
	}

}
