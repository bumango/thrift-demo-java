package io.buman.server;

import io.buman.player.PlayerService;
import io.buman.wow.PlayerServiceImpl;
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
 * @description: thrift server demo.
 * @author: 李桂满
 * @date: Created on 4:14 下午 2021/1/13
 */
@Component
public class ThriftServer {
    private final Logger log = LoggerFactory.getLogger(ThriftServer.class);

    private PlayerServiceImpl playerService;

    @Autowired
    public ThriftServer setPlayerService(PlayerServiceImpl playerService) {
        this.playerService = playerService;
        return this;
    }

    public void start() {
        PlayerService.Processor<PlayerService.Iface> processor = new PlayerService.Processor<>(playerService);

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