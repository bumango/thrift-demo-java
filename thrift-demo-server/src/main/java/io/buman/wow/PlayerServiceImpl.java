package io.buman.wow;

import io.buman.guild.Guild;
import io.buman.player.Player;
import io.buman.player.PlayerNotFoundException;
import io.buman.player.PlayerService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @description: thrift springboot demo.
 * @author: 李桂满
 * @date: Created on 4:11 下午 2021/1/13
 */
@Component
public class PlayerServiceImpl implements PlayerService.Iface {
    private final static Map<Integer, Player> playerMap = new HashMap<>();
    private final static Map<Integer, Guild> guildMap = new HashMap<>();

    @Override
    public Player signIn(Player player) throws TException {
        if (player == null) {
            throw new PlayerNotFoundException(400, "player is null");
        }
        player.setId(getIncrKey(playerMap.keySet()));
        playerMap.put(player.getId(), player);
        return player;
    }

    @Override
    public List<Player> queryAllPlayer() throws TException {
        return new ArrayList<>(playerMap.values());
    }

    @Override
    public Guild registerGuild(Guild guild) throws TException {
        guild.setId(getIncrKey(guildMap.keySet()));
        guildMap.put(guild.getId(), guild);
        return guild;
    }

    @Override
    public List<Guild> queryAllGuild() throws TException {
        return new ArrayList<>(guildMap.values());
    }

    @Override
    public Player addCp(int pid, Player player) throws PlayerNotFoundException, TException {
        Player p = playerMap.get(pid);
        if (p == null) {
            throw new PlayerNotFoundException(401, "player is not found id = " + pid);
        }
        if (!player.isSetId() || playerMap.get(player.getId())== null){
            throw new PlayerNotFoundException(402, "cp player id is null");
        }

        return p.setCp(playerMap.get(player.getId()));
    }

    @Override
    public Player joinGuild(int pid, int gid) throws PlayerNotFoundException, TException {
        Player player = playerMap.get(pid);
        Guild guild = guildMap.get(gid);
        if (player == null) {
            throw new PlayerNotFoundException(400, "player is not found id = " + pid);
        }
        if (guild == null) {
            throw new TException("guild is not found id = " + gid);
        }
        return player.setGuild(guild);
    }

    private int getIncrKey(Set<Integer> set) {
        if (set.isEmpty()) {
            return 1;
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, ((o1, o2) -> (o2 - o1)));
        return list.get(0)+1;
    }
}