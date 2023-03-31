package org.itavsa.portal.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CurrencyDTO {
    String name;
    String code;
    String symbol;
}
