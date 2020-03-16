package com.example.eurekaclient.entry;

import lombok.Data;

import java.util.Date;

@Data
public class Ticket {

    private long id;
    private String username;
    private Date currentTime;
    private Date startTime;
    private Date endTIme;
    private String startSpace;
    private String endSpace;
}
