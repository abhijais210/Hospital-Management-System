package com.example.HospitalManagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class DoctorService {
    DoctorDB db = new DoctorDB();
    public String addDoctor(Doctor doctor){
        return db.add(doctor);
    }
    public Doctor get(Integer id){
        return db.get(id);
    }
    public List<Doctor> getList(Integer age,String field){
        //first get List of doctors from repository or DB class
        List<Doctor> list = db.getList();
        List<Doctor> modifiedList = new ArrayList<>();

        for(Doctor d : list){
            if(d.getAge() >  age && d.getSpecialist().equals(field))
                modifiedList.add(d);
        }
        return modifiedList;
    }
    //update age validation check if it is a correct id or not
    public String updateAge(Integer id,Integer age){
            Doctor d = db.get(id);
            if(d == null)
                return "enter a valid ID";
            else{
                d.setAge(age);
                db.add(d);

                return "age updated of ID :"+id+" Doctro to Age:"+age;
        }
    }

}
