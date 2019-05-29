import java.util.Scanner;
import java.util.Vector;

import Interfaces.*;
import ChildClasses.*;

public class Main {
	String input;
	String[] split;
	String type;
	String idx;
	String idxlist[];
	Vector<BaseChara> CharList = new Vector<BaseChara>();
	Vector<Integer> IdList = new Vector<Integer>();
	Scanner scan= new Scanner(System.in);
	public Main() {
		
		CharList.add(new FirstChar("Chef", "Someone who is great at cooking"));
		CharList.add(new SecondChar("Artist", "Someone who is great at painting"));
		CharList.add(new ThirdChar("Driver", "Someone who is great at driving"));
		CharList.add(new FourthChar("Worker", "Someone who is great at working"));
		CharList.add(new FifthChar("Awesome guy", "Someone who is great at everything"));
		CharList.add(new SixthChar("Useless guy", "Someone who is basically bad at everything"));
		
		do {
			space();
			menu();
			
			boolean valid;
			valid=false;
			int u=0;
			do {
				System.out.print("Input your command[cook|work|drive|paint] and id[1..6]: ");
				input=scan.nextLine();
				split= input.split(" ",2);
				type= split[0];
				idx= split[1];
				if(idx.isBlank())
				{
					System.out.println("please insert number");
					valid=false;
				}
				else
				{
					idxlist = idx.split(" ");
					valid=true;
				}
			}while(valid==false);
				for(int i=0;i<idxlist.length;i++)
				{	
					try {
						u=Integer.parseInt(idxlist[i]);
					} catch (Exception e) {
						System.out.println("Please insert id[1-6]");
					}
					
					if(u%1>=0)
					{
						try {
							IdList.add(u-1);
						} catch (Exception e) {
							System.out.println("Id from 1-6");
						}
					}
					else
					{
						break;
					}
				}
				
				
				switch (type.toLowerCase())
				{
				case "info":
				{
					for(int i=0;i<IdList.size();i++)
					{
						CharList.get(IdList.get(i)).getinfo();
					}
					break;
				}
				case "cook":
				{
					for(int i=0;i<IdList.size();i++)
					{
						if(CharList.get(IdList.get(i)) instanceof IChef)
						{
							((IChef) CharList.get(IdList.get(i))).cook();
						}
						else
						{
							
						System.out.println(CharList.get(IdList.get(i)).getName()+" cannot cook!");
						}
					}
					break;
				}
				case "drive":
				{
					for(int i=0;i<IdList.size();i++)
					{
						if(CharList.get(IdList.get(i)) instanceof IDriver)
						{
							((IDriver) CharList.get(IdList.get(i))).drive();
						}
						else
						{
							
						System.out.println(CharList.get(IdList.get(i)).getName()+" cannot drive!");
						}
					}
					break;
				}
				
				case "work":
				{
					for(int i=0;i<IdList.size();i++)
					{
						if(CharList.get(IdList.get(i)) instanceof IWorker)
						{
							((IWorker) CharList.get(IdList.get(i))).work();;
						}
						else
						{
							
						System.out.println(CharList.get(IdList.get(i)).getName()+" cannot work!");
						}
					}
					break;
				}
				
				
				case "paint":
				{
					for(int i=0;i<IdList.size();i++)
					{
						if(CharList.get(IdList.get(i)) instanceof IArtist)
						{
							((IArtist) CharList.get(IdList.get(i))).paint();;
						}
						else
						{
							
						System.out.println(CharList.get(IdList.get(i)).getName()+" cannot paint!");
						}
					}
					break;
				}
				
				}
				IdList.clear();
				
		}while(!input.contains("exit"));
			
		}

	void menu()
	{
	
		System.out.println("Simulasi Kelompok Kemampuan");
		for (int i = 0; i < CharList.size(); ++i) {
            System.out.println((i+1) + " : " + CharList.get(i).getName());
        }
	}
	
	void space()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Main();
	}

}
