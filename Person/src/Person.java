public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }

        if (firstName.isEmpty()) {
            return lastName;
        }

        if (lastName.isEmpty()) {
            return firstName;
        }

        return firstName + " " + lastName;
    }
}
