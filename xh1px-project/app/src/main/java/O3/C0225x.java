package O3;

import O7.InterfaceC0234g;
import android.util.Log;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: O3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0225x implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f4003e;

    public /* synthetic */ C0225x(F f8, int i4) {
        this.f4002d = i4;
        this.f4003e = f8;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f4002d) {
            case 0:
                return new C1282a(2, this.f4003e, F.class, "onActionEditingStateChanged", "onActionEditingStateChanged(Z)V", 4);
            default:
                return new C1282a(2, this.f4003e, F.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f4002d) {
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
        switch (this.f4002d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f4002d;
        Z5.y yVar = Z5.y.f7506a;
        F f8 = this.f4003e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                f8.getClass();
                if (!booleanValue) {
                    Log.e("IntentDialog", "Closing IntentDialog because there is no action edited");
                    f8.i();
                }
                return yVar;
            default:
                q4.X.P(f8.I(), ((Boolean) obj).booleanValue());
                return yVar;
        }
    }
}
