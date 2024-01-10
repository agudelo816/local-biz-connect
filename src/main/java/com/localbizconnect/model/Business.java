package com.localbizconnect.model;

import java.util.List;
import java.util.Map;

public class Business {

    private Long id;
    private String name;
    private String services;
    private String location;
    private Map<String, String> hoursOfOperation;
    private List<Appointment> appointments;
    private LoginRequest loginRequest;

}
