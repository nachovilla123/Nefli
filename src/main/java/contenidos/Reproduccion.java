package contenidos;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Reproduccion {

  private Contenido contenidoAsociado;
  @Setter
  private Integer minuto;

  public Reproduccion(Contenido contenidoAsociado) {
    this.contenidoAsociado = contenidoAsociado;
  }

  void print(){
    System.out.println(contenidoAsociado.getTitulo() + " en el minuto " + minuto);
  }

}
