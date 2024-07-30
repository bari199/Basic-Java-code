/*Program in java Remove a Special Charecter in String.*/
class RemoveSpecialChar{
	public static void main(String[] args) {
		String str="$ja!va$&st%ar";
		//Approach 1(replace all() method)
		String simplestr=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(simplestr);
	}
}