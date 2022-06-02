package com.revature.groupproject.daos;

import com.revature.groupproject.util.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class StudentsDAO implements CRUDDao{
    Connection con= DatabaseConnection.getCon();
    @Override
    public void save(Object obj) {
        try{
            PreparedStatement ps = con.prepareStatement("INSERT INTO students(id,username,password,name) VALUES(?,?,?,?)");
            ps.setString(1,obj.getId());
            ps.setString(2,obj.getUsername());
            ps.setString(3,obj.getPassword);
            ps.setString(4,obj.getName);
    }
    @Override
    public void update(Object obj) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public List getById(String id) {
        return null;
    }
}
