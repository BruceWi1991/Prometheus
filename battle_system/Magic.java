package battle_system;
import character.Character_Class;
public class Magic {
	
	Character_Class magic = new Character_Class();
	int flameball = 0;
	int lightning_bolt = 0;
	String name;
	
	public int get_Flameball(){
		magic.setMagic(30);
		return flameball = magic.getMagic();
	}

	public int get_Lightning_Bolt(){
		magic.setMagic(10);
		return lightning_bolt = magic.getMagic();
	}
	
	public String get_Lightning_Bolt_Name(){
		return name = "Lightning Bolt";
	}
	
	public String get_Flameball_Name(){
		return name = "Flameball";
	}
	

}
