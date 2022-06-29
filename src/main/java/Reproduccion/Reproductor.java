package Reproduccion;

public interface Reproductor {
  Boolean play(int idVideo, int minutoInicio);
  void stop();
  void registerOnPlay(PlayListener playListener);
  void registerOnStop(StopListener stopListener);
  void registerOnFinish(FinishListener listener);
}
