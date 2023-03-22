package com.example.HospitalManagement;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {
    HashMap<Integer,Patient> hm = new HashMap<>();
    @PostMapping("/addPatient")
    public String addPatient(@RequestBody Patient patient){
        int key = patient.getId();
        hm.put(key,patient);

        return "patient added successfully";
    }
    @PostMapping("/addviaParam")
    public String addPatient(@RequestParam("name")String name,@RequestParam("age") Integer age,
                             @RequestParam("id")Integer id,@RequestParam("disease")String disease){
        Patient p = new Patient(name,age,id,disease);
        hm.put(id,p);

        return "patient added via Parameter";
    }
    @GetMapping("/getPatient")
    public Patient getPatient(@RequestParam("id")Integer id){
            Patient p = hm.get(id);
            return p;
    }
    @GetMapping("/patientList")
    public List<Patient> listOfPatient(){
        List<Patient> p = new ArrayList<>();

        for(int key : hm.keySet()){
            p.add(hm.get(key));
        }
        return p;
    }
    @GetMapping("/getPatientByName")
    public Patient getPatientByName(@RequestParam("name")String name){
        for(Patient p : hm.values()){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
}
