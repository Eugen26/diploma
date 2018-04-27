package com.zakapko.radio.diploma.service;


import com.zakapko.radio.diploma.dao.EquipmentDao;
import com.zakapko.radio.diploma.domain.Equipment;
import com.zakapko.radio.diploma.domain.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EquipmentService {
    @Autowired
    EquipmentDao equipmentDao;

    public Model buildModel(List<Equipment> equipmentList) {
        return new Model();
    }

    public List<Equipment> getAll() {
        return Collections.emptyList();
    }
}
