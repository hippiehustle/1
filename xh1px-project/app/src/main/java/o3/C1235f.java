package o3;

import Z5.y;
import androidx.lifecycle.X;
import androidx.lifecycle.e0;
import n6.InterfaceC1162a;
import q0.C1346b;
import u0.C1617h;

/* renamed from: o3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1235f implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13451d;

    public /* synthetic */ C1235f(int i4) {
        this.f13451d = i4;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13451d) {
            case 0:
                return y.f7506a;
            case 1:
                return new X();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C1.a aVar = new C1.a(2);
                aVar.a(o6.v.f13643a.b(C1346b.class), new C1234e(3));
                return aVar.c();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return Boolean.TRUE;
            default:
                return new e0();
        }
    }

    public /* synthetic */ C1235f(C1617h c1617h) {
        this.f13451d = 3;
    }
}
