package com.revature.groupproject.daos;

import com.revature.groupproject.util.database.DatabaseConnection;

import java.sql.Connection;
import java.util.List;

public class StudentsDAO implements CRUDDao{
    Connection con= DatabaseConnection.getCon();
    @Override
    public void save(Object obj) {
        try{
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
