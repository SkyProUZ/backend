package com.skypro.demo.POJO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BidDetail {
    private Long id;
    private Long userId;
    private Long projectId;
    private String bid_period;
    private String bid_amount;
    private String bid_status;
    private String userName;
}
