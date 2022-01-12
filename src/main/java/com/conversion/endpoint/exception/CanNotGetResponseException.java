package com.conversion.endpoint.exception;

import com.conversion.endpoint.constants.StatusConstants;
import lombok.Getter;

@Getter
public class CanNotGetResponseException extends RuntimeException {

    private StatusConstants.HttpConstants status;

    public CanNotGetResponseException(StatusConstants.HttpConstants status) {
        super(status.getDesc(), null);
        this.status = status;
    }
}