public class Author {

    private String name, surname;
    private int age;

    public Author(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return ("name: " + this.name + " surname: " + this.surname + " age: " + this.age);
    }
}
