package com.hunghv.indentityservice.exception;

public enum ErrorCode {
    ARGS_INVALID(101, "Args invalid"),
    ENTITY_NOT_FOUND(102, "Entity not found"),
    UNCATEGORIZED_EXCEPTION(103, "Uncategorized Exception"),
    UNAUTHENTICATED_EXCEPTION(103, "Unauthenticated Exception");
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}