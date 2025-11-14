package b8;

import Z7.A;
import a6.AbstractC0436k;
import a6.x;
import a8.u;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends m {
    public final u j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9276l;

    /* renamed from: m, reason: collision with root package name */
    public int f9277m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a8.b bVar, u uVar) {
        super(bVar, uVar, (String) null, 12);
        o6.j.e(bVar, "json");
        o6.j.e(uVar, "value");
        this.j = uVar;
        List Q02 = AbstractC0436k.Q0(uVar.f8299d.keySet());
        this.k = Q02;
        this.f9276l = Q02.size() * 2;
        this.f9277m = -1;
    }

    @Override // b8.m, kotlinx.serialization.json.internal.a
    public final String Q(X7.f fVar, int i4) {
        o6.j.e(fVar, "descriptor");
        return (String) this.k.get(i4 / 2);
    }

    @Override // b8.m, kotlinx.serialization.json.internal.a
    public final a8.j S() {
        return this.j;
    }

    @Override // b8.m
    /* renamed from: X */
    public final u S() {
        return this.j;
    }

    @Override // b8.m, kotlinx.serialization.json.internal.a
    public final a8.j c(String str) {
        o6.j.e(str, "tag");
        if (this.f9277m % 2 == 0) {
            A a3 = a8.k.f8289a;
            return new a8.o(str, true);
        }
        return (a8.j) x.M0(this.j, str);
    }

    @Override // b8.m, kotlinx.serialization.json.internal.a, Y7.a
    public final void g(X7.f fVar) {
        o6.j.e(fVar, "descriptor");
    }

    @Override // b8.m, Y7.a
    public final int n(X7.f fVar) {
        o6.j.e(fVar, "descriptor");
        int i4 = this.f9277m;
        if (i4 < this.f9276l - 1) {
            int i8 = i4 + 1;
            this.f9277m = i8;
            return i8;
        }
        return -1;
    }
}
