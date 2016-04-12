package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Startup {

    public static void main(String[] args) {
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }

          Employee e1 = new Employee("Smith","Bob","111-11-1111");
          Employee e2 = new Employee("Smo","Joe","222-22-2222");
          Employee e3 = new Employee("Ree","Jeff","333-33-3333");
          Employee e4 = new Employee("Smith","Bobby","111-11-1111");
          
          Map<String, Employee> emps = new TreeMap<>();//HashMap<>();
          
          emps.put("emp1", e1);
          emps.put("emp2", e2);
          emps.put("emp3", e3);
          emps.put("emp4", e4);
          
          Employee e4c = (Employee)emps.get("emp4");
          
          System.out.println("forth employee:" + e4c);
          
          Set<String> keys = emps.keySet();
          
        for(String key : keys) {
            Employee found = (Employee)emps.get(key);
            System.out.println(found.toString());
        }
        
        Collection<Employee> values = emps.values();
        for(Employee emp : values) {
            System.out.println(emp);
        }
        
        
        
        Set<Employee> set = new TreeSet<>();
        
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        System.out.println("size:" + set.size());
        
        for(Employee e : set) {
            System.out.println(e);
        }
    }
}
