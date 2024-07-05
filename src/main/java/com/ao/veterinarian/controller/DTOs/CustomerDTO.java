package com.ao.veterinarian.controller.DTOs;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private Long id;
    private String name;
    private String lastName;
    private String address;
    private String phone;
}
