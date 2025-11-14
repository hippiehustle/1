package w7;

import java.util.List;
import n6.InterfaceC1163b;
import p7.InterfaceC1333o;
import x7.C1824f;

/* renamed from: w7.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1760w implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16019d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final J f16020e;

    public C1760w(List list, InterfaceC1333o interfaceC1333o, G g8, J j, boolean z8) {
        this.f16020e = j;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        C1824f c1824f = (C1824f) obj;
        switch (this.f16019d) {
            case 0:
                o6.j.e(c1824f, "refiner");
                this.f16020e.c();
                return null;
            default:
                o6.j.e(c1824f, "kotlinTypeRefiner");
                this.f16020e.c();
                return null;
        }
    }

    public C1760w(List list, G g8, J j, boolean z8) {
        this.f16020e = j;
    }
}
