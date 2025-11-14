package Z7;

import a.AbstractC0405a;
import a6.AbstractC0436k;
import n6.InterfaceC1162a;

/* renamed from: Z7.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399u extends T {

    /* renamed from: l, reason: collision with root package name */
    public final X7.h f7646l;

    /* renamed from: m, reason: collision with root package name */
    public final Z5.n f7647m;

    public C0399u(final String str, final int i4) {
        super(str, null, i4);
        this.f7646l = X7.h.f7072f;
        this.f7647m = new Z5.n(new InterfaceC1162a() { // from class: Z7.t
            @Override // n6.InterfaceC1162a
            public final Object a() {
                int i8 = i4;
                X7.f[] fVarArr = new X7.f[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    fVarArr[i9] = AbstractC0405a.f(str + '.' + this.f7570e[i9], X7.i.f7076h, new X7.f[0]);
                }
                return fVarArr;
            }
        });
    }

    @Override // Z7.T, X7.f
    public final q4.X e() {
        return this.f7646l;
    }

    @Override // Z7.T
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof X7.f)) {
                X7.f fVar = (X7.f) obj;
                if (fVar.e() != X7.h.f7072f || !this.f7566a.equals(fVar.b()) || !o6.j.a(Q.b(this), Q.b(fVar))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // Z7.T
    public final int hashCode() {
        int i4;
        int hashCode = this.f7566a.hashCode();
        P.S s8 = new P.S(this);
        int i8 = 1;
        while (s8.hasNext()) {
            int i9 = i8 * 31;
            String str = (String) s8.next();
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            i8 = i9 + i4;
        }
        return (hashCode * 31) + i8;
    }

    @Override // Z7.T, X7.f
    public final X7.f j(int i4) {
        return ((X7.f[]) this.f7647m.getValue())[i4];
    }

    @Override // Z7.T
    public final String toString() {
        return AbstractC0436k.v0(new H7.q(1, this), ", ", this.f7566a.concat("("), ")", null, 56);
    }
}
