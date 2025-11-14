package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class F {
    public static E a(Object obj, Object obj2) {
        E e9 = (E) obj;
        E e10 = (E) obj2;
        if (!e10.isEmpty()) {
            if (!e9.f8604d) {
                e9 = e9.b();
            }
            e9.a();
            if (!e10.isEmpty()) {
                e9.putAll(e10);
            }
        }
        return e9;
    }
}
