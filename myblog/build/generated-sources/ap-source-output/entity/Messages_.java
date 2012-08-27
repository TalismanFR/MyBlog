package entity;

import entity.Articles;
import entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-08-27T23:50:11")
@StaticMetamodel(Messages.class)
public class Messages_ { 

    public static volatile SingularAttribute<Messages, Integer> id;
    public static volatile SingularAttribute<Messages, Users> usersLogin;
    public static volatile SingularAttribute<Messages, String> text;
    public static volatile SingularAttribute<Messages, Articles> articlesId;
    public static volatile SingularAttribute<Messages, Date> date;

}