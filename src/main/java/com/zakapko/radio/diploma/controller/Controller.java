package com.zakapko.radio.diploma.controller;

import com.zakapko.radio.diploma.domain.Equipment;
import com.zakapko.radio.diploma.service.EquipmentService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpEntity.*;
import static org.springframework.http.HttpStatus.OK;

@SuppressWarnings("unchecked")
@org.springframework.stereotype.Controller
@RequestMapping("api/equipment")
public class Controller {

    private EquipmentService equipmentService;

    @RequestMapping(value = "build", method = RequestMethod.GET)
    private ResponseEntity buildModel(List<Equipment> equipment) {
        return new ResponseEntity(equipmentService.buildModel(equipment), OK);
    }

    @RequestMapping(value = "build", method = RequestMethod.GET)
    private ResponseEntity getAll() {
        return new ResponseEntity(equipmentService.getAll(), OK);
    }

}
