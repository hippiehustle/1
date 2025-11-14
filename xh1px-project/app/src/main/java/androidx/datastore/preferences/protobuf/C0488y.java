package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488y {
    public static InterfaceC0485v a(long j, Object obj) {
        int i4;
        InterfaceC0485v interfaceC0485v = (InterfaceC0485v) f0.f8676c.h(j, obj);
        if (!((AbstractC0466b) interfaceC0485v).f8662d) {
            P p8 = (P) interfaceC0485v;
            int i8 = p8.f8632f;
            if (i8 == 0) {
                i4 = 10;
            } else {
                i4 = i8 * 2;
            }
            P i9 = p8.i(i4);
            f0.o(obj, j, i9);
            return i9;
        }
        return interfaceC0485v;
    }
}
