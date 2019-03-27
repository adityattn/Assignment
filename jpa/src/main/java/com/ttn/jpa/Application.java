package com.ttn.jpa;

import com.ttn.jpa.Entity.Person;
import com.ttn.jpa.Repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] arg){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(PersistenceContext.class);
        Person person=new Person();
        person.setfName("aditya");
        person.setlName("kumar");
        person.setAge(25);
        person.setSalary(15000);
        Person person4=new Person("raj","rahul",26,15999);
        Person person7=new Person("peter","parul",35,9000);
        Person person2=new Person("peter","prakash",33,20000);
        PersonRepository personRepository=applicationContext.getBean(PersonRepository.class);
        //Qustion 3Perform all the methods inside CrudRepository for Person Class.

        personRepository.save(person);
        personRepository.save(person4);
        personRepository.save(person7);
        personRepository.save(person2);
        System.out.println("count of person" +personRepository.count());
       // employeeRepository.delete(1);
        System.out.println("person exits or not "+personRepository.exists(1));

        //question 4 and 5For class Person find person declare methods in repository to find person by firstname, lastname and Id.
        List<Person> byFirstName=personRepository.findByfNameIs("aditya");
        System.out.println("find by first Name"+byFirstName);
       List<Person> byLastName=personRepository.findBylNameIs("kumar");
       System.out.println("person data by last name: "+byLastName);
       Person person1=personRepository.findById(1);
       System.out.println(person1);

     // question 6 Use @Query to fetch firstname of the Person whose age is 25.
       String name=personRepository.findByAge();
      System.out.println("person age is  25:"+name);

       //Question 7 Use @Query to fetch firstname and lastname of the Person whose age is 25.

        String name2=personRepository.findByAge2();
        System.out.println(name2);


        //Quetsion 8Get complete information of the Employee whose age is 25 using @Query.

        Person person6=personRepository.finByAge();
        System.out.println(person6);

      //Question 9 Count Person where name is "Peter" using @Query.

        int count=personRepository.countByName();
        System.out.println("no of peter in table:"+count);



        //Question 11  Get the persons greater than age 25 and sort them in descending order according to id by method query.
        List<Person> people=personRepository.findByAgeLessThanOrderByIdDesc(30);
        System.out.println(Arrays.toString(people.toArray()));


       //Question 12 Do  the question above using the Sort class.
        List<Person> list = personRepository.findAll(new Sort(Sort.Direction.DESC,"age"));

        System.out.println(Arrays.toString(list.toArray()));


      //Question 13 Apply Pagination on Person entities.
        Page<Person> personPage= personRepository.findAll(new PageRequest(0,2,new Sort(Sort.Direction.DESC,"id")));
        List<Person> personList=personPage.getContent();
        System.out.println(personList);

       //Question 10

        Person person9=personRepository.findDistinctByfName("aditya");
        System.out.println("distinct by name :"+person9);

        List<Person> list2=personRepository.findByfNameOrAge("peter",33);
        System.out.println(Arrays.toString(list2.toArray()));

        List<Person> list3=personRepository.findByfNameAndAge("peter",33);
        System.out.println(Arrays.toString(list3.toArray()));


        List<Person> list4=personRepository.findByAgeBetween(26,33);
        System.out.println(Arrays.toString(list4.toArray()));

        List<Person> list5=personRepository.findByAgeLessThan(33);
        System.out.println(Arrays.toString(list5.toArray()));


        List<Person> list6=personRepository.findByAgeGreaterThanEqual(26);
        System.out.println(Arrays.toString(list6.toArray()));

        List<Person> list7=personRepository.findByfNameLike("peter");
        System.out.println(Arrays.toString(list7.toArray()));


        List<Person> list8=personRepository.findByfNameNot("peter");
        System.out.println(Arrays.toString(list8.toArray()));


        List<Person> list9=personRepository.findByfNameIgnoreCase("Peter");
        System.out.println(Arrays.toString(list9.toArray()));

//        List<Integer> myAgeList = new ArrayList<Integer>();
//         myAgeList.add(25);
//         myAgeList.add(30);
//        List<Person> list10=personRepository.findByAgeIn(myAgeList);
//        System.out.println(Arrays.toString(list10.toArray()));


        System.out.println("saved successfully");
    }
}
