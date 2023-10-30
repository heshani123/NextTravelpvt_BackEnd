package com.heshani.ts.utill;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResponceUtill {
    private String state;
    private String message;
    private Object data;

}
