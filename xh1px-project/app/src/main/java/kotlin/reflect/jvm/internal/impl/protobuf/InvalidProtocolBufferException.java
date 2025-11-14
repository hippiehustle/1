package kotlin.reflect.jvm.internal.impl.protobuf;

import g7.AbstractC0793b;
import g7.AbstractC0803l;
import java.io.IOException;

/* loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0793b f12155d;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f12155d = null;
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void a(AbstractC0803l abstractC0803l) {
        this.f12155d = abstractC0803l;
    }
}
