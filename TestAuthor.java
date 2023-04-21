public class TestAuthor {

    public void test() {

        Author authorObj1 = new Author("John", "Smith", 99);
        Author authorObj2 = new Author("John", "Smith", 88);
        Author authorObj3 = new Author("Melanie", "Gibson", 77);

        System.out.println("Author name: " + authorObj1.getName() + ", surname: " + authorObj1.getSurname() + ", age: " + authorObj1.getAge());

        authorObj2.setSurname("Smite");
        System.out.println("Author name: " + authorObj2.getName() + ", surname: " + authorObj2.getSurname() + ", age: " + authorObj2.getAge());

        System.out.println("Author name: " + authorObj3.getName() + ", surname: " + authorObj3.getSurname() + ", age: " + authorObj3.getAge());
        System.out.println(authorObj3);
    }
}
