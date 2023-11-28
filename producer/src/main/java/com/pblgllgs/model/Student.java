package com.pblgllgs.model;
/*
 *
 * @author pblgl
 * Created on 27-11-2023
 *
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private int id;
    private String firstname;
    private String lastname;
}
