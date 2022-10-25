package com.undostres.dummy_email.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailResponse {
    private String msg;
    private boolean success;
}