package com.example.HospitalManagement;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class DoctorDB {
    HashMap<Integer,Doctor> hm = new HashMap<>();
    public String add(Doctor doctor){
        int key = doctor.getDoctorId();
        hm.put(key,doctor);

        return "Doctor added to DataBase successfully";
    }
    public Doctor get(Integer id){
        if(hm.containsKey(id))
            return hm.get(id);
        else return null;
    }
    public List<Doctor> getList(){
        List<Doctor> list = new ArrayList<>();
        for(int key:hm.keySet()){
            Doctor d = hm.get(key);
            list.add(d);
        }
        return list;
    }
}
