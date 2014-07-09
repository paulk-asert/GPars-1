package groovyx.gpars.remote.message;

import groovyx.gpars.dataflow.DataflowBroadcast;
import groovyx.gpars.dataflow.stream.DataflowStreamWriteAdapter;
import groovyx.gpars.remote.RemoteConnection;
import groovyx.gpars.serial.SerialMsg;

public class RemoteDataflowReadChannelReplyMsg extends SerialMsg {
    private final String name;
    private final DataflowStreamWriteAdapter stream;

    public RemoteDataflowReadChannelReplyMsg(String name, DataflowBroadcast stream) {
        this.name = name;
        this.stream = stream;
    }

    @Override
    public void execute(RemoteConnection conn) {
        System.err.println("remote dataflow read channel reply");
    }
}
