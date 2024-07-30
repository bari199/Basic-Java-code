/*Program in java Remove all white Space From given String*/
class RemoveAllWhiteSpace{
	public static void main(String[] args) {
		String str = "j a v a sta r";
		String str1= str.replaceAll("\\s","");

		System.out.println(str1);
	}
}