package com.example.HospitalManagement;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Doctor")
public class DoctorController {
    DoctorService ds = new DoctorService();
    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor){
        return ds.addDoctor(doctor);
    }

    //get Doctor with DoctorID
    @GetMapping("/get/{id}")
    public Doctor get(@PathVariable("id")Integer id){
        return ds.get(id);
    }

    //get list of doctor whose age > 35 && specialisation in some field
    @GetMapping("/list")
    public List<Doctor> getList(@RequestParam("age")Integer age,@RequestParam("specialisation")String field){
        return ds.getList(age,field);
    }
    //update age of Doctor with correspond ID
    @PutMapping("/updateAge/{id}/{age}")
    public String updateAge(@PathVariable("id")Integer id,@PathVariable("age")Integer age){
        return ds.updateAge(id,age);
    }
}