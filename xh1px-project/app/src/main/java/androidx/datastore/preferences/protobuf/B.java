package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: b, reason: collision with root package name */
    public static final r f8596b = new r(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f8597a;

    public B(C0475k c0475k) {
        AbstractC0486w.a(c0475k, "output");
        this.f8597a = c0475k;
        c0475k.f8707i = this;
    }

    public void a(int i4, Object obj, S s8) {
        C0475k c0475k = (C0475k) this.f8597a;
        c0475k.p0(i4, 3);
        s8.b((AbstractC0465a) obj, c0475k.f8707i);
        c0475k.p0(i4, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.A, java.lang.Object] */
    public B() {
        H h8;
        O o7 = O.f8627c;
        try {
            h8 = (H) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            h8 = f8596b;
        }
        H[] hArr = {r.f8738b, h8};
        ?? obj = new Object();
        obj.f8595a = hArr;
        Charset charset = AbstractC0486w.f8742a;
        this.f8597a = obj;
    }
}
