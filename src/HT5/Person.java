package HT5;


import java.util.Calendar;

//vЗадача №7
//Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Ms. ” если женский.
//
//
//Задача №8
//В классе Person добавьте поле yearOfBirth (год рождения) и сделайте это поле неизменяемым которое можно задать только через конструктор.
//Удалите поле age из конструкторов и удалите setter метод для этого поля.
//Измените getter для поля age чтобы он возвращал возраст как целое количество лет
//
//подсказка как найти текущий год (попробуйте сначала найти сами) подсказку видно если выделить текст следующей строки :
public class Person {
    private String name;
    private char sex;
    private int age;
    private int yearOfBirt;
    private Person mother;
    private Person father;

    public Person(String name, char sex, int yearOfBirt) {
        this.name = name;
        this.sex = sex;
        this.yearOfBirt=yearOfBirt;
        //this.age = age;

    }
    public String getName(){
        if (sex == 'F'){
        return "Mrs "+ name;
        }
        else if (sex == 'M'){
            return "Mr "+ name;
        }
        else
            return "Undef "+ name;
    }
    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR)-yearOfBirt;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public char getSex() {
        return sex;
    }

    public int getYearOfBirt() {
        return yearOfBirt;
    }
}