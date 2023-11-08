package behavioral.chainofresponsibility;

public interface Handler {
    boolean handleMessage(Message message);
    void nextErrorHandler(Handler nextReceiver);
}

class IssueRaiser {
    public Handler setFirstReceiver;
    public void setFirstErrorHandler(Handler firstErrorHandler)
    {
        this.setFirstReceiver = firstErrorHandler;
    }
    public void raiseMessage(Message message)
    {
        if (setFirstReceiver != null)
            setFirstReceiver.handleMessage(message);
    }
}

// Top level concentration issue handler
class TopConcentrationHandler implements Handler {
    private Handler nextReceiver;
    @Override
    public void nextErrorHandler(Handler nextReceiver)
    {
        this.nextReceiver = nextReceiver;
    }
    @Override
    public boolean handleMessage(Message message) {
        if (message.level == ConcentrationLevel.TOP) {
            System.out.println(" ChairpersonHandler processed " +message.level +" priority issue :"+ message.text);
            return true;
        }
        else {
            if (nextReceiver != null)
                nextReceiver.handleMessage(message);
        }
        return false;
    }
}

// Concentration Issue Handler
class NormalConcentrationHandler implements Handler {
    private Handler nextReceiver;
    @Override
    public void nextErrorHandler(Handler nextReceiver)
    {
        this.nextReceiver = nextReceiver;
    }
    @Override
    public boolean handleMessage(Message message) {
        if (message.level == ConcentrationLevel.NORMAL) {
            System.out.println(" FTFacultyHandler processed " +message.level +" priority issue :"+ message.text);
            return true;
        }
        else {
            if (nextReceiver != null) {
                nextReceiver.handleMessage(message);
            }
        }
        return false;
    }
}

class Message {
    public String text;
    public ConcentrationLevel level;
    public Message(String msg, ConcentrationLevel p) {
        text = msg;
        this.level = p;
    }
}

enum ConcentrationLevel {
    NORMAL,
    TOP
}



