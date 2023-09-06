package com.shopping.task.dto.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostProductOrdersRequestDto {
    @NotNull
    List<ProductOrdersInformation> productOrdersInformationList;
}


