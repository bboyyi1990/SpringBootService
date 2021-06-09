//package com.yi.db;
//
//import com.yi.data.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
///**
// * 数据库dao层
// */
//public interface UserRepositoryDao extends JpaRepository<User,Long> {
//    @Query("select t from User t where t.name = :name")
//    User findByUserName(@Param("name") String name);
//}
