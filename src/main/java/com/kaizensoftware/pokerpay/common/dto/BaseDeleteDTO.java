package com.kaizensoftware.pokerpay.common.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public abstract class BaseDeleteDTO {

    @NotNull
    protected boolean hardDelete;

}