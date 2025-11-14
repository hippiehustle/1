package a7;

/* renamed from: a7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0443d implements g7.p {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);


    /* renamed from: d, reason: collision with root package name */
    public final int f8051d;

    EnumC0443d(int i4) {
        this.f8051d = i4;
    }

    public static EnumC0443d b(int i4) {
        switch (i4) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return SHORT;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return INT;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return LONG;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return FLOAT;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return DOUBLE;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return BOOLEAN;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // g7.p
    public final int a() {
        return this.f8051d;
    }
}
