package com.accountant.service.accountant.domain;

import com.accountant.service.accountant.enums.IsoCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyDTO {
    private Long id;
    private String currencyDate;
    private String currencyDay;
    private String rate;
    private IsoCodeEnum isoCodeFrom;
    private IsoCodeEnum isoCodeTo;
    private String creationDate;
    private String fileName;
    private String fileId;
}
