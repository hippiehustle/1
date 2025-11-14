package s4;

import O7.InterfaceC0234g;
import Z5.y;
import android.util.Log;
import d6.InterfaceC0617c;
import java.util.Iterator;
import java.util.Map;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1493a implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1502j f14525e;

    public /* synthetic */ C1493a(C1502j c1502j, int i4) {
        this.f14524d = i4;
        this.f14525e = c1502j;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f14524d) {
            case 0:
                return new C1282a(2, this.f14525e, C1502j.class, "onScenarioEditingStateChanged", "onScenarioEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f14525e, C1502j.class, "updateContentsValidity", "updateContentsValidity(Ljava/util/Map;)V", 4);
            default:
                return new C1282a(2, this.f14525e, C1502j.class, "updateSaveButtonState", "updateSaveButtonState(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f14524d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 1:
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
        switch (this.f14524d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f14524d;
        y yVar = y.f7506a;
        C1502j c1502j = this.f14525e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c1502j.getClass();
                if (!booleanValue) {
                    Log.e("ScenarioDialog", "Closing ScenarioDialog because there is no scenario edited");
                    c1502j.i();
                }
                return yVar;
            case 1:
                c1502j.getClass();
                Iterator it = ((Map) obj).entrySet().iterator();
                while (it.hasNext()) {
                    c1502j.O(((Number) ((Map.Entry) it.next()).getKey()).intValue(), !((Boolean) r5.getValue()).booleanValue());
                }
                return yVar;
            default:
                X.P(c1502j.I(), ((Boolean) obj).booleanValue());
                return yVar;
        }
    }
}
