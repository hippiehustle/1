package A7;

import C6.InterfaceC0007h;
import C6.S;
import C6.T;
import n6.InterfaceC1163b;
import o6.j;
import w7.W;

/* loaded from: classes.dex */
public final class a implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f409e = new a(0);

    /* renamed from: f, reason: collision with root package name */
    public static final a f410f = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f411d;

    public /* synthetic */ a(int i4) {
        this.f411d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8;
        boolean z9;
        W w8 = (W) obj;
        switch (this.f411d) {
            case 0:
                j.e(w8, "it");
                InterfaceC0007h c6 = w8.B0().c();
                if (c6 != null && (c6 instanceof T) && (((T) c6).q() instanceof S)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                j.e(w8, "it");
                InterfaceC0007h c9 = w8.B0().c();
                if (c9 != null && ((c9 instanceof S) || (c9 instanceof T))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
        }
    }
}
