package contenidos;

import lombok.Getter;


@Getter
public class Contenido {
  private String titulo;
  private Integer idContenido;
  private Genero genero;

  public Contenido(String titulo, Integer idContenido, Genero genero) {
    this.titulo = titulo;
    this.idContenido = idContenido;
    this.genero = genero;
  }

  public void print() {
    System.out.println("\"" + titulo + "\" - Genero: " + genero);
  }
}
