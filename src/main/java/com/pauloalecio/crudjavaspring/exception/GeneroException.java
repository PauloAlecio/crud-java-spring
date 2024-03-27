package com.pauloalecio.crudjavaspring.exception;

public class GeneroException extends RuntimeException{

  public GeneroException(){
    super("Gênero não encontrado");
  }

  public GeneroException(String message){
    super(message);
  }
  
}
