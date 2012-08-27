package entity;

import entity.Groupuser;
import entity.Messages;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-08-27T23:50:11")
@StaticMetamodel(Articles.class)
public class Articles_ { 

    public static volatile SingularAttribute<Articles, Integer> id;
    public static volatile CollectionAttribute<Articles, Groupuser> groupuserCollection;
    public static volatile SingularAttribute<Articles, String> title;
    public static volatile SingularAttribute<Articles, String> text;
    public static volatile SingularAttribute<Articles, Date> date;
    public static volatile CollectionAttribute<Articles, Messages> messagesCollection;

}