package c;

import a6.C0433h;
import g0.H;
import java.util.ListIterator;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class t extends o6.l implements InterfaceC1162a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0544A f9358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(C0544A c0544a, int i4) {
        super(0);
        this.f9357e = i4;
        this.f9358f = c0544a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        H h8;
        switch (this.f9357e) {
            case 0:
                this.f9358f.a();
                return Z5.y.f7506a;
            case 1:
                C0544A c0544a = this.f9358f;
                H h9 = c0544a.f9298c;
                if (h9 == null) {
                    C0433h c0433h = c0544a.f9297b;
                    ListIterator listIterator = c0433h.listIterator(c0433h.g());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            h8 = listIterator.previous();
                            if (((H) h8).f10861a) {
                            }
                        } else {
                            h8 = 0;
                        }
                    }
                    h9 = h8;
                }
                c0544a.f9298c = null;
                if (h9 != null) {
                    h9.a();
                }
                return Z5.y.f7506a;
            default:
                this.f9358f.a();
                return Z5.y.f7506a;
        }
    }
}
