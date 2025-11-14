package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0487x {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0471g.class, C0471g.f8681f),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: d, reason: collision with root package name */
    public final Object f8753d;

    EnumC0487x(Class cls, Serializable serializable) {
        this.f8753d = serializable;
    }
}
