package changmin.rentalBusiness.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReply is a Querydsl query type for Reply
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReply extends EntityPathBase<Reply> {

    private static final long serialVersionUID = -179954119L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReply reply = new QReply("reply");

    public final QBoard board;

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<String, StringPath> likeNumber = this.<String, StringPath>createList("likeNumber", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath stuId = createString("stuId");

    public final DateTimePath<java.time.LocalDateTime> writeTime = createDateTime("writeTime", java.time.LocalDateTime.class);

    public QReply(String variable) {
        this(Reply.class, forVariable(variable), INITS);
    }

    public QReply(Path<? extends Reply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReply(PathMetadata metadata, PathInits inits) {
        this(Reply.class, metadata, inits);
    }

    public QReply(Class<? extends Reply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board")) : null;
    }

}

