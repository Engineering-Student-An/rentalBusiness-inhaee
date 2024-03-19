package changmin.rentalBusiness.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItem is a Querydsl query type for Item
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItem extends EntityPathBase<Item> {

    private static final long serialVersionUID = -560248348L;

    public static final QItem item = new QItem("item");

    public final NumberPath<Integer> allStockQuantity = createNumber("allStockQuantity", Integer.class);

    public final StringPath category = createString("category");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<Rental, QRental> rentals = this.<Rental, QRental>createList("rentals", Rental.class, QRental.class, PathInits.DIRECT2);

    public final NumberPath<Integer> stockQuantity = createNumber("stockQuantity", Integer.class);

    public QItem(String variable) {
        super(Item.class, forVariable(variable));
    }

    public QItem(Path<? extends Item> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItem(PathMetadata metadata) {
        super(Item.class, metadata);
    }

}

