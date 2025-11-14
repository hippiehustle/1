package z6;

import f7.C0722b;
import f7.C0725e;

/* loaded from: classes.dex */
public enum q {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(E2.c.V("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(E2.c.V("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(E2.c.V("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(E2.c.V("kotlin/ULong", false));


    /* renamed from: d, reason: collision with root package name */
    public final C0722b f16816d;

    /* renamed from: e, reason: collision with root package name */
    public final C0725e f16817e;

    /* renamed from: f, reason: collision with root package name */
    public final C0722b f16818f;

    q(C0722b c0722b) {
        this.f16816d = c0722b;
        C0725e f8 = c0722b.f();
        this.f16817e = f8;
        this.f16818f = new C0722b(c0722b.f10793a, C0725e.e(f8.b() + "Array"));
    }
}
