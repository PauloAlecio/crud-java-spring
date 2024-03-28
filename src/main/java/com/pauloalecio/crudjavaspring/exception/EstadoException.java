package com.pauloalecio.crudjavaspring.exception;

public class EstadoException extends RuntimeException {
  
  public EstadoException(){
    super("Estado não encontrado");
  }

  public EstadoException(String message){
    super(message);
  }

}
