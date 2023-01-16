package com.mingtai.mingtai_backend.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class Result<T> {
    private String code;
    private String msg;
    private T data;


    public Result(T data){
        this.data = data;
    }

    //request success
    public static<T> Result<T> success(T data){
        Result rs = new Result<>();
        rs.setCode("200");
        rs.setMsg("ok");
        return rs;
    }
    //request fail
    public static<T> Result<T> error(String code, String msg){
        Result rs = new Result<>();
        rs.setCode(code);
        rs.setMsg(msg);
        return rs;
    }
}
