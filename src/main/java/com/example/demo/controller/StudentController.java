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
    public Studententity update(@PathVariable int id, @RequestBody Studententity st){
        return src.update(id, st);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        src.delete(id);
        return "Student deleted successfully with id: " + id;
    }
}
