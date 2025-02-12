package jetbrains.mps.debugger.java.api.state.proxy;

/*Generated by MPS */

import jetbrains.mps.debugger.java.api.evaluation.proxies.IValueProxy;
import jetbrains.mps.debug.api.programState.IValue;
import org.jetbrains.annotations.NotNull;
import com.sun.jdi.ThreadReference;
import java.util.List;
import jetbrains.mps.debug.api.programState.IWatchable;

public abstract class JavaValue<V extends IValueProxy> extends ProxyForJava implements IValue {
  @NotNull
  protected final V myValue;
  protected final ThreadReference myThreadReference;
  private volatile List<IWatchable> mySubvalues;

  public JavaValue(@NotNull V value, @NotNull ThreadReference threadReference) {
    super(value);
    myValue = value;
    myThreadReference = threadReference;
  }

  @NotNull
  public V getValue() {
    return myValue;
  }

  @Override
  public void initSubvalues() {
    mySubvalues = calculateSubvalues();
  }

  public abstract List<IWatchable> calculateSubvalues();

  @Override
  public List<IWatchable> getSubvalues() {
    return mySubvalues;
  }
}
