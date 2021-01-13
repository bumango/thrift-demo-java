namespace java io.buman.player
include "guild.thrift"

//变量默认赋值从0开始；
enum GenderEnum{
    UNKNOWN,//0
    MALE,//1
    FEMALE//2
}

//第一个变量赋值为1，后面的变量一次递增；
enum RoleEnum{
    WARIOR = 1,//战吊1
    MAGE,//法爷2
    WARLOCK,//术士3
    PRIEST,//牧师4
    DRUID//德鲁伊5
}

struct Player {
    1: i32 id,
    2: required string name,
    3: required RoleEnum role,
    4: required GenderEnum gender = GenderEnum.UNKNOWN,
    5: Player cp,
    6: guild.Guild guild
}

exception PlayerNotFoundException {
    1: i32 code = 400,
    2: string msg
}
service PlayerService {

    /**
     * 玩家注册
     */
    Player signIn(1: Player player)

    /**
     * 查询所有玩家
     */
    list<Player> queryAllPlayer()

    /**
     * 注册公会
     */
    guild.Guild registerGuild(1: guild.Guild guild)

    /**
     * 查询所有公会
     */
    list<guild.Guild> queryAllGuild()

    /**
     * 为玩家添加cp
     */
    Player addCp(1: i32 pid, 2: Player player) throws (1: PlayerNotFoundException e)

    /**
     * 玩家加入公会
     */
    Player joinGuild(1: i32 pid, 2: i32 gid) throws (1: PlayerNotFoundException e)
}