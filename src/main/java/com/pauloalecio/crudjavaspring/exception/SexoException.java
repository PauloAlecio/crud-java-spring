package com.pauloalecio.crudjavaspring.exception;

public class SexoException extends RuntimeException{

  public SexoException(){
    super("Gênero não encontrado");
  }

  public SexoException(String message){
    super(message);
  }
  
}
