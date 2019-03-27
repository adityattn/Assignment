package com.ttn.jpa.Repository;

import com.ttn.jpa.Entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {

     @Query("SELECT e from Person e where id=:id")
     Person findById(@Param("id") Integer id);

     //List<Person> findByfNameIs(@Param("name") String name);

    List<Person> findByfNameIs(@Param("fName") String fName);
    List<Person> findBylNameIs(@Param("lName") String lName);

    @Query("select fName from Person  where age=25")
    String findByAge();

   @Query("select fName,lName from Person where age=25")
    String findByAge2();

  @Query("select p from Person p where age=25")
   Person finByAge();

  @Query("select count(fName) from Person where fName='peter'")
    Integer countByName();


  List<Person> findByAgeLessThanOrderByIdDesc(Integer age);



    List<Person> findAll(Sort sort);


    Page<Person> findAll(Pageable pageable);

    //Special attention for question 10 methods

    Person findDistinctByfName(String name);

    List<Person> findByfNameOrAge(String name, Integer age);

    List<Person> findByfNameAndAge(String name, Integer age);

    List<Person> findByAgeBetween(int min,int max);

    List<Person> findByAgeLessThan(int age);

    List<Person> findByAgeGreaterThanEqual(Integer age);

    List<Person> findByfNameLike(String name);

    List<Person> findByfNameNot(String name);

    List<Person> findByAgeIn(List<Integer> ageList);

    List<Person> findByfNameIgnoreCase(String name);


 }
