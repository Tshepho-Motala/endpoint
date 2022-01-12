package com.conversion.endpoint.exception;

import com.conversion.endpoint.constants.StatusConstants;
import lombok.Getter;

@Getter
public class ConnectionTimeoutException extends Exception {

    private StatusConstants.HttpConstants status;

    public ConnectionTimeoutException(StatusConstants.HttpConstants status) {
        super(status.getDesc(), null);
        this.status = status;
    }
}