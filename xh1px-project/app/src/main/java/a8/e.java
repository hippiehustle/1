package a8;

import Z7.C0381b;
import Z7.I;
import java.util.List;
import q4.X;

/* loaded from: classes.dex */
public final class e implements X7.f {

    /* renamed from: b, reason: collision with root package name */
    public static final e f8284b = new e();

    /* renamed from: c, reason: collision with root package name */
    public static final String f8285c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0381b f8286a;

    /* JADX WARN: Type inference failed for: r1v0, types: [Z7.I, Z7.b] */
    public e() {
        X7.f d2 = l.f8290a.d();
        o6.j.e(d2, "elementDesc");
        this.f8286a = new I(d2);
    }

    @Override // X7.f
    public final int a(String str) {
        o6.j.e(str, "name");
        return this.f8286a.a(str);
    }

    @Override // X7.f
    public final String b() {
        return f8285c;
    }

    @Override // X7.f
    public final int c() {
        this.f8286a.getClass();
        return 1;
    }

    @Override // X7.f
    public final String d(int i4) {
        this.f8286a.getClass();
        return String.valueOf(i4);
    }

    @Override // X7.f
    public final X e() {
        this.f8286a.getClass();
        return X7.i.f7074f;
    }

    @Override // X7.f
    public final boolean g() {
        this.f8286a.getClass();
        return false;
    }

    @Override // X7.f
    public final List getAnnotations() {
        this.f8286a.getClass();
        return a6.s.f7766d;
    }

    @Override // X7.f
    public final boolean h() {
        this.f8286a.getClass();
        return false;
    }

    @Override // X7.f
    public final List i(int i4) {
        this.f8286a.i(i4);
        return a6.s.f7766d;
    }

    @Override // X7.f
    public final X7.f j(int i4) {
        return this.f8286a.j(i4);
    }

    @Override // X7.f
    public final boolean k(int i4) {
        this.f8286a.k(i4);
        return false;
    }
}
