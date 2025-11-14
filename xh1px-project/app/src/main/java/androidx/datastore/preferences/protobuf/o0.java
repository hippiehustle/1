package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum o0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0471g.f8681f),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: d, reason: collision with root package name */
    public final Object f8729d;

    o0(Serializable serializable) {
        this.f8729d = serializable;
    }
}
