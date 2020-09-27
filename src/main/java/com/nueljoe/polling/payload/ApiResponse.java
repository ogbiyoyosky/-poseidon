package com.nueljoe.polling.payload;


public class ApiResponse {
    private Boolean success;
    private String message;

    private Integer status_code;

    public ApiResponse(Boolean success, String message, Integer status_code) {
        this.success = success;
        this.status_code = status_code;
        this.message = message;
    }

    public Integer getStatus_code() {
        return status_code;
    }

    public void setStatus_code(Integer status_code) {
        this.status_code = status_code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
