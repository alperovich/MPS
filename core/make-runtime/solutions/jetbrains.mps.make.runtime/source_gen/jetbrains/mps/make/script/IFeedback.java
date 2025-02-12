package jetbrains.mps.make.script;

/*Generated by MPS */

import jetbrains.mps.messages.IMessage;

public interface IFeedback {
  public IFeedback.Severity getSeverity();
  public String getMessage();
  public Object getSource();
  public Throwable getException();

  public static   enum Severity {
    ERROR("error"),
    WARNING("warning"),
    INFO("info");

    private String severity;

    Severity(String severity) {
      this.severity = severity;
    }

    @Override
    public String toString() {
      return severity.toUpperCase();
    }
  }

  public static abstract class Stub implements IFeedback {
    public Stub() {
    }

    @Override
    public Throwable getException() {
      return null;
    }

    @Override
    public Object getSource() {
      return null;
    }
  }

  public static class MESSAGE implements IFeedback {
    private IMessage msg;

    public MESSAGE(IMessage message) {
      this.msg = message;
    }

    @Override
    public String getMessage() {
      return msg.getText();
    }

    @Override
    public IFeedback.Severity getSeverity() {
      switch (msg.getKind()) {
        case ERROR:
          return IFeedback.Severity.ERROR;
        case WARNING:
          return IFeedback.Severity.WARNING;
        case INFORMATION:
          return IFeedback.Severity.INFO;
        default:
          return null;
      }
    }

    @Override
    public Object getSource() {
      return msg.getHintObject();
    }

    @Override
    public Throwable getException() {
      return msg.getException();
    }
  }

  public static class Default extends IFeedback.Stub implements IFeedback {
    private String message;
    private Throwable throwable;

    public Default(String message) {
      this.message = message;
    }

    public Default(String message, Throwable throwable) {
      this.message = message;
      this.throwable = throwable;
    }

    @Override
    public IFeedback.Severity getSeverity() {
      return IFeedback.Severity.ERROR;
    }

    @Override
    public String getMessage() {
      return message;
    }

    @Override
    public String toString() {
      String msg = getSeverity().toString() + " - " + getMessage().toString();
      return (getException() != null ?
        msg + " (" + getException().toString() + ")" :
        msg
      );
    }

    @Override
    public Throwable getException() {
      return throwable;
    }
  }

  public static class ERROR extends IFeedback.Default implements IFeedback {
    public ERROR(String message) {
      super(message);
    }

    public ERROR(String message, Throwable throwable) {
      super(message, throwable);
    }

    @Override
    public IFeedback.Severity getSeverity() {
      return IFeedback.Severity.ERROR;
    }
  }

  public static class WARNING extends IFeedback.Default implements IFeedback {
    public WARNING(String message) {
      super(message);
    }

    public WARNING(String message, Throwable throwable) {
      super(message, throwable);
    }

    @Override
    public IFeedback.Severity getSeverity() {
      return IFeedback.Severity.WARNING;
    }
  }

  public static class INFORMATION extends IFeedback.Default implements IFeedback {
    public INFORMATION(String message) {
      super(message);
    }

    public INFORMATION(String message, Throwable throwable) {
      super(message, throwable);
    }

    @Override
    public IFeedback.Severity getSeverity() {
      return IFeedback.Severity.INFO;
    }
  }
}
