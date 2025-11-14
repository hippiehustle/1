package k4;

import j2.C0902b;
import n6.InterfaceC1162a;

/* renamed from: k4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0986s implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f12120e;

    public /* synthetic */ C0986s(H h8, int i4) {
        this.f12119d = i4;
        this.f12120e = h8;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f12119d) {
            case 0:
                this.f12120e.I();
                return Z5.y.f7506a;
            case 1:
                H3.n nVar = this.f12120e.J().f12065c;
                C0902b c0902b = (C0902b) nVar.f1950e.b();
                if (c0902b != null) {
                    nVar.k(C0902b.i(c0902b, null, null, null, 0, null, 0, 0, !c0902b.f11797i, null, 767));
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                H h8 = this.f12120e;
                h8.h(new C0986s(h8, 4));
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                H.H(this.f12120e);
                return Z5.y.f7506a;
            default:
                H h9 = this.f12120e;
                h9.o().d(h9.k(), new C0982n(new W4.i(1, h9.J(), X.class, "setDetectionArea", "setDetectionArea(Landroid/graphics/Rect;)V", 0, 0, 10)), true);
                return Z5.y.f7506a;
        }
    }
}
