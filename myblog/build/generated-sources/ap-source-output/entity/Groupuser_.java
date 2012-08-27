package entity;

import entity.Articles;
import entity.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-08-27T23:50:11")
@StaticMetamodel(Groupuser.class)
public class Groupuser_ { 

    public static volatile SingularAttribute<Groupuser, Users> usersLogin;
    public static volatile CollectionAttribute<Groupuser, Articles> articlesCollection;
    public static volatile SingularAttribute<Groupuser, String> name;

}