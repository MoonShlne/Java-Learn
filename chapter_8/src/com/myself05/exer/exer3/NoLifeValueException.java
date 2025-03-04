package com.myself05.exer.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/25 18:55
 */
public class NoLifeValueException extends  RuntimeException{
    static final long serialVersionUID = -7034897190745939L;

    public  NoLifeValueException(){
        super();
    }
    public NoLifeValueException(String message) {
        super(message);
    }



}
