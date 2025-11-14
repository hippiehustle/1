package a8;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8279d = new b();

    /* renamed from: a, reason: collision with root package name */
    public final X6.r f8280a = new X6.r(1);

    /* renamed from: b, reason: collision with root package name */
    public final G5.e f8281b = c8.a.f9730a;

    /* renamed from: c, reason: collision with root package name */
    public final W5.a f8282c = new W5.a();

    public final Object a(V7.a aVar, u uVar) {
        o6.j.e(aVar, "deserializer");
        return new b8.m(this, uVar, (String) null, 12).u(aVar);
    }

    public final j b(String str) {
        l lVar = l.f8290a;
        this.f8280a.getClass();
        S6.e eVar = new S6.e(str);
        Object u8 = new kotlinx.serialization.json.internal.b(this, b8.t.f9290f, eVar, l.f8291b).u(lVar);
        if (eVar.h() == 10) {
            return (j) u8;
        }
        S6.e.q(eVar, "Expected EOF after parsing, but had " + str.charAt(eVar.f5429b - 1) + " instead", 0, null, 6);
        throw null;
    }
}
