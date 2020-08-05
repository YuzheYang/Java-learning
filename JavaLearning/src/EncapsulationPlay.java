

public class EncapsulationPlay{
	private String name;
	public String getName() {
		return name;
		}
	public void setName(String newName) {
		this.name = newName;
		}
	public static void main(String[] args) {
		EncapsulationPlay staffA = new EncapsulationPlay();
		staffA.name = "JackeyLove";
		System.out.println(staffA.getName());
	}
}
