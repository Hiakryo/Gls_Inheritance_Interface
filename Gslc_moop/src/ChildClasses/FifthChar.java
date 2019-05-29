package ChildClasses;
import Interfaces.*;
public class FifthChar extends BaseChara implements IChef, IWorker, IDriver, IArtist {

	public FifthChar(String Name, String Description) {
		// TODO Auto-generated constructor stub
		super(Name,Description);
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println(this.Name + " is painting right now");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(this.Name + " is driving right now");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(this.Name+" is working right now");
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println(this.Name+" is cooking right now");
	}

}
