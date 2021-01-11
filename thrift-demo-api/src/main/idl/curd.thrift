namespace java io.buman.curd
namespace go curd

exception UserNotFoundException{
    1: optional i32 code,
    2: optional string msg
}

enum GenderEnum {
    UNKNOWN = 0,
    MALE = 1,
    FEMALE = 2
}

struct UserInsertDto {
    1: required string name,
    2: required i32 age,
    3: required GenderEnum gender,
    4: optional string addr
}

struct UserUpdateDto {
    1: required i32 id,
    2: optional string name,
    3: optional i32 age,
    4: optional GenderEnum gender,
    5: optional string addr
}

struct User {
    1: required i32 id,
    2: required string name,
    3: required i32 age,
    4: required GenderEnum gender,
    5: optional string addr

}

service CurdService {
    /**
     * Insert user info.
     * @param string name - user name
     * @param i32 age - user age
     * @param GenderEnum gender - user gender
     * @param string addr - user address
     * @return User - returns the user instance
     */
    User insertUser(1: required string name, 2: required i32 age, 3: required GenderEnum gender, 4: string addr)

    /**
     * Insert user by dto.
     * @param UserInsertDto dto - user insert dto
     * @return User - returns the user instance
     */
    User insertByDto(1: UserInsertDto dto)

    /**
     * update user info, the id field is required.
     * @param UserUpdateDto dto - user update dto
     * @return User - returns the modified user instance
     * @throws UserNotFoundException - user not found excepiton
     */
    User updateUser(1: required UserUpdateDto dto) throws (1: UserNotFoundException e)

    /**
     * query user by id.
     * @param i32 id - user id
     * @return User - returns the user instance
     * @throws UserNotFoundException - user not found excepiton
     */
    User queryUser(1: required i32 id) throws (1: UserNotFoundException e)

    /**
     * query all user.
     * @return list - returns the user list
     */
    list<User> queryAll(),

    /**
     * delete user by id.
     * @param i32 id - user id
     * @return User - returns the deleted user instance
     * @throws UserNotFoundException - user not found excepiton
     */
    User deleteUser(1: required i32 id) throws (1: UserNotFoundException e)

}