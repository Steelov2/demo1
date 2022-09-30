package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Holiday {
    public enum Type {
        FESTIVAL, FEDERAL
    }


    public String day;
    public String reason;
    public Type type;

}
