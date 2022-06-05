public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age, address);
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("Некорректный возраст.");
        } else if (name == null || surname == null) {
            throw new IllegalStateException("Введены неполные данные.");
        }
        return person;
    }
}
