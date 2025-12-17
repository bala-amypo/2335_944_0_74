import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class Studentcontroller {

    @Autowired
    Studentservice src;

    @PostMapping("/post")
    public Studententity postdata(@RequestBody Studententity st){
        return src.savedata(st);
    }

    @GetMapping("/get")
    public List<Studententity> getdata(){
        return src.retdata();
    }

    @GetMapping("/getid/{id}")
    public Studententity getIdVal(@PathVariable int id){
        return src.id(id);
    }

    @PutMapping("/update/{id}")
public String update(@PathVariable Long id, @RequestBody Student newStudent) {

    Optional<Student> student = studentService.getOneStudent(id);

    if (student.isPresent()) {
        newStudent.setId(id);
        studentService.insertStudent(newStudent);
        return "Updated Success";
    }

    return "Id not found";
}

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        src.delete(id);
        return "Student deleted successfully with id: " + id;
    }
}
