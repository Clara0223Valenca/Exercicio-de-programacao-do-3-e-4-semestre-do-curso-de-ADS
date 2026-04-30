public class Friend extends Person {

    private int birthdayDay;

    Friend(String name, String gender, int age, int birthdayDay) {
        super(name, gender, age);
        this.birthdayDay = birthdayDay;
    }

    public int getBirthdayDay() {

        return birthdayDay;
    }

    public void setBirthdayDay(int birthdayDay){

        this.birthdayDay = birthdayDay;
    }
    
}
