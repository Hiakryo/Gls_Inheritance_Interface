package ChildClasses;
import Interfaces.IArtist;
public class SecondChar extends BaseChara implements IArtist{

	public SecondChar(String Name,String Description) {
		super(Name,Description);
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println(this.Name+" is painting right now");
	}

}
