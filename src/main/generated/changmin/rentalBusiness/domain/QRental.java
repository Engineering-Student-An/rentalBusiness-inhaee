package changmin.rentalBusiness.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRental is a Querydsl query type for Rental
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRental extends EntityPathBase<Rental> {

    private static final long serialVersionUID = -1283662923L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRental rental = new QRental("rental");

    public final DatePath<java.time.LocalDate> finishRentalDate = createDate("finishRentalDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QItem item;

    public final DatePath<java.time.LocalDate> rentalDate = createDate("rentalDate", java.time.LocalDate.class);

    public final NumberPath<Long> rentalDateDiff = createNumber("rentalDateDiff", Long.class);

    public final EnumPath<RentalStatus> status = createEnum("status", RentalStatus.class);

    public final QStudent student;

    public QRental(String variable) {
        this(Rental.class, forVariable(variable), INITS);
    }

    public QRental(Path<? extends Rental> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRental(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRental(PathMetadata metadata, PathInits inits) {
        this(Rental.class, metadata, inits);
    }

    public QRental(Class<? extends Rental> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItem(forProperty("item")) : null;
        this.student = inits.isInitialized("student") ? new QStudent(forProperty("student")) : null;
    }

}

