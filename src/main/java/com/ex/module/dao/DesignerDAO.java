package com.ex.module.dao;

import com.ex.module.entities.actors.Designer;

import java.sql.SQLException;
import java.util.List;

/*
 * @vlahdu
 *
 * */
public interface DesignerDAO {
    boolean addDesigner(Designer designer)throws SQLException;
    List<Designer> getAll()throws SQLException;
    Designer getById(long id)throws SQLException;
    void update(Designer designer)throws SQLException;
    void remove(Designer designer)throws SQLException;
}
