package p3;

import O7.InterfaceC0234g;
import Z5.y;
import d6.InterfaceC0617c;
import java.util.Iterator;
import java.util.Map;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1305a implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1309e f13709e;

    public /* synthetic */ C1305a(C1309e c1309e, int i4) {
        this.f13708d = i4;
        this.f13709e = c1309e;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f13708d) {
            case 0:
                return new C1282a(2, this.f13709e, C1309e.class, "updateContentsValidity", "updateContentsValidity(Ljava/util/Map;)V", 4);
            default:
                return new C1282a(2, this.f13709e, C1309e.class, "updateSaveButtonState", "updateSaveButtonState(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f13708d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f13708d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f13708d;
        y yVar = y.f7506a;
        C1309e c1309e = this.f13709e;
        switch (i4) {
            case 0:
                c1309e.getClass();
                Iterator it = ((Map) obj).entrySet().iterator();
                while (it.hasNext()) {
                    c1309e.O(((Number) ((Map.Entry) it.next()).getKey()).intValue(), !((Boolean) r5.getValue()).booleanValue());
                }
                return yVar;
            default:
                X.P(c1309e.I(), ((Boolean) obj).booleanValue());
                return yVar;
        }
    }
}
