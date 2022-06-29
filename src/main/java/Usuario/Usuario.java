package Usuario;

import Reproduccion.Reproductor;
import contenidos.Contenido;
import contenidos.Reproduccion;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Getter
public class Usuario {

  private List<Reproduccion> reproduccionesParaContinuarViendo = new ArrayList<Reproduccion>();
  private Integer idUsuario;
  private Reproductor reproductor;
  @Setter
  private Reproduccion reproduccionEnCurso;

  public Usuario(Integer idUsuario, Reproductor reproductor) {
    this.idUsuario = idUsuario;
    this.reproductor = reproductor;
  }


  public void addReproduccionesParaContinuarViendo(Reproduccion reproduccion){
    reproduccionesParaContinuarViendo.add(reproduccion);
  }

  public void obtenerContenidosEnCurso(){
    reproduccionesParaContinuarViendo.forEach(reproduccion -> reproduccion.getContenidoAsociado().print());
  }

  public void continuarViendo(Contenido contenido){
    Reproduccion reproduccion = reproduccionesParaContinuarViendo
        .stream()
        .filter(r -> r.getContenidoAsociado() == contenido)
        .collect(Collectors.toList())
        .get(0);
    reproduccionesParaContinuarViendo.remove(reproduccion);
    //reproductor.play(contenido.getIdContenido(), reproduccion.getMinuto());
    setReproduccionEnCurso(reproduccion);
  }

}
