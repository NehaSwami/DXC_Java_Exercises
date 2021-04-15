public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = "Robert Brett Roser";
        StringBuffer Initials = new StringBuffer();
        int length = Name.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(Name.charAt(i))) {
                Initials.append(Name.charAt(i));
            }
        }
        System.out.println("My initials are: " + Initials);
	}
}	