public class Main {
    
    public static void main(String[] args) {
        
        Friend friend1 = new Friend("Mari", "F", 17, 05);

        System.out.print("The name of my best friend is " + friend1.getName());

        if (friend1.getGender().equalsIgnoreCase("F")){

            System.out.print(", she is female");
        } else if (friend1.getGender().equalsIgnoreCase("M")){

            System.out.print(", he is male");
        }

        System.out.print(", is " + friend1.getAge() + " years old and has a birthday on day " + friend1.getBirthdayDay());
            
    }

    

}
