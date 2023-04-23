package com.fabrica.gestionsemestre.controller;

import com.fabrica.gestionsemestre.model.DateRange;
import org.springframework.cglib.core.Local;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/Semestre")
public class DateRangeController {

      @PostMapping("/daterange")
    public ResponseEntity<String> receiveDateRange(@RequestBody DateRange dateRange) {
        LocalDate startDate = dateRange.getStartDate();
        LocalDate endDate = dateRange.getEndDate();
        String response = "Start date: " + startDate + " - End date: " + endDate;
        return ResponseEntity.ok(response);
    }

}

public class FormRequest {
    private String dateRange;

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }
}
