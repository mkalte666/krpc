package krpc.client;

import java.io.IOException;

public class Stream<T> {
  private StreamManager manager;
  private long id;

  Stream(StreamManager manager, long id) {
    this.manager = manager;
    this.id = id;
  }

  @SuppressWarnings("unchecked")
  public T get() throws RPCException, StreamException {
    return (T) manager.get(id);
  }

  public void remove() throws RPCException {
    manager.remove(id);
  }
}
