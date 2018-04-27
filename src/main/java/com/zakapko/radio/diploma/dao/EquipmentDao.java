package com.zakapko.radio.diploma.dao;

import com.zakapko.radio.diploma.domain.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EquipmentDao {
    private static final String GET_ALL = "SELECT * FROM equipment.equipment";
    private static final String ID = "id";
    private static final String PRICE = "price";
    private static final String NAME = "name";
    private static final String TYPE = "type";
    private static final String DURABILITY = "durability";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Equipment> getAll() {
        return jdbcTemplate.query(GET_ALL, (rs, rowNum) -> {
            Equipment equipment = new Equipment();
            equipment.setId(rs.getInt(ID));
            equipment.setPrice(rs.getInt(PRICE));
            equipment.setName(rs.getString(NAME));
            equipment.setType(rs.getString(TYPE));
            equipment.setDurability(rs.getString(DURABILITY));
            return equipment;
        });
    }
}
