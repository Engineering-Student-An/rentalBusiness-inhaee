package changmin.rentalBusiness.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -194446795L;

    public static final QBoard board = new QBoard("board");

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> editTime = createDateTime("editTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<String, StringPath> likeNumber = this.<String, StringPath>createList("likeNumber", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final BooleanPath notice = createBoolean("notice");

    public final ListPath<Reply, QReply> replyList = this.<Reply, QReply>createList("replyList", Reply.class, QReply.class, PathInits.DIRECT2);

    public final StringPath stuId = createString("stuId");

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> writeTime = createDateTime("writeTime", java.time.LocalDateTime.class);

    public QBoard(String variable) {
        super(Board.class, forVariable(variable));
    }

    public QBoard(Path<? extends Board> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoard(PathMetadata metadata) {
        super(Board.class, metadata);
    }

}

