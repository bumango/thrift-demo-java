package io.buman.curd;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Thrift server demo
 * @author: buman
 * @date: Created on 6:21 下午 2021/1/5
 */
@Component
public class ThriftServer {
    private final Logger log = LoggerFactory.getLogger(ThriftServer.class);

    private CurdServiceImpl curdService;

    @Autowired
    public ThriftServer setOauthService(CurdServiceImpl curdService) {
        this.curdService = curdService;
        return this;
    }

    public void start() {
        CurdService.Processor<CurdService.Iface> processor = new CurdService.Processor<>(curdService);

        try {
            TServerTransport transport = new TServerSocket(3041);
            TServer server = new TSimpleServer(new TServer.Args(transport).processor(processor));
            System.out.println("Starting the simple server...");
            server.serve();
        } catch (TTransportException e) {
            log.error("Start server failed...", e);
        }
    }

}