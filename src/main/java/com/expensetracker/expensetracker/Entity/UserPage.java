package com.expensetracker.expensetracker.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPage  {
    private Integer page;
    private Integer pageSize;
}
