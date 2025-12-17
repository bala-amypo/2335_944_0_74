package com.example.demo.newservice;

public Interface NewfileService {
    NewfileEntity savedata(NewfileEntity newfile);
    NewfileEntity getidval(Long id);
    List<NewfileEntity>getall();
    NewfileEntity update(Long id,NewfileEntity newfile);
    void delete(long id);
}