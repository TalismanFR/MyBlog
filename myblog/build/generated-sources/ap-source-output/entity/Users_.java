package entity;

import entity.Contacts;
import entity.Groupuser;
import entity.Messages;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-10-12T18:54:25")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile CollectionAttribute<Users, Groupuser> groupuserCollection;
    public static volatile SingularAttribute<Users, String> login;
    public static volatile CollectionAttribute<Users, Messages> messagesCollection;
    public static volatile CollectionAttribute<Users, Contacts> contactsCollection;
    public static volatile SingularAttribute<Users, String> pass;

}