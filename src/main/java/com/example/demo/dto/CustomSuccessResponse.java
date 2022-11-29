package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.http.ResponseEntity;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class CustomSuccessResponse {

    private Boolean success;
    private String response;

    public static ResponseEntity<CustomSuccessResponse> ok() {
        CustomSuccessResponse customSuccessResponse = new CustomSuccessResponse();
        customSuccessResponse.setSuccess(true);
        customSuccessResponse.setResponse("Filled out");
        return ResponseEntity.ok().body(customSuccessResponse);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
